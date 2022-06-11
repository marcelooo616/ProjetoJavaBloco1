package br.com.generation.projetobloco1;

import java.util.Scanner;

public class Hyundai {

		static Scanner sc = new Scanner(System.in);
	    //vetores
		static String [] hyundai = {"Hb20","Creta","Elantra","Sonata","Azera"};
		static double [] litrokmhyundai = {11.5,11.6,10.1,8.0,7.0};
	    //declarando as opções
		static int opcao, opcao1 ;
		static double  Co2 = 0.157;
		static double resultado;



	//criando os modulos
	public static void listamodelos() {
		
	    System.out.println("===lista de modelos Hyundai===");
	    System.out.println("1 - Hb20");
	    System.out.println("2 - Creta");
	    System.out.println("3 - Elantra");
	    System.out.println("4 - Sonata");
	    System.out.println("5 - Azera");
		System.out.print("\nEscolha o modelo do carro: ");
		
		
	}

	public static void opcao1() {
	 
	 resultado = litrokmhyundai[0] * Co2 ;

	   System.out.println();
	   System.out.println("A cada 11.5km rodados o Hyundai HB20 gasta "+litrokmhyundai[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");

	}

	public static void opcao2() {

	resultado = litrokmhyundai[1] * Co2 ;

	   System.out.println();
	   System.out.println("A cada 11.6km rodados o Hyundait Creta gasta "+litrokmhyundai[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	}
	public static void opcao3() {

	resultado = litrokmhyundai[2] * Co2 ;

	   System.out.println();
	   System.out.println("A cada 10.1km rodados o Hyundai Elantra gasta "+litrokmhyundai[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	}
	public static void opcao4() {

	resultado = litrokmhyundai[2] * Co2 ;

	   System.out.println();
	   System.out.println("A cada 8.0km rodados o Hyundai Sonata gasta "+litrokmhyundai[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	}
	public static void opcao5() {

	resultado = litrokmhyundai[2] * Co2 ;

	   System.out.println();
	   System.out.println("A cada 7.0km rodados o Hyundai Azera gasta "+litrokmhyundai[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	}

	}






