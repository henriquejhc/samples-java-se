package format;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Test_NumberFormat {

	public static void main(String[] args) {
		
		NumberFormat formatador = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
		
		formatador.setMaximumIntegerDigits(10);		
		formatador.setMaximumFractionDigits(2);
		formatador.setGroupingUsed(true);
		formatador.setRoundingMode(RoundingMode.DOWN);
		
		String resultado = formatador.format(1255533.128);
		
		System.out.println(resultado);
		
	}
	
}
