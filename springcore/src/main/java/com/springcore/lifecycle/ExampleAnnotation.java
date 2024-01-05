package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotation {
 public String subject;

@Override
public String toString() {
	return "ExampleAnnotation [subject=" + subject + "]";
}

public ExampleAnnotation() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@PostConstruct
public void start() {
	System.out.println("starting method");
}
@PreDestroy
 public void end()
{
	 System.out.println("Ending method"); 
}
 
}
