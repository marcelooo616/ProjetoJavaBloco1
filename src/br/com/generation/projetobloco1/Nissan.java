package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;





public class Nissan {
	
	static Scanner sc = new Scanner(System.in);

			static  String [] Nissan = {"Frontier","Versa","Kicks"};
			static double [] litrokmNissan = {8.9,12.9,7.8};
			
			static int opção, opção6;
			static double Co2 = 2.3;
			static double resultado;
			
			public static void listademodelos() {
				
				String menu[][] = { { "\n                            " },
						{ "██████████████████████████████████████████████████████████████████████████████████" },
			                        { "░░░░░░░░░░░░░░░░░░░lista de modelos Nissan░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
			                        { "██████████████████████████████████████████████████████████████████████████████████" },
			                        { "██████████████████████| 1 - Frontier  |███████████████████████████████████████████" },
			                        { "██████████████████████| 2 - Versa     |███████████████████████████████████████████" },
			                        { "██████████████████████| 3 - kicks     |███████████████████████████████████████████" },
			                        { "██████████████████████████████████████████████████████████████████████████████████" }};

	for (int l = 0; l < menu.length; l++) {
		for (int c = 0; c < menu[l].length; c++) {

			System.out.print(menu[l][c]);
		}
		System.out.println();
	}
		
	          System.out.print("\nEscolha o modelo do carro: ");	
			}
			
			public static void opção1() {
				
				resultado = litrokmNissan[0] * Co2;
				String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
						{ "██████████████████████████████████████████████████████████████████████████████████" },
						{ "██A cada 8.9km rodados o Nissan Frontier gasta 1L de gasolina█████████████████████" },
						{ "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
								"kg de gas carbonico na atmosfera█████████████████████" },
						{ "██████████████████████████████████████████████████████████████████████████████████" },
						{ "██████████████████████████████████████████████████████████████████████████████████" } };

				for (int l = 0; l < menuop.length; l++) {
					for (int c = 0; c < menuop[l].length; c++) {

						System.out.print(menuop[l][c]);
					}
					System.out.println();
				}
				
			}
				
			
		        public static void opção2() {
		        	
		        	resultado = litrokmNissan[1] * Co2;
					String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
							{ "██████████████████████████████████████████████████████████████████████████████████" },
							{ "██A cada 12.9km rodados o Nissan Versa gasta 1L de gasolina███████████████████████" },
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
		        
		        	public static void opção3() {
		        	
		        		resultado = litrokmNissan[2] * Co2;
						String menuop[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
								{ "██████████████████████████████████████████████████████████████████████████████████" },
								{ "██A cada 7.8km rodados o Nissan kicks gasta 1L de gasolina████████████████████████" },
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

