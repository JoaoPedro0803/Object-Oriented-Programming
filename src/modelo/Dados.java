package modelo;

/**
 * Criação das arrays em que serão atribuídos os dados pré-cadastrados
 * 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

//Declaração das arrays em que os dados cadastrados serão armazanados
public class Dados {

	private Cliente[] clientes = new Cliente[40];
	private int qtdClientes = 0;
	private Funcionario[] funcs = new Funcionario[40];
	private int qtdFuncs = 0;
	private Armacao[] armacoes = new Armacao[40];
	private int qtdArmacoes = 0;
	private Telefone[] tels = new Telefone[40];
	private int qtdTels = 0;
	private Endereco[] enderecos = new Endereco[40];
	private int qtdEnderecos = 0;
	private Lente[] lentes = new Lente[40];
	private int qtdLentes = 0;
	private OculosDeSol[] oculos = new OculosDeSol[40];
	private int qtdOculos = 0;
	private Venda[] vendas = new Venda[40];
	private int qtdVendas = 0;

// Preenche os dados de clientes, funcionários, produtos e vendas pré-cadastrados
	public void preCadastro() {

		tels[0] = new Telefone(61, 985473652);
		tels[1] = new Telefone(62, 996587412);
		tels[2] = new Telefone(61, 983521478);
		tels[3] = new Telefone(11, 987894519);
		tels[4] = new Telefone(14, 990817423);
		enderecos[0] = new Endereco(72145450, "12");
		enderecos[1] = new Endereco(72163520, "301B");
		enderecos[2] = new Endereco(52641320, "27A");
		enderecos[3] = new Endereco(66448840, "09");
		enderecos[4] = new Endereco(98491270, "1101");
		clientes[0] = new Cliente("Gabriel", "gabriel@gmail.com", "05214536985", "3147395", tels[0], enderecos[0]);
		clientes[1] = new Cliente("João", "joao@gmail.com", "03475695123", "2985743", tels[1], enderecos[1]);
		clientes[2] = new Cliente("Henrique", "henrique@gmail.com", "04685020071", "2589674", tels[2], enderecos[2]);
		clientes[3] = new Cliente("Juliana", "juliana@gmail.com", "06845062510", "3745896", tels[3], enderecos[3]);
		clientes[4] = new Cliente("Maria", "maria@gmail.com", "02854637125", "3257842", tels[4], enderecos[4]);
		funcs[0] = new Funcionario("Sandra", "1050.00", "07842695812", "Atendente", tels[0], enderecos[0]);
		funcs[1] = new Funcionario("Genildo", "1500.00", "05628914560", "Caixa", tels[1], enderecos[1]);
		funcs[2] = new Funcionario("Cadu", "1250.00", "05792486854", "Supervisor", tels[2], enderecos[2]);
		funcs[3] = new Funcionario("Fernanda", "1300.00", "06546844132", "Gerente", tels[3], enderecos[3]);
		funcs[4] = new Funcionario("Edna", "1450.00", "07649080498", "Atendente", tels[4], enderecos[4]);
		armacoes[0] = new Armacao("Chilli Beans", 10001, 53.99f, "Quadrado", "Madeira", "Marrom", 2);
		armacoes[1] = new Armacao("Mormaii", 10002, 59.99f, "Retangular", "Plástico", "Pastel", 4);
		armacoes[2] = new Armacao("Chilli Beans", 10003, 64.99f, "Redondo", "Alumínio", "Vinho", 3);
		armacoes[3] = new Armacao("Ray-Ban", 10004, 69.99f, "Oval", "Ultem", "Dourado", 7);
		armacoes[4] = new Armacao("Ray-Ban", 10005, 79.99f, "Aviador", "Metal", "Preto", 5);
		lentes[0] = new Lente("Hoya", 20001, 49.99f, 0.8f, "Miopia", 5);
		lentes[1] = new Lente("Carl Zeiss", 20002, 54.99f, 1.5f, "Astigmatismo", 6);
		lentes[2] = new Lente("Essilor", 20003, 61.99f, 1.8f, "Miopia", 1);
		lentes[3] = new Lente("Kodak Lenses", 20004, 44.99f, 2.0f, "Hipermetropia", 4);
		lentes[4] = new Lente("Lenscope", 20005, 59.99f, 2.2f, "Miopia", 3);
		oculos[0] = new OculosDeSol("Ray-Ban", 30001, 499.99f, "Quadrado", "Metal", "Marrom", "Verde", 10);
		oculos[1] = new OculosDeSol("Chilli Beans", 30002, 259.99f, "Aviador", "Metal", "Pastel", "Marrom", 11);
		oculos[2] = new OculosDeSol("Ray-Ban", 30003, 499.99f, "Quadrado", "Metal", "Vinho", "Cinza", 15);
		oculos[3] = new OculosDeSol("Ray-Ban", 30004, 499.99f, "Quadrado", "Metal", "Dourado", "Amarelo", 8);
		oculos[4] = new OculosDeSol("Chilli Beans", 30005, 179.99f, "Quadrado", "Plástico", "Preto", "Preto", 18);
		vendas[0] = new Venda("Dinheiro", 40001, 15f);
		vendas[1] = new Venda("PIX", 40002, 30f);
		vendas[2] = new Venda("Cartão de Crédito", 40003, 60f);
		vendas[3] = new Venda("Cartão de Débito", 40004, 75f);
		vendas[4] = new Venda("Cheque", 40005, 90f);

		qtdEnderecos = 5;
		qtdClientes = 5;
		qtdFuncs = 5;
		qtdTels = 5;
		qtdArmacoes = 5;
		qtdLentes = 5;
		qtdOculos = 5;
		qtdVendas = 5;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public Funcionario[] getFuncs() {
		return funcs;
	}

	public void setFuncs(Funcionario[] funcs) {
		this.funcs = funcs;
	}

	public int getQtdFuncs() {
		return qtdFuncs;
	}

	public void setQtdFuncs(int qtdFuncs) {
		this.qtdFuncs = qtdFuncs;
	}

	public Armacao[] getArmacoes() {
		return armacoes;
	}

	public void setArmacoes(Armacao[] armacoes) {
		this.armacoes = armacoes;
	}

	public int getQtdArmacoes() {
		return qtdArmacoes;
	}

	public void setQtdArmacoes(int qtdArmacoes) {
		this.qtdArmacoes = qtdArmacoes;
	}

	public Telefone[] getTels() {
		return tels;
	}

	public void setTels(Telefone[] tels) {
		this.tels = tels;
	}

	public int getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}

	public void inserirEditarFuncs(Funcionario func, int pos) {
		this.funcs[pos] = func;
		if (pos == qtdFuncs)
			qtdFuncs++;
	}

	public void inserirEditarClientes(Cliente cli, int pos) {
		this.clientes[pos] = cli;
		if (pos == qtdClientes)
			qtdClientes++;
	}

	public void inserirEditarOculosSol(OculosDeSol oc, int pos) {
		this.oculos[pos] = oc;
		if (pos == qtdOculos)
			qtdOculos++;
	}

	public void inserirEditarLentes(Lente len, int pos) {
		this.lentes[pos] = len;
		if (pos == qtdLentes)
			qtdLentes++;
	}

	public void inserirEditarArmacoes(Armacao arm, int pos) {
		this.armacoes[pos] = arm;
		if (pos == qtdArmacoes)
			qtdArmacoes++;
	}

	public void inserirEditarVendas(Venda venda, int pos) {
		this.vendas[pos] = venda;
		if (pos == qtdVendas)
			qtdVendas++;
	}

	public Endereco[] getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	public int getQtdEnderecos() {
		return qtdEnderecos;
	}

	public void setQtdEnderecos(int qtdEnderecos) {
		this.qtdEnderecos = qtdEnderecos;
	}

	public Lente[] getLentes() {
		return lentes;
	}

	public void setLentes(Lente[] lentes) {
		this.lentes = lentes;
	}

	public int getQtdLentes() {
		return qtdLentes;
	}

	public void setQtdLentes(int qtdLentes) {
		this.qtdLentes = qtdLentes;
	}

	public OculosDeSol[] getOculos() {
		return oculos;
	}

	public void setOculos(OculosDeSol[] oculos) {
		this.oculos = oculos;
	}

	public int getQtdOculos() {
		return qtdOculos;
	}

	public void setQtdOculos(int qtdOculos) {
		this.qtdOculos = qtdOculos;
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

}