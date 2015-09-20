/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/POTSAM/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner liczba = new Scanner(System.in);
		int n1 = liczba.nextInt();
		int k1 = liczba.nextInt();
		int n2 = liczba.nextInt();
		int k2 = liczba.nextInt();
		System.out.println((n1*k1)+(n2*k2));

	}

}
