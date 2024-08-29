package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//encapsulamento do processo do arquivo através do caminho 		
		File file = new File("C:\\Users\\gio1p\\Documents\\teste.txt");
		
		
		//instanciando o Scanner com null apenas para ter um valor , ao fazer isso pode ser gerado
		//uma exceção do IO então deve ser alocado em um bloco de try catch
		Scanner sc = null;
		
		try {
		
		//instanciado o Scanner utilizando o file como argumento	
			sc = new Scanner(file);
			
		//"while sc.hasNextLine()" ira fazer a função de loop enquanto ouver uma proxima linha de leitura no
		//arquivo	
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
		}
		//se acontecer alguma exceção é exibido uma mensagem para o usuario
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		//o bloco "finally" ira fechar o Scanner de uma maneira mais efetiva , se o "sc.close()" for alocado
		//logo após o bloco "while" pode acontecer de um erro no arquivo e o bloco while pode ser pulado 
		
		finally{
			
		//a logica do "if" é utilizado aqui para garantir que o Scanner sera fechado porem so depois da 
		//instanciação do arquivo pois o Scanner vai estar valendo null	
			if (sc != null) {
				sc.close();
			}
		}
		
		
		

	}

}
