document.addEventListener("DOMContentLoaded", () => {
	
	document.getElementById("cep").addEventListener("input", async function(){
		const cep = this.value.replace(/\D/g, "");//armazenar o valor do cep, filtrando e excluindo qualquer tipo de dígito que não pertence a ele
		
		if(cep.length === 8){ //quando o usuário terminar de digitar, faz isso:
			try{
				const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`); //fazendo uma requisição para a api terceira e armazenando os valores nela
				
				if(!response.ok) throw new Error("Erro ao buscar o CEP");
				
				const dados = await response.json(); //coloca os valores da response no formato json
				
				if(dados.erro){
					alert("CEP não encontrado.")
					return;
				}
				
				document.getElementById("rua").value = dados.logradouro; //vai armazenar o valor do logradouro na api terceira na constante rua
				document.getElementById("bairro").value = dados.bairro;//mesma lógica com os outros valores
				document.getElementById("cidade").value = dados.localidade;//("id no meu html").value = dados.atributo na api terceira
				document.getElementById("estado").value = dados.estado;
			
			} catch (error){
				alert("Erro ao buscar o endereço: " + error.message);
			}
		}
	})
	
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
				alert("Erro ao cadastrar o endereço");
				
			} else {
				alert("Cadastro realizado com sucesso!");
				window.location.href = "sucessocadastro.html";
				
			}
		} catch (error) { //caso tenha um erro faz isso aqui
			console.error("Erro ao cadastrar o endereço :(", error);
		}

	});
});