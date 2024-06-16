
public class ContaCorrente extends Conta {

	 public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void ImprimirExtrato() {
		 System.out.println("**** Extrato Conta Corrente ****");
		 super.imprimirInfoComuns();
		 System.out.println(String.format("            Cheque Especial: %.2f", this.chequeEspecial));
		 
		
		 
	 }
	 
	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
	
		} else if((this.saldo + this.chequeEspecial) >= valor) {
			
			this.saldo -= valor;
			this.chequeEspecial += saldo;
			this.saldo = 0.00;
			
			
			
		 } else { System.out.println("Valor solicitado para saque é superior ao valor em conta");
		  }
			
		  
		
	}

}
