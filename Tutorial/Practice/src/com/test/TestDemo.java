package com.test;

public class TestDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//Input: Hello world
//		String s ="Hellow world";
//		
//		char[] charArray = s.toCharArray();
//		
//		//System.out.println(charArray[5]);
		
		
//		String s ="Hellow world";
//		String[] split = s.split("");
//		String s1 = "";
//		for(int i = split.length-1; i>=0; i--) {
//			s1+=split[i]+"";
//		}
//		s1=s1.trim();
//		System.out.println(s1);
		
		
		String str = "Hello world";
        String[] words = str.split(" ");
        
        for (String word : words) {
            System.out.print(reverseString(word) + " ");
        }
        
        
	}

//	public static String reverseString(String word) {
//		char[] charArray = word.toCharArray();
//        int left = 0;
//        int right = charArray.length - 1;
//        
//        while (left < right) {
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//            left++;
//            right--;
//        }
//        
//        return new String(charArray);
//	}
	 
	public static String reverseString(String s) {
		String s1= "";
		s=s.toLowerCase();
		for(int i=s.length()-1; i>=0; i--)
		{
			s1 = s1 + s.charAt(i);
		}
		return s1;
	}
	
	

}
