
public class Estadio {

	private String nome;
	private float capacidade;
	private float entradas;
	private float saidas;
	private float saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}

	public float getEntradas() {
		return entradas;
	}

	public void setEntradas(float entradas) {
		this.entradas = entradas;
		this.saldo = saldo+entradas;
	}

	public float getSaidas() {
		return saidas;
	}

	public void setSaidas(float saidas) {
		this.saidas = saidas;
		this.saldo = saldo-saidas;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estadio [nome=");
		builder.append(nome);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", entradas=");
		builder.append(entradas);
		builder.append(", saidas=");
		builder.append(saidas);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

}
