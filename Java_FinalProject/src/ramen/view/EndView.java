package ramen.view;

import java.util.ArrayList;

import model.domain.dto.Ramen;
import model.domain.dto.Topping;

public class EndView {
	
	public static void ramenListView(ArrayList<Ramen> ramenList) {
		
		System.out.println("[ ��� ��� ]");
		System.out.println("����̸�" + " " + "����" + " " + "�����ð�");
		
		for (Ramen v : ramenList) {
			if (v != null) {
				System.out.println(v.toString());
			}
		}
	}
	
	public static void toppingListView(ArrayList<Topping> toppingList) {

		System.out.println("[ ���� ��� ]");
		System.out.println("�̸�" + " " + "����");

		for (Topping v : toppingList) {
			if (v != null) {
				System.out.println(v.toString());
			}
		}
	}
	
	public static void messageView(String message) {
		
		System.out.println(message);
	}

	public static void ramenView(Ramen ramen) {
		
		System.out.println("[ �����Ͻ� ��� ]");
		System.out.println(ramen);
	}
	
	public static void toppingView(Topping topping) {
		System.out.println("[ �����Ͻ� ���� ]");
		System.out.println(topping);
	}

	public static void Processmessage(String string) {
		System.out.println(string);
	}

	public static void addPirceMessage(int ramenTopping) {
		System.out.println("�� ������ " + ramenTopping + "�� �Դϴ�.");
	}


}
