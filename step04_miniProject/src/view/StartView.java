package view;

import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		
		StudentController.request(1);
		System.out.println();
		System.out.println(" -- �л� �˻� -- ");
		StudentController.request(2);
		System.out.println();
		System.out.println(" -- �ű� ��ϻ� -- ");
		StudentController.request(3);
		System.out.println();
		System.out.println(" -- �л� ��ܿ��� ���� -- ");
		StudentController.request(4);
		System.out.println();
		System.out.println(" -- �л� ��� ���� -- ");
		StudentController.request(5);
		System.out.println();
		System.out.println(" -- ��� �ٽ� Ȯ�� -- ");
		StudentController.request(1);
		
	}
}
