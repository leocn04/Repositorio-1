import java.util.ArrayList;
import java.util.List;

public class HistoricoTransfer {

	private Time time;
	private List<Transferencia> compras = new ArrayList<>();
	private List<Transferencia> vendas = new ArrayList<>();
	private float saldo;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List<Transferencia> getCompras() {
		return compras;
	}

	public void setCompras(List<Transferencia> compras) {
		this.compras = compras;
	}

	public List<Transferencia> getVendas() {
		return vendas;
	}

	public void setVendas(List<Transferencia> vendas) {
		this.vendas = vendas;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void adicionarTransferencia(Transferencia transferencia) {
		if (transferencia.getTimeNovo().getNome().equals(this.time.getNome())) {
			compras.add(transferencia);
			saldo = saldo - transferencia.getValor();
		} else {
			vendas.add(transferencia);
			saldo = saldo + transferencia.getValor();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", compras=");
		builder.append(compras);
		builder.append(", vendas=");
		builder.append(vendas);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
