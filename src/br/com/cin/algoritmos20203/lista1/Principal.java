package br.com.cin.algoritmos20203.lista1;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  
public class Principal
{ 
    public static void main(String[] args) throws IOException 
    { 
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        String p1 = st.nextToken(); 
        String p2 = st.nextToken();
        String end = p1;
        System.out.println();
        while(end!="END") {
        	st = new StringTokenizer(br.readLine());
        	p1 = st.nextToken();
        	if(st.hasMoreTokens()) {
        		p2 = st.nextToken();
                System.out.print(p1+" ");
                System.out.print(p2+"\n");
                
        	} else {
        		System.out.println(p1);
        	}
        	
            end=p1;
        }
        
        
    } 
} 