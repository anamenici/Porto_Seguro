package PortoSeguro;

import java.util.Scanner;


public class OlaMundoPublicStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; //criando uma vari�vel do tipo String
		int idade=26;//acrescentar x e y depois
		double altura, nota1, nota2, nota3, media;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Ol�, Mundo!!!");//sa�da de dados, ou seja, impress�o no console
			
			System.out.println("\nEntre com o seu nome: ");
			nome = leia.nextLine(); 
			
			System.out.println("\nEntre com sua altura: ");
			altura = leia.nextFloat();		
			
			System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextFloat();
			
			System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextFloat();
			
			System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextFloat();
		}
		
		media = (nota1+nota2+nota3) / 3;
		
		if(media>=7 && media <=10)
		{
			System.out.println("\nAluno Aprovado!");
		}
		else if(media>=5 && media<7)
		{
			System.out.println("\nAluno de Exame!"); 
		}
		else if(media>=0 && media<5)
		{
			System.out.println("\nAluno Reprovado!");
		}
		else
		{
			System.out.println("\nM�dia Inv�lida!");
		}
		
		System.out.println("Meu nome �: "+nome+", eu tenho: "+
		idade+" anos(s) e a minha altura �: "+altura);
		
		System.out.printf("\nM�dia aritm�tica: %2.2f",media);
		
		//nota1 = Math.sqrt(nota2);
		//nota2 = Math.pow(nota3, 3);
		
		/*System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
		
		x = x % y;
		*/
		}

}
