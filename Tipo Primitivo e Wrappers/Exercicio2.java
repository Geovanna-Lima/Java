
public class Exercicio2 {

	public static void main(String[] args) {

		Integer a = 1;
		
		Double b = 2.0;
		
		int c = 0;
		
		double d = 0;
		
		//intValue e doubleValue//
		
		c = a.intValue();
		
		d = b.doubleValue();
		
		System.out.println("Os valores nas váriaveis primitivas são:" +c +',' +d);
		
		//parseInt transferência de String para int//
		
		String e = "4"; 
		
		int f = Integer.parseInt(e);
		
		System.out.println("O parseInt é:" +f);
		
		//parseDouble transferencia de String para Double//
		
		String g = "5";
		
		Double h = Double.parseDouble(g);
		
		System.out.println("O parseDouble:" +h);
		
		//valueOf pega primitivo int ou uma string e retorna um objeto do tipo Integer//
		
		int i = 9;
		
		Integer j = Integer.valueOf(i);
		
		System.out.println("O valueOf é:" +j);

	}
	
}
