/**
 *
 * @author Rifaldi
 */
public class NilaiMatkul {
    public static void main(String[] args) {        
    }
    private String nim;
    private String nama;
    private double nilai;
    
    NilaiMatkul(){
    }
    void setNim(String nim){
        this.nim = nim;
    }
    String getNim(){
       return nim;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
       return nama;
    }
    void setNilai(double nilai){
        this.nilai = nilai;
    }
        double getNilai(){
            return nilai;   
    }
}
