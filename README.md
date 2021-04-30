# Exercícios de tratamento de Exceptions no Java

### Exercício 1

Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada

### Exercício 2

Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta.

### Exercício 3

Escreva uma classe Contato que contenha nome, telefone e um identificador.  Esse identificador deve ser gerado automaticamente pela classe através de um contador(cada vez que um Contato é criado o contador é incrementado e atribuído ao identificador).
Crie uma classe Agenda que irá funcionar para gerenciar os Contatos. 
Essa classe precisa de ter um método para adicionar um Contato e também para consultar. 
Crie uma classe Teste que informe um menu ao usuário: 

* 1 - para consultar um contato da agenda.

* 2 - para adicionar um contato na agenda.

Se o contato não existir, o programa deve lançar uma exceção de ContatoNaoExisteException. 

Caso a agenda esteja cheia quando o usuário quiser adicionar um novo contato, o programa deve lançar uma exceção AgendaCheiaException. 

Trate também as exceções de tipo de dados (caso o usuário entre com um tipo de dado invalido).

### Exercício 4

O código abaixo lança uma exceção (propositalmente) e interrompe sua execução.

Utilizando o tratamento de exceções, corrija a classe com o objetivo de não parar sua execução. 

### Exercício 5

Crie uma classe que crie um vetor de inteiros de 10 posições. Feito isso, permita que o usuário digite valores inteiros a fim de preencher este vetor. Não implemente nenhum tipo controle referente ao tamanho do vetor, deixe que o usuário digite valores até que a entrada 0 seja digitada. Uma vez digitado o valor 0, o mesmo deve ser inserido no vetor e a digitação de novos elementos deve ser interrompida. Feita toda a coleta dos dados, exiba-os em tela.

### Exercício 6

Crie uma classe Login com atributos usuario e senha e um método para entrar na conta.

 Elabore um teste para cadastro de usuário e senha e depois uma simulação de login.

Realize o tratamento de excessões para os erros de login.