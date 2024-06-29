
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cond = 1;
        float limite = 0, valor = 0;
        String descridao = "";

        Scanner ler = new Scanner(System.in);



        ArrayList<Compra> carrinho = new ArrayList<>();

        System.out.println("Qual o limite do cartão?");
        limite = ler.nextFloat();
        ler.nextLine();


        do {

            Compra produto = new Compra();
            produto.setLimite(limite);

            System.out.println("Descrição do item: ");
            descridao = ler.nextLine();

            produto.setDescricao(descridao);

            System.out.println("Valor do item: ");
            valor = ler.nextFloat();
            produto.setValor(valor);
            ler.nextLine();


            if (valor <= produto.getLimite()) {
                produto.pagar();
                limite = produto.getLimite();
                carrinho.add(produto);
                System.out.println("COMPRA REALIZADA");

                for (Compra compra : carrinho) {
                   System.out.println(compra);
                }

            } else {
                System.out.println("CREDITO INSUFICIENTE");
            }

            System.out.println("Digite 0 para Sair ou 1 para Continuar comprando");
            cond = ler.nextInt();
            ler.nextLine();

        } while (cond == 1);
        //System.out.println("\nCarrinho final:");
       // for (Compra compra : carrinho) {
        //    System.out.println(compra);

        //}
    }
}

