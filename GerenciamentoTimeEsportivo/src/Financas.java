
public class Financas {

	private Time time;
	private float entradasValor;
	private float saidasValor;
	private float saldo;

	public Financas(Time time) {
		this.time = time;
		for (int i = 0; i < time.getPatrocinadores().size(); i++) {
			entradasValor = entradasValor + time.getValorPatrocinio(i);
		}
		if (time.getEstadio().getSaldo() > 0) {
			entradasValor = entradasValor + time.getEstadio().getSaldo();
		} else {
			saidasValor = saidasValor + time.getEstadio().getSaldo();
		}

		if (time.getHistoricoTransfer().getSaldo() > 0) {
			entradasValor = entradasValor + time.getHistoricoTransfer().getSaldo();
		} else {
			saidasValor = saidasValor + time.getHistoricoTransfer().getSaldo();
		}
		saidasValor = saidasValor + time.getComissao().getSalarioTotal();
		saidasValor = saidasValor + time.getDiretoria().getSalarioTotal();
		saidasValor = saidasValor + time.getElenco().getSalarioTotal();

		saldo = entradasValor - saidasValor;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public float getEntradasValor() {
		return entradasValor;
	}

	public void setEntradasValor(float entradasValor) {
		this.entradasValor = entradasValor;
	}

	public float getSaidasValor() {
		return saidasValor;
	}

	public void setSaidasValor(float saidasValor) {
		this.saidasValor = saidasValor;
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
		builder.append(", entradasValor=");
		builder.append(entradasValor);
		builder.append(", saidasValor=");
		builder.append(saidasValor);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

}
