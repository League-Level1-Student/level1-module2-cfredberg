package _03_smurf;

public class runner {
	public static void main(String[] args) {
		Smurf HandySmurf = new Smurf("Handy");
		System.out.println(HandySmurf.getName());
		HandySmurf.eat();
		
		Smurf papa = new Smurf("Papa");
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		
		Smurf et = new Smurf("Smurfette");
		System.out.println(et.getName());
		System.out.println(et.getHatColor());
		System.out.println(et.isGirlOrBoy());
	}
}
