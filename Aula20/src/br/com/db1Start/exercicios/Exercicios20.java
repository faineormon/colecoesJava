package br.com.db1Start.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicios20 {
	List<String> vogais = new ArrayList<>();
	
	public Exercicios20() {
	vogais.add("a");
	vogais.add("e");
	vogais.add("i");
	vogais.add("o");
	vogais.add("u");
	}
	
	public Set<String> getVogais(String palavraQualquer) {
		palavraQualquer = palavraQualquer.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();
		for (Integer x = 0; x < palavraQualquer.length(); x++) {
			String letra = palavraQualquer.substring(x, x+1);
			if(vogais.contains(letra)) {
				vogaisEncontradas.add(letra);
				
			}
		}
		
		return vogaisEncontradas;
	}
	
	public Set<String> getConsoante(String palavraQualquer) {
		palavraQualquer = palavraQualquer.toLowerCase();
		Set<String> consoantesEncontradas = new HashSet<>();
		for (Integer x = 0; x < palavraQualquer.length(); x++) {
			String letra = palavraQualquer.substring(x, x+1);
			if(vogais.contains(letra)) {
				consoantesEncontradas.add(null);
				} else {
					consoantesEncontradas.add(letra);
				}
		}
		
		return consoantesEncontradas;
	}
}
