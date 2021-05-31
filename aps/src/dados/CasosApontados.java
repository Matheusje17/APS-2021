package dados;

public class CasosApontados {
	private int cd_caso_apontado;
	private Cidade cidade;
	private Integer qtdCasos;

	
	public int getCd_caso_apontado() {
		return cd_caso_apontado;
	}
	public void setCd_caso_apontado(int cd_caso_apontado) {
		this.cd_caso_apontado = cd_caso_apontado;
	}
	public Integer getQtdCasos() {
		return qtdCasos;
	}
	public void setQtdCasos(Integer qtdCasos) {
		this.qtdCasos = qtdCasos;
	}
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
