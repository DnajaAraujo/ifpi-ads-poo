package exercicios.poo05.q05;

public class Hora {

    private String hora;
    private String minuto;
    private String segundo;

    public Hora() {
    	
    }
    
    public Hora(String hora, String minuto, String segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora() {
        return hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public String getSegundo() {
        return segundo;
    }
    
    public void setHora(String hora) {
    	this.hora = hora;
    }
    
    public void setMinuto(String minuto) {
    	this.minuto = minuto;
    }
    
    public void setSegundo(String segundo) {
    	this.segundo = segundo;
    }

    public void mostraHorario() {
        String horario = getHora() + ":" + getMinuto() + ":" + getSegundo();
        System.out.println(horario);
    }

}