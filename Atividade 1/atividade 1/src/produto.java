public class produto {
    String nome;
    Double preço;

    void informarNome(String NomeProduto){
        nome = NomeProduto;
        System.out.println("O nome do produto é " + nome );
    }
    void informarPreço(Double PreçoProduto){
        preço = PreçoProduto;
        System.out.println("O preço do produto é " + preço + " está muito caro!" );
    }
    void fazerPromoçao(Double Promoção){

        preço = Promoção;
        Promoção = preço - 1.00;
                System.out.println("O preço era:R$" + preço + " pra vc que é meu amigo eu deixo:R$ " + Promoção);
    }
    void PreçoPromoção (Double NovoPreço){
        NovoPreço = preço - 1.00;
        System.out.println("O preço da promoção é:"+ NovoPreço);
    }
}

