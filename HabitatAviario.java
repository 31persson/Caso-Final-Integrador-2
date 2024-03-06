public class HabitatAviario extends Habitat {
    // Puedes agregar atributos específicos para hábitats aviarios

    public HabitatAviario(String tipo) {
        super(tipo);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat aviario: " + tipo);
        // Implementa la lógica específica para hábitats aviarios
    }
}
