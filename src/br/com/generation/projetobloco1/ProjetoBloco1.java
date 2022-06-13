package br.com.generation.projetobloco1;

import java.util.Scanner;

public class ProjetoBloco1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		

		Tela.tela1();

		

		int opcao, opcao1;		
		double resultado;

		String menu[][] = { { "██████████████████████████████████████████████████████████████████████████████████" },
			              	{ "██████████████████████Lista de opções█████████████████████████████████████████████" },
			            	{ "██████████████████████████████████████████████████████████████████████████████████" },
			             	{ "████████████████████| 1  - Fiat       |███████████████████████████████████████████" },
				            { "████████████████████| 2  - Honda      |███████████████████████████████████████████" },
				            { "████████████████████| 3  - Citroen    |███████████████████████████████████████████" },
				            { "████████████████████| 4  - Ford       |███████████████████████████████████████████" },
				            { "████████████████████| 5  - Peugeot    |███████████████████████████████████████████" },
				            { "████████████████████| 6  - Nissan     |███████████████████████████████████████████" },
				            { "████████████████████| 7  - Renault    |███████████████████████████████████████████" },
				            { "████████████████████| 8  - Chevrolet  |███████████████████████████████████████████" },
				            { "████████████████████| 9  - Volkswagen |███████████████████████████████████████████" },
				            { "████████████████████| 10 - Toyota     |███████████████████████████████████████████" },
				            { "████████████████████| 11 - Hyundai    |███████████████████████████████████████████" },
				            { "██████████████████████████████████████████████████████████████████████████████████" } };

		for (int l = 0; l < menu.length; l++) {
		//	Thread.sleep(200);
			for (int c = 0; c < menu[l].length; c++) {

				System.out.print(menu[l][c]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Digite uma das opções Ex. '1,2,3...'   : ");
		
		opcao = sc.nextInt();
		
		while(opcao < 1 || opcao > 11) {
			System.out.println("opção invalida");
			
			System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
			opcao = sc.nextInt();
		}
		

		

		if (opcao == 1) {
			
			Carregamento.carregando();

			Fiat.lista();
			opcao1 = sc.nextInt();
			
			while(opcao1 < 1 || opcao1 > 3) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}
			

			if (opcao1 == 1) {
				

				Fiat.opcao1();

			}

			else if (opcao1 == 2) {
				

				Fiat.opcao2();
			} else if (opcao1 == 3) {
				

				Fiat.opcao3();
			}

		}

		if (opcao == 2) {
			Carregamento.carregando();
			Honda.listamodelos();
			opcao1 = sc.nextInt();
			while(opcao1 < 1 || opcao1 > 3) {
				System.out.println("Opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

			if (opcao1 == 1) {

				Honda.opcao1();

			} else if (opcao1 == 2) {

				Honda.opcao2();

			} else if (opcao1 == 3) {

				Honda.opcao3();

			}
		}

		if (opcao == 3) {
			Carregamento.carregando();
			Citroen.listamodelos();
			opcao1 = sc.nextInt();
			while(opcao1 < 1 || opcao1 > 3) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

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
			Carregamento.carregando();
			Ford.listamodelos();
			opcao1 = sc.nextInt();
			while(opcao1 < 1 || opcao1 > 3) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

			if (opcao1 == 1) {

				Ford.opcao1();

			} else if (opcao1 == 2) {

				Ford.opcao2();

			} else if (opcao1 == 3) {

				Ford.opcao3();

			}
		}
		
		if (opcao == 5) {
			Carregamento.carregando();
			Peugeot.lista();
			opcao1 = sc.nextInt();
			while(opcao1 < 1 || opcao1 > 5) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

			if (opcao1 == 1) {

				Peugeot.opcao1();

			} else if (opcao1 == 2) {

				Peugeot.opcao2();

			} else if (opcao1 == 3) {

				Peugeot.opcao3();

			}
			else if (opcao1 == 4) {

				Peugeot.opcao4();

			}
			else if (opcao1 == 5) {

				Peugeot.opcao5();

			}
		}
		if (opcao == 6) {
			Carregamento.carregando();
			Nissan.listademodelos();
			opcao1 = sc.nextInt();
			
			while(opcao1 < 1 || opcao1 > 3) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

			if (opcao1 == 1) {

				Nissan.opção1();

			} else if (opcao1 == 2) {

				Nissan.opção2();

			} else if (opcao1 == 3) {

				Nissan.opção3();

			}
		}

		if (opcao == 7) {
			Carregamento.carregando();
			Renault.listamodelos();
			opcao1 = sc.nextInt();
			
			while(opcao1 < 1 || opcao1 > 3) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

			if (opcao1 == 1) {

				Renault.opcao1();
			}

			else if (opcao1 == 2) {

				Renault.opcao2();

			} else if (opcao1 == 3) {

				Renault.opcao3();
			}
		}
		
		if (opcao == 8) {
			Carregamento.carregando();
			Chevrolet.listamodelos();
			opcao1 = sc.nextInt();
			
			while(opcao1 < 1 || opcao1 > 5) {
				System.out.println("opção invalida");
				
				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
				opcao1 = sc.nextInt();
			}

			if (opcao1 == 1) {

				Chevrolet.opcao1();
			}

			else if (opcao1 == 2) {

				Chevrolet.opcao2();

			} else if (opcao1 == 3) {

				Chevrolet.opcao3();
			}
			else if (opcao1 == 4) {

				Chevrolet.opcao4();
			}
			else if (opcao1 == 5) {

				Chevrolet.opcao5();
			}
		}
		
		
		
			//volkswagen Começa aqui.
        	if (opcao == 9)  {
        		Carregamento.carregando();
        		Volkswagen.listamodelos();
        		opcao1 = sc.nextInt();
        		
        		while(opcao1 < 1 || opcao1 > 15) {
    				System.out.println("opção invalida");
    				
    				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
    				opcao1 = sc.nextInt();
    			}
        	
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
        
        	
        	//volkswagen acaba aqui.
       } 
        	if (opcao == 10) {
        		Carregamento.carregando();
    			Toyota.lista();
    			opcao1 = sc.nextInt();
    			
    			while(opcao1 < 1 || opcao1 > 5) {
    				System.out.println("opção invalida");
    				
    				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
    				opcao1 = sc.nextInt();
    			}

    			if (opcao1 == 1) {

    				Toyota.opcao1();
    			}

    			else if (opcao1 == 2) {

    				Toyota.opcao2();

    			} else if (opcao1 == 3) {

    				Toyota.opcao3();
    			}
    			else if (opcao1 == 4) {

    				Toyota.opcao4();
    			}
    			else if (opcao1 == 5) {

    				Toyota.opcao5();
    			}
    		}
        
        	if (opcao == 11) {
        		Carregamento.carregando();
    			Hyundai.listamodelos();
    			opcao1 = sc.nextInt();
    			
    			while(opcao1 < 1 || opcao1 > 5) {
    				System.out.println("opção invalida");
    				
    				System.out.println("Digite uma das opções Ex. '1,2,3...'   :");
    				opcao1 = sc.nextInt();
    			}

    			if (opcao1 == 1) {

    				Hyundai.opcao1();
    			}

    			else if (opcao1 == 2) {

    				Hyundai.opcao2();

    			} else if (opcao1 == 3) {

    				Hyundai.opcao3();
    			}
    			else if (opcao1 == 4) {

    				Hyundai.opcao4();
    			}
    			else if (opcao1 == 5) {

    				Hyundai.opcao5();
    			}
    		}
		

		System.out.println();
		Solucoes.listadesolucoes();

		

		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		System.out.println();

		Tela.Telabase();

		

	}
}

