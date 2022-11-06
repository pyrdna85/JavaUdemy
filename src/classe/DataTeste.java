package classe;


public class DataTeste {	
	public static void main(String[] args) {	
		
		Data data1 = new Data();			
		data1.ano = 2021;			
		
		var d2 = new Data(31,12,2020);
		System.out.println(d2.dataFormatada());		
		
		
	}

}
