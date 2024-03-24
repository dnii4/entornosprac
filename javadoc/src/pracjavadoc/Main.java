package pracjavadoc;


/**
 * Se crea otra clase Main y en ella, se crea otro objeto 
 * llamado c1 que haga las funciones y metodos de la clase cafetera 
 * mencionados y explicados en la misma 
 * y otro objeto llamado c2 que tiene como capacidad actual 2000 y de máxima 3000
 */
public class Main {
	    public static void main(String[] args) {
	        Cafetera c1 = new Cafetera();
	        c1.llenarCafetera();
	        c1.print();
	        c1.vaciarCafetera();
	        c1.print();
	        c1.servirTaza(250);
	        c1.print();
	        Cafetera c2 = new Cafetera(2000, 3000);
	        c2.print();
	    }
	}

