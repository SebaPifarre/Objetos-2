package ejercicios.refact;

public class CharRing extends Ring<Character>{

	
	public CharRing(String srcString) {
		source = new Character[srcString.length()];
		for (int i = 0; i<srcString.length();i++) {
			source[i] = srcString.charAt(i);
		}
	}
	
}