/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class Resep {
    private String idResep;
    private String tanggalResep;
    private Obat[] obat;

    public Resep() {
    }

    public Resep(String idResep, String tanggalResep, Obat[] obat) {
        this.idResep = idResep;
        this.tanggalResep = tanggalResep;
        this.obat = obat;
    }


    /**
     * @return the idResep
     */
    public String getIdResep() {
        return idResep;
    }

    /**
     * @param idResep the idResep to set
     */
    public void setIdResep(String idResep) {
        this.idResep = idResep;
    }

    /**
     * @return the tanggalResep
     */
    public String getTanggalResep() {
        return tanggalResep;
    }

    /**
     * @param tanggalResep the tanggalResep to set
     */
    public void setTanggalResep(String tanggalResep) {
        this.tanggalResep = tanggalResep;
    }

    /**
     * @return the obat
     */
    public Obat[] getObat() {
        return obat;
    }

    /**
     * @param obat the obat to set
     */
    public void setObat(Obat[] obat) {
        this.obat = obat;
    }
    
}
