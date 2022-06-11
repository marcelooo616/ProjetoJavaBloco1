package br.com.generation.projetobloco1;

import java.util.Scanner;

public class Chevrolet {
	
	static Scanner sc = new Scanner(System.in);
    //vetores
	static String [] chevrolet = {"Onix","Cruze","Tracker","Prisma","Corsa"};
	static double [] litrokmchevrolet = {13.7,11.2,11.2,11.9,12.6};
    //declarando as opções
	static int opcao, opcao1 ;
	static double  Co2 = 0.157;
	static double resultado;



//criando os modulos
public static void listamodelos() {
	
    System.out.println("===lista de modelos Chevrolet===");
    System.out.println("1 - Onix");
    System.out.println("2 - Cruze");
    System.out.println("3 - Tracker");
    System.out.println("4 - Prisma");
    System.out.println("5 - Corsa");
	System.out.print("\nEscolha o modelo do carro: ");
	
	
}

public static void opcao1() {
 
 resultado = litrokmchevrolet[0] * Co2 ;

   System.out.println();
   System.out.println("A cada 13.7km rodados o Chevrolet Onix gasta "+litrokmchevrolet[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");

}

public static void opcao2() {

resultado = litrokmchevrolet[1] * Co2 ;

   System.out.println();
   System.out.println("A cada 11.2km rodados o Chevrolet Cruze gasta "+litrokmchevrolet[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao3() {

resultado = litrokmchevrolet[2] * Co2 ;

   System.out.println();
   System.out.println("A cada 11.2km rodados o Chevrolet Tracker gasta "+litrokmchevrolet[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao4() {

resultado = litrokmchevrolet[2] * Co2 ;

   System.out.println();
   System.out.println("A cada 11.9km rodados o Chevrolet Prisma gasta "+litrokmchevrolet[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}	

public static void opcao5() {

resultado = litrokmchevrolet[2] * Co2 ;

   System.out.println();
   System.out.println("A cada 12.6km rodados o Chevrolet Corsa gasta "+litrokmchevrolet[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");

}
}


