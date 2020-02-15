package pacote;

public class Principal {

	public static void main(String[] args) {
		
		// Declaração e instanciação de um novo obejto
		Carro uno = new Carro();
		
		uno.setAno(1998);
		uno.setMarca("Fiat");
		uno.setModelo("Uno Mille com Escada");
		uno.setPotencia(350);
		
		System.out.println(uno.getVelocidadeAtual() + "Km/h");
		
		uno.acelerar();
		
		System.out.println(uno.getVelocidadeAtual() + "Km/h");
		
		uno.acelerar();
		
		System.out.println(uno.getVelocidadeAtual() + "Km/h");
		
		uno.frear();
		
		System.out.println(uno.getVelocidadeAtual() + "Km/h");
		
		Carro uno2 = new Carro();
		
		uno2 = null;
		
		//System.out.println(uno2.getVelocidadeAtual() + "Km/h");
		
		Ferrari f = new Ferrari();
		
		f.acelerar();
		System.out.println("Ferrari: " + f.getVelocidadeAtual() + " Km/h");

	}

}
