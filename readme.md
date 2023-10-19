Uma API Rest que disponibilize o endpoint /students por meio do qual pode-se obter uma lista de alunos com suas respectivas turmas. Os alunos serão instanciados no método hard code. Um aluno é associado a apenas uma classe, porém, uma classe está associada a vários alunos. 

 
Resultado esperado:
[
	{
		“id”: 1,
		“name”: “Maria”,
		“age”: 15,
		“class”: {
		“id”: 1,
		“name”:  “Turma A”
		}
	}
{
		“id”: 2,
		“name”: “João”,
		“age”: 17,
		“class”: {
		“id”: 4,
		“name”:  “Turma D”
		}
	}

O que será utilizado?
-	Web Server (Tom Cat)
-	App Spring Boot Java
-	Multi-threading
-	Mapeamento de URL
-	Serialização JSON

1 – Iniciei o projeto pelo Spring initializr
2 – Com a criação do pacote Entity, criei as classes Student e Class com seus respectivos getters and setters e construtores.
3 – Criei o subpacote Controller da entidade Student para que seja possível a criação do endpoint, a notação @RestController configura que a classe possa responder a API, com a @RequestMapping foi possível definir o caminho do endpoint. Logo após foi inserido uma função com algumas instâncias de objeto para estar iniciando, essa função retornará os estudantes cadastrado. A notação @GetMapping definirá que essa função será a resposta para a requisição GET desse endpoint.
4 – Foi criado um atributo na classe Student do tipo Class para definir a associação.
