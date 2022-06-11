package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;





public class Nissan {
	
	static Scanner sc = new Scanner(System.in);

			static  String [] Nissan = {"Frontier","Versa","Kicks"};
			static double [] litrokmNissan = {8.9,12.9,7.8};
			
			static int opção, opção6;
			static double Co2 = 0.157;
			static double resultado;
			
			public static void listademodelos() {
				
				String menu[][] = { { "██████████████████████████████████████████████████████████" },
			                        { "░░░░░░░░░░░░░░░░░░░lista de modelos Fiat░░░░░░░░░░░░░░░░░░" },
			                        { "██████████████████████████████████████████████████████████" },
			                        { "██████████████████████| 1 - Frontier  |███████████████████" },
			                        { "██████████████████████| 2 - Versa     |███████████████████" },
			                        { "██████████████████████| 2 - kicks     |███████████████████" },
			                        { "██████████████████████████████████████████████████████████" }};

	for (int l = 0; l < menu.length; l++) {
		for (int c = 0; c < menu[l].length; c++) {

			System.out.print(menu[l][c]);
		}
		System.out.println();
	}
		
	          System.out.print("\nEscolha o modelo do carro: ");	
			}
			
			public static void opção1() {
				
				resultado = litrokmNissan [0]* Co2 ;
				
				System.out.println();
				System.out.println("A cada 8.9km rodados o Nissan Frontier gasta" + litrokmNissan [0] );
				System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");
				
			}
				
			
		        public static void opção2() {
		        	
		        	resultado =litrokmNissan [1]* Co2;
		        	
		        	System.out.println();
		        	System.out.println("A cada 12.9km rodados o Nissan versa gasta" + litrokmNissan [1]);
		        	System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");
		        	
		        }
		        
		        	public static void opção3() {
		        	
		        	resultado =litrokmNissan [2]* Co2;
		        	
		        	System.out.println();
		        	System.out.println("A cada 7.8km rodados o Nissan versa gasta" + litrokmNissan [2]);
		        	System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");
		        
		        	
		        	
		        
		        	
		        	
		        }
			
}

