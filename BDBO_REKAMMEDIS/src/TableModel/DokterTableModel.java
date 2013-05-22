/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Data.Dokter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author basisb16
 */
public class DokterTableModel extends AbstractTableModel {

    private List<Dokter> barang = new ArrayList<Dokter>();

    public DokterTableModel(List<Dokter> barang) {
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
        Dokter k = barang.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getIdDokter();
            case 1:
                return k.getNamaDokter();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Dokter";
            case 1:
                return "Nama Dokter";
            default:
                return "";
        }
    }
}
