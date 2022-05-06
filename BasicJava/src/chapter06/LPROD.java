package chapter06;
//value Object(VO:값을 가지고 있는 개체)
//Data Transfer Object(dto:데이터를운반해주는 객체)
//Model(데이터)
//Item(안드로이드 분야에서 많이 사용했음)
//Bean(객체)
public class LPROD {
   
private int lprodId; 
private String lprodGu;
private String lprodNm;
public int getLprodId() {
	return lprodId;
}
public void setLprodId(int lprodId) {
	this.lprodId = lprodId;
}
public String getLprodGu() {
	return lprodGu;
}
public void setLprodGu(String lprodGu) {
	this.lprodGu = lprodGu;
}
public String getLprodNm() {
	return lprodNm;
}
public void setLprodNm(String lprodNm) {
	this.lprodNm = lprodNm;
}



}

