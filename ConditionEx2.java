package com.javalec.condition;

import java.util.Scanner;

public class ConditionEx2 {
	
	public static void main(String[] args) {
	
		//��� ���ϱ�
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� ������ �Է��ض�.");
		int K = sc.nextInt();
		System.out.print("���� ������ �Է��ض�.");
		int E = sc.nextInt();
		System.out.print("���� ������ �Է��ض�.");
		int M = sc.nextInt();
		
		double ave = (K+E+M) / 3;
		
		System.out.println("���������"+ ave + "�Դϴ�");
		
		if(K > ave) {
			System.out.println("���������� ��պ��� ����.");
		}else if(K < ave) {
			System.out.println("���������� ��պ��� ����");
		}else {
			System.out.println("���������� ����̴�");
		}
		if(E > ave) {
			System.out.println("���������� ��պ��� ����.");
		}else if(E < ave) {
			System.out.println("���������� ��պ��� ����");
		}else {
			System.out.println("���������� ����̴�");
		}
		if(M > ave) {
			System.out.println("���������� ��պ��� ����.");
		}else if(M < ave) {
			System.out.println("���������� ��պ��� ����");
		}else {
			System.out.println("���������� ����̴�");
		}
}
}
