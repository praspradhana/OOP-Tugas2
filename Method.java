public class Method{
		public static void main (String [] args ) { // Program utama

		Method method = new Method (); //method nama objek ,new Method membuat objek
		method.methodTampilkan ();       // memanggil fungsi               
		System.out.println (method.kembalikanNilai()); //mereturn  atau mengembalikan nilai

		}
private void methodTampilkan (){
		System.out.println ("Belajar Java Yuks 1");  //membuat prosedur

		}
private int kembalikanNilai(){    // membuat fungsi
	return 1;
}
}