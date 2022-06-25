import statistics

primeiraLista = [8, 9, 7]
segundaLista = [4, 5, 6]
primeiraMedia = statistics.mean(primeiraLista)
segundaMedia = statistics.mean(segundaLista)
somaMedias = (primeiraMedia + segundaMedia)
print("A média aritmética de 8, 9 e 7 é: ", primeiraMedia)
print("A média aritmética de 4, 5 e 6 é: ", segundaMedia)
print("A soma das duas médias é: ", somaMedias)
print("A média das médias é: ", somaMedias/2)
