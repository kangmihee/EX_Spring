package controller;

import model.DataDao;

public class SelectSeviceImpl implements SelectService {
	private DataDao dataDao;  // dataDao에 주소를 주어야함 ... 밑의 생성자로 주소 줌
	
	public SelectSeviceImpl(DataDao dataDao) {
		System.out.println("SelectSeviceImpl 생성자");
		this.dataDao = dataDao; // 생성자를통해 dao의 인스턴스 주소 가짐(DataDaoImpl의 주소)
	}
	
	public void selectProcess() {
		System.out.println("SelectProcess 수행");
		dataDao.selectData();

	}
}
