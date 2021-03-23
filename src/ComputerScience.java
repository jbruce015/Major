import java.util.ArrayList;
import java.util.List;

/**
 * Computer Science Class extending Major
 */
public class ComputerScience extends Major {
    private String degree;

    /**
     * Computer Science Constructor method
     * @param majorName
     * @param minGPA
     * @param totalHours
     * @param degree
     */
    public ComputerScience(String majorName, double minGPA, int totalHours, String degree) {
        super(majorName, minGPA, totalHours);
        this.degree = degree;
    }

    /**
     * Prerequisite method to display the prereqs for Computer Science
     * @return preReq
     */
    public List<String> preReq(){
        ArrayList<String> preReq = new ArrayList<>();
        preReq.add("COP2210 Computer Programming 1");
        preReq.add("MAC2311 Calculus 1");
        preReq.add("MAC2312 Calculus 2");
        preReq.add("PHY2048 Physics with Calculus 1 w/Lab");
        preReq.add("PHY2049 Physics with Calculus 2 w/Lab");
        return preReq;
    }

    /**
     * Degree method that specify whether it's undergraduate or graduate
     * @return degree
     */
    public String getDegree(){
       return degree;
    }

    /**
     * String method with degree and prereq added to super
     * @return string
     */
    @Override
    public String genInfo() {
        return super.genInfo() + "\nDegree: " + degree + "\nPrerequisites: " + preReq();
    }
}

