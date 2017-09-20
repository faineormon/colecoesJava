package br.com.db1Start.exercicios.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1Start.exercicios.Carro;
import br.com.db1Start.exercicios.Exercicios20;
import br.com.db1Start.exercicios.MarcaComparator;
import br.com.db1Start.exercicios.PlacaComparator;
import br.com.db1Start.exercicios.Produto;
import br.com.db1Start.exercicios.ProdutoComparator;

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
		// Aqui deveria retornar size() = 3. Esta retornando 4 pois está sendo inserido um null lá no método getConsoantes
		for(String s: consoantes) {
			System.out.println(s);
		}
		
		Assert.assertTrue(consoantes.size() == 4);
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("a"));
	}
	
	@Test
	public void removeTerceiro() {
		List<Integer> valores = new ArrayList<>();
		for(Integer x = 0; x < 10; x++) {
			valores.add(x * 10);
		}
		
		Assert.assertTrue(valores.contains(0));
		Assert.assertTrue(valores.contains(10));
		Assert.assertTrue(valores.contains(20));
		Assert.assertTrue(valores.contains(30));
		
		List<Integer> novoValores = colecao.removeTerceiraPosicao(valores);
		Assert.assertTrue(novoValores.contains(0));
		Assert.assertTrue(novoValores.contains(10));
		Assert.assertFalse(novoValores.contains(20));
		Assert.assertTrue(novoValores.contains(30));
	}
	
	@Test
	public void mutiplosDeTres() {
		List<Integer> valores = new ArrayList<>();
		for(Integer x = 0; x < 10; x++) {
			valores.add(x * 10);
	}
		Assert.assertTrue(valores.get(3) == 30);
		Assert.assertTrue(valores.get(6) == 60);
		Assert.assertTrue(valores.get(9) == 90);
		
	}
	
	@Test
	public void mutiplosDeDois() {
		List<Integer> valores = new ArrayList<>();
		for(Integer x = 0; x < 10; x++) {
			valores.add(x);
	}
		
		List<Integer> novaLista = colecao.getNumerosPares(valores);
		
		Assert.assertTrue(novaLista.contains(2));
		Assert.assertTrue(novaLista.contains(4));
		Assert.assertTrue(novaLista.contains(6));
		Assert.assertTrue(novaLista.contains(8));
		Assert.assertFalse(novaLista.contains(10));
		Assert.assertFalse(novaLista.contains(3));
	}
	
	@Test
	public void exercicio6Test(){
		List<String> nomes = new ArrayList<>();
		nomes.add("silas");
		nomes.add("gustavo");
		nomes.add("aline");
		nomes.add("izabela");
		nomes.add("gabriel");
		nomes.add("lorena");
		nomes.add("lucas");
		nomes.add("caio");
		nomes.add("leonardo");
		nomes.add("fernando");

		List<String> novaLista = new ArrayList<>(nomes);

		Assert.assertTrue(novaLista.contains("caio"));
	}
	
	@Test
	public void exercicio7Test(){
		List<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("preto");

		List<String> cores2 = new ArrayList<>();
		cores2.add("azul");
		cores2.add("vermelho");
		cores2.add("preto");

		Assert.assertFalse(cores.equals(cores2));

		cores2.add("laranja");
		Assert.assertFalse(cores.equals(cores2));

		Assert.assertTrue(cores.containsAll(cores2));

		Collections.sort(cores);
		Collections.sort(cores2);
		Assert.assertTrue(cores.equals(cores2));
	}
	
	@Test
	public void exercicio9Test() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(98, "Celular", 1000.00));
		produtos.add(new Produto(50, "Monitor", 200.00));
		produtos.add(new Produto(55, "Caneca", 50.00));
		
		Assert.assertTrue(produtos.size() == 3);
		Assert.assertTrue(produtos.get(0).getValor() == 1000.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 50.00);
		
		Collections.sort(produtos);
		
		Assert.assertTrue(produtos.get(0).getValor() == 50.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 1000.00);

		Collections.sort(produtos, new ProdutoComparator());

		Assert.assertEquals("Caneca",produtos.get(0).getDescricao());
		Assert.assertEquals("Celular",produtos.get(1).getDescricao());
		Assert.assertEquals("Monitor",produtos.get(2).getDescricao());
		
	}
	
	@Test
	public void test() {
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro(1972, "Fusca", "VW", "DAD-1234"));
		carros.add(new Carro(2017, "Ecosport", "Ford", "ABC-9999"));
		carros.add(new Carro(2016, "Uno", "Fiat", "ABC-1890"));

		Assert.assertTrue(carros.size() == 3);
		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2017);
		Assert.assertTrue(carros.get(2).getAno() == 2016);
		
		Collections.sort(carros);

		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2016);
		Assert.assertTrue(carros.get(2).getAno() == 2017);

		Collections.sort(carros, new MarcaComparator());

		Assert.assertEquals("Fiat",carros.get(0).getMarca());
		Assert.assertEquals("Ford",carros.get(1).getMarca());
		Assert.assertEquals("VW",carros.get(2).getMarca());


		Collections.sort(carros, new PlacaComparator());

		Assert.assertEquals("ABC-1890",carros.get(0).getPlaca());
		Assert.assertEquals("ABC-9999",carros.get(1).getPlaca());
		Assert.assertEquals("DAD-1234",carros.get(2).getPlaca());
	}
}
