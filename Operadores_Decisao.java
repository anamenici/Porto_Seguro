package Aula02_LacoDecisao_IfElseSwitchCase;

import java.util.Scanner;

public class Operadores_Decisao {
	public static void main(String[] args) {
				
		float n1, n2, resultado=0;
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n 1 - Soma");
		System.out.println("\n 2 - Diferen�a");
		System.out.println("\n 3 - Multiplica��o");
		System.out.println("\n 4 - Divis�o");
		System.out.println("\nEntre com sua op��o: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if(n2==0)
			{
				System.out.println("\nN�o � poss�vel fazer a divis�o por zero");
			}
			else 
			{
			resultado = n1 / n2;
			}
			break;
		default: 
			System.out.println("\n Op��o Inv�lida!");
		}
		System.out.println("\n Resultado: " + resultado);
		
	}
}
