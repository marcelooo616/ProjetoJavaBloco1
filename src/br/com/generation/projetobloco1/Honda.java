package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Honda {

	static Scanner sc = new Scanner(System.in);
	static String[] honda = { "Civic", "Odyssey", "Fit" };
	static double[] litrokmhonda = { 10.6, 9, 12.3 };

	static int opcao, opcao1;
	static double Co2 = 2.3;
	static double resultado;

	public static void listamodelos() {
		String menufiat[][] = { { "\n                            " },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "░░░░░░░░░░░░░░░░░░░lista de modelos Honda░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████| 1 - Civic    |████████████████████████████████████████████" },
				{ "██████████████████████| 2 - Odyssey  |████████████████████████████████████████████" },
				{ "██████████████████████| 3 - Fit      |████████████████████████████████████████████" },
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

		System.out.print("Escolha a opção: ");
		Scanner entrada = new Scanner(System.in);
		opcao1 = sc.nextInt();

	}

	public static void opcao1() {

		resultado = litrokmhonda[0] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 10.6km rodados o Honda Civic gasta 1L de gasolina████████████████████████" },
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

		resultado = litrokmhonda[1] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 9km rodados o Honda Odyssey gasta 1L de gasolina█████████████████████████" },
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

		resultado = litrokmhonda[2] * Co2;
		String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
				{ "██A cada 12.3km rodados o Honda Fit gasta 1L de gasolina██████████████████████████" },
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
