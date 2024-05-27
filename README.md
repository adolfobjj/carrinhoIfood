# Restaurante API

## Visão Geral
Uma API RESTful para gerenciar uma aplicação de domínio de entrega, com foco específico em um carrinho de compras.

### Recursos
- Adicionar itens ao carrinho de compras
- Visualizar o carrinho de compras
- Finalizar o carrinho de compras
- Remover itens do carrinho de compras

### Demonstração da Aplicação
Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- **Java JDK** 8 ou superior
- **Git** 2.x
- **Postman** 9.x

**Para uma demonstração mais suave da aplicação, recomendamos a instalação do IntelliJ IDEA e a execução do projeto a partir da IDE.**

### Método Post :</br>
http://localhost:8080/clientes </br>
Json : </br>
{</br>
     "nome": "Nome do Cliente",</br>
  "endereco": "Endereço do Cliente"</br>
}</br></br>
http://localhost:8080/produtos </br>
{ </br>
  "nome": "Nome do Produto", </br>
  "valorUnitario": 10.5, </br>
  "restaurante": { </br>
    "id": 1, </br>
    "nome": "Nome do Restaurante", </br>
    "endereco": "Endereço do Restaurante" </br>
  } </br>
} </br>
http://localhost:8080/restaurantes </br>
{</br>
  "nome": "Nome do Restaurante",</br>
  "endereco": "Endereço do Restaurante"</br>
}</br></br>
http://localhost:8080/carrinho/criar</br>
{</br>
  "cliente": {</br>
    "id": 1,</br>
    "nome": "Nome do Cliente",</br>
    "endereco": "Endereço do Cliente"</br>
  },</br>
  "itens": [</br>
    {</br>
      "produtoId": 2, // fornecendo apenas o id do produto</br>
      "quantidade": 2</br>
    }</br>
  ],</br>
  "valorTotal": 21.0,</br>
  "formaPagamento": "DINHEIRO",</br>
  "fechada": false</br>
}</br></br>

http://localhost:8080/carrinho/1/fechar (PUT)</br>
Aqui muda o status do carrinho para fechado</br>

### Contribuições
Este repositório foi criado para fins educacionais, portanto, sinta-se à vontade para contribuir. Se este projeto foi útil de alguma forma, por favor, avise-nos. E se você conhece alguém que possa achar esse conteúdo útil, não hesite em compartilhá-lo.

Obrigado pelo seu interesse na API do Restaurante!
