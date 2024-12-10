package daw;

/**
 *
 * @author christian
 */
public class Productos {
    
    private int idPro;
    private String nomPro;
    private double precioPro;
    private int stockPro;

    public Productos(int idPro, String nomPro, double precioPro, int stockPro) {
        this.idPro = idPro;
        this.nomPro = nomPro;
        this.precioPro = precioPro;
        this.stockPro = stockPro;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public double getPrecioPro() {
        return precioPro;
    }

    public void setPrecioPro(double precioPro) {
        this.precioPro = precioPro;
    }

    public int getStockPro() {
        return stockPro;
    }

    public void setStockPro(int stockPro) {
        this.stockPro = stockPro;
    }
    
        
    public String toString(){
        return "id del Producto: "+idPro+"; nombre del Producto: "+nomPro+"; precio: "+precioPro+" €";
    }
}
