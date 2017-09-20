package br.com.db1Start.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
	
	/*consoantes.add('b');
	consoantes.add('c');
	consoantes.add('d');
	consoantes.add('f');
	consoantes.add('g');
	consoantes.add('h');
	consoantes.add('j');
	consoantes.add('k');
	consoantes.add('l');
	consoantes.add('m');
	consoantes.add('n');
	consoantes.add('o');
	consoantes.add('p');
	consoantes.add('q');
	consoantes.add('r');
	consoantes.add('s');
	consoantes.add('t');
	consoantes.add('v');
	consoantes.add('w');
	consoantes.add('x');
	consoantes.add('y');
	consoantes.add('z');*/
	}
	
	/* muito bom !!*/
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
	
	/* muito bom também!!*/
	public Set<String> getConsoante(String palavraQualquer) {
		palavraQualquer = palavraQualquer.toLowerCase();
		Set<String> consoantesEncontradas = new HashSet<>();
		for (Integer x = 0; x < palavraQualquer.length(); x++) {
			String letra = palavraQualquer.substring(x, x+1);
			/*Aqui poderia apenas colocar uma negacao !vogais.contain(letra) e se isso for verdadeiro coloca na lista. 
			Assim não precisa ter um else e nem inserir um null*/
			if(vogais.contains(letra)) {
				consoantesEncontradas.add(null);
				} else {
					consoantesEncontradas.add(letra);
				}
		}
		
		return consoantesEncontradas;
	}
	
	public List<Integer> removeTerceiraPosicao(List<Integer> valores) {
		valores.remove(2);
		return valores;
	}
	
	public List<Integer> getNumerosPares(List<Integer> valores) {
		List<Integer> valoresMultiplosDeDois = new ArrayList<>();
		Iterator<Integer> it = valores.iterator();
		while (it.hasNext()){
			Integer valor = it.next();

			if (valor > 0 && valor % 2 == 0){
				valoresMultiplosDeDois.add(valor);
			}
		}
		return valoresMultiplosDeDois;
	}
	
	
}
