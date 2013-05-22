/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class Pegawai {

    private String idPegawai;
    private String namaPegawai;
    private String passwordPegawai;

    public Pegawai() {
    }

    public Pegawai(String idPegawai, String namaPegawai, String passwordPegawai) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.passwordPegawai = passwordPegawai;
    }

    /**
     * @return the idPegawai
     */
    public String getIdPegawai() {
        return idPegawai;
    }

    /**
     * @param idPegawai the idPegawai to set
     */
    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    /**
     * @return the namaPegawai
     */
    public String getNamaPegawai() {
        return namaPegawai;
    }

    /**
     * @param namaPegawai the namaPegawai to set
     */
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    /**
     * @return the passwordPegawai
     */
    public String getPasswordPegawai() {
        return passwordPegawai;
    }

    /**
     * @param passwordPegawai the passwordPegawai to set
     */
    public void setPasswordPegawai(String passwordPegawai) {
        this.passwordPegawai = passwordPegawai;
    }

    @Override
    public String toString() {
        return getIdPegawai() + " " + getNamaPegawai();
    }
}
