package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hyundai {

		static Scanner sc = new Scanner(System.in);
	    //vetores
		static String [] hyundai = {"Hb20","Creta","Elantra","Sonata","Azera"};
		static double [] litrokmhyundai = {11.5,11.6,10.1,8.0,7.0};
	    //declarando as opções
		static int opcao, opcao1 ;
		static double  Co2 = 2.3;
		static double resultado;



	//criando os modulos
	public static void listamodelos() {
		
		String menufiat[][] = { { "\n                            " },
				{ "██████████████████████████████████████████████████████████████████████████████████" },
	                            { "░░░░░░░░░░░░░░░░░░lista de modelos Hyundai░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
                                { "██████████████████████████████████████████████████████████████████████████████████" },
	                            { "██████████████████████| 1 - Hb20       |██████████████████████████████████████████" },
                                { "██████████████████████| 2 - Creta      |██████████████████████████████████████████" },
                                { "██████████████████████| 3 - Elantra    |██████████████████████████████████████████" },
                                { "██████████████████████| 4 - Sonata     |██████████████████████████████████████████" },
                                { "██████████████████████| 5 - Azera      |██████████████████████████████████████████" },
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
	 
	 resultado = litrokmhyundai[0] * Co2 ;
	 String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                         { "██████████████████████████████████████████████████████████████████████████████████" },
                         { "██A cada 11.5km rodados, o Hyundai HB20 gasta 1L de gasolina██████████████████████" },
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

	resultado = litrokmhyundai[1] * Co2 ;
	
	 String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                         { "██████████████████████████████████████████████████████████████████████████████████" },
                         { "██A cada 11.6km rodados, o Hyundai Creta gasta 1L de gasolina█████████████████████" },
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

	resultado = litrokmhyundai[2] * Co2 ;
	
	 String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                         { "██████████████████████████████████████████████████████████████████████████████████" },
                         { "██A cada 10.1km rodados, o Hyundai Elantra gasta 1L de gasolina███████████████████" },
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

	resultado = litrokmhyundai[3] * Co2 ;
	
	String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                        { "██████████████████████████████████████████████████████████████████████████████████" },
                        { "██A cada 8.0km rodados, o Hyundai Sonata gasta 1L de gasolina█████████████████████" },
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

	resultado = litrokmhyundai[4] * Co2 ;
	
	String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                        { "██████████████████████████████████████████████████████████████████████████████████" },
                        { "██A cada 7.0km rodados, o Hyundai Azera gasta 1L de gasolina██████████████████████" },
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

	}






