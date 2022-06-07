### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git? 
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
  b. git help checkout 
  c. git help merge 
  d. git init
  e. git add --all
  f. git add -u 
  g. git config -l
  h. git mv a.txt b.txt
  i. git reset --hard
  j. git log -27
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
6. Qual o comando para efetuar um _commit_?
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
9. O que acontece se o seu repositório local for acidentalmente removido?
10. Como clonar um repositório remoto?
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
13. Qual o comando para criar um repositório local?
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
30. O que o comando **git push origin 3.4-gold** teria como efeito?
31. Após executar um commit, qual o efeito de **git commit --amend**?
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.

**RESPOSTAS**
1. git --version ----
2. 
  a. Devolve informações sobre o Git
  b. Devolve informações sobre o comando checkout, que permite trocar entre branches ou restaurar os arquivos da árvore de trabalho.
  c. Devolve informações sobre o comando merge, que permite unir dois ou mais históricos de desenvolvimento
  d. Gera um repositório git vazio ou reinicializa um já existente
  e. Adiciona todos os arquivos no stage.
  f. Atualiza ou remove arquivos que ja foram adicionadas, esse comando não adiciona nenhum arquivo novo.
  g. Lista todas as variáveis definidas no arquivo de configuração e seus valores
  h. Renomeia o arquivo de texto "a" para "b"
  i. Descarta as alterações na área de stage e também reverte todas as alterações no diretório de working para o commit informado no comando
  j. Exibe os registros log dos últimos 27 commit
3. Para o primeiro passo é necessário do comando "git add" e para o segundo, é necessário o comando "git commit"
4. git log ou git diff
5. git ls-files --others --exclude-standard ou git status
6. git commit -m "insere mensagem aqui"
7. git reset teste.txt
8. Para ignorar um diretório, basta criar um arquivo .gitignore, que é um arquivo texto, e nela adicionar o nome do diretório que deseja ignorar
9. Quando um repositório local é removido localmente, ele continua existindo no repositório remoto. Para desfazer esse incidente, é necessário realizar um git reset, recuperando o repositório do último commit.
10. git clone + o URL do repositório remoto.
11. git log --pretty=oneline
12. Informações de configuração são guardados no arquivo .gitconfig
13. git-init
14. O diretório secreto criado pelo git ao inicializar um repositório chama .git
15. git add -u
16. SHA1 significa secure hash algorithm, que é um tipo de criptografia. Isso permite a proteção de mensagens importantes através da codificação delas por dispersão.
17. Uma revisão é usada para apontar para o id/ hash de SHA1 de um commit
18. Não, pois o comando git add -u apenas atualiza arquivos previamente adicionados
19. 
    **git reset --soft HEAD~1** ~ Move apenas o ponteiro HEAD para outro commit e não alterar a área de stage ou o diretório de working. Os arquivos que passaram por modificação ficam como mudanças a serem comitadas.
    **git reset --hard** ~ Descarta as alterações na área de stage e reverte todas as alterações no diretório de working para o estado do commit especificado ao                                  utilizar o comando
20. git clean -f e git clean -d
21. arquivo .gitignore
22. Para ignorar os arquivos com uma extensão específica, é necessário incluir essa regra no arquivo .gitignore. Nesse caso, precisa incluir a regra *.class dentro do arquivo .gitignore
23. -
24.  






</DIV/>
