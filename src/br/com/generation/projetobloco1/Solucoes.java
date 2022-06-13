package br.com.generation.projetobloco1;

public class Solucoes {

	public static void listadesolucoes () throws InterruptedException{
		
		String titulo = "-Co2", nome = "marcelo";
		String[][] meme = {
				{ "██████████████████████████████████████████████████████████████████████████████████"},
				{ "█████!!O que voce fazer para compensar toda essa emissão██████████       █████████"},		
				{ "██████████████████████████████████████████████████████████████████       █████████"},				      
				{ "█████- Deixar os produtos de origem animal              ██████████       █████████"},
				{ "█████ de fora do cardapio por um dia!!                  ██████████       █████████"},
				{ "█████- Utilizar tansporte público                       ██████████       █████████"},
				{ "█████- utilizar bicicletas para viagens pequenas        ██████████       █████████"},
				{ "█████- Evitar embalagens plasticas                      ██████████       █████████"},		
				{ "█████- Fazer o plantio de arvores                       ██████████████████████████"},
				{ "█████- Incentivo a veículos menos poluentes             ██████████       █████████"},
		        { "█████- Utilize ecobags                                  ██████████       █████████"},
				{ "██████████████████████████████████████████████████████████████████████████████████"}};

		for (int l = 0; l < meme.length; l++) {
			Thread.sleep(800);
			for (int c = 0; c < meme[l].length; c++) {

				System.out.print(meme[l][c]);
			}
			System.out.println();

		}

		

	}

}
