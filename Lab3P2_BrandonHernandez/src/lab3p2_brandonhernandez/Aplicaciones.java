
package lab3p2_brandonhernandez;

public class Aplicaciones {
    
    protected String nombre;
    protected String desarrollador;
    protected double precio;
    protected String estado;
    protected int rating;    
    protected int descargas;

    public Aplicaciones() {
    }

    public Aplicaciones(String nombre, String desarrollador, double precio) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.precio = precio;
        this.estado = "No Descargada";
        this.rating = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nDesarrollador: " + desarrollador + "\nPrecio: " + precio + "\nEstado: " + estado + "\nRating: " + rating + "\nDescargas: " + descargas + "\n";
    }
    
    
    
}
