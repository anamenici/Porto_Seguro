package Aula02_LacoDecisao_IfElseSwitchCase;

import java.util.Scanner;

public class Decisao_ParImpar_PositivoNegativo {

	public static void main(String[] args) {
		
        int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com um n�mero inteiro: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 )
		{
			if(numero >= 0)
			{
				System.out.println("\n Este n�mero � par e positivo!");
			}
			else 
			{
				System.out.println("\n Este n�mero � par e negativo");
			}
		}
		else
		{
			if(numero > 0 ) 
			{
				System.out.println("\n Este n�mero � �mpar e positivo");
			}
			else
			{
				System.out.println("\n Este n�mero � �mpar e negativo");
			}
		}
	}

}
