/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.Dokter;
import Data.Obat;
import Data.Pasien;
import Data.Pegawai;
import Data.RekamMedisData;
import TableModel.PetugasTableModel;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.db4o.query.Query;
import java.awt.RenderingHints.Key;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a9uszT
 */
public class ControlData {

    public static ObjectContainer db;
    private static final String DataBase = "RekamMedisData.yap";

    private static void resetDatabase() {
        new File(DataBase).delete();
    }

    public static void bukaDatabase() {
        db = Db4o.openFile(DataBase);
    }

    public static void input(Object data) {
        db = Db4o.openFile(DataBase);
        db.set(data);
        db.close();
    }

    public static boolean LoginPetugas(String id, String password) throws SQLException {
        boolean cek = false;
        bukaDatabase();
        Query query = db.query();
        query.constrain(Pegawai.class);
        query.descend("idPegawai").constrain(id); // search a name
        query.descend("passwordPegawai").constrain(password);
        ObjectSet res = query.execute();
        if (res.hasNext()) {
            cek = true;
        }
        return cek;
    }

    public static String NamaPetugas(final String id) throws SQLException {
        String cek = "";
         List<Pegawai> persons = db.query(new Predicate<Pegawai>()
      {
            @Override
        public boolean match(Pegawai person)
        {
            return person.getIdPegawai().equalsIgnoreCase(id);
        }
      });

      // Menampilkan hasil query
      for(Pegawai person : persons)
        cek=(person.getNamaPegawai());

        return cek;
    }
    public static String NamaDokter(final String id) throws SQLException {
        String cek = "";
         List<Dokter> persons = db.query(new Predicate<Dokter>()
      {
            @Override
        public boolean match(Dokter person)
        {
            return person.getIdDokter().equalsIgnoreCase(id);
        }
      });

      // Menampilkan hasil query
      for(Dokter person : persons)
        cek=(person.getNamaDokter());

        return cek;
    }

    public static boolean LoginDokter(String id, String password) throws SQLException {
        boolean cek = false;
        bukaDatabase();
        Query query = db.query();
        query.constrain(Dokter.class);
        query.descend("idDokter").constrain(id); // search a name
        query.descend("passwordDokter").constrain(password);
        ObjectSet res = query.execute();
        if (res.hasNext()) {
            cek = true;
        }
        return cek;
    }

    public static void listResult(ObjectSet res) {
        while (res.hasNext()) {
            System.out.println(res.next());
        }
    }

    public static Obat[] Result(ObjectSet res) {
        Obat obt[] = null;
        while (res.hasNext()) {
            obt = (Obat[]) (res.next());
        }
        return obt;
    }

    public static List<Pasien> ResultPasien() {
        List<Pasien> pas = new ArrayList<Pasien>();
        bukaDatabase();
        Query query = db.query();
        query.constrain(Pasien.class);
        ObjectSet res = query.execute();
        while (res.hasNext()) {
            pas.add((Pasien) res.next());
        }
        return pas;
    }

    public static List<Pasien> ResultPasienSelected(final String key) {
        List<Pasien> pas = new ArrayList<Pasien>();
        Query query = db.query();
        query.constrain(Pasien.class);
        query.descend("id").constrain(key).like();
        ObjectSet res = query.execute();
        while (res.hasNext()) {
            pas.add((Pasien) res.next());
        }
        return pas;
    }

    public static Pasien getSelectedPasien(final String key) {
        Pasien pas = null;
//        bukaDatabase();
        Query query = db.query();
        query.constrain(Pasien.class);
        query.descend("id").descend("nama").descend("fakultas").constrain(key).like();
        ObjectSet res = query.execute();
        while (res.hasNext()) {
            pas = new Pasien();
            pas.setId((String) res.get(1));
            pas.setNama((String) res.get(2));
            pas.setFakultas((String) res.get(7));

        }
        return pas;
    }

    public static List<RekamMedisData> getAllRMPasien(String id) throws SQLException {
        List<RekamMedisData> pas = new ArrayList<RekamMedisData>();
        bukaDatabase();
        Query query = db.query();
        query.constrain(Pasien.class);
        query.descend("id").constrain(id).like();
        ObjectSet res = query.execute();
        while (res.hasNext()) {
            RekamMedisData rm = new RekamMedisData();
            rm.setIdRekamMedis((String) res.get(1));
            rm.setTanggal_RM((String) res.get(2));
            rm.setAnamnesa((String) res.get(3));
            rm.setDiagnose((String) res.get(4));
            rm.setTherapy((String) res.get(5));
            Pegawai peg = new Pegawai();
            peg.setIdPegawai((String) res.get(6));
            rm.setPetugas(peg);
            Dokter dok = new Dokter();
            dok.setIdDokter((String) res.get(7));
            rm.setDokter(dok);
            pas.add(rm);
        }
        return pas;
    }

    public static List<Pasien> getAllPasien() throws SQLException {
        List<Pasien> pas = new ArrayList<Pasien>();
        bukaDatabase();
        Query query = db.query();
        query.constrain(Pasien.class);
        ObjectSet res = query.execute();
//        while (res.hasNext()) {
//            Pasien pasdt = new Pasien();
//            pasdt.setId((String) res.get(1));
//            pasdt.setNama((String) res.get(2));
//            pasdt.setAlamat((String) res.get(3));
//            pasdt.setTanggallahir((String) res.get(4));
//            pasdt.setJeniskelamin((String) res.get(5));
//            pasdt.setNotelp((String) res.get(6));
//            pasdt.setFakultas((String) res.get(7));
//            pas.add(pasdt);
//        }
        while (res.hasNext()) {
            pas.add((Pasien) res.next());
        }
        return pas;
    }

    public static List<Pasien> getAllPasienRMSkrng(String date) throws SQLException {
        List<Pasien> pas = new ArrayList<Pasien>();
        bukaDatabase();
        Query query = db.query();
        query.constrain(RekamMedisData.class);
        query.descend("tanggal").constrain(date).like();
        ObjectSet res = query.execute();
        while (res.hasNext()) {
            Pasien pasdt = new Pasien();
            pasdt.setId((String) res.get(1));
            pasdt.setNama((String) res.get(2));
            pasdt.setAlamat((String) res.get(3));
            pasdt.setTanggallahir((String) res.get(4));
            pasdt.setJeniskelamin((String) res.get(5));
            pasdt.setNotelp((String) res.get(6));
            pasdt.setFakultas((String) res.get(7));
            pas.add(pasdt);

        }
        return pas;
    }
}
