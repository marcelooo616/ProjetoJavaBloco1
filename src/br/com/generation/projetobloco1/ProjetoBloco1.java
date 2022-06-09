package br.com.generation.projetobloco1;

import java.util.Scanner;

public class ProjetoBloco1 {
public static void main(String[] args) {
		
		// usando vetor, matriz e if/else
		
      
            
              // tela inicial   
            	
            	//System.out.println(resultado);
            	//Integer.toString(1)
          // String val;
            
            ;
            	String titulo = "-Co2", nome = "marcelo";
           String [][] meme = {{"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
        		               {"░","░","░","░","░","░","░","░",titulo,"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
        		               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",}};
           
          
           for(int l = 0 ; l < meme.length; l++) {
        	   for(int c = 0; c < meme[l].length; c++) {
        		   
        		   System.out.print(meme[l][c]);
        	   }System.out.println();
       	    			
   		}  
           String [] fiat = {"Argo","Palio","Uno"};
           double [] litrokmfiat = {10.1,11.9,13.1};
           String [] honda = {"Civic","Odyssey","Fit"};
           double [] litrokmhonda = {10.6,9,12.3};
           String [] citroen = {"C4","Aircross","C3"};
           double [] litrokmcitroen = {7.8,10.2,13.2};
           
           
           
          
           int opcao ;
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
           System.out.println("6 - Subaru ");
           System.out.println("9 - Volvo ");
           System.out.println("9 - Nissan ");
           System.out.println("9 - Renault ");
           System.out.println("10 - Jeep ");
           //System.out.println("1 - Toyota ");
           System.out.println();         
           System.out.print("Digite uma das opções Ex. '1,2,3...'   : ");
           Scanner sc = new Scanner(System.in);
           opcao = sc.nextInt();
           
           resultado = litrokmfiat[0] * 1;
         // System.out.print("Digite a opção ex. 1,2,3...: ");
       	   
           
        if (opcao == 1)  {
        	
        	System.out.println("===lista de modelos Fiat===");
        	System.out.println("1 - Argo");
        	System.out.println("2 - Palio");
        	System.out.println("3 - Uno");
        	System.out.println();
        	
        	
        	System.out.print("Escolha a opção: ");
        	Scanner entrada = new Scanner(System.in);
           	opcao = sc.nextInt();
           	
           	
        if (opcao == 1 ) {
        	
        	resultado = litrokmcitroen[2] * Co2 ;
            
            System.out.println();
      	   System.out.println("A cada 10.1km rodados o Fiat Argo gasta "+litrokmfiat[0] );
      	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
        	
        }
        
        else if (opcao == 2) {
        	resultado = litrokmcitroen[2] * Co2 ;
                
                System.out.println();
          	   System.out.println("A cada 11.9km rodados o Fiat Palio gasta "+litrokmfiat[0] );
          	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
          	   
             }
        else if (opcao == 3) {
             	resultado = litrokmcitroen[2] * Co2 ;
                 
                 System.out.println();
           	   System.out.println("A cada 13.1km rodados o Fiat Uno gasta "+litrokmfiat[0] );
           	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
           	   
              }
        	       	
        }
        
        else if (opcao == 2)  {
        	
        	System.out.println("===lista de modelos Honda===");
        	System.out.println("1 - Civic");
        	System.out.println("2 - Odyssey");
        	System.out.println("3 - Fit");
        	System.out.println();
        	
        	
        	System.out.print("Escolha a opção: ");
        	Scanner entrada = new Scanner(System.in);
           	opcao = sc.nextInt();
           	
           	
        if (opcao == 1 ) {
        	
        	resultado = litrokmcitroen[2] * Co2 ;
            
            System.out.println();
      	   System.out.println("A cada 10.6km rodados o Honda Civic gasta "+litrokmfiat[0] );
      	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
        	
        }
        
        else if (opcao == 2) {
        	   resultado = litrokmcitroen[2] * Co2 ;
                
                System.out.println();
          	   System.out.println("A cada 9km rodados o Honda Odyssey gasta "+litrokmfiat[0] );
          	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
          	   
             }
        else if (opcao == 3) {
        	 resultado = litrokmcitroen[2] * Co2 ;
                 
                 System.out.println();
           	   System.out.println("A cada 12.3km rodados o Honda fit gasta "+litrokmfiat[0] );
           	   System.out.println("Jogando "+resultado+ "kg de carbono na atmosfera");
           	   
              }
        	       	
        }
        
       else if (opcao == 3)  {
        	
        	System.out.println("===lista de modelos Citroen===");
        	System.out.println("1 - C4");
        	System.out.println("2 - Aircross");
        	System.out.println("3 - C3");
        	System.out.println();
        	
        	
        	System.out.print("Escolha a opção: ");
        	Scanner entrada = new Scanner(System.in);
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
        	       	
        }
        
        
        
        
        
        
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        
        
        String [][] base = {{"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
	               {"░","░","░","░","░","░","░","░",titulo,"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",},
	               {"░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░",}};


                  for(int l = 0 ; l < base.length; l++) {
                       for(int c = 0; c < base[l].length; c++) {
	   
	                      System.out.print(meme[l][c]);
      }System.out.println();
        	   
           
           
           
           
           
           
           
           
           
           
           
           //System.out.println(resultado2);
}
          
	}


}
