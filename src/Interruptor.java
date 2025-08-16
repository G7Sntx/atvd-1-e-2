public class Interruptor {

    boolean ligado = false;

    void pressionar(boolean inverterValor){
        if (ligado == false){
            ligado = true;
        }
        else {
            ligado = false;
        }
    }
    void verificarLampada(boolean verifica){
        if (ligado == true){
            System.out.println("A lâmpada está acessa");
        } else {
            System.out.println("A lâmpada está apagada");
        }
    }

}

