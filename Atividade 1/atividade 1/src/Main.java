//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        produto carne = new produto();
        carne.nome = "picanha";
        carne.preço = 99.99;
        carne.informarNome(carne.nome);
        carne.informarPreço(carne.preço);
        carne.fazerPromoçao(carne.preço);
        carne.PreçoPromoção(carne.preço);

    }
}