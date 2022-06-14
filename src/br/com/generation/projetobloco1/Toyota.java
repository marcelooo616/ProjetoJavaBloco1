package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Toyota {
	
	static Scanner sc = new Scanner(System.in);
	static String[] toyota = { "Corolla", "Etios", "Prius", "Yaris", "Corolla Cross" };
	static double[] litrokmtoyota = { 11.5, 12.2, 15.7, 13.8, 13.9 };

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
                            	{ "░░░░░░░░░░░░░░░░░░░lista de modelos Toyota░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
                                { "██████████████████████████████████████████████████████████████████████████████████" },
                             	{ "██████████████████████| 1 - Corolla         |█████████████████████████████████████" },
                                { "██████████████████████| 2 - Etios           |█████████████████████████████████████" },
                                { "██████████████████████| 3 - Prius           |█████████████████████████████████████" },
                                { "██████████████████████| 4 - Yaris           |█████████████████████████████████████" },
                                { "██████████████████████| 5 - Corolla Cross   |█████████████████████████████████████" },
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
		
		resultado = litrokmtoyota[0] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
	                        { "██████████████████████████████████████████████████████████████████████████████████" },
	                        { "██A cada 11.5km rodados, o Corolla gasta 1L de gasolina███████████████████████████" },
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

		resultado = litrokmtoyota[1] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 12.2km rodados, o Etios gasta 1L de gasolina█████████████████████████████" },
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

		resultado = litrokmtoyota[2] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 15.7km rodados, o Prius gasta 1L de gasolina█████████████████████████████" },
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

		resultado = litrokmtoyota[3] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 13.8km rodados, o Yaris gasta 1L de gasolina█████████████████████████████" },
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

		resultado = litrokmtoyota[4] * Co2;
		
		String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
                            { "██A cada 13.9km rodados, o Corolla Cross gasta 1L de gasolina█████████████████████" },
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
