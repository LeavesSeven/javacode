public class PropertiesDetail {
	public static void main(String[] args) {
		// ����Person����
		new Person();

		// ��Person���󸳸�p1
		// p1�Ƕ��������������ã�
		// new Person() �����Ķ���ռ䣨�Լ��ռ�������ݣ����������Ķ���
		Person p1 = new Person();

		// ����û�и�ֵ������Ĭ��ֵ
		System.out.println("����˵���Ϣ" + " " +
		                   p1.name + " " +
		                   p1.age + " " +
		                   p1.sal + " " +
		                   p1.isPass);
	}
}

class Person {
	// �ĸ�����
	int age;
	String name;
	double sal;
	boolean isPass;
}