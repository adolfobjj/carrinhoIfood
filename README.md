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
    "nome": "Exemplo Nome 2",</br>
    "endereco": {</br>
        "cep": "12345-678",</br>
        "complemento": "Apartamento 101"</br>
    }</br>
}</br>


### Tecnologias Utilizadas
- **Spring Initializr**: [https://start.spring.io/](https://start.spring.io/)
- **Spring Boot Starter Web**: 2.7.4
- **Spring Boot Starter Data JPA**: 2.7.4
- **Lombok**: 1.18.24
- **Springfox Boot Starter**: 3.0.0
- **Banco de Dados H2**: 2.1.214

### Contribuições
Este repositório foi criado para fins educacionais, portanto, sinta-se à vontade para contribuir. Se este projeto foi útil de alguma forma, por favor, avise-nos. E se você conhece alguém que possa achar esse conteúdo útil, não hesite em compartilhá-lo.

Obrigado pelo seu interesse na API do Restaurante!
