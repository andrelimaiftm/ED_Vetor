public class Main {
    public static void main(String[] args) {
        
        try {
        	Vetor vetor = new Vetor(2);
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			 System.out.println(vetor);
		} catch (Exception e) {			
			e.printStackTrace();
		}
        
       
    }
}
