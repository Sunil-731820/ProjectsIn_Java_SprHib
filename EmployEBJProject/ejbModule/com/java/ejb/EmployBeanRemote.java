package com.java.ejb;

import javax.ejb.Remote;


@Remote
public interface EmployBeanRemote {

	Employ[] showEmploy();

}
