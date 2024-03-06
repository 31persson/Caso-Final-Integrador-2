public class HabitatAcuatico extends Habitat {
    // Atributos específicos para hábitats acuáticos

    public HabitatAcuatico(String tipo) {
        super(tipo);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat acuático: " + tipo);
        // Implementa la lógica específica para hábitats acuáticos
    }
}
