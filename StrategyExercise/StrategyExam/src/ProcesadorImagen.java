public class ProcesadorImagen {
    private EstrategiaProcesamientoImagen estrategia;

    public void setEstrategia(EstrategiaProcesamientoImagen estrategia) {
        this.estrategia = estrategia;
    }

    public void aplicarFiltro(String imagen) {
        estrategia.aplicarFiltro(imagen);
}

}
