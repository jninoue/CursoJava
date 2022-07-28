package br.com.geekuniversity.secao18.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		String path = "C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\vendedor.csv";
		
		List<Product> list = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				
				Product prod = new Product(vect[0], Double.parseDouble(vect[1]), Integer.parseInt(vect[2])); 
						
				list.add(prod);
				line = br.readLine();
			}
			

			for (Product p : list) {
				System.out.println(p);
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
