package chapter08;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("DB에서 삽입");
	}
	@Override
	public void update() {
		System.out.println("DB에서 수정");
	}
	@Override
	public void delete() {
		System.out.println("DB에서 삽입");
	}
	

	
}
