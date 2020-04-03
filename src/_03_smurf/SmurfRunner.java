package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("handy","white","boy");
		String name=smurf.getName();
		System.out.println(name);
		smurf.eat();
		Smurf papasmurf = new Smurf("papa","red","boy");
		String name2=papasmurf.getName();
		System.out.println(name2);
		String hatColor=papasmurf.getHatColor();
		System.out.println(hatColor);
		String boy=papasmurf.isGirlOrBoy();
		System.out.println(boy);
		Smurf smurfette = new Smurf("smurfette","white","girl");
		String name3=smurfette.getName();
		System.out.println(name3);
		String hat2=smurfette.getHatColor();
		System.out.println(hat2);
		String girl=smurfette.isGirlOrBoy();
		System.out.println(girl);
	}
}
