package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Chevrolet {
	
	static Scanner sc = new Scanner(System.in);
    //vetores
	static String [] chevrolet = {"Onix","Cruze","Tracker","Prisma","Corsa"};
	static double [] litrokmchevrolet = {13.7,11.2,11.2,11.9,12.6};
    //declarando as opÃ§Ãµes
	static int opcao, opcao1 ;
	static double  Co2 = 2.3;
	static double resultado;



//criando os modulos
public static void listamodelos() {
	
	String menufiat[][] = { 
		                	{ "\n                            " },
			                { "██████████████████████████████████████████████████████████████████████████████████" },
         	                { "░░░░░░░░░░░░░░░░░░lista de modelos Crevrolet░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" },
                            { "██████████████████████████████████████████████████████████████████████████████████" },
         	                { "██████████████████████| 1 - Onix       |██████████████████████████████████████████" },
                            { "██████████████████████| 2 - Cruze      |██████████████████████████████████████████" },
                            { "██████████████████████| 3 - Tracker    |██████████████████████████████████████████" },
                            { "██████████████████████| 4 - Prisma     |██████████████████████████████████████████" },
                            { "██████████████████████| 5 - Corsa      |██████████████████████████████████████████" },
                            { "██████████████████████████████████████████████████████████████████████████████████" } };

for (int l = 0; l < menufiat.length; l++) {
for (int c = 0; c < menufiat[l].length; c++) {

System.out.print(menufiat[l][c]);
}
System.out.println();
}
	
System.out.print("\nEscolha o modelo do carro: ");
	
}

public static void opcao1() {
 
 resultado = litrokmchevrolet[0] * Co2 ;
 
 String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                     { "██████████████████████████████████████████████████████████████████████████████████" },
                     { "██A cada 13.7km rodados, o Chevrolet Onix gasta 1L de gasolina████████████████████" },
                     { "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
                                                     "kg de carbono na atmosfera██████████████████████████" },
                     { "██████████████████████████████████████████████████████████████████████████████████" },
                     { "██████████████████████████████████████████████████████████████████████████████████" } };

for (int l = 0; l < menuop.length; l++) {
for (int c = 0; c < menuop[l].length; c++) {

System.out.print(menuop[l][c]);
}
System.out.println();
}
 

}

public static void opcao2() {

resultado = litrokmchevrolet[1] * Co2 ;

String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██A cada 11.2km rodados, o Chevrolet Cruze gasta 1L de gasolina███████████████████" },
                    { "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
                                                    "kg de carbono na atmosfera██████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" } };

for (int l = 0; l < menuop.length; l++) {
for (int c = 0; c < menuop[l].length; c++) {

System.out.print(menuop[l][c]);
}
System.out.println();
}

 
}
public static void opcao3() {

resultado = litrokmchevrolet[2] * Co2 ;

String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██A cada 11.2km rodados, o Chevrolet Tracker gasta 1L de gasolina█████████████████" },
                    { "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
                                                    "kg de carbono na atmosfera██████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" } };

for (int l = 0; l < menuop.length; l++) {
for (int c = 0; c < menuop[l].length; c++) {

System.out.print(menuop[l][c]);
}
System.out.println();
}



   
}
public static void opcao4() {

resultado = litrokmchevrolet[3] * Co2 ;

String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██A cada 11.9km rodados, o Chevrolet Prisma gasta 1L de gasolina██████████████████" },
                    { "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
                                                     "kg de carbono na atmosfera█████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" } };

for (int l = 0; l < menuop.length; l++) {
for (int c = 0; c < menuop[l].length; c++) {

System.out.print(menuop[l][c]);
}
System.out.println();
}




}	

public static void opcao5() {

resultado = litrokmchevrolet[4] * Co2 ;


String menuop[][] = {{"██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██A cada 12.6km rodados, o Chevrolet Corsa gasta 1L de gasolina███████████████████" },
                    { "██Jogando o equivalente a ", "" + new DecimalFormat(".##").format(resultado),
                                                     "kg de carbono na atmosfera█████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" },
                    { "██████████████████████████████████████████████████████████████████████████████████" } };

for (int l = 0; l < menuop.length; l++) {
for (int c = 0; c < menuop[l].length; c++) {

System.out.print(menuop[l][c]);
}
System.out.println();
}



   

}
}


