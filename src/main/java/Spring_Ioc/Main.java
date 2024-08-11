package Spring_Ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("MyConfig.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(cpr);
		Student std = (Student) beanFactory.getBean("std");
		System.out.println("Hello");

	}
}
