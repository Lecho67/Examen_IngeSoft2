public class Main {
    public static void main(String[] args) {
        // Crear instancias de las estrategias
        EstrategiaProcesamientoImagen filtroAltoContraste = new FiltroAltoContraste();
        EstrategiaProcesamientoImagen filtroEscalaGrises = new FiltroEscalaGrises();
        EstrategiaProcesamientoImagen filtroSepia = new FiltroSepia();

        // Crear el contexto
        ProcesadorImagen procesador = new ProcesadorImagen();

        // Aplicar filtros
        procesador.setEstrategia(filtroAltoContraste);
        procesador.aplicarFiltro("imagen1.jpg");

        procesador.setEstrategia(filtroEscalaGrises);
        procesador.aplicarFiltro("imagen2.jpg");

        procesador.setEstrategia(filtroSepia);
        procesador.aplicarFiltro("imagen3.jpg");

    }
}