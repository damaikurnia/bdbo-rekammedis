/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.ControlData;
import Data.Obat;

/**
 *
 * @author a9uszT
 */
public class inputDataObat {
 public static void main(String[] args) {
         Obat obt = new Obat("Obt001", "Amoxilin", "3 x 1","generik");
        ControlData.input(obt);
        try {

        } finally {
            ControlData.db.close();
        }
    }
}
