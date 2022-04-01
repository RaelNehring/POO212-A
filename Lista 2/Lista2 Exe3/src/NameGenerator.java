
public class NameGenerator {
	public static String generateStarWarsName(String[] entrada) {
		String nomeStarWars;
		String[] nome = entrada[0].split(" ");;
		nomeStarWars = nome[nome.length-1].substring(0,3) + nome[0].substring(0,2);
		nomeStarWars +=  " " + entrada[1].substring(0,2);
		nomeStarWars += entrada[2].substring(0,3);
		
		return nomeStarWars;
	}
}
