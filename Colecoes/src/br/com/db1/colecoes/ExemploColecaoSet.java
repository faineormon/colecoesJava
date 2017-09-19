package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploColecaoSet {
	private Set<String> nomesDb1Start = new HashSet<>();
	
	public void adicionarNomes(String nome) {
		nomesDb1Start.add(nome);
	}
	
	public void removerNomes(String nome) {
		nomesDb1Start.remove(nome);
	}
	
	public Boolean estaNaLista(String nome) {
		return nomesDb1Start.contains(nome);
	}
	
	public void percorrerLista() {
		Iterator lista = nomesDb1Start.iterator();
		while (lista.hasNext()) {
			System.out.println(lista.next());
		}
	}
	
	public Integer tamanhoLista(){
		return nomesDb1Start.size();
	}
	
	public Set getLista(){
		return nomesDb1Start;
	}

	public List<String> getListaOrdenada() {
		List<String> ordenados = new ArrayList<>();
		ordenados.addAll(nomesDb1Start);
		Collections.sort(ordenados);
		return ordenados;
	}
	
	public Set<String> getListaOrdenada2() {
		Set<String> ordenados = new TreeSet<>();
		ordenados.addAll(nomesDb1Start);
		return ordenados;
	}
}
