package com.xyzcorp;

/**
 * @author Daniel Hinojosa
 * @since 11/22/13 9:30 AM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class HumanResources {
    private double percentRaise;
    private HumanResourceDAO DAO;

    public void setPercentRaise(double percentRaise) {
        this.percentRaise = percentRaise;
    }
    
    public void layOff(Employee employee) {
    	employee.setPay(0);
    }
    
    

    public void setDAO(HumanResourceDAO DAO) {
        this.DAO = DAO;
    }

    public void giveEmployeeARaise(Employee employee) {
        employee.setPay((employee.getPay() * percentRaise) + employee.getPay());
    }
}
