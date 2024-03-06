public abstract class Habitat {
    protected String tipo;

    public Habitat(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void monitorear();
}
