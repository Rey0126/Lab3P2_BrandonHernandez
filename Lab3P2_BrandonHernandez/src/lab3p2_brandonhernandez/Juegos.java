
package lab3p2_brandonhernandez;

public class Juegos extends Aplicaciones{
    
    private int edadRecom;

    public Juegos() {
    }

    public Juegos(int edadRecom, String nombre, String desarrollador, double precio) {
        super(nombre, desarrollador, precio);
        this.edadRecom = edadRecom;
    }

    public int getEdadRecom() {
        return edadRecom;
    }

    public void setEdadRecom(int edadRecom) {
        this.edadRecom = edadRecom;
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
        return super.toString()+ edadRecom;
    }
    
    
    
}
