
public class CGwamokManager {
	private DAO dao;
	
	public CGwamokManager() {

	}
	
	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public void gaesol(EGwamok gwamok) {
		dao.write(gwamok);
	}

}
