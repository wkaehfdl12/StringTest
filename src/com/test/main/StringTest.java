package com.test.main;

import com.test.component.StringValueEdit;

public class StringTest {
    public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException {
    	System.out.println("============================================");
    	System.out.println("주소값 테스트 시작!\r\n");
    	System.out.println("String s와 t의 주소값을 변경\r\n");
        String s = "string!";
        String t = "!!";
        System.out.println("s 값 => "+s);
        System.out.println("t 값 => "+t);
        
        s = t;
        
        System.out.println("s 주소 => "+s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
        System.out.println("t 주소 => "+t.getClass().getName() + '@' + Integer.toHexString(t.hashCode()));
        //변경
        StringValueEdit.edit(s, "");
        //StringValueEdit.edit(t, "");
        
        System.out.println("\r\n변경\r\n");
        System.out.println("s 값 => "+s);
        System.out.println("t 값 => "+t);
        
        System.out.println("s 주소 => "+s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
        System.out.println("t 주소 => "+t.getClass().getName() + '@' + Integer.toHexString(t.hashCode()));
        
        System.out.println("============================================");
        System.out.println("주소값 변경 \r\n");
        System.out.println("s2와 t2의 값을 아래와 같이 세팅함");
        System.out.println("String s2 = \"string!\"");
        System.out.println("String t2 = \"!!\"");
        System.out.println();
        
        String s2 = "string!";
        String t2 = "!!";
        
        System.out.println("s2 값 => "+s2);
        System.out.println("t2 값 => "+t2);
        
        System.out.println("s2 주소 => "+s2.getClass().getName() + '@' + Integer.toHexString(s2.hashCode()));
        System.out.println("t2 주소 => "+t2.getClass().getName() + '@' + Integer.toHexString(t2.hashCode()));
        //변경
        //StringValueEdit.notEdit(s2, "change Value22");
        //StringValueEdit.notEdit(t2, "change Value23");
        System.out.println("-----------------------------------------");
        System.out.println("s2와 t2의 값을 각각 change Value1, change Value2로 세팅함");
        s2 = "change Value1";
        t2 = "change Value2";
        
        System.out.println("\r\n변경\r\n");
        System.out.println("s2 값 => "+s2);
        System.out.println("t2 값 => "+t2);
        
        System.out.println("s2 주소 => "+s2.getClass().getName() + '@' + Integer.toHexString(s2.hashCode()));
        System.out.println("t2 주소 => "+t2.getClass().getName() + '@' + Integer.toHexString(t2.hashCode()));
    }
}


