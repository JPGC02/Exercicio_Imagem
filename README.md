# Exercicio_Imagem
_______________________________________________________________________________________________

Crie um programa que monte uma matriz 16x16, conforme a imagem abaixo. ao iniciar o programa o usuário poderá inserir 4 cores que são: Branco, zero (0); Preto,  um (1); Vermelho, dois (2) e Bege, três (3).

Ao iniciar o programa o usuário poderá inserir cada número correspondente a imagem seguindo a cada linha.

_________________________________________________________________________________________________

INÍCIO

    VAR
    i, j, m : inteiros

    PARA i -> 0, i -> 16, i = i + 1, FAÇA
          ESCREVA('Escreva os elementos da linha [x]' -> i + 1)
      PARA J = 0, J -> 16, i = i + 1, FAÇA
          ESCREVA('m[x][y]' -> i, j)
      FIM PARA
    FIM PARA
    PARA i = 0, j -> 16, i = i + 1, FAÇA
       PARA j = 0, j -> 16, j = j + 1, FAÇA
          ESCREVA('x' -> m[i][j])
      FIM PARA
    FIM PARA

FIM
____________________________________________________________________________________________________
