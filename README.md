Como usar este repositório:

Na raiz existem 3 áreas de projetos sendo eles:

[1] Create

Este diretório possui o arquivo Create.c que explica como uma thread pode ser criada e gerenciada em C <br/>
Para compilar o arquivo utilize a sintáxe gcc Create.c -lpthread -o Create <br/>
Para rodar o código basta apontar para ./Create <br/>
O resultado será de duas threads concorrendo pelo CPU e escrevendo mensagens de olá na tela <br/>

[2] Sync [OK]

Este diretório possui o arquivo Sync.c que explica como uma thread pode ser sincronizada em C <br/>
Para compilar o arquivo utilize a sintáxe gcc Sync.c -lpthread -o Sync <br/>
Para rodar o código basta apontar para ./Sync <br/>
O resultado será de duas threads concorrendo pelo CPU e escrevendo mensagens na tela <br/>

[3] Comun

Este diretório possui 3 projetos C <br/>

[3.1] Projeto do chat em C

Este diretório contem o projeto de um chat servidor/cliente do tipo 1 servidor N clientes <br/>
Você deve compilar os arquivos utilizando a sintáxe gcc Client.c -lpthread -o Client e gcc Server.c -lpthread -o Server <br/>
Rode o servidor utilizando o comando ./Server 3389 <br/>
Rode o cliente utilizando o comando ./Client IPv4 3389 <br/>

[3.2] Transmissão de arquivos em C usando Socket

Este diretório contem o projeto de um programa que realiza a transmissão de um arquivo de um Client para um Server <br/>
Altere a linha 22 no Client.c com o IPv4 do servidor + porta 3389 e o arquivo e compile <br/>
Você deve compilar os arquivos utilizando a sintáxe gcc Client.c -lpthread -o Client e gcc Server.c -lpthread -o Server <br/>
Rode o servidor utilizando o comando ./Server <br/>
Rode o cliente utilizando o comando ./Client <br/>

[3.3]
