
public class ContaPoupanca extends Conta {
	 
	 public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void ImprimirExtrato() {
		 System.out.println("**** Extrato Conta Poupança ****");
		 super.imprimirInfoComuns();
		
		 
	 }



	
}
