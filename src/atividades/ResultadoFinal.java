package atividades;

public class ResultadoFinal {

	
private String nome;
private double tri1,tri2,tri3;

public double notafinal(){
	
 return (tri1+tri2+tri3 );
}
	

public String getNome(){
	return nome;
}

	public void setNome(String nome){
		this.nome = nome;

	}
	public double getTri1(){
		return tri1;
	}
	
	public void setTri1(double tri1){
		this.tri1 = tri1;
	}
	public double getTri2(){
		return tri2;
	}
	
	public void setTri2(double tri2){
		this.tri2 = tri2;
	}
	public double getTri3(){
		return tri3;
	}
	
	public void setTri3(double tri3){
		this.tri3 = tri3;
	}
}


