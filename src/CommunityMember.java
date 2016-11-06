abstract class CommunityMember implements IRightsAndDuties {
    private String id;
    private Gender gender;
    private String name;
    private String address;
    private String birthday;
    private double weeklyToraStudyingHours;
    private double weeklyWorkHours;
    private double income;
    private Volunteering volunteering;


    CommunityMember(String id, Gender gender, String name, String address, String birthday,
                    double weeklyToraStudyingHours, double weeklyWorkHours, double income,
                    Volunteering volunteering) throws Exception {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.weeklyToraStudyingHours = weeklyToraStudyingHours;
        this.weeklyWorkHours = weeklyWorkHours;
        this.income = income;
        this.volunteering = volunteering;

        enforceLaziness();
    }

    public CommunityMember(double weeklyToraStudyingHours, double weeklyWorkHours) throws Exception {
        this.weeklyToraStudyingHours = weeklyToraStudyingHours;
        this.weeklyWorkHours = weeklyWorkHours;

        enforceLaziness();
    }

    private void enforceLaziness() throws Exception {
        if (getWeeklyWorkHours() + getWeeklyToraStudyingHours() < 2/3*getHoursInWeek())
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(getName());

        result.append(", ID:" + getId());
        result.append("\n");

        result.append("Gender: " + getGender());
        result.append(", Birthday:" + getBirthday());
        result.append("\n");
        result.append("Address: " + getAddress());
        result.append("\n");
        result.append("Income: " + getIncome());
        result.append(", Tora hours: " + getWeeklyToraStudyingHours());
        result.append(", Work hours: " + getWeeklyWorkHours());
        result.append("\n");
        result.append("Volunteering Type: " + getVolunteeringType());
        result.append(", Recommended hours:" + getRecommendedVolunteeringHours());
        result.append("\n");

        return result.toString();
    }
}
