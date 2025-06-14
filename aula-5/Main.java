public class Main
{
	public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
		import java.util.Scanner;
                public class Main
{
	public static void main(String[] args) {
	    
	    
	
		
	       /* int [][] tabela = {{1,2},{2,3}};
				    
				    
			int lin =2,col =2;
		                               
		        for(int i = 0; i < lin; i++) {
                for(int j = 0; j < col; j++){
                    System.out.print(tabela[i][j] + " ");
                }
                System.out.println("");
            }
            */
            
            
            int [][] matriz2 = new int [3][3];
            
            int lin =3, col =3;
            Scanner entrada = new Scanner(System.in);
            
             for(int i = 0; i < lin; i++) {
                 
            for(int j = 0; j < col; j++) {
                 System.out.println("LINHA: " + i + " COLUNA: "+ j);
             matriz2[i][j]=   entrada.nextInt();
               
            }
                System.out.println("");
            
            }
            
            for(int i = 0; i < lin; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matriz2 [i][j] + " ");
            }
               System.out.println("");
            }
            
		    
		    
	}
}

	}
}
