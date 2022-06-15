package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        MyStack<Character> stack = new LinkedListStack<>();
		MyStack<Character> auxiliar = new LinkedListStack<>();

		int cont = 0;

		System.out.println(s.length() + stack.size());
		
		if (s.length() % 2 == 0) {

			for (int i = 1; i < s.length(); i++) {

				stack.push(s.charAt(cont));

				auxiliar.push(s.charAt(i));

				System.out.println("/-----/" + stack.top() + "//" + auxiliar.top());

				if (stack.top() == '(' && auxiliar.top() == ')' || stack.top() == '[' && auxiliar.top() == ']'
						|| stack.top() == '{' && auxiliar.top() == '}') {

					System.out.println("//" + stack.top() + "//" + auxiliar.top());

					stack.pop();
					auxiliar.pop();

					System.out.println("/POP/" + stack.top() + "//" + auxiliar.top());
				} else {
					cont++;
				}

			}
			System.out.println(stack.top() + " y " + stack.size());

			if (stack.isEmpty()) {
				return true;
			}

		}
		return false;
    }
}
