package org.photon.test.datatype;

public class StringBuilderBuffer {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("Hello");
		System.out.println(s);
		int identityHashCode = System.identityHashCode(s);
		System.out.println(identityHashCode);
		
		StringBuffer s1 = new StringBuffer("Welcome");
		System.out.println(s1);
		int identityHashCode2 = System.identityHashCode(s1);
		System.out.println(identityHashCode2);
		
		StringBuffer s2 = new StringBuffer("Welcome");
		System.out.println(s2);
		int identityHashCode3 = System.identityHashCode(s2);
		System.out.println(identityHashCode3);
		
		StringBuilder s3 = new StringBuilder("Gnan");
		StringBuffer s4 = new StringBuffer("Sundari");
		StringBuilder append = s3.append(s4);
		System.out.println(append);
		
		System.out.println("-----------");
		
		String a = new String("Same");
		String b = new String("Same");
		int identityHashCode4 = System.identityHashCode(a);
		int identityHashCode5 = System.identityHashCode(b);
		System.out.println(identityHashCode4);
		System.out.println(identityHashCode5);
		
		System.out.println("-----------");
		
		String a1="Same String";
		String a2="Same String";
		int identityHashCode6 = System.identityHashCode(a1);
		int identityHashCode7 = System.identityHashCode(a2);
		System.out.println(identityHashCode6);
		System.out.println(identityHashCode7);
		
		
		
	}

}
