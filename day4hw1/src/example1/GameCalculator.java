package example1;

public abstract class GameCalculator {
	//abstract s�n�fta illa bir abstract metot olmak zorunda de�il.
	//abstract s�n�flar� new'ledi�imiz zaman abstract metotlar�n� override etmemiz laz�m.
	//bu s�n�f� inherit eden s�n�flar calculate metodunu override etmek zorunda.
	public abstract void calculate() ;
	
	public void gameOver() {
		System.out.println("Oyun biti");
	}
}
