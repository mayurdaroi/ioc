//This class gets the bean from the applicationContext.xml file and calls the display method.


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args)
    {  
          
        ApplicationContext apc=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e=(Employee)apc.getBean("obj");  
        s.display();  
    }  
}  
