package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Volkswagen {
	
	static Scanner sc = new Scanner(System.in);
	static String [] volkswagen = {"Civic","Odyssey","Fit","Volkswagen Jetta", "Gol","Kombi","T-cross","Polo","Virtus","Taos","Saveiro", "Fox", "Up!","Voyage","Tiguan","Golf","Novo Polo","Passat","Fusca"
			,"Brasilia","Gol Quadrado", "Parati","Santana","Santana Quantum","Apollo","CrosFox","SpaceFox", "Pointer","Passat AlemÃ£o","SP1/SP2","VW 1600 TL","VW 1600","Karmann-Ghia/TC"};
	static double [] litrokmvolkswagen = {15.9,12,10.6,11.6,9.8,13.3,13.6,10.1,12.9,10.4,10.3,10.2,10.8,13.8,7.9,12.9,10.4,12.9,13.5,9.2,10.6,8.6,7.8,10.5,12.5,13.5,13.2,14.2,10.8,11.6,14.2,10.9};
	
	static int opcao, opcao1 ;
	static double  Co2 = 0.157;
	static double resultado;
	
	public static void listamodelos() {
		
		System.out.println("===lista de modelos Fiat===");
		System.out.println("1 -  Apollo");
		System.out.println("2 -  Brasilia");
		System.out.println("3-   CrosFox");
		System.out.println("4 -  Fox");
		System.out.println("5 -  Fusca");
    	System.out.println("6 -  Gol");
    	System.out.println("7 -  Gol Quadrado");
    	System.out.println("8 -  Golf");
    	System.out.println("9 -  Jetta");
    	System.out.println("10 - Kombi");
    	System.out.println("11 - Karmann-Ghia/TC");
    	System.out.println("12 - Nivus");
    	System.out.println("13 - Novo Gol");
    	System.out.println("14 - Novo Polo");
    	System.out.println("15 - Parati");
    	System.out.println("16 - Passat");
    	System.out.println("17 - Passat AlemÃ£o");
    	System.out.println("18 - Polo");
    	System.out.println("19 - Pointer");
    	System.out.println("20 - Santana");
    	System.out.println("21 - Santana Quantum");
    	System.out.println("22 - Saveiro");
    	System.out.println("23 - SpaceFox");
    	System.out.println("24 - SP1/SP2");
    	System.out.println("25 - Taos");
    	System.out.println("26 - T-Cross");
    	System.out.println("27 - Tiguan");
    	System.out.println("28 - Up!");
    	System.out.println("29 - Virtus");
    	System.out.println("30 - Voyage");
    	System.out.println("31 - VW 1600 TL");
    	System.out.println("32 - VW 1600 ");
    	System.out.print("\nEscolha o modelo do carro: ");
		
		
	}
	
	public static void escolhaopcao() {
		
		System.out.print("Escolha a opÃ§Ã£o: ");
		Scanner entrada = new Scanner(System.in);
	   	opcao1 = sc.nextInt();
		
	   	
	}
	
	public static void opcao1() {
		 
		resultado = litrokmvolkswagen[0] * Co2;
		String menuop[][] = { { "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "██A cada 15.9km rodados o Apolo gasta 1L de gasolina████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gás carbonico na atmosfera" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}
	 
	 }
	
	public static void opcao2() {
		
		resultado = litrokmvolkswagen[1] * Co2;
		String menuop[][] = { { "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "██A cada 12km rodados o Brasilia gasta 1L de gasolina████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gás carbonico na atmosfera" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}
	}
	public static void opcao3() {
		
		resultado = litrokmvolkswagen[2] * Co2 ;
        
		String menuop[][] = { { "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "██A cada 10.6km rodados o CrosFox gasta 1L de gasolina████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gás carbonico na atmosfera" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}
		
	}
  	 public static void opcao4() {
 		
 		resultado = litrokmvolkswagen[3] * Co2 ;
         
 		String menuop[][] = { { "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "██A cada 11.6km rodados o Fox gasta 1L de gasolina████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gás carbonico na atmosfera" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}
  	 }
  	 public static void opcao5() {
		
		resultado = litrokmvolkswagen[4] * Co2 ;
        
		String menuop[][] = { { "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "██A cada 9.8km rodados o Fusca gasta 1L de gasolina████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gás carbonico na atmosfera" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}
  	 }
  	 public static void opcao6() {
		
		resultado = litrokmvolkswagen[5] * Co2 ;
        
		String menuop[][] = { { "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "██A cada 13.3km rodados o Gol gasta 1L de gasolina████" },
				{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
						"kg de gás carbonico na atmosfera" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menuop.length; l++) {
			for (int c = 0; c < menuop[l].length; c++) {

				System.out.print(menuop[l][c]);
			}
			System.out.println();
		}
}
	public static void opcao7() {
	
	resultado = litrokmvolkswagen[6] * Co2 ;
    
	String menuop[][] = { { "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" },
			{ "██A cada 13.6km rodados o Gol Quadrado gasta 1L de gasolina████" },
			{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
					"kg de gás carbonico na atmosfera" },
			{ "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" } };

	for (int l = 0; l < menuop.length; l++) {
		for (int c = 0; c < menuop[l].length; c++) {

			System.out.print(menuop[l][c]);
		}
		System.out.println();
	}
}
	public static void opcao8() {
	
	resultado = litrokmvolkswagen[7] * Co2 ;
    
	String menuop[][] = { { "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" },
			{ "██A cada 10.1km rodados o Golf gasta 1L de gasolina████" },
			{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
					"kg de gás carbonico na atmosfera" },
			{ "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" } };

	for (int l = 0; l < menuop.length; l++) {
		for (int c = 0; c < menuop[l].length; c++) {

			System.out.print(menuop[l][c]);
		}
		System.out.println();
	}
}
	public static void opcao9() {
	
	resultado = litrokmvolkswagen[8] * Co2 ;
    
	String menuop[][] = { { "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" },
			{ "██A cada 12.9km rodados o Jetta gasta 1L de gasolina████" },
			{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
					"kg de gás carbonico na atmosfera" },
			{ "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" } };

	for (int l = 0; l < menuop.length; l++) {
		for (int c = 0; c < menuop[l].length; c++) {

			System.out.print(menuop[l][c]);
		}
		System.out.println();
	}
}
	public static void opcao10() {
	
	resultado = litrokmvolkswagen[9] * Co2 ;
    
	String menuop[][] = { { "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" },
			{ "██A cada 10.4km rodados o Kombi gasta 1L de gasolina████" },
			{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
					"kg de gás carbonico na atmosfera" },
			{ "████████████████████████████████████████████████████████████" },
			{ "████████████████████████████████████████████████████████████" } };

	for (int l = 0; l < menuop.length; l++) {
		for (int c = 0; c < menuop[l].length; c++) {

			System.out.print(menuop[l][c]);
		}
		System.out.println();
	}
}
	public static void opcao11() {
	
	resultado = litrokmvolkswagen[10] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao12() {
	
	resultado = litrokmvolkswagen[11] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}	public static void opcao13() {
	
	resultado = litrokmvolkswagen[12] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao14() {
	
	resultado = litrokmvolkswagen[13] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao15() {
	
	resultado = litrokmvolkswagen[14] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao16() {
	
	resultado = litrokmvolkswagen[15] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao17() {
	
	resultado = litrokmvolkswagen[16] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao18() {
	
	resultado = litrokmvolkswagen[17] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
	public static void opcao19() {
		
		resultado = litrokmvolkswagen[18] * Co2 ;
	    
	    System.out.println();
		   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
		   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
	}
	public static void opcao20() {
	
	resultado = litrokmvolkswagen[19] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao21() {
	
	resultado = litrokmvolkswagen[20] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao22() {
	
	resultado = litrokmvolkswagen[21] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
	
	}	

public static void opcao23() {
	
	resultado = litrokmvolkswagen[22] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao24() {
	
	resultado = litrokmvolkswagen[23] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao25() {
	
	resultado = litrokmvolkswagen[24] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao26() {
	
	resultado = litrokmvolkswagen[25] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
	
	}	
public static void opcao27() {
	
	resultado = litrokmvolkswagen[26] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao28() {
	
	resultado = litrokmvolkswagen[27] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
	
	}
public static void opcao29() {
	
	resultado = litrokmvolkswagen[28] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao30() {
	
	resultado = litrokmvolkswagen[29] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
	
	}	
public static void opcao31() {
	
	resultado = litrokmvolkswagen[30] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
}
public static void opcao32() {
	
	resultado = litrokmvolkswagen[31] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gÃ¡s carbÃ´nico na atmosfera");
	
	}	

}
