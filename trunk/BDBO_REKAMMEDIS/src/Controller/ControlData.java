/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.Obat;
import Data.Pasien;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.db4o.query.Query;
import java.awt.RenderingHints.Key;
import java.io.File;
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
}
