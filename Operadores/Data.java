package Class5;

public class Data {
	
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Data(Integer dia, Integer mes,Integer ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String Imprime() {
		
		return dia +"/" +mes +"/" +ano;
	}
	
	public Integer QntDias(Integer mes) {
		
		Integer qnt[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Integer total = 0;
		
		for( int i = 0; i < mes; i++) {
			
			total = total + qnt[i];
		}
		
		return total;
					
	}
	
	public Integer StringQntDias (String mes) {
		
		mes = mes.toLowerCase();
		
		Integer num = 0;
		
		switch(mes){
			
			case "janeiro":
				num = 1;
			break;
			
			case "fevereiro":
				num = 2;
			break;
			
			case "março":
				num = 3;
			break;
			
			case "abril":
				num = 4;
			break;
			
			case "maio":
				num = 5;
			break;
			
			case "junho":
				num = 6;
			break;
			
			case "julho":
				num = 7;
			break;
			
			case "agosto":
				num = 8;
			break;
			
			case "setembro":
				num = 9;
			break;
			
			case "outubro":
				num = 10;
			break;
			
			case "novembro":
				num = 11;
			break;
			
			case "dezembro":
				num = 12;
			break;
			
			default:
			System.out.println("Esse mês não existe!");
			break;
		}
		
		Integer qnt[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Integer total = 0;
		
		for( int i = 0; i < num; i++) {
			
			total = total + qnt[i];
		}
		return total;
		
	}
		
}

