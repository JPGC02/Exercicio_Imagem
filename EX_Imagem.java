import java.util.Scanner;



public class EX_Imagem {



    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);



        // Declaracao das variaveis e declaração da matriz
        int i, j, m[][] = new int[16][16];

        // enunciado do exercicio
        System.out.printf("Crie um desenho a partir de uma matriz 16x16\n");
        // numero de repeticoes da matriz 
        for (i = 0; i < 16; i++) {
            // informacoes das cores com seus respectivos numeros para o desenho 
            System.out.
            printf
                ("Cores: Branco(0); Preto(1); Vermelho(2); e Bege(3).\nInforme as cores da %da. linha:\n",
                    (i + 1));
            // numero de repeticoes da matriz 	 
            for (j = 0; j < 16; j++) {
                // Receber um numero referente a uma coordenada
                System.out.printf("m[%d][%d] = ", i, j);
                // Guardar esse valor em uma coordenada da matriz
                m[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (i = 0; i < 16; i++) {
            for (j = 0; j < 16; j++) {
                // Exibir os valores das coordenadas da matriz
                System.out.printf("%d ", m[i][j]);
            }
            System.out.printf("\n");
        }

    }


}
