package Model;

public class Product_DTO {
	private String pNAME;
	private int pPrice;
	private String pTYPE;
	private String pMANUF;
	
	public Product_DTO(String pNAME, int pPrice, String pTYPE, String pMANUF) {
		super();
		this.pNAME = pNAME;
		this.pPrice = pPrice;
		this.pTYPE = pTYPE;
		this.pMANUF = pMANUF;
	}
	
	public String getpNAME() {
		return pNAME;
	}
	public void setpNAME(String pNAME) {
		this.pNAME = pNAME;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpTYPE() {
		return pTYPE;
	}
	public void setpTYPE(String pTYPE) {
		this.pTYPE = pTYPE;
	}
	public String getpMANUF() {
		return pMANUF;
	}
	public void setpMANUF(String pMANUF) {
		this.pMANUF = pMANUF;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [pNAME=" + pNAME + ", pPrice=" + pPrice + ", pTYPE=" + pTYPE + ", pMANUF=" + pMANUF + "]";
	}
	
}