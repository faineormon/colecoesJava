package br.com.db1Start.exercicios;

public class Carro implements Comparable<Carro>{
	
	private Integer ano;
	private String nome;
	private String marca;
	private String placa;
	
	public Carro(Integer anoCarro, String nomeCarro, String marcaCarro, String placaCarro) {
		this.ano = anoCarro;
		this.nome = nomeCarro;
		this.marca = marcaCarro;
		this.placa = placaCarro;
	}
	
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	@Override
	public int compareTo(Carro outroCarro) {
		// TODO Auto-generated method stub
		if(this.getAno() < outroCarro.getAno()) {
			return -1;
		}
		if(this.getAno() > outroCarro.getAno()) {
			return 1;
		}
		return 0;
		
	}
	
}
