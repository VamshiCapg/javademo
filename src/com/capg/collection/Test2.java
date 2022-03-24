package com.capg.collection;
import java.util.HashSet;
public class Test2
{
  public static void main(String[] args)
  {
	  HashSet<Student> hs=new HashSet<Student>();
	  Student st1=new Student();
	  st1.setStid(100);
	  st1.setStname("Hello");
	  
	  Student st2=new Student();
	  st1.setStid(200);
	  st1.setStname("Smith");
	  
	  Student st3=new Student();
	  st3.setStid(323);
	  st3.setStname("Colly");
	  hs.add(st1);
	  hs.add(st2);
	  hs.add(st3);
	  System.out.println(hs);
	  for(Student s:hs)
	  {
		  if(s.getStname().startsWith("C"));
		  {
			  System.out.println(s.getStname());
		  }
	  }
	  
  }
}
