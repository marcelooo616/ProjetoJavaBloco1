package br.com.generation.projetobloco1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Renault {

	static Scanner sc = new Scanner(System.in);
	static String[] renault = { "Kwid", "Sandero", "Duster" };
	static double[] litrokmrenault = { 14.9, 12.5, 11.1 };

	static int opcao1 = 0;
	static double Co2 = 7773;
	static double resultado;

	public static void listamodelos() {

		System.out.println("===lista de modelos Renault===");
		System.out.println("1 - Kwid");
		System.out.println("2 - Sandero");
		System.out.println("3 - Duster");

	}

	public static void escolhaopcao() {

		System.out.println("Escolha a opção ");
		Scanner entrada = new Scanner(System.in);
		opcao1 = sc.nextInt();
	}

	public static void lista() {

		System.out.println("===lista de modelos Fiat===");
		System.out.println("1 - Kwid");
		System.out.println("2 - Sandero");
		System.out.println("3 - Duster");
		System.out.print("\nEscolha o modelo do carro: ");

	}

	public static void opcao1() {

		resultado = litrokmrenault[0] * Co2;

		System.out.println();
		System.out.println("A cada 14.9km rodados, o Renault Kwid gasta" + litrokmrenault[0]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}

	public static void opcao2() {
		resultado = litrokmrenault[1] * Co2;

		System.out.println();
		System.out.println("A cada 12.5km rodados, o Renault Sandero gasta" + litrokmrenault[1]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}

	public static void opcao3() {
		resultado = litrokmrenault[2] * Co2;

		System.out.println();
		System.out.println("A cada 11.1km rodados, o Renault Duster gasta" + litrokmrenault[2]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}

}