package site.luisicj.juegolucha;

public class Luchador {
	
	private String nombreLuchador;
	private int puntosVida;
	
	public Luchador(String nombreLuchador) {
		this.nombreLuchador = nombreLuchador;
		this.puntosVida = 3;
	}
	
	public String getNombreLuchador() {
		return nombreLuchador;
	}
	
	public void setNombreLuchador(String nombreLuchador) {
		this.nombreLuchador = nombreLuchador;
	}
	
	public int getPuntosVida() {
		return puntosVida;
	}
	
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	public void recibirDano() {
		this.puntosVida -= 1;
	}
	
}
