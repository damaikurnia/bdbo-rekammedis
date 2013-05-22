/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class Obat {
    private String idObat;
    private String namaObat;
    private String komposisi;
    private String tipe;

    public Obat() {
    }

    public Obat(String idObat, String namaObat, String komposisi, String tipe) {
        this.idObat = idObat;
        this.namaObat = namaObat;
        this.komposisi = komposisi;
        this.tipe = tipe;
    }
    

    /**
     * @return the idObat
     */
    public String getIdObat() {
        return idObat;
    }

    /**
     * @param idObat the idObat to set
     */
    public void setIdObat(String idObat) {
        this.idObat = idObat;
    }

    /**
     * @return the namaObat
     */
    public String getNamaObat() {
        return namaObat;
    }

    /**
     * @param namaObat the namaObat to set
     */
    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    /**
     * @return the komposisi
     */
    public String getKomposisi() {
        return komposisi;
    }

    /**
     * @param komposisi the komposisi to set
     */
    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }

    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
}
