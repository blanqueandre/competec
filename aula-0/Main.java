/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada=new Scanner(System.in);
	    
	    System.out.println("digite seu nome");
	    String nome = entrada.nextLine();
	    System.out.println(nome + "fez esse código");
	    
	    
	    System.out.println("Qual sua idade");
	    int idade= entrada.nextInt();
	    System.out.println(nome + " tem" + idade + " anos");
	    
	    System.out.println("Esta em casa?");
	    boolean resposta = entrada.nextBoolean();
	    //boolean  =(true);
	    
	    char inicial= 'a';
	  
	    boolean cafe= true;
	    int laranja= 5;
	    int uva= 3;
	    int soma= laranja + uva;
	    System.out.println("uva:" + uva);
	    System.out.println("laranja:" + laranja);
	    System.out.println("Resultado:" + soma);
	}
}
