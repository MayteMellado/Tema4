package Abstractas;

public abstract class Figura {
    private String nomfig;
    private String color;

    public Figura(String nom, String col) {
        nomfig = nom;
        color = col;
    }

    public String getNomfig() {
        return nomfig;
    }

    public void setNomfig(String nomfig) {
        this.nomfig = nomfig;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double area();

    @Override
    public String toString() {
        return "Figura{" + "nomfig=" + nomfig + ", color=" + color + '}';
    }
    
}

