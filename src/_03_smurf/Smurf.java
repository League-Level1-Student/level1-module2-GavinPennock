package _03_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;
	private String hatColor;
	private String GirlOrBoy;

	Smurf(String name, String hatColor, String GirlOrBoy) {
		this.name = name;
		this.hatColor= hatColor;
		this.GirlOrBoy=GirlOrBoy;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name.equals("papa")) {
		return "i am wearing a "+hatColor+" hat";
		}else {
			return "i am wearing a white hat";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name.equals("smurfette")) {
		return "i am a "+GirlOrBoy;
		}else {
			return"i am a boy";
		}
	}

}


