package br.com.generation.projetobloco1;

public class Tela {

	public static void tela1() {

		String titulo = "-Co2", nome = "marcelo";
		String[][] meme = {
				{ "████████████████████████████████████████████████████████████"},
				{ "████████████████████████████████████████████████████████████"},		
				{ "████████████     ███████████        ████████████████████████"},
				{ "██████████  █████████████████████   ████████████████████████"},
				{ "█████████ ██████████  █████████   ██████████████████████████"},
				{ "█████████ █████████ ██ █████    █████     ███      █████████"},
				{ "██████████  ███████ ██ ███    ██████████████████████████████"},		
				{ "████████████     ███  ████          ████████████████████████"},
				{ "████████████████████████████████████████████████████████████"}};

		for (int l = 0; l < meme.length; l++) {
			for (int c = 0; c < meme[l].length; c++) {

				System.out.print(meme[l][c]);
			}
			System.out.println();

		}

	}

	public static void Telabase() {

		String titulo = "-Co2", nome = "marcelo";
		String[][] meme = {
				{ "████████████████████████████████████████████████████████████"},
				{ "████████████████████████████████████████████████████████████"},		
				{ "████████████     ███████████        ████████████████████████"},
				{ "██████████  █████████████████████   ████████████████████████"},
				{ "█████████ ██████████  █████████   ██████████████████████████"},
				{ "█████████ █████████ ██ █████    █████     ███      █████████"},
				{ "██████████  ███████ ██ ███    ██████████████████████████████"},		
				{ "████████████     ███  ████          ████████████████████████"},
				{ "████████████████████████████████████████████████████████████"}};

		for (int l = 0; l < meme.length; l++) {
			for (int c = 0; c < meme[l].length; c++) {

				System.out.print(meme[l][c]);
			}
			System.out.println();

		}

	}
}
