/**
 * 
 */
package com.pavan.yalamanchili;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


/**
 * @author ypava
 *
 */
public class CharRepetetion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Pavan Yalamanchili";
        getCount(str);

	}

public static void getCount(String name) {
        
	  Map<Character, Integer> names = 
              new LinkedHashMap<Character, Integer>();
      for (int i = 0; i < name.length(); i++) {
          char c = name.charAt(i);
          Integer count = names.get(c);
          if (count == null) {
              count = 0;
          }
          names.put(c, count + 1);
      }
      Set<Character> a = names.keySet();
      for (Character t : a) {
          if (!t.equals(' '))
              System.out.println(t + " Ocurred " 
          + names.get(t) + " times");

        }
    }
}


