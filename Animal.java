public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected int salud;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void alimentar();
    public abstract void verificarSalud();
}
