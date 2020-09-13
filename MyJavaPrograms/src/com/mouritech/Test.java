package com.mouritech;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

//filer reduce map

public class Test {
	@NumberValidation(message = "Yooo")
	static void sayHello(){
		System.err.println("Hello");
	}

	public static void main(String[] args) throws KeyStoreException {
		
		
      Test.sayHello();
      
    
}
}