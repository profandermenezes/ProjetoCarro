package pacote;

public class UnoEscada extends Carro{
	
	private double tamEscada;
	
	public void acelerar() {
		if(tamEscada > 5) {
			velocidadeAtual += 90;
		} else {
			velocidadeAtual += 50;
		}
	}

	public double getTamEscada() {
		return tamEscada;
	}

	public void setTamEscada(double tamEscada) {
		this.tamEscada = tamEscada;
	}

}
