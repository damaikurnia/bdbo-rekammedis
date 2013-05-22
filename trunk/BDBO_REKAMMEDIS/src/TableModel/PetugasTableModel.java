/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;


import Data.Pegawai;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author basisb16
 */
public class PetugasTableModel extends AbstractTableModel {

    private List<Pegawai> barang = new ArrayList<Pegawai>();

    public PetugasTableModel(List<Pegawai> barang) {
        this.barang = barang;
    }

    @Override
    public int getRowCount() {
        return barang.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pegawai k = barang.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getIdPegawai();
            case 1:
                return k.getNamaPegawai();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID petugas";
            case 1:
                return "Nama petugas";
            default:
                return "";
        }
    }
}
