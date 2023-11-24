import java.util.ArrayList;
import java.util.List;

public class Diretoria {

	private List<Funcionario> listaDiretoria = new ArrayList<>();
	private float salarioTotal;

	public void AdicionarFuncionario(Funcionario funcionario) {
		listaDiretoria.add(funcionario);
		salarioTotal = salarioTotal + funcionario.getSalario();
	}

	public void removeAluno(String name) {
		for (Funcionario a : this.listaDiretoria) {
			if (a.getNome().equals(name))
				this.listaDiretoria.remove(a);
			this.salarioTotal = salarioTotal - a.getSalario();
		}
	}

	public List<Funcionario> getListaDiretoria() {
		return listaDiretoria;
	}

	public void setListaDiretoria(List<Funcionario> listaDiretoria) {
		this.listaDiretoria = listaDiretoria;
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
		builder.append("Diretoria [listaDiretoria=");
		builder.append(listaDiretoria);
		builder.append(", salarioTotal=");
		builder.append(salarioTotal);
		builder.append("]");
		return builder.toString();
	}

}
