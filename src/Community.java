import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

 class Community {
    private ArrayList<CommunityMember> communityMembers;
    private double fund;

     Community() {
        communityMembers = new ArrayList<>();
        fund = 0;
    }

     void addCommunityMember(CommunityMember communityMember) {
        communityMembers.add(communityMember);
    }

     double calcuateTotalTax() {
        double result = 0;

        for (CommunityMember member : communityMembers) {
            result += member.getTax();
        }

        return result;
    }

     double requestScholarhipFor(String memberName) throws Exception {
        List<CommunityMember> chosenMember = communityMembers.stream().
                filter(member -> memberName.equals(member.getName()))
                .collect(Collectors.toList());

        if (chosenMember.size() == 0)
            throw new Exception("Member doesn't exist");

        return chosenMember.get(0).getScholarship();
    }

     ArrayList<MemberVolunteeringHoursDTO> getMembersVolunteeringHoursSortedByType() {
        ArrayList<MemberVolunteeringHoursDTO> result = communityMembers.stream()
                .map(member -> new MemberVolunteeringHoursDTO(member.getName(),
                        member.getRecommendedVolunteeringHours(),
                        member.getVolunteeringType()))
                .collect(Collectors.toCollection(ArrayList::new));

        result.sort((member1, member2) ->
                member1.volunteeringType.compareTo(member2.volunteeringType)
        );

        return result;
    }

     ArrayList<CommunityMember> getCommunityMembers() {
        return communityMembers;
    }
}
