import java.util.ArrayList;
import java.util.List;

public class Comissao {

	private List<Funcionario> listaComissao = new ArrayList<>();
	private float salarioTotal;

	public void AdicionarFuncionario(Funcionario funcionario) {
		listaComissao.add(funcionario);
		salarioTotal = salarioTotal + funcionario.getSalario();
	}

	public void removeAluno(String name) {
		for (Funcionario a : this.listaComissao) {
			if (a.getNome().equals(name))
				this.listaComissao.remove(a);
			this.salarioTotal = salarioTotal - a.getSalario();
		}
	}

	public List<Funcionario> getListaComissao() {
		return listaComissao;
	}

	public void setListaComissao(List<Funcionario> listaComissao) {
		this.listaComissao = listaComissao;
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
		builder.append("Comissao [listaComissao=");
		builder.append(listaComissao);
		builder.append(", salarioTotal=");
		builder.append(salarioTotal);
		builder.append("]");
		return builder.toString();
	}

}
