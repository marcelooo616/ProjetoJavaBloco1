package br.com.generation.projetobloco1;

import java.util.Scanner;

public class Fiat {
static Scanner sc = new Scanner(System.in);
static String [] fiat = {"Argo","Palio","Uno"};
static double [] litrokmfiat = {10.1,11.9,13.1};

static int opcao1 = 0 ;
static double  Co2 = 7773;
static double resultado;

public static void listamodelos() {
	
	System.out.println("===lista de modelos Fiat===");
	System.out.println("1 - Argo");
	System.out.println("2 - Palio");
	System.out.println("3 - Uno");
	System.out.println();
	
}

public static void escolhaopcao() {
	
	System.out.print("Escolha a opção: ");
	Scanner entrada = new Scanner(System.in);
   	opcao1 = sc.nextInt();
	
}


	public static void lista() {
		System.out.println("===lista de modelos Fiat===");
    	System.out.println("1 - Argo");
    	System.out.println("2 - Palio");
    	System.out.println("3 - Uno");
    	System.out.print("\nEscolha o modelo do carro: ");
    	
    	
    	
				
      
		
	}
	 public static void opcao1() {
		 
		 resultado = litrokmfiat[0] * Co2 ;
         
         System.out.println();
   	   System.out.println("A cada 10.1km rodados o Fiat Argo gasta "+litrokmfiat[0] );
   	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
		 
		 
		 
	 }
	 public static void opcao2() {
		 
		 resultado = litrokmfiat[1] * Co2 ;
         
         System.out.println();
   	   System.out.println("A cada 11.9km rodados o Fiat Palio gasta "+litrokmfiat[0] );
   	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
		 
		 
	 }
	 public static void opcao3() {
		 resultado = litrokmfiat[2] * Co2 ;
         
         System.out.println();
   	   System.out.println("A cada 13.1km rodados o Fiat Uno gasta "+litrokmfiat[0] );
   	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
		 
		 
	 }
	
}
