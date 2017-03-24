public class Methodpar{
		public static void main (String [] args ) { // Program utama

		Methodpar method = new Methodpar (); //method nama objek ,new Method membuat objek
		method.methodTampilkan2 ("Belajar Java Yuks 1");       // memanggil prosedur              
		System.out.println (method.tambahNilai(3, 5)); //mereturn  atau mengembalikan nilai

		}
private void methodTampilkan2 (String nama){    //membuat prosedur
		System.out.println (nama);   

		}
private int tambahNilai( int x, int y){    // membuat fungsi
	return x + y;
}
}