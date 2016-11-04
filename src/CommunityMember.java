import java.util.Date;

public abstract class CommunityMember implements IRightsAndDuties{
    private String id;
    private Gender gender;
    private String name;
    private String address;
    private Date birthday;
    private double weeklyToraStudyingHours;
    private double weeklyWorkHours;
    private double income;
    private Volunteering volunteering;

    public CommunityMember(String id, Gender gender, String name, String address, Date birthday,
                           double weeklyToraStudyingHours, double weeklyWorkHours, double income,
                           Volunteering volunteering) throws Exception{
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.weeklyToraStudyingHours = weeklyToraStudyingHours;
        this.weeklyWorkHours = weeklyWorkHours;
        this.income = income;
        this.volunteering = volunteering;

        if(getWeeklyWorkHours() + getWeeklyToraStudyingHours() < getHoursInWeek())
            throw new Exception("Member Too lazy!");
    }

    private int getHoursInWeek() {
        final int ACTIVE_DAYS_IN_WEEK = 5;
        final int HOURS_IN_DAY = 24;
        return ACTIVE_DAYS_IN_WEEK * HOURS_IN_DAY;
    }

    public Volunteering getVolunteeringType() {
        return volunteering;
    }

    public void setVolunteering(Volunteering volunteering) {
        this.volunteering = volunteering;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getWeeklyWorkHours() {
        return weeklyWorkHours;
    }

    public void setWeeklyWorkHours(double weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }

    public double getWeeklyToraStudyingHours() {
        return weeklyToraStudyingHours;
    }

    public void setWeeklyToraStudyingHours(double weeklyToraStudyingHours) {
        this.weeklyToraStudyingHours = weeklyToraStudyingHours;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
