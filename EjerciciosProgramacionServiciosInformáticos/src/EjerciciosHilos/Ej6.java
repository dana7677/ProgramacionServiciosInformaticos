package EjerciciosHilos;

public class Ej6 implements Runnable{
	
	private String nombre;
	private int inicio, fin;
	public int suma;
	
	public Ej6(String nombre, int inicio, int fin) 
	{
		this.nombre=nombre;
		this.inicio=inicio;
		this.fin=fin;
	}
	
	public void run() 
	{
		for(int i= inicio; i<=fin; i++) 
		{
			suma +=i;
		}
	}

	public static void main(String[] args) {
		
		
		Ej6 e1 = new Ej6("Hilo 1", 1, 50);
		Ej6 e2 = new Ej6("Hilo 2", 51, 100);
		
		Thread h1 = new Thread(e1);
		Thread h2 = new Thread(e2);
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			if(h2.isAlive()) h2.join(); {}
		}catch(InterruptedException e) 
		{
			System.err.println("Error"+e);
		}
		
		System.out.println("La suma de 1 a 100 es: "+ (e1.suma+e2.suma));
		// TODO Auto-generated method stub

	}

}
