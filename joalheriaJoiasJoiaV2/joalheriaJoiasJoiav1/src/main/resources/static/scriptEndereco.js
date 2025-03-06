document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroEndereco");// armazena os dados numa constante pelo id do html

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const bairro = document.getElementById("bairro").value;
		const numero = document.getElementById("numero").value;
		const cep = document.getElementById("cep").value;
		const rua = document.getElementById("rua").value;
		const complemento = document.getElementById("complemento").value;

		try { //faz isso aqui

			const response = await fetch("http://localhost:8080/cadastroendereco", { //faz a conexão com a api
				method: "POST",
				headers: {
					"Content-Type": "application/json" //o formato que a api vai receber as informações
				},
				body: JSON.stringify({ //converte os dados recebidos no formato json
					estado,
					cidade,
					bairro,
					rua,
					cep,
					numero,
					complemento
				}),

			});

			if (!response.ok) {
				alert("Erro ao cadastrar o endereço :(");
				
			} else {
				alert("Endereço cadastrado com sucesso!");
				
			}
		} catch (error) { //caso tenha um erro faz isso aqui
			console.error("Erro ao cadastrar o endereço :(", error);
		}

	});
});