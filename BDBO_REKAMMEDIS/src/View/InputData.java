/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControlData;
import Data.Dokter;
import Data.Obat;
import Data.Pasien;
import Data.Pegawai;
import Data.RekamMedis;
import Data.Resep;
import com.db4o.ObjectSet;

/**
 *
 * @author a9uszT
 */
public class InputData {

    public static void main(String[] args) {
        Pegawai peg = new Pegawai("P001", "agus", "agus");
        Dokter dok = new Dokter("D001", "joni", "jonijoni");
        Obat obt[] = {new Obat("O001", "amoxilin", "3 x 1", "generik")};
        Resep rsp = new Resep("R001", "2-5-2013", obt);
        Pasien pas = new Pasien("P001", "Ari", "Yogya", "2-2-1992", "L", "0891232222", "FST");
        RekamMedis rm = new RekamMedis("R001", "2-5-2013", "pusing", "pilek", "minum air putih banyak", peg, dok, rsp, pas);
        ControlData.input(rm);
        try {

            RekamMedis template = new RekamMedis();
            template.setIdRekamMedis("R001");
            ObjectSet res = ControlData.db.get(template);
            ControlData.listResult(res);

        } finally {
            ControlData.db.close();
        }

    }
}
