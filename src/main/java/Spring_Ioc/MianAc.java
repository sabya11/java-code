package Spring_Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianAc {
public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("MyConfig.xml");
Student student=(Student)context.getBean("std");
Student student2=(Student)context.getBean("std");
System.out.println(student.equals(student2));
}
}