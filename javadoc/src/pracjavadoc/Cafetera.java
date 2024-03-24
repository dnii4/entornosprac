package pracjavadoc;

public class Cafetera {
	
	
	    /**
	     * Atributos
	     */
	    private int capacidadMaxima;
	    private int cantidadActual;
	    
	/**
	 * En nuestro constructor hemos declarado que la capacidad
	 *  máxima tendremos 1000 y en la mínima 
	 * buscaremos el 0 ya que por defecto tiene que estar vacío
	 */
	    
	    public Cafetera() {
	        this.capacidadMaxima = 1000;
	        this.cantidadActual = 0;
	    }
	/**
	 * 
	 * @param capacidadMaxima
	 */
	    public Cafetera(int capacidadMaxima) {
	        this.capacidadMaxima = capacidadMaxima;
	        this.cantidadActual = capacidadMaxima;
	    }
	    
	 /**
	  *    
	  * @param capacidadMaxima
	  * @param cantidadActual
	  */
	    public Cafetera(int capacidadMaxima, int cantidadActual) {
	        this.capacidadMaxima = capacidadMaxima;
	        if (cantidadActual > capacidadMaxima) {
	            this.cantidadActual = capacidadMaxima;
	        } else {
	            this.cantidadActual = cantidadActual;
	        }
	    }
	 
	    /**
	     * int 
	     * @return
	     */
	    public int getCapacidadMaxima() {
	        return this.capacidadMaxima;
	    }
	    /**
	     * 
	     * @param capacidadMaxima
	     */
	    public void setCapacidadMaxima(int capacidadMaxima) {
	        this.capacidadMaxima = capacidadMaxima;
	    }
	    
	    /**
	     * 
	     * @return
	     */
	    public int getCantidadActual() {
	        return this.cantidadActual;
	    }
	    
	    /**
	     * 
	     * @param cantidadActual
	     */
	    public void setCantidadActual(int cantidadActual) {
	        this.cantidadActual = cantidadActual;
	    }
	    
	    /**
	     * @param cantidadActual
	     * @param capacidadMaxima
	     */
	    public void llenarCafetera() {
	        this.cantidadActual = this.capacidadMaxima;
	    }
	    
	    /**
	     * Método llamado servirTaza
	     * @param capacidadTaza
	     */
	    public void servirTaza(int capacidadTaza) {
	        if (this.cantidadActual >= capacidadTaza) {
	            this.cantidadActual -= capacidadTaza;
	        } else {
	            this.cantidadActual = 0;
	        }
	    }
	    
	    /**
	     * Se crea otro metodo llamado vaciarCafetera 
	     * tipo void diciendo que la cantidad se iguale a 0
	     */
	    public void vaciarCafetera() {
	        this.cantidadActual = 0;
	    }
	    
	    /**
	     * Basicamente estamos creando otro metodo
	     *  llamado agregarCafe para agregar mas cafe a la cantidada actual
	     * @param cantidad
	     */
	    public void agregarCafe(int cantidad) {
	        if ((this.cantidadActual + cantidad) > this.capacidadMaxima) {
	            this.cantidadActual = this.capacidadMaxima;
	        } else {
	            this.cantidadActual += cantidad;
	        }
	    }
	    
	    /**
	     * Metodo llamado print para que se imprima 
	     * por la consola el estado actual de capacidad de nuestra cafetera
	     */
	    public void print() {
	        System.out.println("La capacidad de la cafetera es: " + this.capacidadMaxima + 
	                " y la cantidad actual de cafe es: " + this.cantidadActual);
	    }
	    
	}


