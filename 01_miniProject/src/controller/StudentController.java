package controller;

import log.check.Log4J;
import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {
	
	static Log4J log = Log4J.getInstance();

	public static void request(int reqNumber) {
		
		if(reqNumber == 1) {
			
			System.out.println(log.info());
			System.out.println();
			
			EndView.printAll(StudentModel.getAll());
			
			System.out.println(log.done());
			
		} else if(reqNumber == 2) {
			
			EndView.printOne(StudentModel.getOne("������"));
			
			System.out.println(log.done());
			
		} else if(reqNumber == 3) {
			
			boolean r = StudentModel.insert(new Student("������", 46, "��", "�ƶ���"));
			
			log.info();
			
			if(r) {
				System.out.println(log.done());
			} else {
				System.out.println(log.error());
			}
			
		} else if(reqNumber == 4) {
			
			StudentModel.delete("�ּ���");
			
			System.out.println(log.done());
			
		} else if(reqNumber == 5) {
			
			StudentModel.update("������");
			
			System.out.println(log.done());
		} else {
			
			System.out.println(log.empty());
		}
	}
}
