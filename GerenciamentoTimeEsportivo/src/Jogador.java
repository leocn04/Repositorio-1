import java.util.ArrayList;
import java.util.List;

public class Jogador extends Pessoa {
	private String posicao;
	private float salario;
	private List<Time> Times = new ArrayList<>();

	public void AdicionarTimeAntigo(Time time) {
		Times.add(time);
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public List<Time> getTimesAntigos() {
		return Times;
	}

	public void setTimesAntigos(List<Time> timesAntigos) {
		Times = timesAntigos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogador [posicao=");
		builder.append(posicao);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", TimesAntigos=");
		for (int i = 0; i < Times.size(); i++) {
			builder.append(Times.get(i).getNome());
		}
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
