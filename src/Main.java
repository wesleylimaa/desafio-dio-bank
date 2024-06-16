
public class Main {

	public static void main(String[] args) {
		
			Cliente wesley = new Cliente("Wesley");
			Cliente lima = new Cliente("lima");
			Cliente araujo = new Cliente("araujo");
			
			
			Conta cc = new ContaCorrente(wesley);
			Conta ccLima = new ContaCorrente(lima);
			Conta ccAraujo = new ContaCorrente(araujo);
			Conta poupanca = new ContaPoupanca(wesley);
			
			cc.depositar(1000);
			
			cc.sacar(1100);
			
		
			
			cc.ImprimirExtrato();
			ccLima.ImprimirExtrato();
			ccAraujo.ImprimirExtrato();
			
			
			

	}

}
