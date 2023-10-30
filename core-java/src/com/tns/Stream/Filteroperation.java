package com.tns.Stream;

import java.util.Arrays;
import java.util.List;

public class Filteroperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>s2=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("filter odd numbers");
       s2.stream().filter(num->num%2==1).forEach(System.out::println);

	}

}
