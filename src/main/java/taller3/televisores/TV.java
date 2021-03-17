package taller3.televisores;


public class TV {
	private Marca marca;
	int canal;
	private int precio;
	boolean estado;
	int volumen;
	Control control;
	public static int numTV;
	
	public static void setNumTV(int numTV) {
        numTV = numTV;
    }
    public static int getNumTV() {
        return numTV;
    }
    public Marca getMarca(){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public void setCanal(int canal){
        if(canal >= 1 && canal <= 120){
            this.canal = canal;
        }
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public void canalUp(){
        if (canal < 120 && estado){
            canal ++;
        }
    }
    public void canalDown(){
        if (canal > 1 && estado){
            canal --;
        }
    }
    public void volumenUp(){
        if (volumen < 7 && estado){
            volumen ++;
        }
    }
    public void volumenDown(){
        if (volumen > 0 && estado){
            volumen --;
        }
    }
    public void enlazar(Control control){
        this.control = control.tv.control;
    }
}

