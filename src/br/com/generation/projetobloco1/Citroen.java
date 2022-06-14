package br.com.generation.projetobloco1;

import java.text.DecimalFormat;

public class Citroen {
	// vetores
	static String[] citroen = { "C4", "Aircross", "C3" };
	static double[] litrokmcitroen = { 7.8, 10.2, 13.2 };
	// declarando as opções
	static int opcao, opcao1;
	static double Co2 = 2.3;
	static double resultado;

	// criando os modulos
	public static void listamodelos() {

		String menufiat[][] = { { "\n                            " },
				                { "██████████████████████████████████████████████████████████████████████████████████" },
			                 	{ "░░░░░░░░░░░░░░░░░░░lista de modelos Citroen░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
				                { "██████████████████████████████████████████████████████████████████████████████████" },
			                 	{ "██████████████████████| 1 - C4       |████████████████████████████████████████████" },
				                { "██████████████████████| 2 - Aircross |████████████████████████████████████████████" },
				                { "██████████████████████| 2 - C3       |████████████████████████████████████████████" },
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

		resultado = litrokmcitroen[0] * Co2;
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
				            { "██████████████████████████████████████████████████████████████████████████████████" },
				            { "██A cada 7.8km rodados o Citroen C4 gasta 1L de gasolina██████████████████████████" },
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

		resultado = litrokmcitroen[1] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 10.2km rodados o Citroen Aircross gasta 1L de gasolina███████████████████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de carbono na atmosfera███████████████████████████" },
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

		resultado = litrokmcitroen[2] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 13.2km rodados o Citroen C3 gasta 1L de gasolina█████████████████████████" },
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
