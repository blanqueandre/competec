epublic class Main
{
	public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
		import java.util.Scanner;
public class Main
{
	public static void main(String[] args) { 
	        
	       /* int inteiros [] = {1,5,3};
	        int soma = inteiros [0] + inteiros [1] + inteiros [2];
	        int numeros [] = new int [5];
	        System.out.println(soma);*/
	        
	        Scanner leitor = new Scanner(System.in);
	        int tamanho = leitor.nextInt();
	        int N [] = new int [tamanho];
	        for(int i=0; i < N.length;i++) {
	            N[i] = leitor.nextInt();
	        }
	          System.out.println("-----" );
	     for(int i=0; i < N.length;i++) {
         System.out.println(N[i] );
	    }
	
	}
		
	}


	}
}
