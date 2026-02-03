package com.ibm.annotations;


@CustomAnnotation(duration=10,name="class",version= {1.2,1.3})
public class CustomAnnotationusage {
 @CustomAnnotation(duration=4, name="consturctor")
 public CustomAnnotationusage() {
	 
 }
}
