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
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a9uszT
 */
public class ControlData {

    public static ObjectContainer db;

    public static void input(Object data) {
        db = Db4o.openFile("RekamMedisData.yap");
        db.set(data);

    }

    public static void listResult(ObjectSet res) {
        while (res.hasNext()) {
            System.out.println(res.next());
        }
    }
    public static Obat[] Result(ObjectSet res) {
        Obat obt[] = null;
        while (res.hasNext()) {
           obt=(Obat[])(res.next());
        }
        return  obt;
    }

    public static List<Pasien> ResultPasien(ObjectSet res) {
        List<Pasien> barang = new ArrayList<Pasien>();
        while (res.hasNext()) {
          
        }
        return  barang;
    }
}
