/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class Dokter {

    private String idDokter;
    private String namaDokter;
    private String passwordDokter;

    public Dokter() {
    }

    public Dokter(String idDokter, String namaDokter, String passwordDokter) {
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.passwordDokter = passwordDokter;
    }

    /**
     * @return the idDokter
     */
    public String getIdDokter() {
        return idDokter;
    }

    /**
     * @param idDokter the idDokter to set
     */
    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    /**
     * @return the namaDokter
     */
    public String getNamaDokter() {
        return namaDokter;
    }

    /**
     * @param namaDokter the namaDokter to set
     */
    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    /**
     * @return the passwordDokter
     */
    public String getPasswordDokter() {
        return passwordDokter;
    }

    /**
     * @param passwordDokter the passwordDokter to set
     */
    public void setPasswordDokter(String passwordDokter) {
        this.passwordDokter = passwordDokter;
    }

    @Override
    public String toString() {
        return getIdDokter() + " " + getNamaDokter();
    }
}
