import java.util.*;

public class Competition {
    private HashMap<String, List<String>> groups = new LinkedHashMap<>();

    public void addGroupAndMembers(Scanner scanner) {
        System.out.println("enter group name");
        scanner.nextLine();
        String groupName = scanner.nextLine();
        int decision = 1;
        List<String> members = new ArrayList<>();
        do {
            System.out.println("enter member name");
            String memberName = scanner.nextLine();
            members.add(memberName);
            System.out.println("complete adding members - press 0");
            System.out.println("add next member - press other number");
            decision = scanner.nextInt();
            scanner.nextLine();
        } while (decision != 0);
        groups.put(groupName, members);
    }

    public void displayAllGroupsAndMemBers(Scanner scanner) {
        for (Map.Entry<String, List<String>> element : groups.entrySet()) {
            System.out.println("group name: " + element.getKey());
            for (String memberName : element.getValue()) {
                System.out.println("member name: " + memberName);
            }
        }
    }

    public void displayAllMembersFromGroup(Scanner scanner) {
        System.out.println("enter group name");
        scanner.nextLine();
        String groupName = scanner.nextLine();

        for (String memberName : groups.get(groupName)) {
            System.out.println("member from group " + groupName + " name: " + memberName);
        }

    }

    public void addNewMemberToGroup(Scanner scanner) {
        System.out.println("enter new member name");
        scanner.nextLine();
        String memberName = scanner.nextLine();
        System.out.println("enter group name");
        String groupName = scanner.nextLine();

        groups.get(groupName).add(memberName);
    }

    public void deleteMemberFromGroup(Scanner scanner) {
        System.out.println("enter member name");
        scanner.nextLine();
        String memberName = scanner.nextLine();
        System.out.println("enter group name");
        String groupName = scanner.nextLine();

        groups.get(groupName).remove(memberName);

    }
}
