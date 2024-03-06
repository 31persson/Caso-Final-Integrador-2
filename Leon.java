public class Leon extends Animal {
    public Leon(String nombre, int edad, Habitat habitat) {
        super(nombre, edad, habitat);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al león " + nombre);
        // Implementa la lógica específica de alimentación para leones
    }

    @Override
    public void verificarSalud() {
        System.out.println("Verificando la salud del león " + nombre);
        // Implementa la lógica específica de verificación de salud para leones
    }
}
