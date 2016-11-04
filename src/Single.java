import java.util.Date;

public class Single extends CommunityMember{
    private double studyingYears;
    private boolean isLeaveWithParents;

    public Single(double studyingYears, boolean isLeaveWithParents,
                  String id, Gender gender, String name, String address, Date birthday,
                  double weeklyToraStudyingHours, double weeklyWorkHours, double income,
                  Volunteering volunteering) throws Exception {
        super(id, gender, name, address, birthday, weeklyToraStudyingHours,
                weeklyWorkHours, income, volunteering);
        this.studyingYears = studyingYears;
        this.isLeaveWithParents = isLeaveWithParents;
    }

    public double getStudyingYears() {
        return studyingYears;
    }

    public void setStudyingYears(double studyingYears) {
        this.studyingYears = studyingYears;
    }

    public boolean isLeaveWithParents() {
        return isLeaveWithParents;
    }

    public void setLeaveWithParents(boolean leaveWithParents) {
        isLeaveWithParents = leaveWithParents;
    }

    @Override
    public double getTax() {
        return 500;
    }

    @Override
    public double getScholarship() {
        return 0;
    }

    @Override
    public double getRecommendedVolunteeringHours() {
        return 10;
    }
}
