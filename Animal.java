public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected int salud;
    protected Habitat habitat;

    public Animal(String nombre, int edad, Habitat habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = 100;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void alimentar();
    public abstract void verificarSalud();

    public void cambiarHabitat(Habitat nuevoHabitat) {
        this.habitat = nuevoHabitat;
        System.out.println(nombre + " se ha movido al hábitat " + nuevoHabitat.getTipo());
    }
}
