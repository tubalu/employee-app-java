package com.xyzcorp;

/**
 * @author Daniel Hinojosa
 * @since 11/22/13 9:33 AM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class Employee {
    private double pay;
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		
		if(firstName.startsWith("Mr.") || firstName.startsWith("Ms.")){
			throw new Exception("No Title Please");
		}
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	private String firstName;
    private String lastName;
    private String middleName;

    public Employee(String firstName, String lastName, double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
   
}