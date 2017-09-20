package br.com.db1Start.exercicios;

import java.util.Comparator;

public class PlacaComparator implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {
		// TODO Auto-generated method stub
		return o1.getPlaca().compareTo(o2.getPlaca());
	}

}
