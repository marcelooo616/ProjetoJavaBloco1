package br.com.generation.projetobloco1;

public class Citroen {
	//vetores
	static String [] citroen = {"C4","Aircross","C3"};
	static double [] litrokmcitroen = {7.8,10.2,13.2};
    //declarando as opções
	static int opcao, opcao1 ;
	static double  Co2 = 7773;
	static double resultado;
	
	
	
	//criando os modulos
public static void listamodelos() {
		
	    System.out.println("===lista de modelos Citroen===");
	    System.out.println("1 - C4");
	    System.out.println("2 - Aircross");
	    System.out.println("3 - C3");
    	System.out.print("\nEscolha o modelo do carro: ");
		
		
	}

public static void opcao1() {
	 
	 resultado = litrokmcitroen[0] * Co2 ;
   
       System.out.println();
	   System.out.println("A cada 10.6km rodados o Citroen C4 "+litrokmcitroen[0] );
	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");

}

public static void opcao2() {
	
	resultado = litrokmcitroen[1] * Co2 ;
    
       System.out.println();
	   System.out.println("A cada 9km rodados o Citroen Aircross gasta "+litrokmcitroen[1] );
	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
}
public static void opcao3() {
	
	resultado = litrokmcitroen[2] * Co2 ;
    
       System.out.println();
	   System.out.println("A cada 9km rodados o Citroen C3 gasta Litros "+litrokmcitroen[2] );
	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
}


}
