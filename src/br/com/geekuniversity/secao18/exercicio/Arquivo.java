package br.com.geekuniversity.secao18.exercicio;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Arquivo {
	
	static String path = "C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\";
	static Scanner teclado = new Scanner(System.in);
	
	public void criar_arquivo(String arquivo) {
		try (PrintStream arq = new PrintStream(new FileOutputStream(path + arquivo + ".csv", true))){
			System.out.println("Arquivo: " + arquivo + ".csv criado com sucesso!");
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não pode ser criado!");
		}
	
	}

	
	public void incluir_registro(String arquivo) {
		
		boolean incluir = true;
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		
		
		//* Ler o arquivo e incluir no array para que posso fazer a ordenação ao salva-lo.
		try (BufferedReader br = new BufferedReader(new FileReader(path + arquivo + ".csv"))){
			
			String linha = br.readLine();			
			while (linha != null) {
				String[] vect = linha.split(";");
				vendedores.add(new Vendedor(Integer.parseInt(vect[0]), vect[1], Float.parseFloat(vect[2]), Integer.parseInt(vect[3])));
				linha = br.readLine();
			}
			
		
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		/*
		 * Captura dados para incluir registro
		 */
		try (PrintStream arq = new PrintStream(new FileOutputStream(path + arquivo + ".csv"))){
			
			while (incluir) {
				
				if (vendedores.isEmpty()) {
					System.out.println("======= Incluir Registro ======");
					System.out.print("Informe o Codigo do Vendedor: " );
					String codigo = teclado.nextLine();
					System.out.print("Informe o mes da venda......: " );
					String mes = teclado.nextLine();
					System.out.print("Informe o nome do Vendedor..: " );
					String nome = teclado.nextLine();
					System.out.print("Informe o Valor da Venda....: " );
					String venda = teclado.nextLine();
					vendedores.add(new Vendedor(Integer.parseInt(codigo), nome, Float.parseFloat(venda), Integer.parseInt(mes)));
					System.out.println("Registro incluído com sucesso!");	
				}else {
					System.out.println("======= Incluir Registro ======");
					System.out.print("Informe o Codigo do Vendedor: " );
					String codigo = teclado.nextLine();
					System.out.print("Informe o mes da venda......: " );
					String mes = teclado.nextLine();
					
					for (Vendedor v : vendedores) {
						if (v.getCodigo_vendedor() == Integer.parseInt(codigo) && v.getMes() == Integer.parseInt(mes)) {
							System.out.println("Registro ja cadastrado!");
							break;
						}else {
							System.out.print("Informe o nome do Vendedor..: " );
							String nome = teclado.nextLine();
							System.out.print("Informe o Valor da Venda....: " );
							String venda = teclado.nextLine();
							vendedores.add(new Vendedor(Integer.parseInt(codigo), nome, Float.parseFloat(venda), Integer.parseInt(mes)));
							System.out.println("Registro incluído com sucesso!");
							break;
						}
					}
				}
				System.out.print("Incuir outro registro (S)im (N)ão: ");
				incluir = teclado.nextLine().toUpperCase().equals("S");
				 
			}
			Collections.sort(vendedores);
			
			for (Vendedor v : vendedores) {
				arq.println(v.getCodigo_vendedor()+";"+v.getNome_vendedor()+";"+v.getValor_venda()+";"+v.getMes()+";");
			}
			
		}catch(FileNotFoundException e) {
			{
				System.out.println("Não foi possivel incluir Registro arquivo!");
			}
		}
	}
	
	public void excluir_registro(String arquivo) {
		
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path + arquivo + ".csv"))){
			
			String linha = br.readLine();			
			while (linha != null) {
				String[] vect = linha.split(";");
				vendedores.add(new Vendedor(Integer.parseInt(vect[0]), vect[1], Float.parseFloat(vect[2]), Integer.parseInt(vect[3])));
				linha = br.readLine();
			}
			
			System.out.println("********** EXCLUSAO **********");
			System.out.println("Informe o codigo vendedor: ");
			String codigo = teclado.nextLine();
			System.out.println("Informe o mes: ");
			String mes = teclado.nextLine();
			
			for (Vendedor v : vendedores) {
				if (v.getCodigo_vendedor() == Integer.parseInt(codigo) && v.getMes() == Integer.parseInt(mes)) {
					vendedores.remove(v);
					break;
				}
			}
			
			
			Collections.sort(vendedores);
			
			
			try (PrintStream arq = new PrintStream(path + arquivo + ".csv")) {
				
				for (Vendedor v : vendedores) {
					arq.println(v.getCodigo_vendedor()+";"+v.getNome_vendedor()+";"+v.getValor_venda()+";"+v.getMes()+";");
				}
				arq.close();
			}catch(FileNotFoundException e) {
				System.out.println("Não foi possivel incluir Registro arquivo!");
			}
			
					
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void alterar_venda(String arquivo) {
		
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path + arquivo + ".csv"))){
			
			String linha = br.readLine();			
			while (linha != null) {
				String[] vect = linha.split(";");
				vendedores.add(new Vendedor(Integer.parseInt(vect[0]), vect[1], Float.parseFloat(vect[2]), Integer.parseInt(vect[3])));
				linha = br.readLine();
			}
			
			System.out.println("******** ALTERA VENDA ********");
			System.out.println("Informe o codigo vendedor: ");
			String codigo = teclado.nextLine();
			System.out.println("Informe o mes: ");
			String mes = teclado.nextLine();
			
			for (Vendedor v : vendedores) {
				if (v.getCodigo_vendedor() == Integer.parseInt(codigo) && v.getMes() == Integer.parseInt(mes)) {
					System.out.println("Informe novo valor de venda: ");
					v.setValor_venda(Float.parseFloat(teclado.nextLine()));
					break;
				}
			}
			
			
			Collections.sort(vendedores);
			
			
			try (PrintStream arq = new PrintStream(path + arquivo + ".csv")) {
				
				for (Vendedor v : vendedores) {
					arq.println(v.getCodigo_vendedor()+";"+v.getNome_vendedor()+";"+v.getValor_venda()+";"+v.getMes()+";");
				}
				arq.close();
			}catch(FileNotFoundException e) {
				System.out.println("Não foi possivel incluir Registro arquivo!");
			}
			
					
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void imprime_registro(String arquivo) {
		
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		try (BufferedReader br = new BufferedReader(new FileReader(path + arquivo + ".csv"))){
			
			String linha = br.readLine();			
			while (linha != null) {
				
				String[] vect = linha.split(";");
				
				vendedores.add(new Vendedor(Integer.parseInt(vect[0]), vect[1], Float.parseFloat(vect[2]), Integer.parseInt(vect[3])));
				linha = br.readLine();
				
			}
			
			if (vendedores.isEmpty()) {
				System.out.println("Arquivo está vazio!");
			}else {
				for (Vendedor v : vendedores) {
					System.out.println(v);	
			}
			
			}
		
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void excluir_arquivo(String arquivo) {
		
		Path caminho = Paths.get(path + arquivo + ".csv");
			
		try {
			if (Files.deleteIfExists(caminho)) {
				System.out.println("Arquivo deletado com sucesso!");
			}else {
				System.out.println("Falha ao deletar arquivo!");
			}
				
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
		
}
