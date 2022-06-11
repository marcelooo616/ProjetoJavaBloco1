package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Honda {

	static Scanner sc = new Scanner(System.in);
	static String[] honda = { "Civic", "Odyssey", "Fit" };
	static double[] litrokmhonda = { 10.6, 9, 12.3 };

	static int opcao, opcao1;
	static double Co2 = 157;
	static double resultado;

	public static void listamodelos() {

		System.out.println("===lista de modelos Fiat===");
		System.out.println("1 - Civic");
		System.out.println("2 - Odyssey");
		System.out.println("3 - Fit");
		System.out.print("\nEscolha o modelo do carro: ");

	}

	public static void escolhaopcao() {

		System.out.print("Escolha a opção: ");
		Scanner entrada = new Scanner(System.in);
		opcao1 = sc.nextInt();

	}

	public static void opcao1() {

		resultado = litrokmhonda[0] * Co2;

		System.out.println();
		System.out.println("A cada 10.6km rodados o Honda Civic gasta " + litrokmhonda[0]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}

	public static void opcao2() {

		resultado = litrokmhonda[1] * Co2;

		System.out.println();
		System.out.println("A cada 9km rodados o Honda Odyssey gasta " + litrokmhonda[1]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");
	}

	public static void opcao3() {

		resultado = litrokmhonda[2] * Co2;

		System.out.println();
		System.out.println("A cada 12.3km rodados o Honda fit gasta " + litrokmhonda[2]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}

}
