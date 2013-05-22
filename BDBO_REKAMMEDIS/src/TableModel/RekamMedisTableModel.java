/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Data.RekamMedis;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a9uszT
 */
public class RekamMedisTableModel extends AbstractTableModel {

    private List<RekamMedis> RM = new ArrayList<RekamMedis>();

    public RekamMedisTableModel(List<RekamMedis> RMdt) {
        this.RM = RMdt;
    }

    @Override
    public int getRowCount() {
        return RM.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RekamMedis k = RM.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getIdRekamMedis();
            case 1:
                return k.getTanggal_RM();
            case 2:
                return k.getAnamnesa();
            case 3:
                return k.getDiagnose();
            case 4:
                return k.getTherapy();
            case 5:
                return k.getPetugas().getIdPegawai();
            case 6:
                return k.getDokter().getIdDokter();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Rekam Medis";
            case 1:
                return "Tanggal Rekam Medis";
            case 2:
                return "Anamnesa";
            case 3:
                return "Diagnosa";
            case 4:
                return "Therapi";
            case 5:
                return "Id petugas";
            case 6:
                return "id Dokter";
            default:
                return "";
        }
    }
}
