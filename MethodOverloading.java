public class MethodOverloading{   //membuat kelas
		public static void main (String [] args ) { // Program utama

		MethodOverloading method = new MethodOverloading (); //method nama objek ,new Method membuat objek
		method.methodTampilkan ("Belajar Java Yuks 1");       // refresentasi dari parameter method tampilkan dengan 1 parameter             
		method.methodTampilkan ("Belajar Java Yuks ","hingga Mengerti"); // refresentasi dari parameter method tampilkan dengan 2 parameter
		

		}
private void methodTampilkan (String nama){    //membuat method prosedur dengan 1 parameter
		System.out.println (nama);   

		}
private void methodTampilkan( String nama1, String nama2){    // membuat method prosedur dengan 2 parameter
	   System.out.println (nama1+ nama2);
}
}