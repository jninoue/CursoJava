package br.com.geekuniversity.secao08;

public class DataExtenso {
	static public void dtExtenso(String data) {
		String dia, mes, ano;
		
		dia = data.substring(0, 2);
		mes = data.substring(3, 5);
		ano = data.substring(6, 10);
		
		switch (mes) {
			case "01" :
				System.out.println(dia+" de janeiro de " + ano  );
				break;
			case "02" :
				System.out.println(dia+" de fevereiro de " + ano  );
				break;
			case "03" :
				System.out.println(dia+" de março de " + ano  );
				break;
			case "04" :
				System.out.println(dia+" de abril de " + ano  );
				break;
			case "05" :
				System.out.println(dia+" de maio de " + ano  );
				break;
			case "06" :
				System.out.println(dia+" de junho de " + ano  );
				break;
			case "07" :
				System.out.println(dia+" de julho de " + ano  );
				break;
			case "08" :
				System.out.println(dia+" de agosto de " + ano  );
				break;
			case "09" :
				System.out.println(dia+" de setembro de " + ano  );
				break;
			case "10" :
				System.out.println(dia+" de outubro de " + ano  );
				break;
			case "11" :
				System.out.println(dia+" de novembro de " + ano  );
				break;
			case "12" :
				System.out.println(dia+" de dezembro de " + ano  );
				break;
			default :
				break;
		}
	}

}
