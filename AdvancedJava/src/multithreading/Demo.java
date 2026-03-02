package multithreading;

import java.util.Scanner;

class D1 extends Thread {
	public void run() {
		System.out.println("Program Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println("Program finished");
	}
}

class D2 extends Thread {
	public void run() {
		System.out.println("Printing Characters");
		for(int i = 65; i<=75; i++) {
			System.out.println((char) i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class D3 extends Thread {
	public void run() {
		System.out.println("Printing Numbers");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class D4 implements Runnable {
	public void run() {
		System.out.println("Program Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println("Program finished");
	}
}

class D5 implements Runnable {
	public void run() {
		System.out.println("Printing Characters");
		for(int i = 65; i<=75; i++) {
			System.out.println((char) i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class D6 implements Runnable {
	public void run() {
		System.out.println("Printing Numbers");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Demo {

	public static void main(String[] args) {
		D4 t1 = new D4();
		D5 t2 = new D5();
		D6 t3 = new D6();
		
		Thread td1 = new Thread(t1);
		Thread td2 = new Thread(t2);
		Thread td3 = new Thread(t3);
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		td1.start();
		td2.start();
		td3.start();

	}

}
