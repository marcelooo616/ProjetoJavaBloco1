package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fiat {
	static Scanner sc = new Scanner(System.in);
	static String[] fiat = { "Argo", "Palio", "Uno" };
	static double[] litrokmfiat = { 10.1, 11.9, 13.1 };

	static int opcao1 = 0;
	static double Co2 = 2.3;
	static double resultado;
	
	

	public static void escolhaopcao() {

		System.out.print("Escolha a opção: ");
		Scanner entrada = new Scanner(System.in);
		opcao1 = sc.nextInt();

	}

	public static void lista() {

		String menufiat[][] = { { "                                                                                  " },
				                { "                                                                                  " },
				                { "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
			                	{ "██████████████████████████████████████████████████████████████████████████████████" },
				                { "░░░░░░░░░░░░░░░░░░░lista de modelos Fiat░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
				                { "██████████████████████████████████████████████████████████████████████████████████" },
				                { "██████████████████████| 1 - argo    |█████████████████████████████████████████████" },
				                { "██████████████████████| 2 - Palio   |█████████████████████████████████████████████" },
			                 	{ "██████████████████████| 3 - Uno     |█████████████████████████████████████████████" },
				                { "██████████████████████████████████████████████████████████████████████████████████" } };
 
		for (int l = 0; l < menufiat.length; l++) {
			for (int c = 0; c < menufiat[l].length; c++) {

				System.out.print(menufiat[l][c]);
			}
			System.out.println();
		}
		System.out.print("\nEscolha o modelo do carro: ");

	}

	public static void opcao1() {
		resultado = litrokmfiat[0] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 10.1km rodados o Fiat Argo gasta 1L de gasolina██████████████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gas carbonico na atmosfera████████████████████" },
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

		resultado = litrokmfiat[1] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 11.9km rodados o Fiat Argo gasta 1L de gasolina██████████████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gas carbonico na atmosfera████████████████████" },
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
		resultado = litrokmfiat[2] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 13.1km rodados o Fiat Argo gasta 1L de gasolina██████████████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gas carbonico na atmosfera████████████████████" },
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
