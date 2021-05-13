package example1;

public abstract class GameCalculator {
	//abstract sýnýfta illa bir abstract metot olmak zorunda deðil.
	//abstract sýnýflarý new'lediðimiz zaman abstract metotlarýný override etmemiz lazým.
	//bu sýnýfý inherit eden sýnýflar calculate metodunu override etmek zorunda.
	public abstract void calculate() ;
	
	public void gameOver() {
		System.out.println("Oyun biti");
	}
}
