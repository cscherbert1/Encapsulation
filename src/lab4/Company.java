
package lab4;

/**
 *
 * @author cscherbert1
 */
public class Company {
    private HiringManager hm;
    
    public Company() {
        hm = new HiringManager();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hm.hireNewEmployee(firstName, lastName, ssn);
        hm.outputHiringReport(ssn);
    }

    public HiringManager getHm() {
        return hm;
    }

    public void setHm (HiringManager hm) {
        this.hm = hm;
    }
}
