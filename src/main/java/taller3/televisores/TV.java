package taller3.televisores;


public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	public static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal =1;
		precio=500;
		volumen=1;
		numTV++;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getnumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
	
	public boolean getEstado() {
        return estado;
    }
	
	public void turnOn() {
		this.estado=true;
		
	}
	public void turnOff() {
		 this.estado=false;
		
	}
	public void canalUp() {
		if (estado == true && (canal>=1 && canal<=120)){
			if(canal>=1 && canal<=120) {
				this.canal++;
			}
		}
	}
	
		
	public void  canalDown() {
		if (estado == true && (canal>=1 && canal<=120)){
				this.canal--;
			}
		}
	
	public void volumenUp() {
		if (estado == true && (volumen>=1 && volumen<=7)){
				this.volumen++;
			}
		}
		
	public void  volumenDown() {
		if (estado == true && (volumen>=1 && volumen<=7)){
				this.volumen--;
			}
		}
	public void enlazar(Control control){
        this.control = control.tv.control;
    }
}

