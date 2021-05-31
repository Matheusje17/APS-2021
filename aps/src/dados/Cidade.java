package dados;

public class Cidade {
	private int cd_cidade;
	private String nomeCidade;
	private String uF;
	
	
	

	public int getCd_cidade() {
		return cd_cidade;
	}
	public void setCd_cidade(int cd_cidade) {
		this.cd_cidade = cd_cidade;
	}
	public Cidade(String nomeCidade) {
		this.nomeCidade =nomeCidade;
	}
	public Cidade() {

	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		
		this.nomeCidade=nomeCidade;
	}
	

	public String getuF() {
		return uF;
	}
	public void setuF(String uF) {
		this.uF=uF;
	}
	
}
