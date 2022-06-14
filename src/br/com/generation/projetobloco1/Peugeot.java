package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peugeot {

	static Scanner sc = new Scanner(System.in);
	static String[] peugeot = { "206", "207", "208", "308", "3008" };
	static double[] litrokmpeugeot = { 9.4, 10.6, 15.1, 10.0, 9.2 };

	static int opcao1 = 0;
	static double Co2 = 2.3;
	static double resultado;
	
	public static void escolhaopcao() {

		System.out.print("Escolha a opÃ§Ã£o: ");
		Scanner sc = new Scanner(System.in);
		opcao1 = sc.nextInt();

	}

	public static void lista() {
		
		String menufiat[][] = { { "\n                            " },
				                { "██████████████████████████████████████████████████████████████████████████████████" },
                               	{ "░░░░░░░░░░░░░░░░░░░lista de modelos Peugeot░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
                                { "██████████████████████████████████████████████████████████████████████████████████" },
             	                { "██████████████████████| 1 - 206       |███████████████████████████████████████████" },
                                { "██████████████████████| 2 - 207       |███████████████████████████████████████████" },
                                { "██████████████████████| 3 - 208       |███████████████████████████████████████████" },
                                { "██████████████████████| 4 - 308       |███████████████████████████████████████████" },
                                { "██████████████████████| 5 - 3008      |███████████████████████████████████████████" },
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
		
		resultado = litrokmpeugeot[0] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 9.4km rodados, o Peugeot 206 gasta 1L de gasolina████████████████████████" },
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

		resultado = litrokmpeugeot[1] * Co2;
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 10.6km rodados, o Peugeot 207 gasta 1L de gasolina███████████████████████" },
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

		resultado = litrokmpeugeot[2] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 15.1km rodados, o Peugeot 208 gasta 1L de gasolina███████████████████████" },
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
	public static void opcao4() {

		resultado = litrokmpeugeot[3] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 10.0km rodados, o Peugeot 308 gasta 1L de gasolina███████████████████████" },
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
	public static void opcao5() {

		resultado = litrokmpeugeot[4] * Co2;
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 9.2km rodados, o Peugeot 3008 gasta 1L de gasolina███████████████████████" },
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
