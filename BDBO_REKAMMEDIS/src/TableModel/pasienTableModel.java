/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;


import Data.Pasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author basisb16
 */
public class pasienTableModel extends AbstractTableModel {

    private List<Pasien> barang = new ArrayList<Pasien>();

    public pasienTableModel(List<Pasien> barang) {
        this.barang = barang;
    }

    @Override
    public int getRowCount() {
        return barang.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pasien k = barang.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getId();
            case 1:
                return k.getNama();
            case 2:
                return k.getAlamat();
            case 3:
                return k.getTanggallahir();
            case 4:
                return k.getJeniskelamin();
            case 5:
                return k.getNotelp();
            case 6:
                return k.getFakultas();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID pasien";
            case 1:
                return "Nama Pasien";
            case 2:
                return "Alamat Psien";
            case 3:
                return "Tanggal Lahir";
            case 4:
                return "Jenis Kelamin";
            case 5:
                return "no telp";
            case 6:
                return "Fakultas";
            default:
                return "";
        }
    }
}
