import java.util.ArrayList;
import java.util.List;

public class Elenco {

	private List<Jogador> listaElenco = new ArrayList<>();
	private float salarioTotal;

	public void AdicionarJogador(Jogador jogador) {
		listaElenco.add(jogador);
		salarioTotal = salarioTotal + jogador.getSalario();
	}

	public void removeJogador(Jogador jogador) {
				this.listaElenco.remove(jogador);
			this.salarioTotal = salarioTotal - jogador.getSalario();
		}
	

	public List<Jogador> getListaElenco() {
		return listaElenco;
	}

	public void setListaElenco(List<Jogador> listaElenco) {
		this.listaElenco = listaElenco;
	}

	public float getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(float salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elenco [listaElenco=");
		builder.append(listaElenco);
		builder.append(", salarioTotal=");
		builder.append(salarioTotal);
		builder.append("]");
		return builder.toString();
	}

}
