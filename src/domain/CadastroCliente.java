package domain;

public class CadastroCliente {

	private Integer numeroConta;
	private Integer agencia;
	private String nome;
	private Double saldo;

	public CadastroCliente() {
	}

	public CadastroCliente(Integer numero, Integer numeroAgencia, String nome, Double saldo) {
		super();
		this.numeroConta = numero;
		this.agencia = numeroAgencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numeroConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Oi " + nome + ", obrigado por escolher nosso banco, sua agencia é " + agencia + ", conta "
				+ numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " está disponível para saque. ";
	}
}
