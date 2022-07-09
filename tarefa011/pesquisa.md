**Padrões de Codificação**  
    Definição:
        Os padrões de codificação é uma prática em que uma equipe estabelece uma maneira de programar que
        todos devem adotar, promovendo o fácil entendimento do código, já que está tudo escrito da mesma
        maneira e qualquer integrante da equipe poderá ler, entender e modificar o código facilmente.   

    Onde e quando utilizar:
        Essa prática deve ser utilizada durante todo o percuso de codificação, se desviar em qualquer momento,
        já estará fugindo do padrão estabelecido. Alguns locais que fica fácil de encontrar o padrão de um projeto
        é na identação, nos espaços em branco, na nomenclatura, entre outos.

    Porque utilizar:
        - Facilita o desenvolvimento
        - Facilita a busca por bugs
        - Facilita a manutenção
        - Aumenta produtividade
        - Melhora o trabalho em equipe
        - Facilita a leitura do código

    Exemplo de utilização:
        A escolha de como o código deve ser identado, onde e quantos espaços em branco colocar, como os comentário
        são feitos.

**Reflexão**  
    Definição:
        É a habilidade que um programa tem de examinar ou modificar sua própria estrutura, como o comportamento de
        classes, métodos e interfaces durante o tempo de execução.  

    Onde e quando utilizar:
        A reflexão é utilizada quando é necessário carregar classes de assembly e instanciá-las durante o tempo de execução, é necessário pegar atributos públicos de um objeto, para fazer testes através da criação de objetos falsos, quando precisa construir novos tipos durante o tempo de execução, entre outros.
    Porque utilizar:
        - Aumenta produtividade
        - Aumenta a flexibilidade de um código
        - Melhora a eficiência
        - Facilitar trabalhos mais complexos
    Exemplo de utilização:
        - GetType(): Usado para descobrir o tipo de uma variável
**Programação Defensiva**  
    Definição:
        É um conjunto de práticas para implementar em um código, que possibilita evitar problemas provindas de situações não esperadas, garantindo assim a disponibilidade do sistema, a integridade dos dados e funcionamento da aplicação.

    Onde e quando utilizar:
        A programação defensiva precisa ser utilizada durante o código inteiro, principalmente quando o código recebe dados de usuários/fontes externas.

    Porque utilizar:
        - Eliminar códigos desnecessários
        - Menos tempo de debug
        - O código será mais persistente
        - Ajuda criar um código mais compreensivel
        - Previsibilidade de um software

    Exemplo de utilização:
        - Verificar se a função malloc() realizou seu objetivo:

        void teste(void) {
            uint8_t *buf = malloc(128);
            if (buf == NULL) {
            }
        }