package com.sky.ConstructorInjectionWithCollection;


import org.springframework.stereotype.Component;
import java.util.Iterator;  
import java.util.List;  

@Component
public class Employee {
    
    private int id;
    private String name;
    private List<String> skills;  
    
    public Employee(int id, String name,List<String> skills){
        super();
        this.id = id;
        this.name = name; 
        this.skills = skills;
    }


    public void Run(){
        
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
        System.out.println("Having Skills");
        Iterator<String> itr=skills.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  

    }
}
