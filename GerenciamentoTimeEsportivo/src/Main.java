import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Jogador leo = new Jogador();
		leo.setNome("Leonardo");
		leo.setGenero("Masculino");
		leo.setPosicao("Atacante");
		leo.setSalario(500000);
		leo.setDataNascimento(LocalDate.parse("2004-07-06"));

		Jogador ze = new Jogador();
		ze.setNome("José");
		ze.setGenero("Masculino");
		ze.setPosicao("Volante");
		ze.setSalario(1000000);
		ze.setDataNascimento(LocalDate.parse("2000-02-25"));

		Funcionario joao = new Funcionario();
		joao.setNome("João");
		joao.setGenero("Masculino");
		joao.setCargo("Treinador");
		joao.setSalario(200000);
		joao.setDataNascimento(LocalDate.parse("1980-05-07"));

		Funcionario lucas = new Funcionario();
		lucas.setNome("Lucas");
		lucas.setGenero("Masculino");
		lucas.setCargo("Presidente");
		lucas.setSalario(500000);
		lucas.setDataNascimento(LocalDate.parse("1970-10-01"));

		Elenco e = new Elenco();
		e.AdicionarJogador(leo);

		Elenco e2 = new Elenco();
		e2.AdicionarJogador(ze);

		Comissao c = new Comissao();
		c.AdicionarFuncionario(joao);

		Diretoria d = new Diretoria();
		d.AdicionarFuncionario(lucas);

		Estadio arena = new Estadio();
		arena.setNome("Pacaembu");
		arena.setSaidas(100000);
		arena.setEntradas(500000);
		arena.setCapacidade(40000);

		Patrocinador p = new Patrocinador();
		p.setNome("CAIXA");
		p.setTipo("Banco");
		p.setValor(20000000);

		Time timeteste = new Time();
		timeteste.setNome("time teste");
		timeteste.setElenco(e2);

		Time ifc = new Time();
		ifc.setNome("IFC FC");
		ifc.setDataFundacao(LocalDate.parse("2023-11-23"));
		ifc.setPais("Brasil");
		ifc.setEstadio(arena);
		ifc.setComissao(c);
		ifc.setElenco(e);
		ifc.setDiretoria(d);
		ifc.AdicionarPatrocinador(p);

		Transferencia t = new Transferencia(ze, timeteste, ifc, 50000);
		HistoricoTransfer h = new HistoricoTransfer();
		h.setTime(ifc);
		ifc.setHistoricoTransfer(h);
		h.adicionarTransferencia(t);
		
		System.out.println(ifc.getHistoricoTransfer());
		System.out.println(timeteste.getElenco());
		System.out.println(ifc.getElenco());
		
		System.out.println("\n");
		
		Transferencia t2 = new Transferencia(ze, ifc, timeteste, 50000);
		h.adicionarTransferencia(t2);
		System.out.println(ifc.getHistoricoTransfer());
		System.out.println(timeteste.getElenco());
		System.out.println(ifc.getElenco());
		
		System.out.println("\n");
		
		
		Financas f = new Financas(ifc);
		ifc.setFinancas(f);

		
		System.out.println(ifc.toString());
		
		
		// FAZER HISTORICO,TRANSFERENCIAS ADICIONANDO E REMOVENDO JOGADOR DO ELENCO

	}

}
