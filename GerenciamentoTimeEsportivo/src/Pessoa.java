
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private String genero;
	private LocalDate DataNascimento;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
		final LocalDate dataAtual = LocalDate.now();
		final Period periodo = Period.between(DataNascimento, dataAtual);
		setIdade(periodo.getYears());

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", DataNascimento=");
		builder.append(DataNascimento);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}

	

}
