/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class Pasien {

    private String id;
    private String nama;
    private String alamat;
    private String tanggallahir;
    private String jeniskelamin;
    private String notelp;
    private String fakultas;

    public Pasien() {
    }

    public Pasien(String id, String nama, String alamat, String tanggallahir, String jeniskelamin, String notelp, String fakultas) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggallahir = tanggallahir;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.fakultas = fakultas;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   
    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /**
     * @return the tanggallahir
     */
    public String getTanggallahir() {
        return tanggallahir;
    }

    /**
     * @param tanggallahir the tanggallahir to set
     */
    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }
}
