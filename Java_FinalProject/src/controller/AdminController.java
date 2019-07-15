package controller;

import java.util.ArrayList;

import model.domain.dto.Ramen;
import ramen.exception.NotExistException;
import ramen.service.RamenService;
import ramen.view.EndView;
import ramen.view.FailView;

public class AdminController {
	
	private static AdminController instance = new AdminController();
	private RamenService service = RamenService.getInstance();
	
	public AdminController(){}
	public static AdminController getInstance() {
		return instance;
	}
	
	// ��ü ��� �˻�
	public void ramenListView() {

		ArrayList<Ramen> ramenList = service.getAllList();

		if (ramenList.size() != 0) {
			EndView.ramenListView(ramenList);
		}
	}

	// Ư�� ��� �˻�
	public void oneRamenView(String ramenName) {

		Ramen ramen = service.getRamenName(ramenName);

		if (ramen != null) {
			EndView.ramenView(ramen);
		} else {
			EndView.messageView("--------- �����Ͻ� ����� �������� �ʽ��ϴ�. --------");
		}
	}
	
	// ��� ����Ʈ �߰�
	public void insertRamen(Ramen newramen) {
		service.listInsert(newramen);
	}
	
	// ��� ���� ����
	public void updateRamenPrice(String ramenName) {
		try {
			service.listUpdatePrice(ramenName);
			EndView.messageView("���� �Ǿ����ϴ�.");
		} catch(NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}
	
	// Ư�� ������Ʈ ����
	public void deleteRamen(String ramenName) {
		try {
			service.listDelete(ramenName);
			EndView.messageView("���� �Ǿ����ϴ�.");
		} catch(NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}
}















