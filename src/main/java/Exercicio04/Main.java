package Exercicio04;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
	}

	public void start() {
		int i = 0;
		
		while(i < 20) {
			System.out.println("valor de i: "+i);
			i += 1;
		}
		
		System.out.println("==================");
		
		int k = 0;
		do {
			System.out.println("Valor de k: " + k);
			k+=1;
		}while(k<20);
		
		System.out.println("==================");
		
		for (int j = 0; j <20; j++) {
			System.out.println("Valor de j: "+j);
		}
	}
		
		
}
