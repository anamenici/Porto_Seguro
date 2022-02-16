package PortoSeguro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner entrada = new Scanner(System.in)) {
		List<String> degraus = new ArrayList<>();

					 

			System.out.print("Escreva o número de degraus dessa escada: ");
			int numDegraus = entrada.nextInt();

					 

			for (int i = 0; i < numDegraus; i++) {
			degraus.add(" ".repeat(numDegraus - i) + "*".repeat(i + 1));
			}

					 
			for (String d : degraus) {
			System.out.println(d);
			}
		
		}

	}

}

