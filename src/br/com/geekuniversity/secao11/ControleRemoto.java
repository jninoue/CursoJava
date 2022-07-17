package br.com.geekuniversity.secao11;

public class ControleRemoto {
	Televisao tv;
	
	public ControleRemoto(Televisao tv) {
		this.tv = tv;
	}
	
	public void aumenta_volume() {
		tv.volume = tv.volume + 1;
	}
	
	public void diminui_volume() {
		if ((tv.volume - 1) >= 0 ) {
			tv.volume = tv.volume - 1;
		}
	}
	
	public void troca_canal(int canal) {
		tv.canal = canal;
		
	}
	
	public void aumenta_canal() {
		tv.canal = tv.canal + 1;
	}
	
	public void diminui_canal() {
		if ((tv.canal - 1) >= 0 ) {
			tv.canal = tv.canal - 1;
		}
	}

}
