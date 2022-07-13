# Exercício de tratamento de exceções em Java

A intenção do projeto é tratar as exceções de forma organizada, delegando as funções para as classes corretas e usando programação orientada a objetos.
##
Na imagem abaixo temos o programa rodando de forma correta, recebendo os dados de uma conta e fazendo um saque. Como o valor o valor sacado estava abaixo do valor de limite e do saldo, o saque foi bem sucedido.

![image](https://user-images.githubusercontent.com/91509587/178846446-24dc95c7-0110-4f3a-b919-0a7f71383b87.png)

Na imagem abaixo temos o primeiro tratamento de erro, pois o valor que deveria ser sacado, apesar de ser menor que o saldo, é maior que o limite permitido. Nesse caso a operação retorna uma exception e cancela a operação.

![image](https://user-images.githubusercontent.com/91509587/178852380-04a10ff5-102d-4b7f-add0-d67f6bf313b6.png)

Por fim, temos a operação onde, apesar do valor a ser sacado esteja dentro do limite permitido, é maior que o valor em conta, retornando assim uma exception e cancelando a operação.

![image](https://user-images.githubusercontent.com/91509587/178852541-369710fa-ca24-47ec-ad3e-8db3a5e72676.png)
