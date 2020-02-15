package pacote;

public class Carro {
	
	// Atributos
	private int velocidadeMaxima;
	protected int velocidadeAtual = 0;
	private int consumo;
	private String marca;
	private String modelo;
	private int ano;
	private int potencia;
	private double preco;
	private double volumeMala;
	private double quilometragemRodada;
	private boolean usado;
	private String cor;
	
	// Comportamento - métodos de funcionalidades
	
	public void acelerar() {
		velocidadeAtual += 10;
	}
	
	public void desacelerar() {
		velocidadeAtual -= 10;
	}
	
	public void buzinar(int segundos) {
		System.out.println("Biiiiiiiiii por " + segundos + " segundos.");
	}
	
	public void frear() {
		velocidadeAtual = 0;
	}
	
	// Métodos de acesso
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getVolumeMala() {
		return volumeMala;
	}

	public void setVolumeMala(double volumeMala) {
		this.volumeMala = volumeMala;
	}

	public double getQuilometragemRodada() {
		return quilometragemRodada;
	}

	public void setQuilometragemRodada(double quilometragemRodada) {
		this.quilometragemRodada = quilometragemRodada;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}	

}
