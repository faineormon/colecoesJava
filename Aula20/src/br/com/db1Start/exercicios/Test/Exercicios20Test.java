package br.com.db1Start.exercicios.Test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1Start.exercicios.Exercicios20;

public class Exercicios20Test {
	private Exercicios20 colecao = new Exercicios20();
	
	@Test
	public void getVogaisTest() {
		
		Set<String> consoantes = colecao.getVogais("Fusca");
		Assert.assertTrue(consoantes.size() == 2);
		Assert.assertFalse(consoantes.contains("F"));
		Assert.assertTrue(consoantes.contains("u"));
		Assert.assertFalse(consoantes.contains("s"));
		Assert.assertFalse(consoantes.contains("c"));
		Assert.assertTrue(consoantes.contains("a"));
	}
	
	@Test
	public void getConsoanteTest() {
		
		Set<String> consoantes = colecao.getConsoante("Fusca");
		Assert.assertTrue(consoantes.size() == 4);
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("a"));
	}

}
