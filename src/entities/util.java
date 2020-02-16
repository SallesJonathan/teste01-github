package entities;

public class util {

	private int num_conta;
	private double valor_inicial;
	private String nome_titular;
	
	
	public util(int num_conta, double valor_inicial, String nome_titular) {
		
		this.num_conta = num_conta;
		this.nome_titular = nome_titular;
		addMoney(valor_inicial);
	}

	public util(int num_conta, String nome_titular) {
		
		this.num_conta = num_conta;
		this.nome_titular = nome_titular;
	}

	public double getNum_conta() {
		return num_conta;
	}

		public double getValor_inicial() {
		return valor_inicial;
	}

	
	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	
	public void addMoney(double valor_inicial) {
		this.valor_inicial += valor_inicial;
	}
	
	public void removeMoney(double valor_inicial) {
		this.valor_inicial -= valor_inicial+5;
	}
	public String toString() {
		return nome_titular 
				+","
				+"com saldo de: $"
				+String.format("%.2f", valor_inicial)
				+","
				+"com numero da conta: "
				+num_conta;
	}
}
