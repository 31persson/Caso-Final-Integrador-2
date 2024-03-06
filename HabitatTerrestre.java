public class HabitatTerrestre extends Habitat {
    // Puedes agregar atributos específicos para hábitats terrestres

    public HabitatTerrestre(String tipo) {
        super(tipo);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat terrestre: " + tipo);
        // Implementa la lógica específica para hábitats terrestres
    }
}
