public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(100);
        System.out.println("Minha conta tem " + contaDoPaulo.saldo);
        System.out.println(contaDoPaulo.saldo);
                contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaJasmine = new Conta();
        contaDaJasmine.deposita(3000);

        contaDaJasmine.transfere(1500, contaDoPaulo);
        System.out.println(contaDaJasmine.saldo);
        System.out.println(contaDoPaulo.saldo );



    }
}
