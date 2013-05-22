/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.ControlData;
import Data.Pegawai;

/**
 *
 * @author a9uszT
 */
public class InputDataPegawai {
    public static void main(String[] args) {
         Pegawai peg = new Pegawai("P002", "dodo", "dodol");
        ControlData.input(peg);
        try {

        } finally {
            ControlData.db.close();
        }
    }
}
