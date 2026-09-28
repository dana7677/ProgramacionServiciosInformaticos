package EjerciciosHilos;

public class Ej2 implements Runnable {
	
	private int n;
	private String nombre;
	
	public Ej2(String nombre) 
	{
		n=0;
		this.nombre=nombre;
	}
	public void run() 
	{
		for(int i=0; i<100;i++) 
		{
			n +=i;
			System.out.println(nombre+" "+n);
		}
	}
	

	public static void main(String[] args)
	{
		Ej2 e1 = new Ej2("Hilo1");
		Ej2 e2 = new Ej2("Hilo2");
		
		Thread h1 = new Thread(e1);
		Thread h2 = new Thread(e2);
		
		h1.start();
		// TODO Auto-generated method stub

	}

}
