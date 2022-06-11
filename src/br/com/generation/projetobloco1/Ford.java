package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ford {

	static Scanner sc = new Scanner(System.in);
	// vetores
	static String[] ford = { "Ka", "Focus", "Ecosport" };
	static double[] litrokmford = { 13.4, 8.1, 10.3 };
	// declarando as opções
	static int opcao, opcao1;
	static double Co2 = 157;
	static double resultado;

	// criando os modulos
	public static void listamodelos() {

		String menufiat[][] = { { "██████████████████████████████████████████████████████████" },
				{ "░░░░░░░░░░░░░░░░░░░lista de modelos Fiat░░░░░░░░░░░░░░░░░░" },
				{ "██████████████████████████████████████████████████████████" },
				{ "██████████████████████| 1 - Ka       |████████████████████" },
				{ "██████████████████████| 2 - Focus    |████████████████████" },
				{ "██████████████████████| 3 - Ecosport |████████████████████" },
				{ "██████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menufiat.length; l++) {
			for (int c = 0; c < menufiat[l].length; c++) {

				System.out.print(menufiat[l][c]);
			}
			System.out.println();
		}

		
		System.out.print("\nEscolha o modelo do carro: ");

	}

	public static void opcao1() {

		resultado = litrokmford[0] * Co2;

		System.out.println();
		System.out.println("A cada 13.4km rodados o Ford Ka gasta " + litrokmford[0]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}

	public static void opcao2() {

		resultado = litrokmford[1] * Co2;

		System.out.println();
		System.out.println("A cada 8.1km rodados o Ford Focus gasta " + litrokmford[1]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");
	}

	public static void opcao3() {

		resultado = litrokmford[2] * Co2;

		System.out.println();
		System.out.println("A cada 10.3km rodados o Ford Ecosport gasta " + litrokmford[2]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");
	}

}
