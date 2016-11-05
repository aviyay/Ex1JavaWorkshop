
 class MemberVolunteeringHoursDTO {
     String memberName;
     double volunteeringHours;
     Volunteering volunteeringType;

     MemberVolunteeringHoursDTO(String memberName, double volunteeringHours, Volunteering volunteeringType) {
        this.memberName = memberName;
        this.volunteeringHours = volunteeringHours;
        this.volunteeringType = volunteeringType;
    }
}
