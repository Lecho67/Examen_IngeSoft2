public class FiltroAltoContraste implements EstrategiaProcesamientoImagen{

    @Override
    public void aplicarFiltro(String imagen) {
        System.out.println("Aplicando filtro de alto contraste a la imagen: " + imagen);
    }

}
