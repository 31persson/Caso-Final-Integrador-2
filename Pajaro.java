public class Pajaro extends Animal {
    public Pajaro(String nombre, int edad, Habitat habitat) {
        super(nombre, edad, habitat);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al pájaro " + getNombre());
        // Implementa la lógica específica de alimentación para pájaros
    }

    @Override
    public void verificarSalud() {
        System.out.println("Verificando la salud del pájaro " + getNombre());
        // Implementa la lógica específica de verificación de salud para pájaros
    }
}
