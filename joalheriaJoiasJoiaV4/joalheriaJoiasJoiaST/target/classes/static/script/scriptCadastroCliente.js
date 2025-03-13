document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroClienteForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeCliente = document.getElementById("nome").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dataNascimento = document.getElementById("dt-nasc").value;
		const senha = document.getElementById("senha").value;

		try { 

			const response = await fetch("http://localhost:8080/cadastrocliente", { 
				method: "POST",
				headers: {
					"Content-Type": "application/json" 
				},
				body: JSON.stringify({ 
					nomeCliente,
					cpf,
					email,
					telefone,
					dataNascimento,
					senha
				}),

			});

			if (response.ok) {
				window.location.href = "cadastroendereco.html";
			} else {
				alert("Erro ao cadastrar o cliente :(");
			}
		} catch (error) { 
			console.error("Erro ao cadastrar cliente :(", error);
		}

	});
});