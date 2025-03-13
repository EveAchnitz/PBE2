document.addEventListener("DOMContentLoaded", () => {
	
	document.getElementById("cep").addEventListener("input", async function(){
		const cep = this.value.replace(/\D/g, "");
		
		if(cep.length === 8){ 
			try{
				const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`); 
				
				if(!response.ok) throw new Error("Erro ao buscar o CEP");
				
				const dados = await response.json();
				
				if(dados.erro){
					alert("CEP não encontrado.")
					return;
				}
				
				document.getElementById("rua").value = dados.logradouro; 
				document.getElementById("bairro").value = dados.bairro;
				document.getElementById("cidade").value = dados.localidade;
				document.getElementById("estado").value = dados.estado;
			
			} catch (error){
				alert("Erro ao buscar o endereço: " + error.message);
			}
		}
	})
	
	const form = document.getElementById("cadastroEndereco");
	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const bairro = document.getElementById("bairro").value;
		const numero = document.getElementById("numero").value;
		const cep = document.getElementById("cep").value;
		const rua = document.getElementById("rua").value;
		const complemento = document.getElementById("complemento").value;

		try {

			const response = await fetch("http://localhost:8080/cadastroenderecos", { 
				method: "POST",
				headers: {
					"Content-Type": "application/json" 
				},

				body: JSON.stringify({ 
					estado,
					cidade,
					bairro,
					rua,
					cep,
					numero,
					complemento
				}),

			});

			if (response.ok) {
				window.location.href = "sucessocadastro.html";
				
			} else {
				alert("Erro ao cadastrar o endereço");
				
			}
		} catch (error) { 
			console.error("Erro ao cadastrar o endereço :(", error);
		}

	});
});