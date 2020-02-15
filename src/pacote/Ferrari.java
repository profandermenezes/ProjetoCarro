package pacote;

// Ferrari é um tipo de Carro?
public class Ferrari extends Carro{
	
	// ctrl + espaço : auto-completar
	
	// especialização da função acelerar (sobrescrita)
	public void acelerar() {
		//setVelocidadeAtual(getVelocidadeAtual() + 40);
		velocidadeAtual += 40;
	}

}
