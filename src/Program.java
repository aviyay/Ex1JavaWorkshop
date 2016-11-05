import java.util.*;

 class Program {
     static void main(String[] args) {
        Community community = new Community();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        addMembers(community);

        do {
            System.out.println("Choose action:");
            System.out.println("0 - Exit");
            System.out.println("1 - Calculate total tax");
            System.out.println("2 - List all the members' names");
            System.out.println("3 - Request scholarship");
            System.out.println("4 - Print all members and their volunteering hours");

            try {
                switch (scanner.nextInt()) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        System.out.println("Total tax is " + community.calcuateTotalTax());
                        break;
                    case 2:
                        for (CommunityMember member : community.getCommunityMembers()) {
                            System.out.println(member.getName());
                        }
                        break;
                    case 3:
                        scanner.nextLine();
                        System.out.print("Enter member's name: ");
                        System.out.println("Approved scholarship: " +
                                community.requestScholarhipFor(scanner.nextLine()));
                        break;
                    case 4:
                        for (MemberVolunteeringHoursDTO i : community.getMembersVolunteeringHoursSortedByType())
                            System.out.println(i.memberName + ": " + i.volunteeringHours + ", Type: " + i.volunteeringType);
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!exit);
    }

    private static void addMembers(Community community) {
        List<String> names = Arrays.asList("Shilo", "Shy", "Oshrit", "Aviya", "Ezra", "Ori", "Shoshana", "Yakir");

        for (int i = 0; i < names.size(); ++i) {
            CommunityMember member;

            if (i % 2 == 1) {
                Single temp = new Single(i, false);
                temp.setLiveWithParents(false);
                temp.setStudyingYears(i);
                member = temp;
            } else {
                Married temp = new Married();
                temp.setPartnerId((i + (i % 4 == 0 ? 2 : -2)) + "123456789");
                temp.setNumberOfChildrenUnderage(i);
                member = temp;
            }

            member.setName(names.get(i));
            member.setAddress("Baker St. 221, London");
            member.setBirthday(i + "/10/1998");
            member.setGender(i % 2 == 0 ? Gender.MALE : Gender.FEMALE);
            member.setId(i + "123456789");
            member.setIncome(150 * i);

            switch (i % 3) {
                case 0:
                    member.setVolunteering(Volunteering.PHYSICAL);
                    break;
                case 1:
                    member.setVolunteering(Volunteering.MUSICAL);
                    break;
                case 2:
                    member.setVolunteering(Volunteering.SPIRITUAL);
                    break;
            }

            member.setWeeklyToraStudyingHours(5 * 8 + i);
            member.setWeeklyWorkHours(5 * 8 - i);

            community.addCommunityMember(member);
        }
    }
}
