import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_Date {
	
	public static void main(String[] args) {
		
		// Data atual
		Calendar cal = Calendar.getInstance(); // new Calendar();
		
		cal.add(Calendar.DAY_OF_MONTH, 3);
		cal.add(Calendar.MONTH, 4);
		
		Date date = cal.getTime();		
		
//		SimpleDateFormat simpleFormatador = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
//		String textoFormatado = simpleFormatador.format(date);
//		System.out.println(textoFormatado);
		

//		Locale[] locales = {Locale.FRANCE, Locale.ENGLISH, Locale.GERMANY, Locale.ITALIAN, new Locale("pt", "BR")};
//		
//		for (Locale locale : locales) {
//			
//			SimpleDateFormat formatador = new SimpleDateFormat("EEEE - MMMM", locale);
//			//DateFormat formatador = DateFormat.getDateInstance(DateFormat.MEDIUM, locale );
//			String resultado = formatador.format(date);
//			System.out.println(resultado); // dd/mm/aaaa
//			
//		}
		
		try {
			String stringData = "10/aa/2010";
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			Date data = formatador.parse(stringData);
			System.out.println(data);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		
	}
	
	

}
