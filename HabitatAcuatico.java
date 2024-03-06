public class HabitatAcuatico extends Habitat {
    public HabitatAcuatico(String tipo) {
        super(tipo);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat acuático: " + tipo);
    }
}
