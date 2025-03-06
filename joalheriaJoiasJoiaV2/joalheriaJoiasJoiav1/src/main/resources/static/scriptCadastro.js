document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroClienteForm");// armazena os dados numa constante pelo id do html

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeCliente = document.getElementById("nome").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dataNascimento = document.getElementById("dt-nasc").value;

		try { //faz isso aqui

			const response = await fetch("http://localhost:8080/cadastrocliente", { //faz a conexão com a api
				method: "POST",
				headers: {
					"Content-Type": "application/json" //o formato que a api vai receber as informações
				},
				body: JSON.stringify({ //converte os dados recebidos no formato json
					nomeCliente,
					cpf,
					email,
					telefone,
					dataNascimento
				}),

			});

			if (response.ok) {
				alert("Cliente cadastrado com sucesso!");
				window.location.href = "cadastroendereco.html";
			} else {
				alert("Erro ao cadastrar o cliente :(");
			}
		} catch (error) { //caso tenha um erro faz isso aqui
			console.error("Erro ao cadastrar cliente :(", error);
		}

	});
});