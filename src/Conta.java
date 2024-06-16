
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 160472;
	private static int SEQUENCIAL = 25000;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	protected double chequeEspecial = 100.00;
	
	
	

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
		
	}

	
	
	
	@Override
	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
	
		} else { System.out.println("Valor solicitado para saque é superior ao valor em conta");
		  }
		
	}


	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
		
		
	}


	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
	
		} else { System.out.println("Valor solicitado para Transferencia é superior ao valor em conta");
		  }
		
		
	}
	
	
	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfoComuns() {
		System.out.println(String.format("            Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("            Agencia: %d", this.agencia));
		System.out.println(String.format("            Numero Conta: %d", this.numeroConta));
		System.out.println(String.format("            Saldo: %.2f", this.saldo));
		
	}
	

	
	
}
