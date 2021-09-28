import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Inserisci T-min: ");
		int min=s.nextInt();
		System.out.println("Inserisci T-Max: ");
		int max=s.nextInt();
		
		//TODO auto-generated mnethod stub
		System.out.print("Hello git!");
		
		Task j=new Task();
		Thread t=new Thread();
		t.start();
		
		//oggetti anonimi
		new Thread(new Task()).start();
	}
}
