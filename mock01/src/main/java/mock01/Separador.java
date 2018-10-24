package mock01;

import java.util.ArrayList;
import java.util.List;

public class Separador {
	
	private Inversor aInversor;
	
	public Separador( Inversor pInversor ) {
		this.aInversor = pInversor;
	}
	
	public void setInversor(Inversor pInversor) {
		this.aInversor = pInversor;
	}
	
	public List<String> separarPorEspacos( String pString ) {
		List<String> resultado = new ArrayList<String>();
		
		String invertida = this.aInversor.inverter(pString);
		
		return resultado;
	}
	
}