package br.com.generation.projetobloco1;

import java.util.Scanner;

public class Volkswagen {
	
	static Scanner sc = new Scanner(System.in);
	static String [] volkswagen = {"Civic","Odyssey","Fit","Volkswagen Jetta", "Gol","Kombi","T-cross","Polo","Virtus","Taos","Saveiro", "Fox", "Up!","Voyage","Tiguan","Golf","Novo Polo","Passat","Fusca"
			,"Brasilia","Gol Quadrado", "Parati","Santana","Santana Quantum","Apollo","CrosFox","SpaceFox", "Pointer","Passat Alemão","SP1/SP2","VW 1600 TL","VW 1600","Karmann-Ghia/TC"};
	static double [] litrokmvolkswagen = {10.6,9,12.3};
	
	static int opcao, opcao1 ;
	static double  Co2 = 0.157;
	static double resultado;
	
	public static void listamodelos() {
		
		System.out.println("===lista de modelos Fiat===");
		System.out.println("1 - Volkswagen Jetta");
    	System.out.println("2 -  Gol");
    	System.out.println("3 -  Kombi");
    	System.out.println("4 -  T-Cross");
    	System.out.println("5 -  Polo");
    	System.out.println("6 -  Virtus");
    	System.out.println("7 -  Nivus");
    	System.out.println("8 -  Taos");
    	System.out.println("9 -  Saveiro");
    	System.out.println("10 - Fox");
    	System.out.println("11 - Up!");
    	System.out.println("12 - Voyage");
    	System.out.println("13 - Tiguan");
    	System.out.println("14 - Golf");
    	System.out.println("15 - Novo Gol");
    	System.out.println("16 - Novo Polo");
    	System.out.println("17 - Passat");
    	System.out.println("18 - Fusca");
    	System.out.println("19 - Brasilia");
    	System.out.println("20 - Gol Quadrado");
    	System.out.println("21 - Parati");
    	System.out.println("22 - Santana");
    	System.out.println("23 - Santana Quantum");
    	System.out.println("24 - Apollo");
    	System.out.println("25-  CrosFox");
    	System.out.println("26 - SpaceFox");
    	System.out.println("27 - Pointer");
    	System.out.println("28 - Passat Alemão");
    	System.out.println("29 - SP1/SP2");
    	System.out.println("30 - VW 1600 TL");
    	System.out.println("31 - VW 1600 ");
    	System.out.println("32 - Karmann-Ghia/TC");
    	System.out.print("\nEscolha o modelo do carro: ");
		
		
	}
	public static void escolhaopcao() {
		
		System.out.print("Escolha a opção: ");
		Scanner entrada = new Scanner(System.in);
	   	opcao1 = sc.nextInt();
		
	   	
	}
	
	public static void opcao1() {
		 
		 resultado = litrokmvolkswagen[0] * Co2 ;
        
        System.out.println();
   	   System.out.println("A cada 10.6km rodados o Honda Civic gasta "+litrokmvolkswagen[0] );
   	   System.out.println("Jogando "+resultado+ "kg de gas carbônico na atmosfera");
	 
	 }
	
	public static void opcao2() {
		
		resultado = litrokmvolkswagen[1] * Co2 ;
        
        System.out.println();
  	   System.out.println("A cada 9km rodados o Honda Odyssey gasta "+litrokmvolkswagen[0] );
  	   System.out.println("Jogando "+resultado+ "kg de gas carbônico na atmosfera");
	}
	public static void opcao3() {
		
		resultado = litrokmvolkswagen[2] * Co2 ;
        
        System.out.println();
  	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
  	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
		
	}
  	 public static void opcao4() {
 		
 		resultado = litrokmvolkswagen[3] * Co2 ;
         
         System.out.println();
   	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
   	   System.out.println("Jogando "+resultado+ "kg de gas carbônico na atmosfera");
  	 }
  	 public static void opcao5() {
		
		resultado = litrokmvolkswagen[4] * Co2 ;
        
        System.out.println();
  	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
  	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
  	 }
  	 public static void opcao6() {
		
		resultado = litrokmvolkswagen[5] * Co2 ;
        
        System.out.println();
  	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
  	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao7() {
	
	resultado = litrokmvolkswagen[6] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao8() {
	
	resultado = litrokmvolkswagen[7] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao9() {
	
	resultado = litrokmvolkswagen[8] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao10() {
	
	resultado = litrokmvolkswagen[9] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao11() {
	
	resultado = litrokmvolkswagen[10] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao12() {
	
	resultado = litrokmvolkswagen[11] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}	public static void opcao13() {
	
	resultado = litrokmvolkswagen[12] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao14() {
	
	resultado = litrokmvolkswagen[13] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao15() {
	
	resultado = litrokmvolkswagen[14] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao16() {
	
	resultado = litrokmvolkswagen[15] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao17() {
	
	resultado = litrokmvolkswagen[16] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao18() {
	
	resultado = litrokmvolkswagen[17] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
	public static void opcao19() {
		
		resultado = litrokmvolkswagen[18] * Co2 ;
	    
	    System.out.println();
		   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
		   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	}
	public static void opcao20() {
	
	resultado = litrokmvolkswagen[19] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao21() {
	
	resultado = litrokmvolkswagen[20] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao22() {
	
	resultado = litrokmvolkswagen[21] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	
	}	

public static void opcao23() {
	
	resultado = litrokmvolkswagen[22] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao24() {
	
	resultado = litrokmvolkswagen[23] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao25() {
	
	resultado = litrokmvolkswagen[24] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao26() {
	
	resultado = litrokmvolkswagen[25] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	
	}	
public static void opcao27() {
	
	resultado = litrokmvolkswagen[26] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao28() {
	
	resultado = litrokmvolkswagen[27] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	
	}
public static void opcao29() {
	
	resultado = litrokmvolkswagen[28] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao30() {
	
	resultado = litrokmvolkswagen[29] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	
	}	
public static void opcao31() {
	
	resultado = litrokmvolkswagen[30] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao32() {
	
	resultado = litrokmvolkswagen[31] * Co2 ;
    
    System.out.println();
	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmvolkswagen[0] );
	   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
	
	}	

}