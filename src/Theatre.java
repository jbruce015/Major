public class Theatre extends Major {

    private boolean additionalReq;
    /**
     * Major Constructor
     *
     * @param majorName
     * @param minGPA
     * @param totalHours
     * @param additionalReq
     */
    public Theatre(String majorName, double minGPA, int totalHours, boolean additionalReq) {
        super(majorName, minGPA, totalHours);
        this.additionalReq = additionalReq;
    }

    /**
     * Additional Requirements method that
     * returns a string if the boolean condition is met
     * @return addReq
     */
    public String getAdditionalReq() {
        String addReq = "";
        if (additionalReq == true) {
            addReq = " Audition required";
        } else {
            addReq = "Audition not required";
        }
        return addReq;
    }

    /**
     * String method to display information
     * @return String
     */
    @Override
    public String genInfo() {
        return super.genInfo() +
                "\nAdditional Requirements :" + getAdditionalReq();
    }
}
