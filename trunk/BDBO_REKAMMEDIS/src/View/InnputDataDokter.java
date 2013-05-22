/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.ControlData;
import Data.Dokter;
import com.db4o.ObjectSet;

/**
 *
 * @author a9uszT
 */
public class InnputDataDokter {
public static void main(String[] args) {
        Dokter dok = new Dokter("D002", "kokox", "sssdf");
        ControlData.input(dok);
        try {

//            Dokter template = new Dokter();
//            template.setIdDokter("D001");
//            ObjectSet res = ControlData.db.get(template);
//            ControlData.listResult(res);

        } finally {
            ControlData.db.close();
        }

    }
}
