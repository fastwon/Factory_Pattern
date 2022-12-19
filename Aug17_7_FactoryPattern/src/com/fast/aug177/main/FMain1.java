package com.fast.aug177.main;

import com.fast.aug177.register.Academy;
import com.fast.aug177.register.Student;

// �п����� �л��� ����� �� �ش� Ŀ��ŧ�� ����ڷ� ����Ϸ��� ��
// �л��� ������ �̸� / ���� !
// ��� ������� ��ȣ�� �ο��ϰ� ������ ��� �ؾ� �ұ�?

// ��ü�� �ʿ���� : static �޼ҵ� ���
// ��ü�� �ֱ�� �ؾ���
//		�ϳ� : Singleton ����
//		������ :
//				�뷮����, �ڵ�ȭ�� : Factory ����
//				������ : ���²� �츮�� �ߴ��ɷ�!

public class FMain1 {
	public static void main(String[] args) {
		Academy ac = new Academy();
		
		Student s1 = ac.consult("aa", 20);
		s1.printInfo();
		System.out.println("===============");
		Student s2 = ac.consult("bb", 20);
		s2.printInfo();
		System.out.println("===============");
		Student s3 = ac.consult("cc", 20);
		s3.printInfo();
		System.out.println("===============");
				
	}

}
