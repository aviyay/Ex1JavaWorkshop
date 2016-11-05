class Married extends CommunityMember {
    private String partnerId;
    private int numberOfChildrenUnderage;

     Married(String partnerId, int numberOfChildrenUnderage,
                   String id, Gender gender, String name, String address, String birthday,
                   double weeklyToraStudyingHours, double weeklyWorkHours, double income,
                   Volunteering volunteering) throws Exception {
        super(id, gender, name, address, birthday, weeklyToraStudyingHours,
                weeklyWorkHours, income, volunteering);
        this.partnerId = partnerId;
        this.numberOfChildrenUnderage = numberOfChildrenUnderage;
    }

    Married() {

    }

     int getNumberOfChildrenUnderage() {
        return numberOfChildrenUnderage;
    }

     void setNumberOfChildrenUnderage(int numberOfChildrenUnderage) {
        this.numberOfChildrenUnderage = numberOfChildrenUnderage;
    }

     String getPartnerId() {
        return partnerId;
    }

     void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    @Override
    public double getTax() {
        return 800;
    }

    @Override
    public double getScholarship() {
        return getNumberOfChildrenUnderage()*150;
    }

    @Override
    public double getRecommendedVolunteeringHours() {
        return 4;
    }
}
