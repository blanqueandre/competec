public class Main
{
	public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
		
		import java.util.Scanner;
public class Main
{
	    public static void main(String[] args) {
	        
	    System.out.println("nome");
	    Scanner scan = new Scanner(System.in);
	    String nome = scan.nextLine();    
	    	    	    	         
	    	    	    	         
	    System.out.println(nome); 
	    int tamanho = nome.length();
	    System.out.println("Olá, "+ nome + ", seu nome tem "+ tamanho +" caracteres");
	    
	    String PalavraSecreta = "batata";
	    System.out.println("Digite a palavra secreta: ");
        String palavra = scan.nextLine();
  
        if (palavra.equals(PalavraSecreta)) {
            System.out.println("Parabéns, você acertou!");
       } else {
            System.out.println("Que pena, você errou!");
        }
	    
	 }
}


  
