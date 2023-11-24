
public class Transferencia {

	private Jogador jogador;
	private Time timeAntigo;
	private Time timeNovo;
	private float valor;

	public Transferencia(Jogador jogador, Time timeAntigo, Time timeNovo, float valor ) {
		this.jogador = jogador;
		this.timeAntigo = timeAntigo;
		this.timeNovo = timeNovo;
		this.valor = valor;
		
		timeAntigo.getElenco().removeJogador(jogador);
		timeNovo.getElenco().AdicionarJogador(jogador);
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Time getTimeAntigo() {
		return timeAntigo;
	}

	public void setTimeAntigo(Time timeAntigo) {
		this.timeAntigo = timeAntigo;}

	public Time getTimeNovo() {
		return timeNovo;
	}

	public void setTimeNovo(Time string) {
		this.timeNovo = string;	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transferencia [jogador=");
		builder.append(jogador.getNome());
		builder.append(", timeAntigo=");
		builder.append(timeAntigo.getNome());
		builder.append(", timeNovo=");
		builder.append(timeNovo.getNome());
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	

}
