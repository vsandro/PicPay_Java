# PicPay

Sandro Alves


## 1. Introdução

Implementação em Java Spring Boot

## 2. Definições

### Objetivo

Implementação do desafio PicPay em Java Spring.


## 3. Tecnologias (Technologies)

- Java Spring Boot
- Banco de dados em memória (H2)


**Postman**

- Use as collection do Postman para acesso aos endpoints da aplicação

```sh
PicPay - Java.postman_collection
```

**Post users**

```sh
{
    "firstName": "Joao",
    "lastName": "Alves",
    "document": "123456789-1",
    "email": "joao@gmail.com",
    "password": "123456",
    "userType": "MERCHANT",
    "balance": 500
}
```

```sh
{
    "firstName": "Sandro",
    "lastName": "Alves",
    "document": "123456789-2",
    "email": "sandro@gmail.com",
    "password": "123456",
    "userType": "COMMON",
    "balance": 10
}
```

```sh
{
    "firstName": "Ana",
    "lastName": "Santos",
    "document": "123456789-3",
    "email": "ana@gmail.com",
    "password": "123456",
    "userType": "COMMON",
    "balance": 50
}
```


**Post transactions**

```sh
{
    "senderId": 3,
    "receiverId": 2,
    "value": 10
}
```

