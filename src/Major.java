/**
 * Major Class representing the minimum requirements for majors
 * such as the major name, gpa and total credit hours
 * Concepts used: Object Oriented, Inheritance, Polymorphism
 * @author Jessica Bruce
 */
public class Major {
    private String majorName;
    private double minGPA;
    private int totalHours;

    /**
     * Major Constructor
     * @param majorName
     * @param minGPA
     * @param totalHours
     */
    public Major(String majorName, double minGPA, int totalHours) {
        this.majorName = majorName;
        this.minGPA = minGPA;
        this.totalHours = totalHours;
    }
    public String getMajorName() {
        return majorName;
    }

    /**
     * Method to get the minimum GPA
     * @return minGPA
     */
    public double getMinGPA() {
        return minGPA;
    }

    /**
     * Method to get the total credit hours
     * @return totalHours
     */
    public int getTotalHours() {
        return totalHours;
    }

    /**
     * toString() method to display the instance variables in a string format
     * @return String
     */
    @Override
    public String toString() {
        return "General major information" +
                "\nMajor Name: " + majorName +
                "\nMinimum GPA:" + minGPA +
                "\nTotal Credit Hours: " + totalHours +
                "\n**************************************";
    }
    /**
     * Method to display the instance variables in a string format
     * @return String
     */
    public String genInfo(){
        return "Major General Information" +
                "\nMajor Name: " + majorName +
                "\nMinimum GPA:" + minGPA +
                "\nTotal Credit Hours: " + totalHours +
                "\n------------------------------------";
    }
}
