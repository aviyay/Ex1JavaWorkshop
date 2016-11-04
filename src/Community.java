import java.util.ArrayList;

public class Community {
    ArrayList<CommunityMember> communityMembers;
    double fund;

    public Community() {
        communityMembers = new ArrayList<>();
        fund = 0;
    }

    public void addCommunityMember(CommunityMember communityMember) {
        communityMembers.add(communityMember);
    }

    public double calcuateTotalTax() {
        double result = 0;

        for (CommunityMember member : communityMembers) {
            result += member.getTax();
        }

        return result;
    }

    public double requestScholarhipFor(CommunityMember member) {
        return member.getScholarship();
    }

    public ArrayList<Double> getMembersVolunteeringHoursSortedByType() {
        ArrayList<CommunityMember> sortedMembers = (ArrayList<CommunityMember>) communityMembers.clone();
        sortedMembers.sort((member1, member2) ->
                member1.getVolunteeringType().compareTo(member2.getVolunteeringType())
        );

        ArrayList<Double> result = new ArrayList<>();

        for (CommunityMember member :
                sortedMembers) {
            result.add((member.getRecommendedVolunteeringHours()));
        }
        return result;
    }
}
