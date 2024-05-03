public class FiltroEscalaGrises implements EstrategiaProcesamientoImagen{
    @Override
    public void aplicarFiltro(String imagen) {
        System.out.println("Aplicando filtro en escala de grises a la imagen: " + imagen);
    }

}
