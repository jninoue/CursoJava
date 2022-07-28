package br.com.geekuniversity.secao18.exercicio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		File file = new File ("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\vendedor.csv");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				 System.out.println(sc.nextLine());
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if (sc != null) {
				sc.close();	
			}
			
		}
		
		
		
	}

}
