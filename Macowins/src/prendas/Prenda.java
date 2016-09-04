package prendas;

public class Prenda {
	
lel probando
	private boolean esImportado = true;
	public double precioBase;
	static double ValorFijoDelNegocio = 50;
	
	

	
	
	
	private double tasaDeImportacion(){
		if (esImportado) {
			return 1.3; } else {
				return 1;
		}
	}

	public double precioFinal(){
		return ((ValorFijoDelNegocio + precioBase) * this.tasaDeImportacion());
	}
}
