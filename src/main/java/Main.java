public class Main {


    public static void main(String[] args) {

        Cliente gabriel = new Cliente("Gabriel");
        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(gabriel);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
