 abstract class CommunityMember implements IRightsAndDuties{
    private String id;
    private Gender gender;
    private String name;
    private String address;
    private String birthday;
    private double weeklyToraStudyingHours;
    private double weeklyWorkHours;
    private double income;
    private Volunteering volunteering;

     CommunityMember() {
    }

     CommunityMember(String id, Gender gender, String name, String address, String birthday,
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

     Volunteering getVolunteeringType() {
        return volunteering;
    }

     void setVolunteering(Volunteering volunteering) {
        this.volunteering = volunteering;
    }

     double getIncome() {
        return income;
    }

     void setIncome(double income) {
        this.income = income;
    }

     double getWeeklyWorkHours() {
        return weeklyWorkHours;
    }

     void setWeeklyWorkHours(double weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }

     double getWeeklyToraStudyingHours() {
        return weeklyToraStudyingHours;
    }

     void setWeeklyToraStudyingHours(double weeklyToraStudyingHours) {
        this.weeklyToraStudyingHours = weeklyToraStudyingHours;
    }

     String getBirthday() {
        return birthday;
    }

     void setBirthday(String birthday) {
        this.birthday = birthday;
    }

     String getAddress() {
        return address;
    }

     void setAddress(String address) {
        this.address = address;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     Gender getGender() {
        return gender;
    }

     void setGender(Gender gender) {
        this.gender = gender;
    }

     String getId() {
        return id;
    }

     void setId(String id) {
        this.id = id;
    }
}
