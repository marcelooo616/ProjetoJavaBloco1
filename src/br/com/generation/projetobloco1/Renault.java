package br.com.generation.projetobloco1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Renault {

	static Scanner sc = new Scanner(System.in);
	static String[] renault = { "Kwid", "Sandero", "Duster" };
	static double[] litrokmrenault = { 14.9, 12.5, 11.1 };

	static int opcao1 = 0;
	static double Co2 = 2.3;
	static double resultado;

	public static void listamodelos() {

		String menufiat[][] = { { "\n                            " },
				                { "██████████████████████████████████████████████████████████████████████████████████" },
				                { "░░░░░░░░░░░░░░░░░░░lista de modelos Renault░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ " },
				                { "██████████████████████████████████████████████████████████████████████████████████" },
			                 	{ "██████████████████████| 1 - Kwid    |█████████████████████████████████████████████" },
				                { "██████████████████████| 2 - Sandero |█████████████████████████████████████████████" },
				                { "██████████████████████| 3 - Duster  |█████████████████████████████████████████████" },
				                { "██████████████████████████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menufiat.length; l++) {
			for (int c = 0; c < menufiat[l].length; c++) {

				System.out.print(menufiat[l][c]);
			}
			System.out.println();
		}

		System.out.print("\nEscolha o modelo do carro: ");	

	}

	public static void escolhaopcao() {

		System.out.println("Escolha a opção ");
		Scanner entrada = new Scanner(System.in);
		opcao1 = sc.nextInt();
	}

	

	public static void opcao1() {

		resultado = litrokmrenault[0] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 14.9km rodados o Renault Kwid gasta 1L de gasolina███████████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de carbono na atmosfera██████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}

	}

	public static void opcao2() {
		resultado = litrokmrenault[1] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 12.5km rodados o Renault Sandero gasta 1L de gasolina████████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de carbono na atmosfera██████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}

	}

	public static void opcao3() {
		resultado = litrokmrenault[2] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 11.1km rodados o Renault Duster gasta 1L de gasolina█████████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de carbono na atmosfera██████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}

	}

}