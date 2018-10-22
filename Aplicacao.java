
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(processar(null));
		System.out.println(processar("Mateus"));
				
	}
	
	/**
	 * Metodo para Pegar uma palavra e Inverter os 3 primeiros caracteres
	 * Se for null deve retornar "null"
	 * @param s
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String processar(String s) {
		if (s == null) {
			return null;
		}
		
		s = s.toUpperCase();
		
		if (s.length() <= 3) {
			return s;
		}
		
		String s2 = s.substring(0, 3);
		
		StringBuffer sb = new StringBuffer(s2);
		
		sb.reverse();
		
		return sb.toString() + s.substring(3);
	}

}
