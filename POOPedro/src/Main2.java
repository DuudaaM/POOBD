
public class Main2 {

	public static void main(String[] args) {
		Cabelo c = new Cabelo();
		c.setId(1l);
		c.setCorte("Chanel");
		DAO<Cabelo> dao = new DAO<Cabelo>();
		dao.save(c);
		
	}
}
