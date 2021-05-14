package dados;



public class Cidade {
	private String nomeCidade;
	private String uF;

	
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
