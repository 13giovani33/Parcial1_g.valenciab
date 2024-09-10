package logica;

public abstract class Pieza {
	protected int fila;
	protected int columna;
	
	public int getfila() {
		return fila;
	}

	public void setfila(int fila) {
		this.fila = fila;
	}

	public int getcolumna() {
		return columna;
	}

	public void setcolumna(int columna) {
		this.columna = columna;
	}
	
	public Figura(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	publ
	
	public abstract int calcCasillas();
	
}
