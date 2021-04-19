package Class5;

public class Java {

	public static Integer max3(Integer m1, Integer m2, Integer m3) {
			
		if(m1 > m2 && m1 > m3)
					
				return m1;

		else {
				
			if(m2 > m1 && m2 > m3) {
					
				return m2;
			}
				
			else
					
				return m3;
		
		}
				
	}

	public static Double max3(Double m1, Double m2, Double m3){
			
		if(m1 > m2 && m1 > m3) 
					
				return m1;
				
		else {
				
			if(m2 > m3 && m2 > m1) {
					
				return m2;
			}
				
			else
					
				return m3;
			
		} 
		
	}
		
}
