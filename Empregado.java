package PortoSeguro;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) //cria��o de m�todo
	{
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//moeda do pa�s
		//nf � uma vari�vel, se fosse objeto teria que ter "new"
		nf.setMinimumFractionDigits(2);//qtde de casa depois da v�rgula
		String formatoMoeda = nf.format(salario);//formata��o monet�ria
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println(nome + "\t\t" + "Sal�rio: " + this.formatarMoeda());
	}
	
}
