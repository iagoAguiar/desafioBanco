
public abstract class Conta implements IConta{
	
	protected int agencia;
	protected int numero;
	private double saldo;
	
	
	protected static int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	
	

	
	public Conta() {
		super();
	}

	public Conta(int agencia, int numero ) {
		super();
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	@Override
	public void transferir(Conta contadestino, double valor) {
		this.sacar(valor);
		contadestino.depositar(valor);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void imprimirExtrado(){
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println(String.format("Agencia %d", agencia));
	}
	

}
