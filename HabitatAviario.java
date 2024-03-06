public class HabitatAviario extends Habitat {
    public HabitatAviario(String tipo) {
        super(tipo);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat aviario: " + tipo);
    }
}
