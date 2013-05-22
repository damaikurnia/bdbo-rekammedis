/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControlData;
import Data.Obat;
import Data.Resep;
import com.db4o.ObjectSet;

/**
 *
 * @author a9uszT
 */
public class InputDataResep {

    public static void main(String[] args) {
        try {
            Obat template = new Obat();
            template.setIdObat("Obt001");
            ObjectSet res = ControlData.db.get(template);
            Obat[] obt = ControlData.Result(res);
            Resep dok = new Resep("R002", "2-2-2013", obt);
            ControlData.input(dok);
        } finally {
            ControlData.db.close();
        }

    }
}
