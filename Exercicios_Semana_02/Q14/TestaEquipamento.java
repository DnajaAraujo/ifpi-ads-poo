public class TestaEquipamento {
    public static void main(String[] args) {
        
        Equipamento equip = new Equipamento();

        equip.ligado = true;

        System.out.println(equip.liga());
        System.out.println(equip.desligado());
        System.out.println(equip.inverte());
        System.out.println(equip.estaLigado());

    }
}