package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			String arquivo;
			int l0 = 0, l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0, l7 = 0, l8 = 0, l9 = 0;
			int la = 0, lb = 0, lc = 0, ld = 0, le = 0, lf = 0, lg = 0, lh = 0, li = 0, lj = 0; 
			int lk = 0, ll = 0, lm = 0, ln = 0, lo = 0, lp = 0, lq = 0, lr = 0, ls = 0, lt = 0;
			int lu = 0, lv = 0, lw = 0, lx = 0, ly = 0, lz = 0;
			
			while (ler.hasNextLine()) {
				arquivo = ler.nextLine();
				
				for (int i = 0; i < arquivo.length(); i++) {
					switch (arquivo.toLowerCase().charAt(i)) {
					case '0': l0++; break;
					case '1': l1++; break;
					case '2': l2++; break;
					case '3': l3++; break;
					case '4': l4++; break;
					case '5': l5++; break;
					case '6': l6++; break;
					case '7': l7++; break;
					case '8': l8++; break;
					case '9': l9++; break;
					case 'a': la++; break;
					case 'b': lb++; break;
					case 'c': lc++; break;
					case 'd': ld++; break;
					case 'e': le++; break;
					case 'f': lf++; break;
					case 'g': lg++; break;
					case 'h': lh++; break;
					case 'i': li++; break;
					case 'j': lj++; break;
					case 'k': lk++; break;
					case 'l': ll++; break;
					case 'm': lm++; break;
					case 'n': ln++; break;
					case 'o': lo++; break;
					case 'p': lp++; break;
					case 'q': lq++; break;
					case 'r': lr++; break;
					case 's': ls++; break;
					case 't': lt++; break;
					case 'u': lu++; break;
					case 'v': lv++; break;
					case 'w': lw++; break;
					case 'x': lx++; break;
					case 'y': ly++; break;
					case 'z': lz++; break;
					
					default:
						System.out.println("Fora da tabela ASCII");
						break;
					}
				}
			}
			
			System.out.println("Quantidade de letras do alfabeto no arquivo: ");
			System.out.println("Letra 0: " + l0);
			System.out.println("Letra 1: " + l1);
			System.out.println("Letra 2: " + l2);
			System.out.println("Letra 3: " + l3);
			System.out.println("Letra 4: " + l4);
			System.out.println("Letra 5: " + l5);
			System.out.println("Letra 6: " + l6);
			System.out.println("Letra 7: " + l7);
			System.out.println("Letra 8: " + l8);
			System.out.println("Letra 9: " + l9);
			System.out.println("Letra a: " + la);
			System.out.println("Letra b: " + lb);
			System.out.println("Letra c: " + lc);
			System.out.println("Letra d: " + ld);
			System.out.println("Letra e: " + le);
			System.out.println("Letra f: " + lf);
			System.out.println("Letra g: " + lg);
			System.out.println("Letra h: " + lh);
			System.out.println("Letra i: " + li);
			System.out.println("Letra j: " + lj);
			System.out.println("Letra k: " + lk);
			System.out.println("Letra l: " + ll);
			System.out.println("Letra m: " + lm);
			System.out.println("Letra n: " + ln);
			System.out.println("Letra o: " + lo);
			System.out.println("Letra p: " + lp);
			System.out.println("Letra q: " + lq);
			System.out.println("Letra r: " + lr);
			System.out.println("Letra s: " + ls);
			System.out.println("Letra t: " + lt);
			System.out.println("Letra u: " + lu);
			System.out.println("Letra v: " + lv);
			System.out.println("Letra w: " + lw);
			System.out.println("Letra x: " + lx);
			System.out.println("Letra y: " + ly);
			System.out.println("Letra x: " + lz);
			ler.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		

	}

}
