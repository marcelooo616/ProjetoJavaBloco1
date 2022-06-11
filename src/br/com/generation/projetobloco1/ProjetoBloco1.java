package br.com.generation.projetobloco1;

import java.util.Scanner;

public class ProjetoBloco1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		// usando vetor, matriz e if/else

		// tela inicial

		// System.out.println(resultado);
		// Integer.toString(1)
		// String val;

		Tela.tela1();

		// String [] fiat = {"Argo","Palio","Uno"};
		// double [] litrokmfiat = {10.1,11.9,13.1};
		// String [] honda = {"Civic","Odyssey","Fit"};
		// double [] litrokmhonda = {10.6,9,12.3};

		int opcaofiat, opcao, opcao1;
		double Co2 = 7773;
		double resultado;

		String menu[][] = { { "████████████████████████████████████████████████████████████" },
				{ "██████████████████████Lista de opções███████████████████████" },
				{ "████████████████████████████████████████████████████████████" },
				{ "████████████████████| 1 - Fiat        |█████████████████████" },
				{ "████████████████████| 2 - Honda       |█████████████████████" },
				{ "████████████████████| 3 - Citroen     |█████████████████████" },
				{ "████████████████████| 4 - Ford        |█████████████████████" },
				{ "████████████████████| 5 - Peugeot     |█████████████████████" },
				{ "████████████████████| 6 - Nissan      |█████████████████████" },
				{ "████████████████████| 7 - Renault     |█████████████████████" },
				{ "████████████████████| 8 - Chevrolet   |█████████████████████" },
				{ "████████████████████| 9 - Volkswagen  |█████████████████████" },
				{ "████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menu.length; l++) {
			for (int c = 0; c < menu[l].length; c++) {

				System.out.print(menu[l][c]);
			}
			System.out.println();
		}
		/*
		 * System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		 * System.out.println("░░░░░░░░░░░░░░░░░░Lista de opções░░░░░░░░░░░░░░░░░      "
		 * ); System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		 * System.out.println("  ■■■■■■■| 1 - Fiat        |■■■■■■■"); System.out.
		 * println{"█████████████| 2 - Honda       |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 3 - Citroen     |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 4 - Ford        |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 5 - Peugeot     |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 6 - Nissan      |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 7 - Renault     |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 8 - Chevrolet   |██████████████████████████"},
		 * System.out.
		 * println{"█████████████| 9 - Volkswagen  |██████████████████████████"}}
		 * System.out.println{"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■"); //
		 * System.out.println("10 - Jeep "); // System.out.println("1 - Toyota ");
		 */
		System.out.println();

		System.out.print("Digite uma das opções Ex. '1,2,3...'   : ");
		Thread.sleep(1000);
		opcao = sc.nextInt();

		// resultado = litrokmfiat[0] * 1;
		// System.out.print("Digite a opção ex. 1,2,3...: ");

		if (opcao == 1) {

			Fiat.lista();
			opcao1 = sc.nextInt();
			Thread.sleep(500);

			if (opcao1 == 1) {
				Thread.sleep(500);

				Fiat.opcao1();

			}

			else if (opcao1 == 2) {
				Thread.sleep(500);

				Fiat.opcao2();
			} else if (opcao1 == 3) {
				Thread.sleep(500);

				Fiat.opcao3();
			}

		}

		if (opcao == 2) {
			Thread.sleep(500);
			Honda.listamodelos();
			opcao1 = sc.nextInt();

			if (opcao1 == 1) {

				Honda.opcao1();

			} else if (opcao1 == 2) {

				Honda.opcao2();

			} else if (opcao1 == 3) {

				Honda.opcao3();

			}
		}

		if (opcao == 3) {
			Thread.sleep(500);
			Citroen.listamodelos();
			opcao1 = sc.nextInt();

			if (opcao1 == 1) {

				Citroen.opcao1();
			}

			else if (opcao1 == 2) {

				Citroen.opcao2();

			} else if (opcao1 == 3) {

				Citroen.opcao3();
			}

		}
		if (opcao == 4) {
			Thread.sleep(500);
			Ford.listamodelos();
			opcao1 = sc.nextInt();

			if (opcao1 == 1) {

				Ford.opcao1();

			} else if (opcao1 == 2) {

				Ford.opcao2();

			} else if (opcao1 == 3) {

				Ford.opcao3();

			}
		}
		if (opcao == 6) {
			Thread.sleep(500);
			Nissan.listademodelos();
			opcao1 = sc.nextInt();

			if (opcao1 == 1) {

				Nissan.opção1();

			} else if (opcao1 == 2) {

				Nissan.opção2();

			} else if (opcao1 == 3) {

				Nissan.opção3();

			}
		}

		if (opcao == 7) {
			Thread.sleep(500);
			Renault.listamodelos();
			opcao1 = sc.nextInt();

			if (opcao1 == 1) {

				Renault.opcao1();
			}

			else if (opcao1 == 2) {

				Renault.opcao2();

			} else if (opcao1 == 3) {

				Renault.opcao3();
			}
		}
		
			//volkswagen Começa aqui.
        	if (opcao == 9)  {
        	
        		Volkswagen.listamodelos();
        		opcao1 = sc.nextInt();
        	
        	if (opcao1 == 1) {
        		
        		Volkswagen.opcao1();
        	}
        	
        	else if (opcao1 == 2) {
        		
        		Volkswagen.opcao2();
        	}
        	else if (opcao1 == 3) {
        		
        		Volkswagen.opcao3();
        	}
        	else if (opcao1 == 4) {
        		
        		Volkswagen.opcao4();
        	}
        	else if (opcao1 == 5) {
        		
        		Volkswagen.opcao5();
        	}
        	else if (opcao1 == 6) {
        		
        		Volkswagen.opcao6();
        	}
        	else if (opcao1 == 7) {
        		
        		Volkswagen.opcao7();
        	}
        	else if (opcao1 == 8) {
        		
        		Volkswagen.opcao8();
        	}
        	else if (opcao1 == 9) {
        		
        		Volkswagen.opcao9();
        	}
        	else if (opcao1 == 10) {
        		
        		Volkswagen.opcao10();
        	}
        	else if (opcao1 == 11) {
        		
        		Volkswagen.opcao11();
        	}
        	else if (opcao1 == 12) {
        		
        		Volkswagen.opcao12();
        	}
        	else if (opcao1 == 13) {
        		
        		Volkswagen.opcao13();
        	}
        	else if (opcao1 == 14) {
        		
        		Volkswagen.opcao14();
        	}
        	else if (opcao1 == 15) {
        		
        		Volkswagen.opcao15();
        	}
        	else if (opcao1 == 16) {
        		
        		Volkswagen.opcao17();
        	}
        	else if (opcao1 == 18) {
        		
        		Volkswagen.opcao18();
        	}
        	else if (opcao1 == 19) {
        		
        		Volkswagen.opcao19();
        	}
        	else if (opcao1 == 20) {
        		
        		Volkswagen.opcao20();
        	}
        	else if (opcao1 == 21) {
        		
        		Volkswagen.opcao21();
        	}
        	else if (opcao1 == 23) {
        		
        		Volkswagen.opcao23();
        	}
        	else if (opcao1 == 24) {
        		
        		Volkswagen.opcao24();
        	}
        	else if (opcao1 == 25) {
        		
        		Volkswagen.opcao25();
        	}
        	else if (opcao1 == 26) {
        		
        		Volkswagen.opcao26();
        	}
        	else if (opcao1 == 27) {
        		
        		Volkswagen.opcao27();
        	}
        	else if (opcao1 == 28) {
        		
        		Volkswagen.opcao28();
        	}
        	else if (opcao1 == 29) {
        		
        		Volkswagen.opcao29();
        	}
        	else if (opcao1 == 30) {
        		
        		Volkswagen.opcao30();
        	}
        	else if (opcao1 == 31) {
        		
        		Volkswagen.opcao31();
        	}
        	else if (opcao1 == 32) {
        		
        		Volkswagen.opcao32();
        	}
        	
        	//volkswagen acaba aqui.
       }         	 
        
		

		System.out.println();
		Solucoes.listadesolucoes();

		/*
		 * 
		 * 
		 * 
		 * else if (opcao == 3) {
		 * 
		 * System.out.println("===lista de modelos Citroen===");
		 * System.out.println("1 - C4"); System.out.println("2 - Aircross");
		 * System.out.println("3 - C3"); System.out.println();
		 * 
		 * 
		 * System.out.print("Escolha a opção: "); Scanner sc = new Scanner(System.in);
		 * opcao = sc.nextInt();
		 * 
		 * 
		 * if (opcao == 1 ) {
		 * 
		 * resultado = litrokmcitroen[2] * Co2 ;
		 * 
		 * System.out.println();
		 * System.out.println("A cada 10.6km rodados o Citroen C4 gasta "+litrokmfiat[0]
		 * ); System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
		 * 
		 * }
		 * 
		 * else if (opcao == 2) { resultado = litrokmcitroen[2] * Co2 ;
		 * 
		 * System.out.println();
		 * System.out.println("A cada 9km rodados o Citroen Aircross gasta "+litrokmfiat
		 * [0] ); System.out.println("Jogando "+resultado+
		 * "kg de carbono na atmosfera");
		 * 
		 * } else if (opcao == 3) { resultado = litrokmcitroen[2] * Co2 ;
		 * 
		 * System.out.println();
		 * System.out.println("A cada 12.3km rodados o Citroen C3 gasta "+litrokmfiat[0]
		 * ); System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
		 * 
		 * }
		 */

		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		System.out.println();

		Tela.Telabase();

		// System.out.println(resultado2);

	}
}

