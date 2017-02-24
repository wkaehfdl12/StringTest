package com.test.component;

import java.lang.reflect.Field;

public class StringValueEdit {
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
