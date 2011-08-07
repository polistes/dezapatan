package proxyPaTan.polistes;

public class Client {
	public void giveMealsOriginal(MarimoTheEater eater) {
		eater.eatBeaf();
		eater.eatPork();
		eater.eatFish();
	}
	
	public static void main(String[] args) {
		long start;
		
		System.out.println("***** big eater only *****");
		start = System.currentTimeMillis();
		new Client().giveMealsOriginal(new MarimoTheBigEater());
		System.out.println("time : " + (System.currentTimeMillis() - start) + " ms");
		
		
		System.out.println("\n\n***** picky eater *****");
		start = System.currentTimeMillis();
		new Client().giveMealsOriginal(new MarimoThePickyEater());
		System.out.println("time : " + (System.currentTimeMillis() - start) + " ms");
	}
}
