# TaskHive Backend
Essa aplicação foi criada com o objetivo de obtenção da aprovação na disciplina Programação Orientada a Objetos, no curso de Ciência da Computação, na Universidade Federal do Agreste de Pernambuco.

### Autores
[<img src="https://img.shields.io/badge/Lucas Victor-%2312100E.svg?&style=for-the-badge&logo=github&logoColor=white" />](https://github.com/lucas8790)
[<img src="https://img.shields.io/badge/Ricardo Martins-%2312100E.svg?&style=for-the-badge&logo=github&logoColor=white" />](https://github.com/RickyM7)
[<img src="https://img.shields.io/badge/Sara Abreu-%2312100E.svg?&style=for-the-badge&logo=github&logoColor=white" />](https://github.com/ynjisng)

### Descrição
O TaskHive é uma aplicação de gerenciamento de tarefas que utiliza o paradigma da Programação Orientada a Objetos (POO) para organizar e estruturar o código. O backend do TaskHive foi desenvolvido em Java com o framework Spring Boot e utiliza o gerenciador de dependências Gradle.

### Instalação
Para rodar o backend do TaskHive, é necessário ter o Java e o Gradle instalados em sua máquina. Após clonar este repositório, acesse a pasta taskhive-backend e rode o comando gradle bootRun. Isso iniciará o servidor backend na porta 8080.

### Banco de Dados
O TaskHive utiliza o banco de dados Postgresql para armazenar os dados. O arquivo application.properties contém as configurações de acesso ao banco de dados.

### API Endpoints

## Cadastrar Usuário:
#### POST /usuario/cadastrar
+ Request (application/json)
	{"nome": "", "email": "", "senha": ""}
+ Response 201 (application/json)
	{"id": 0, "nome": "", "email": ""}

## Obter Usuário pelo ID:
#### GET /usuario/{usuarioId}
+ Parameters
	+ usuarioId (long) - O ID do usuário que você deseja obter informações.
+ Response 200 (application/json)
	{"id": 0, "nome": "", "email": ""}
+ Response 404 (application/json)
	{"mensagem": "Usuário não existe!"}

## Logar no Usuário:
#### GET /usuario/login
+ Request (application/json)
	{"email": "", "senha": ""}
+ Response 201 (application/json)
	{"id": 0, "nome": "", "email": "", ...}
+ Response 400 (application/json)
	{mensagem: “Usuário já existe!”}

## Cadastrar Papel:
#### POST /papel/cadastrar
+ Request (application/json)
	{"nome": "", "descricao": "", …}
+ Response 201 (application/json)
	{"id": 0, "nome": "", "descricao": "", ...}


## Obter Papel pelo ID:
#### GET /papel/{papelId}
+ Parameters
	+ papelId (long) - O ID do papel que você deseja obter informações.
+ Response 200 (application/json)
	{"id": 0, "nome": "", "descricao": ""}
+ Response 404 (application/json)
	{"mensagem": "Papel não existe!"}

## Listar Todos os Papéis:
#### GET /papel/lista
+ Response 200 (application/json)
	[{"id": 0, "nome": "", "descricao": ""}, …]
+ Response 500 (application/json)
	{"mensagem": "Papéis não encontrados!"}


## Listar Projetos no Papel:
#### GET /papel/{papelId}/projetos
+ Response 200 (application/json)
	[{"id": 0, "nome": "", "descricao": ""}, …]
+ Response 500 (application/json)
	{"mensagem": "Projetos não encontrados!"}



## Cadastrar Projeto:
#### POST /projeto/cadastrar
+ Request (application/json)
	{"nome": "", "descricao": "", …}
+ Response 201 (application/json)
	{"id": 0, "nome": "", "descricao": "", ...}


## Obter Papel pelo ID:
#### GET /projeto/{papelId}
+ Parameters
	+ projetoId (long) - O ID do projeto que você deseja obter informações.
+ Response 200 (application/json)
	{"id": 0, "nome": "", "descricao": ""}
+ Response 404 (application/json)
	{"mensagem": "Projeto não existe!"}

## Listar Todos os Projetos:
#### GET /projeto/lista
+ Response 200 (application/json)
	[{"id": 0, "nome": "", "descricao": ""}, …]
+ Response 500 (application/json)
	{"mensagem": "Projetos não encontrados!"}


## Listar Tarefas no Projeto:
#### GET /projeto/{papelId}/tarefas
+ Response 200 (application/json)
	[{"id": 0, "titulo": "", "descricao": ""}, …]
+ Response 500 (application/json)
	{"mensagem": "Tarefas não encontradas!"}


## Listar TarefasLista no Projeto:
#### GET /projeto/{papelId}/tarefaslista
+ Response 200 (application/json)
	[{"id": 0, "titulo": "", "descricao": ""}, …]
+ Response 500 (application/json)
	{"mensagem": "TarefasLista não encontradas!"}

## Cadastrar Tarefa Lista
#### POST /tarefalista
+ Request (application/json)
	{"titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "subtarefas": null}
+ Response 200 (application/json)
	{“id”: 0, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "subtarefas": null}
+ Response 404 (application/json)
	{"mensagem": "Bad Request!"}

## Procurar Tarefa Lista pelo ID
#### GET /tarefalista/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja buscar.
+ Response 200 (application/json)
	{“id”: 0, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "subtarefas": null}
+ Response 404 (application/json)
	{"mensagem": "Tarefa Não Existe"}

## Listar Todas as Tarefas Lista
#### GET /tarefalista
+ Response 200 (application/json)
	{[{“id”: 0, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "subtarefas": null}], …}
+ Response 404 (application/json)
	{"mensagem": "Bad Request!"}

## Atualizar Tarefa Lista
#### PATCH /tarefalista/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja atualizar.
+ Request
	{“id”: null, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "subtarefas": null}
+ Response 200 (application/json)
	{“ok”: "TarefaLista atualizada com sucesso!"}
+ Response 404 (application/json)
	{"mensagem": "Tarefa Não Existe"}

## Deletar Tarefa Lista
#### DELETE /tarefalista/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja deletar.
+ Response 200 (application/json)
	{“ok”: "TarefaLista deletada com sucesso!"}
+ Response 404 (application/json)
	{"mensagem": "Tarefa Não Existe"}

## Adicionar Subtarefa em Tarefa Lista
#### POST /tarefalista/{tarefaId}/item
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja adicionar uma subtarefa.
+ Request (application/json)
	{"item": "", "checked": false}
+ Response 200 (application/json)
	{“id”: 0, "item": "", "checked": false}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Adicionar Comentário em Tarefa Lista
#### POST /tarefalista/{tarefaId}/comentario
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja adicionar um comentário.
+ Request (application/json)
	{“mensagem”: “”}
+ Response 200 (application/json)
	{“id”: 0, “mensagem”: “”}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Adicionar Usuário em Tarefa Lista
#### POST /tarefalista/{tarefaId}/{userId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja atribuir a um usuário;
	+ userId (Long) - O ID do usuário que deseja atribuir a tarefa.
+ Response 200 (application/json)
	{"id": 0, "nome": "", "email": ""}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Cadastrar Tarefa
#### POST /tarefa
+ Request (application/json)
	{"titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "descricao": ""}
+ Response 200 (application/json)
	{“id”: 0, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "descricao": ""}
+ Response 404 (application/json)
	{"mensagem": "Bad Request!"}

## Procurar Tarefa pelo ID
#### GET /tarefa/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja buscar.
+ Response 200 (application/json)
	{“id”: 0, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "descricao": ""}
+ Response 404 (application/json)
	{"mensagem": "Tarefa Não Existe"}

## Listar Todas as Tarefas
#### GET /tarefa
+ Response 200 (application/json)
	{[{“id”: 0, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "descricao": ""}], …}
+ Response 404 (application/json)
	{"mensagem": "Tarefa Não Existe"}

## Atualizar Tarefa
#### PATCH /tarefa/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja atualizar.
+ Request (application/json)
	{“id”: null, "titulo": "", "prioridade": "", "categoria": null, "comentario": null, "lembrete": null, "user": null, "projeto": [{id: null}], "data_criacao": null, "data_conclusao": null, "data_prevista": "", "arquivado": false, "exluido": false, "descricao": ""}
+ Response 200 (application/json)
	{“ok”: "Tarefa atualizada com sucesso!"}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Deletar Tarefa
#### DELETE /tarefa/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja deletar.
+ Response 200 (application/json)
	{“ok”: "Tarefa deletada com sucesso!"}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Adicionar Comentário em Tarefa
#### POST /tarefa/{tarefaId}/comentario
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja adicionar um comentário.
+ Request (application/json)
	{“mensagem”: “”}
+ Response 200 (application/json)
	{“id”: 0, “mensagem”: “”}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Adicionar Usuário em Tarefa
#### POST /tarefa/{tarefaId}/{userId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja atribuir a um usuário.
+ userId (Long) - O ID do usuário que deseja atribuir a tarefa.
+ Response 200 (application/json)
	{"id": 0, "nome": "", "email": ""}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Cadastrar Registro de Status
#### POST /registrostatus
+ Request (application/json)
	{"tarefa": [{ "id": null}], "tarefa_lista": [ ], "data_registro": "", "status": [{ "id": null }]}
+ Response 200 (application/json)
	{“ok”: "Status registrado com sucesso!"}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Procurar Registro pelo ID
#### GET /registrostatus/{registroId}
+ Parameters
	+ registroId (Long) - O ID do registro que deseja buscar.
+ Response 200 (application/json)
	{“id”: 0, "tarefa": [{ "id": null}], "tarefa_lista": [ ], "data_registro": "", "status": [{ "id": null }]}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Procurar Registro pelo Status
#### GET /registrostatus/status/{statusId}
+ Parameters
	+ statusId (Long) - O ID do status que deseja buscar os registros de status que foram realizados.
+ Response 200 (application/json)
	{“id”: 0, "tarefa": [{ "id": null}], "tarefa_lista": [ ], "data_registro": "", "status": [{ "id": null }]}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Procurar Registro pela Tarefa
#### GET /registrostatus/tarefa/{tarefaId}
+ Parameters
	+ tarefaId (Long) - O ID da tarefa que deseja buscar o registro de status.
+ Response 200 (application/json)
	{“id”: 0, "tarefa": [{ "id": null}], "tarefa_lista": [ ], "data_registro": "", "status": [{ "id": null }]}
+ Response 404 (application/json)
	{"mensagem": "Tarefa não Existe!"}

## Carregar todos os Registro de Status
#### GET /registrostatus
+ Response 200 (application/json)
	{[{ “id”: 0, "tarefa": [{ "id": null}], "tarefa_lista": [ ], "data_registro": "", "status": [{ "id": null }]}], …}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}

## Atualizar Registro de Status
#### PATCH /registrostatus/{registroId}
+ Parameters
	+ registroId (Long) - O ID do registro que deseja atualizar.
+ Request (application/json)
	{“id”: 0, "tarefa": [{ "id": null}], "tarefa_lista": [ ], "data_registro": "", "status": [{ "id": null }]}
+ Response 200 (application/json)
	{“ok”: "Registro de Status Atualizada com sucesso"}
+ Response 404 (application/json)
	{"mensagem": "Bad Request"}
