public class Equipamento {

    boolean ligado = false;

    public boolean liga() {
        return ligado = true;
    }

    public boolean desligado() {
        return ligado = false;
    }

    public boolean inverte() {
        if (ligado == true) {
            return ligado = false;
        } 
        else {
            return ligado = true;
        }
    }

    public boolean estaLigado() {
        return ligado;
    }

}