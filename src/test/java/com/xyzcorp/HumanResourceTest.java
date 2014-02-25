package com.xyzcorp;

import org.junit.Test;

import static org.easymock.EasyMock.createMock;
import static org.junit.Assert.assertEquals;

/**
 * @author Daniel Hinojosa
 * @since 11/22/13 9:21 AM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class HumanResourceTest {

    @Test
    public void testEmployeeRaise() {
        HumanResourceDAO humanResourceDAO = createMock(HumanResourceDAO.class);
        HumanResources humanResources = new HumanResources();
        humanResources.setPercentRaise(.10);
        humanResources.setDAO(humanResourceDAO);
        Employee employee = new Employee("Bob", "Barker", 88);
        humanResources.giveEmployeeARaise(employee);

        assertEquals(((.10 * 88) + 88), employee.getPay(), .01);
    }
    
    @Test
    public void testEmployeeRaise2() {
        HumanResourceDAO humanResourceDAO = createMock(HumanResourceDAO.class);
        HumanResources humanResources = new HumanResources();
        humanResources.setPercentRaise(.10);
        humanResources.setDAO(humanResourceDAO);
        Employee employee = new Employee("Bob", "Barker", 88);
        humanResources.giveEmployeeARaise(employee);

        assertEquals(((.10 * 88) + 889), employee.getPay(), .01);
    }
    @Test
    public void testLayoff(){
    	
    	HumanResourceDAO humanResourceDAO = createMock(HumanResourceDAO.class);
        HumanResources humanResources = new HumanResources();
        humanResources.setPercentRaise(.10);
        humanResources.setDAO(humanResourceDAO);
        Employee employee = new Employee("Bob", "Barker", 88);
        humanResources.giveEmployeeARaise(employee);
        humanResources.layOff(employee);

        assertEquals(0, employee.getPay(), .01);
    }
    
    @Test
    public void testSetFirstName() throws Exception{
    	
        Employee employee = new Employee("Bob", "Barker", 88);
        employee.setFirstName("scott");
        assertEquals(employee.getFirstName(),"scott");
    }
    
    @Test(expected=Exception.class)
    public void testSetFirstNameWithExp() throws Exception{
    	
        Employee employee = new Employee("Bob", "Barker", 88);
        employee.setFirstName("Mr. scott");
        assertEquals(employee.getFirstName(),"scott");
    }
}
