// ���������

/*
��ֻè��С�׺�С�졣
�������֣�
��ȷ->�������䣬��ɫ
����->��ʾ��û����ֻèè
 */

// ���� è�� ���ࣺ�Զ����������ͣ�
class Cat {
	// è������
	String name; // ����
	int age; // ����
	String color; // ��ɫ

	// è����Ϊ���Ժ�����ӣ�
}

public class Object01 {
	public static void main(String[] args) {
		// ʹ���������OOP��
		// 1.new Cat() ����(ʵ����)һֻè
		// 2.Cat cat1 = new Cat() �Ѵ�����è����cat1
		// 3.cat1 ����һ��è����
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 10;
		cat1.color = "��ɫ";
		// ʵ�����ڶ�ֻè
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 12;
		cat2.color = "��ɫ";

		// ���ʶ��������
		System.out.println("��һֻè����Ϣ" +
		                   cat1.name + " " +
		                   cat1.age + " " +
		                   cat1.color);
		System.out.println("�ڶ�ֻè����Ϣ" +
		                   cat2.name + " " +
		                   cat2.age + " " +
		                   cat2.color);
	}
}

