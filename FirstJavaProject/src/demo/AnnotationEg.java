package demo;

import java.lang.reflect.Method;

public class AnnotationEg {
    
    @MyAnnotation(value = 15)
    public void sayHello() {
    	System.out.println("hello annotation");
    }
    
    public static void main(String[] args) throws Exception {
		AnnotationEg ae = new AnnotationEg();
		Method m = ae.getClass().getMethod("sayHello");
		
		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: "+ manno.value());
	}
}
