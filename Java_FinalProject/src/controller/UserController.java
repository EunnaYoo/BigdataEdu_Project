package controller;

import java.util.ArrayList;

import model.domain.dto.Topping;
import ramen.exception.NotExistException;
import ramen.service.RamenService;
import ramen.view.EndView;
import ramen.view.FailView;

public class UserController extends AdminController {

	private static UserController instance = new UserController();
	private RamenService service = RamenService.getInstance();

	UserController() {
		super();
	}

	public static UserController getInstance() {
		return instance;
	}

	public void Process() {
		EndView.Processmessage("������ �������Դϴ�." + "\n" + "����" + "\n" + "����" + "\n" + "����" + "\n" + "������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void toppingListView() {

		ArrayList<Topping> toppingList = service.getAllTopping();

		if (toppingList.size() != 0) {
			EndView.toppingListView(toppingList);
		}
	}
	
	public void oneToppingView(String ToppingName) {

		Topping topping = service.getToppingName(ToppingName);

		if (topping != null) {
			EndView.toppingView(topping);
		} else {
			EndView.messageView("--------- �����Ͻ� ����� �������� �ʽ��ϴ�. --------");
		}
	}
	
	public void addTopping(String ramenName, String toppingName) {
		try {
			EndView.addPirceMessage(service.ramenTopping(ramenName, toppingName));
		} catch(NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}
}
