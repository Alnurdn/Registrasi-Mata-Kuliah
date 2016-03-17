/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author ANZYM
 */
public class MataKuliah {
    private String namaMK;
    private String jadwal;
    
    public MataKuliah (String namaMK, String jadwal) {
        this.namaMK = namaMK;
        this.jadwal = jadwal;
    }
    
    public void setJadwal (String jadwal) {
        this.jadwal = jadwal;
    }
    
    public String getNamaMK () {
        return namaMK;
    }
    
    public String getJadwal() {
        return jadwal;
    }
}
