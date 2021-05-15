package dados;

public class CasosApontados {
	
	private Cidade cidade;
	private Integer qtdCasos;

	public CasosApontados() {
		this(null, 0);
	}
	public CasosApontados(Cidade cidade, int qtdeCasos) {
		this.cidade = cidade;
		this.qtdCasos=qtdeCasos;
	}
	public CasosApontados(int qtdeCasos) {
		
		this.qtdCasos =qtdeCasos;
	}
	
	public CasosApontados(Cidade cidade) {
		this.cidade =cidade;

	}

	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade=cidade;
	}
	
		
	public int getQtdeCasos() {
		return qtdCasos;
	}
	
	public void setQtdeCasos(int qtdCasos) {
		this.qtdCasos=qtdCasos;
	}
	


	

	
	
	
	
}
