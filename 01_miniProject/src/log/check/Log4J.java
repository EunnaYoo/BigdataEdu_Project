package log.check;

public class Log4J {
	
	private static Log4J instance = new Log4J();
	
	private Log4J(){};
	
	public static Log4J getInstance() {
		return instance;
	}
	
	public String info() {
		return "�ȳ��ϼ���";
	}
	
	public String done() {
		return "����Ǿ����ϴ�.";
	}
	
	public String error() {
		return "������ �߻��߽��ϴ�.";
	}
	
	public String empty() {
		return "�����Ͱ� �������� �ʽ��ϴ�.";
	}
	

}
