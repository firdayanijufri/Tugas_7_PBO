/* 	Nama 	: FIRDAYANI
	Nim 	: 13020180089
	waktu	: 20 april 2020
	tugas 7
*/

//nomor 3
//Program abstract class
public class Manusia extends MakhlukHidup {
    private String duaKaki;
    public Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri menggunakan :  "+duaKaki);
    }
}
