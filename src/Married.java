import java.util.Date;

public class Married extends CommunityMember {
    private String partnerId;
    private int numberOfChildrenUnderage;

    public Married(String partnerId, int numberOfChildrenUnderage,
                   String id, Gender gender, String name, String address, Date birthday,
                   double weeklyToraStudyingHours, double weeklyWorkHours, double income,
                   Volunteering volunteering) throws Exception {
        super(id, gender, name, address, birthday, weeklyToraStudyingHours,
                weeklyWorkHours, income, volunteering);
        this.partnerId = partnerId;
        this.numberOfChildrenUnderage = numberOfChildrenUnderage;
    }

    public int getNumberOfChildrenUnderage() {
        return numberOfChildrenUnderage;
    }

    public void setNumberOfChildrenUnderage(int numberOfChildrenUnderage) {
        this.numberOfChildrenUnderage = numberOfChildrenUnderage;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
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
