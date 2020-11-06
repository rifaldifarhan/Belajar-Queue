/**
 *
 * @author Rifaldi
 */
public class Queue {
    public static void main(String[] args) {
    }
        private int first;
        private int last;
        private NilaiMatkul[] data = new NilaiMatkul [10];
        Queue(){        
            for(int i=0;i<data.length; i++){
                data [i] = new NilaiMatkul();
            }
            
        }
        void setFirst(int first){
        this.first = first;
        
        }
        int getFirst(){
            return first;
            
        }
        void setLast(int last){
            this.last = last;
            
        }
        int getLast(){
            return last;
            
        }
        void createEmpty(){
            first = -1;
            last = -1;
            
        }
        boolean isEmpty(){
            boolean hasil = false;
            if(first == -1){
                hasil = true;           
            }
            return hasil;
            
        }
        boolean isFull(){
            boolean hasil = false;
            if(last == data.length){
                hasil = true;
            }
            return hasil;
            
        }
        void add(String nim, String nama, double nilai){
            if(isEmpty()== true){ //jika queue masih kosong//
                last = 0;
                first = 0;
                data[0].setNim(nim);
                data[0].setNama(nama);
                data[0].setNilai(nilai);
            }
            else {
                //jika queue tidak kosong//
                if(isFull() != true){
                    last = last +1;
                    data[last].setNim(nim);
                    data[last].setNama(nama);
                    data[last].setNilai(nilai);
                }
                else {
                    System.out.println("------------Antrian Penuh------------");
                }
            }
        }
        void del(){
            if(last == 0){
                first = -1;
                last = -1;
            }
            else {
                //geser elemen antrian kedepan//
                int i;
                for (i=(first+1); i <= last; i++){
                    data[i-1].setNim(data[i].getNim());
                    data[i-1].setNama(data[i].getNama());
                    data[i-1].setNilai(data[i].getNilai());
                }
                last = last -1;
            }
        }
        void printQueue(){
            if(first != -1){
                System.out.println("----------------Isi Queue----------------");
                int i;
                for(i= last; i>=first; i--){
                    System.out.println("=====================================");
                    System.out.println("elemen ke :"+i);
                    System.out.println("nim     : " + data[i].getNim());
                    System.out.println("nama    : " + data[i].getNama());
                    System.out.println("nilai   : " + data[i].getNilai());
                }
                System.out.println("-----------------------------------------");
            }
            else {
                //proses jika queue kosong//
                System.out.println("Queue Kosong");
            }
                        
    }
}
