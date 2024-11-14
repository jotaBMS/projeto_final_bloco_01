package site.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import site.model.Filial;
import site.model.FilialAlegria;
import site.model.FilialArcoiris;
import site.model.FilialLazer;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//introdução de dados nas filiais 
		
		//filial Alegria 
		FilialAlegria f1 = new FilialAlegria(50, 50, 50, 50, true, "11984424922", "Rua da Alegria 333", 50);
		 
		
		//filial Arcoiris 
		FilialArcoiris f2 = new FilialArcoiris(50, 50, 50, 50, false, "11984424924", "Estr do Arcoiris 777", 30);
				
		//filial Lazera 
		FilialLazer f3 = new FilialLazer(50, 50, 50, 50, true, "11984424923", "Av do Lazer 10", 40);
		
		
		

		int opcao;

		while (true) {

			System.out.println("\n\n\n*****************************************************");
			System.out.println("                   ___________                       ");
			System.out.println("                  |VIBRA COLOR|                      ");
			System.out.println("               |Colorindo sua vida|                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Catalogo                             ");
			System.out.println("            2 - Filiais                              ");
			System.out.println("            3 - Sugestão de cores                    ");
			System.out.println("            4 - Comprar                    ");
			System.out.println("            5 - Sac                                  ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
			opcao = scanner.nextInt();	
			}catch(InputMismatchException e){
				System.out.println("\nDigite uma opção valida!");
				scanner.nextLine();
				opcao=0;
			}

			if (opcao == 6) {
				System.out.println("\nObrigado por visitar nosso site, espero te ver novamente e em breve!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("                   ____________________              ");
					System.out.println("                  |CATALOGO DE PRODUTOS|             ");
					System.out.println("      escolha abaixo a cor tinta que deseja comprar  ");
					System.out.println("                                                     ");
					//System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Roxo                                 ");
					System.out.println("            2 - Vermelho                             ");
					System.out.println("            3 - Azul                                 ");
					System.out.println("            4 - Azul Bebê                            ");
					System.out.println("            5 - Amarelo Sol                          ");
					System.out.println("            6 - Branco                               ");
					System.out.println("\n            7 - Sair do catalogo                   ");
					System.out.println("                                                     ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					

					break;
				case 2:
					System.out.println("Nossas fliais se encontram nos endereços abaixo: \n");
					f1.consultarLoja();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					f2.consultarLoja();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					f3.consultarLoja();
					
					
					

					break;
				case 3:
					System.out.println("Onde pretende pintar? \n\n");
					System.out.println("     1 - Interiores \n");
					System.out.println("     2 - Exteriores \n");
					int sugestao = scanner.nextInt();
					
					switch (sugestao) {
					case 1 : 
						System.out.println("Para um ambiente mais fechados é interessante usar tons mais claros como azul bebê para não escurecer o ambiente. \n\n");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;
						
					case 2 :
						System.out.println("Para um ambiente mais abertos você pode ousar e optar por cores como Vermelho ou amarelo sol. \n\n");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;
					}
				 					
					break;
				case 4 : 
					System.out.println("\n escolha a filial para consultar estoque ");
					System.out.println("--> 1 - Rua da Alegria, 333");
					System.out.println("--> 2 -Estr. do arcoiris, 777");
					System.out.println("--> 3 -Av. do Lazer, 10");
					int filial = scanner.nextInt();
					
					switch (filial) {
					
					case 1:  
						
						System.out.println("estoque loja 1");
						f1.consulestoque();
						break;
						
					case 2:  
						
						System.out.println(" estoque loja 2");
						f2.consulestoque();
						break;
						
					case 3:  
						
						System.out.println(" estoque loja 3");
						f3.consulestoque();
						break;
					
					}

					
					break;
					
				case 5:
					System.out.println("Para falar com o nosso Serviço de Atendimento ao Consumidor entre em contato com os numeros abaixo: \n");
					System.out.println("Reclamações: 0800 123123 132");
					System.out.println("Trocas:      0800 456456 456");
					System.out.println("Sugestões:    0800 789789 789\n\n");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					break;
				
				default:
					System.out.println("\nOPÇÃO INVALIDA!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n**********************************************************");
		System.out.println("Projeto Desenvolvido por: João Bispo ");
		System.out.println("Email de contato -  joaovitor.bispo.1000@gmail.com");
		System.out.println("github.com/jotaBMS");
		System.out.println("**********************************************************");
	

	}

}
