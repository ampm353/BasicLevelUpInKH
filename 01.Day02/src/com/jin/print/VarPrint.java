package com.jin.print;

public class VarPrint {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		// ���� + ���� = ����
		
		System.out.println(1.1 + 1.1);
		// �Ǽ� + �Ǽ� = �Ǽ�
		
		System.out.println('1' + '1');
		// ����a + ����b = ����a�� �ƽ�Ű�ڵ� �� + ����b�� �ƽ�Ű�ڵ� ��
		// ���⼭ ����1�� �ƽ�Ű�ڵ� ���� 49�̴�.
		
		System.out.println("1" + "1");
		// ���ڿ�a + ���ڿ�b = ���ڿ�a���ڿ�b
		// ���ڴ� ��������ǥ ' ���ڿ��� ū����ǥ " �� �����Ѵ�.

		System.out.println("Hello" + 'q');
		// ���ڿ� + ���� = ���ڿ�
		
		System.out.println("Hello" + 3.14);
		// ���ڿ� + �Ǽ� = ���ڿ�
		
		System.out.println(10 + 20 + "Hello");
		// ��������� �¿��� �� �����̱� ������,
		// 10+20�� ���� �����ϰ�, �̸� ���ڿ� Hello�� ���̴� ���̴�.
		
		System.out.println(10 + "Hello" + 20);
		System.out.println("Hello" + 10);
		System.out.println(10 + "Hello");
		System.out.println(10 + (20 + "Hello"));
		// ���뿡�� ������ ����, ���ڿ� + AnyThing = ���ڿ� �̶�� ����̴�.

		float fNum = 486.520F;
		System.out.printf("%.3f\n", fNum);
		// ����(form)�� �����Ͽ� ����� �� �ִ� printf.

		boolean bool = true;
		System.out.println(bool);
		// ��
		
		bool = (3 > 2);
		System.out.println(bool);
		// ��
		
		bool = (1 == 2);
		System.out.println(bool);
		// ����

		char k1 = 'a';
		// ���� a
		char k2 = 97;
		// �ƽ�Ű�ڵ忡�� ���� a�� ����Ű�� ��
		char k3 = '\u0061';
		// �����ڵ忡�� ���� a�� ����Ű�� ��ȣ
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		// �׷��� �ᱹ ��� a
	}


}
