package prendas;



import org.junit.Assert;
import org.junit.Test;

public class PruebasPrenda {

	
	

	
	@SuppressWarnings("deprecation")
	@Test
	public void testPrecioTotal(){
		Pantalon unPantalon =new Pantalon();
		Assert.assertEquals(390, unPantalon.precioFinal());
	}
	
}