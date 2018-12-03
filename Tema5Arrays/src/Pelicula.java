public class Pelicula {
    private final String titulo;
    private int valoracion;

    public Pelicula(String titulo, int valoracion) {
        this.titulo = titulo;
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }


    @Override
    public String toString(){
        return this.titulo+" - "+this.valoracion;
    }

}
