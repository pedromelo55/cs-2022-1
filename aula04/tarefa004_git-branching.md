### Tarefa 004: Git Branching - 03/06/2021

1. Qual o nome do branch padrão do Git?
2. O que o comando **<code>git branch nome</code>** realiza?
3. Como criar um branch a partir de um commit específico?
4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?
5. Qual o comando para se alternar para um branch de nome **experimento2**?
6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?
7. O que o comando **<code>git checkout -b</code>** nome faz?
8. Qual a função do <code>**comando git branch -d teste</code>**?
9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.

**Respostas**  
1. Master  
2. Cria um branch com o nome informado no comando  
3. Git checkout -b <nome do branch> <commit>  
4. 
5. Git checkout experimento2  
6. Mostra os dois branches, marcando o branch b1 com um asterisco  
7. Cria um novo branch  
8. Apaga um branch  
9.  
     Git branch branchtest1  
     Git checkout branchtest1  
     Git add (nome de um arquivo)  
     Git commit -m "branchtest1 criado e um arquivo foi adicionado"  
     Git branch branchtest2  
     Git checkout branchtest2  
     Git add -u (atualiza as mudancas feita no arquivo previamente adicionado)  
     Git commit -m "arquivo foi modificado"  
     Git checkout Master  
     Git merge branchtest1  
     Git merge branchtest2  


</DIV/>
