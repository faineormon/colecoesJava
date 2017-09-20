package br.com.db1Start.exercicios;

import java.util.Comparator;

public class MarcaComparator implements Comparator<Carro>{

	@Override
	public int compare(Carro o1, Carro o2) {
		// TODO Auto-generated method stub
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
