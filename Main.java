public class Main {
    public static void main(String[] args) {
        // Instancia de hábitats
        HabitatAcuatico acuario = new HabitatAcuatico("Acuario");
        HabitatTerrestre selva = new HabitatTerrestre("Selva");
        HabitatAviario aviario = new HabitatAviario("Aviario");

        // Instancia de animales
        Leon leon = new Leon("Simba", 5, selva);  // Ahora no se asume un hábitat específico
        // Puedes instanciar más animales aquí

        // Instancia de guía virtual y quiosco interactivo
        GuiaVirtual guia = new GuiaVirtual();
        QuioscoInteractivo quiosco = new QuioscoInteractivo();

        // Instancia de recursos
        Recurso comida = new RecursoAlimento("Carne", 100, "ProveedorA");
        // Puedes instanciar más recursos aquí

        // Instancia de mantenimiento y sistema de seguridad
        Mantenimiento mantenimiento = new Mantenimiento();
        SistemaSeguridad seguridad = new SistemaSeguridad();

        // Pruebas
        acuario.monitorear();
        leon.alimentar();
        guia.proporcionarTour(new Visitante("Juan"));
        quiosco.mostrarInformacion(leon);
        comida.reabastecer(50);
        mantenimiento.programarMantenimiento(acuario);
        seguridad.monitorearAccesos();
    }
}
