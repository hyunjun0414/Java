package com.javalec.condition;

import java.util.Scanner;

public class ConditionEx2 {
	
	public static void main(String[] args) {
	
		//평균 구하기
		Scanner sc = new Scanner(System.in);
	
		System.out.print("국어 점수를 입력해라.");
		int K = sc.nextInt();
		System.out.print("영어 점수를 입력해라.");
		int E = sc.nextInt();
		System.out.print("수학 점수를 입력해라.");
		int M = sc.nextInt();
		
		double ave = (K+E+M) / 3;
		
		System.out.println("평균점수는"+ ave + "입니다");
		
		if(K > ave) {
			System.out.println("국어점수는 평균보다 높다.");
		}else if(K < ave) {
			System.out.println("국어점수는 평균보다 낮다");
		}else {
			System.out.println("국어점수는 평균이다");
		}
		if(E > ave) {
			System.out.println("영어점수는 평균보다 높다.");
		}else if(E < ave) {
			System.out.println("영어점수는 평균보다 낮다");
		}else {
			System.out.println("영어점수는 평균이다");
		}
		if(M > ave) {
			System.out.println("수학점수는 평균보다 높다.");
		}else if(M < ave) {
			System.out.println("수학점수는 평균보다 낮다");
		}else {
			System.out.println("수힉점수는 평균이다");
		}
}
}
