package com.test.main;

import java.lang.reflect.Field;

public class StringTest {
    public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException {
        String s = "string!";
        String t = "!!";
        System.out.println("s 값 => "+s);
        System.out.println("t 값 => "+t);
        
        System.out.println("s.hashCode() => "+s.hashCode());
        System.out.println("t.hashCode() => "+t.hashCode());
        
        System.out.println("s 주소 => "+t.getClass().getName() + '@' + Integer.toHexString(t.hashCode()));
        System.out.println("t 주소 => "+s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
        
        //변경
        edit(s, "s tete");
        edit(t, "t tete");
        
        System.out.println("\r\ns 값 => "+s);
        System.out.println("t 값 => "+t);
        
        System.out.println("s.hashCode() => "+s.hashCode());
        System.out.println("t.hashCode() => "+t.hashCode());
        
        System.out.println("s 주소 => "+t.getClass().getName() + '@' + Integer.toHexString(t.hashCode()));
        System.out.println("t 주소 => "+s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
    }
    public static void edit(String s, String edit) throws IllegalArgumentException, IllegalAccessException, SecurityException, NoSuchFieldException {
    	
    	byte[] tempByte = edit.getBytes();
    	char [] tempChar = new char[tempByte.length];
    	for(int i=0; i<tempByte.length; i++){
    		tempChar[i] = (char) tempByte[i];
    	}
        Field stringValue = String.class.getDeclaredField("value");
        stringValue.setAccessible(true);
        stringValue.set(s, tempChar);
        //http://iilii.egloos.com/3809685
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

