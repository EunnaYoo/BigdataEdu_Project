// �ֿ� ��� Ŭ����
package model;

import log.check.Log4J;
import model.domain.Student;

public class StudentModel {
	
	// �迭�� ����
	private static Student[] allData = new Student[30];
	private static int index;
	
	// ���� ������ �ֱ�
	static {
		
		allData[0] = new Student("�����", 42, "��", "�濵��");
		allData[1] = new Student("������", 25, "��", "�����");
		allData[2] = new Student("������", 27, "��", "������");
		allData[3] = new Student("������", 25, "��", "�濵��");
		allData[4] = new Student("�ּ���", 29, "��", "������");
		
		index = 5; 
	}
	
	// ��ü ��� Ȯ��(getAll)
	public static Student[] getAll() {
		
		System.out.println("[ ���ھ� ������ �м� ���� ���� ��� ]"); // ��� ��� ����
		return allData;
	}
	
	// �� ��� �˻�(getOne)
	public static Student getOne(String name) {
		
		Log4J.getInstance();
		Student v = null;;
		
		for(int i = 0; i < allData.length; i++) {
			
			v = allData[i];
			
			if(v != null && v.getName().equals(name)) {
				
				return v;
			}
		}
		
		return v;
	}
	
	// �߰� �л�(Insert)
	public static boolean insert(Student v) {
		
		if(index < 30) {
			
			allData[index++] = v;
			System.out.println(v.getName() + "��(��) ��ϵǾ����ϴ�.");
			return true;
		}
		
		return false;
	}
	
	// ���� ����(Update)
	public static boolean update(String name) {
		
		Student v = null;
		
		for(int i = 0; i < allData.length; i++) {

			v = allData[i];
			
			if(v != null && v.getName().equals(name)) {
				
				v.setAge(v.getAge() - 1);
				System.out.println(name + " �� ������ ����Ǿ����ϴ�.");
				return true;
			}	
		}
		
		return false;
	}	
	
	// �ߵ� ����(Delete)
	public static boolean delete(String name) {
		
		Student v = null;
		
		for(int i = 0; i < allData.length; i++) {
			
			v = allData[i];
			
			if(v != null && v.getName().equals(name)) {
				
				allData[i] = null;
				System.out.println(name + "��(��) �ߵ� �����ϼ̽��ϴ�.");
				return true;
			}
		}
		
		return false;
	}
}
