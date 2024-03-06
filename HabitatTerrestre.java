public class HabitatTerrestre extends Habitat {
    public HabitatTerrestre(String tipo) {
        super(tipo);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat terrestre: " + tipo);
    }
}
