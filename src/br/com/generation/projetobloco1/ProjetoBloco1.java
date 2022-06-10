package br.com.generation.projetobloco1;

import java.util.Scanner;

public class ProjetoBloco1 {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
		
		// usando vetor, matriz e if/else
		
      
            
              // tela inicial   
            	
            	//System.out.println(resultado);
            	//Integer.toString(1)
          // String val;
            
           Tela.tela1();
            	  
         //  String [] fiat = {"Argo","Palio","Uno"};
         //  double [] litrokmfiat = {10.1,11.9,13.1};
         //  String [] honda = {"Civic","Odyssey","Fit"};
         //  double [] litrokmhonda = {10.6,9,12.3};
           
           
           
           
           
          
           int opcaofiat,opcaohonda,opcao, opcao1 ;
           double  Co2 = 7773;
           double resultado;
           
           System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           System.out.println("Lista de opções      ");
           System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           System.out.println("1 - Fiat ");
           System.out.println("2 - Honda ");
           System.out.println("3 - Citroen ");
           System.out.println("4 - Ford ");
           System.out.println("5 - Peugeot ");
           System.out.println("6 - Nissan ");
           System.out.println("7 - Renault ");
           System.out.println("8 - Chevrolet ");
           System.out.println("9 - Volkswagen ");
          // System.out.println("10 - Jeep ");
           //System.out.println("1 - Toyota ");
           System.out.println();         
           System.out.print("Digite uma das opções Ex. '1,2,3...'   : ");
           
           opcao = sc.nextInt();
           
           
          // resultado = litrokmfiat[0] * 1;
         // System.out.print("Digite a opção ex. 1,2,3...: ");
       	   
           
        if (opcao == 1)  {
        	
        	Fiat.lista();
        	opcao1 = sc.nextInt();
        	
        	if (opcao1 == 1) {
        		
        		Fiat.opcao1();
        	}
        	
        	else if (opcao1 == 2) {
        		
        		Fiat.opcao2();
        	}
        	else if (opcao1 == 3) {
        		
        		Fiat.opcao3();
        	}
        	
        	         	 
        }
        
         if (opcao == 2) {
        	
        	Honda.listamodelos();
        	opcao1 = sc.nextInt();
        	
        	if(opcao1 == 1) {
       		
        		Honda.opcao1();
        		
        	}else if (opcao1 == 2) {
        		
        		Honda.opcao2();
        		
        	}else if (opcao1 == 3) {
        		
        		Honda.opcao3();
        		      		
        	}
        }
         
         if (opcao == 3) {
        	 
        	 Citroen.listamodelos();
        	 opcao1 = sc.nextInt();
        	 
        	 if(opcao1 == 1) {
        		 
        		 Citroen.opcao1();
        	 }
        	 
        	 else if(opcao1 == 2) {
        		 
        		 Citroen.opcao2();
        		 
        	 }
        	 else if (opcao1 == 3) {
        		 
        		 Citroen.opcao3();
        	 }
        	 
         }
        
         System.out.println();	    
    	 Solucoes.listadesolucoes();  
           
        
            	
       /* 
        
       
        
       else if (opcao == 3)  {
        	
        	System.out.println("===lista de modelos Citroen===");
        	System.out.println("1 - C4");
        	System.out.println("2 - Aircross");
        	System.out.println("3 - C3");
        	System.out.println();
        	
        	
        	System.out.print("Escolha a opção: ");
        	Scanner sc = new Scanner(System.in);
           	opcao = sc.nextInt();
           	
           	
        if (opcao == 1 ) {
        	
        	resultado = litrokmcitroen[2] * Co2 ;
            
            System.out.println();
      	   System.out.println("A cada 10.6km rodados o Citroen C4 gasta "+litrokmfiat[0] );
      	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
        	
        }
        
        else if (opcao == 2) {
        	resultado = litrokmcitroen[2] * Co2 ;
                
                System.out.println();
          	   System.out.println("A cada 9km rodados o Citroen Aircross gasta "+litrokmfiat[0] );
          	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
          	   
             }
        else if (opcao == 3) {
           	     resultado = litrokmcitroen[2] * Co2 ;
                 
                 System.out.println();
           	   System.out.println("A cada 12.3km rodados o Citroen C3 gasta "+litrokmfiat[0] );
           	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
           	   
              }
              */
        	       	
        
        
        
        
        
        
        
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        
       
        
        System.out.println();
        	   
           
           
         Tela.Telabase();  
           
           
           
           
           
           
           
           
           //System.out.println(resultado2);

          
	}
}




