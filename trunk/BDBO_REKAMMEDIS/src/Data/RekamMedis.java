/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class RekamMedis {

    private String idRekamMedis;
    private String Tanggal_RM;
    private String Anamnesa;
    private String Diagnose;
    private String Therapy;
    private Pegawai petugas;
    private Dokter dokter;
    private Resep resep;
    private Pasien pasien;

    public RekamMedis() {
    }

    public RekamMedis(String idRekamMedis, String Tanggal_RM, String Anamnesa, String Diagnose, String Therapy, Pegawai petugas, Dokter dokter, Resep resep, Pasien pasien) {
        this.idRekamMedis = idRekamMedis;
        this.Tanggal_RM = Tanggal_RM;
        this.Anamnesa = Anamnesa;
        this.Diagnose = Diagnose;
        this.Therapy = Therapy;
        this.petugas = petugas;
        this.dokter = dokter;
        this.resep = resep;
        this.pasien = pasien;
    }

    /**
     * @return the idRekamMedis
     */
    public String getIdRekamMedis() {
        return idRekamMedis;
    }

    /**
     * @param idRekamMedis the idRekamMedis to set
     */
    public void setIdRekamMedis(String idRekamMedis) {
        this.idRekamMedis = idRekamMedis;
    }

    /**
     * @return the Tanggal_RM
     */
    public String getTanggal_RM() {
        return Tanggal_RM;
    }

    /**
     * @param Tanggal_RM the Tanggal_RM to set
     */
    public void setTanggal_RM(String Tanggal_RM) {
        this.Tanggal_RM = Tanggal_RM;
    }

    /**
     * @return the Anamnesa
     */
    public String getAnamnesa() {
        return Anamnesa;
    }

    /**
     * @param Anamnesa the Anamnesa to set
     */
    public void setAnamnesa(String Anamnesa) {
        this.Anamnesa = Anamnesa;
    }

    /**
     * @return the Diagnose
     */
    public String getDiagnose() {
        return Diagnose;
    }

    /**
     * @param Diagnose the Diagnose to set
     */
    public void setDiagnose(String Diagnose) {
        this.Diagnose = Diagnose;
    }

    /**
     * @return the Therapy
     */
    public String getTherapy() {
        return Therapy;
    }

    /**
     * @param Therapy the Therapy to set
     */
    public void setTherapy(String Therapy) {
        this.Therapy = Therapy;
    }

    /**
     * @return the petugas
     */
    public Pegawai getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Pegawai petugas) {
        this.petugas = petugas;
    }

    /**
     * @return the dokter
     */
    public Dokter getDokter() {
        return dokter;
    }

    /**
     * @param dokter the dokter to set
     */
    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    /**
     * @return the resep
     */
    public Resep getResep() {
        return resep;
    }

    /**
     * @param resep the resep to set
     */
    public void setResep(Resep resep) {
        this.resep = resep;
    }

    /**
     * @return the pasien
     */
    public Pasien getPasien() {
        return pasien;
    }

    /**
     * @param pasien the pasien to set
     */
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    @Override
    public String toString() {
        return " [ " + getIdRekamMedis() + " ; " + getTanggal_RM() + " ; " + getAnamnesa() + " ; " + getDiagnose() +
                 " ; " + getTherapy() + " ; " + getPasien().getNama() + " ; " + getDokter().getNamaDokter() + " ; " +
                 " ] ";
    }
}
