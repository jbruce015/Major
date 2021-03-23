import java.util.ArrayList;
import java.util.List;

/**
 * CyberSecurity Class extending Computer Science
 */
public class CyberSecurity extends  ComputerScience {
    public CyberSecurity(String majorName, double minGPA, int totalHours, String degree) {
        super(majorName, minGPA, totalHours, degree);
    }
    /**
     *Method override from Computer Science with a few changes
     * @return preReq
     */
    @Override
    public List<String> preReq() {
        ArrayList<String> preReq = new ArrayList<>();
        preReq.add("Computer Science degree ");
        preReq.add("Computer Engineering degree");
        preReq.add("Information Technology degree");
        return preReq;
    }
}
