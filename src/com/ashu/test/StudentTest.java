package com.ashu.test;

import com.ashu.A;
import com.ashu.Question;
import com.ashu.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentTest {
    public static void main(String [] args){
        //Bean factory implementation
        //Resource resource = new ClassPathResource("com/ashu/applicationContext.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(resource);
        //Student student = (Student)beanFactory.getBean("studentbean");
        //ClassPathXmlApplcationContext implementation
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ashu/applicationContext.xml");
        //Student student = (Student)context.getBean("studentbean");
        //student.displayInfo();
        //Question question = (Question)context.getBean("question1");
        //question.display();
        A obj = (A)context.getBean("a");
        obj.show();
    }
}
