import java.util.Scanner;

 
public class EX_Imagem
{
  
 
public static void main (String[]args)
  {
    
Scanner ler = new Scanner (System.in);
    
 
      // Declaracao das variaveis, variavel de matriz com valor definido 16x16
    int i, j, m[][] = new int[4][4];
    
 
      // Exibir ao usuario uma informacao sobre o codigo
      System.out.printf ("Crie um desenho a partir de uma matriz 16x16\n");
    
 
      // Estrutura de repeticao numero de linhas da matriz
      for (i = 0; i < 4; i++)
      {
	
	  // Exibir ao usuario informacao das cores para o desenho + contagem
	  System.out.
	  printf
	  ("Cores: Branco(0); Preto(1); Vermelho(2); e Bege(3).\nInforme as cores da %da. linha:\n",
	   
(i + 1));
	
	  // Estrutura de repeticao numero de colunas da matriz
	  for (j = 0; j < 4; j++)
	  {
	    
	      // Receber do usuario um numero referente a uma coordenada da matriz
	      System.out.printf ("m[%d][%d] = ", i, j);
	    
	      // Guardar esse valor em uma coordenada da matriz
	      m[i][j] = ler.nextInt ();
	  
}
	
	  // Pular linha
	  System.out.printf ("\n");
      
}
    
      // Pular linha
      System.out.printf ("\n");
    
      // Estrutura de repeticao numero de linhas da matriz
      for (i = 0; i < 4; i++)
      {
	
	  // Estrutura de repeticao numero de colunas da matriz
	  for (j = 0; j < 4; j++)
	  {
	    
	      // Exibir os valores referente a coordenada da matriz
	      System.out.printf ("%d ", m[i][j]);
	  
}
	
	  // Pular linha 
	  System.out.printf ("\n");
      
}
  
}

}
