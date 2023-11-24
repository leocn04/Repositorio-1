import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Time {

	private String nome;
	private LocalDate dataFundacao;
	private String Pais;
	private Elenco elenco;
	private Diretoria diretoria;
	private Comissao comissao;
	private Estadio estadio;
	private List<Patrocinador> patrocinadores = new ArrayList<>();
	private Financas financas;
	private HistoricoTransfer historicoTransfer;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public Elenco getElenco() {
		return elenco;
	}
	public void setElenco(Elenco elenco) {
		this.elenco = elenco;
	}
	public Diretoria getDiretoria() {
		return diretoria;
	}
	public void setDiretoria(Diretoria diretoria) {
		this.diretoria = diretoria;
	}
	public Comissao getComissao() {
		return comissao;
	}
	public void setComissao(Comissao comissao) {
		this.comissao = comissao;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	public float getValorPatrocinio(int i) {
		return patrocinadores.get(i).getValor();
	}
	
	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	public Financas getFinancas() {
		return financas;
	}
	public void setFinancas(Financas financas) {
		this.financas = financas;
	}
	public HistoricoTransfer getHistoricoTransfer() {
		return historicoTransfer;
	}
	public void setHistoricoTransfer(HistoricoTransfer historicoTransfer) {
		this.historicoTransfer = historicoTransfer;
	}

	public void AdicionarPatrocinador(Patrocinador patrocinador) {
		patrocinadores.add(patrocinador);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Time [nome=");
		builder.append(nome);
		builder.append(", dataFundacao=");
		builder.append(dataFundacao);
		builder.append(", Pais=");
		builder.append(Pais);
		builder.append(", elenco=");
		builder.append(elenco);
		builder.append(", diretoria=");
		builder.append(diretoria);
		builder.append(", comissao=");
		builder.append(comissao);
		builder.append(", estadio=");
		builder.append(estadio);
		builder.append(", patrocinadores=");
		builder.append(patrocinadores);
		builder.append(", financas=");
		builder.append(financas);
		builder.append(", historicoTransfer=");
		builder.append(historicoTransfer);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
