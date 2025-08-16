//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Interruptor lampada = new Interruptor();

    lampada.pressionar(lampada.ligado);
    lampada.verificarLampada(lampada.ligado);
    lampada.pressionar(lampada.ligado);
    lampada.verificarLampada(lampada.ligado);

    }
}
