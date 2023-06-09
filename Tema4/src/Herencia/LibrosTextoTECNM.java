package Herencia;

public class LibrosTextoTECNM extends LibrosDeTexto{
    private String campus;
    private Fecha fecha;

    public LibrosTextoTECNM() {
        super();
    }

    public LibrosTextoTECNM(String titulo, Autor autor, String editorial, 
            double precio, String asignatura,String campus, Fecha fecha) {
        super(titulo, autor, editorial, precio, asignatura);
        this.campus = campus;
        this.fecha = fecha;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLibrosTextoTECNM: " + "\ncampus=" + campus 
                + "\nfecha=" + fecha ;
    }   
}
