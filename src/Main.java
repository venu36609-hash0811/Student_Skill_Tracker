import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SkillManager manager = new SkillManager();

        while (true) {

            System.out.println("\n===== STUDENT SKILL TRACKER =====");
            System.out.println("1. Add Skill");
            System.out.println("2. View Skills");
            System.out.println("3. Delete Skill");
            System.out.println("4. Search Skill");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:

                    Skill skill = new Skill();

                    System.out.print("Enter Skill Name : ");
                    skill.name = sc.nextLine();

                    System.out.print("Enter Skill Level : ");
                    skill.level = sc.nextLine();

                    manager.addSkill(skill);

                    System.out.println("Skill Added Successfully!");
                    break;

                case 2:

                    manager.viewSkills();
                    break;

                case 3:

                    manager.viewSkills();

                    System.out.print("Enter Skill Number to Delete : ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    manager.deleteSkill(num - 1);
                    break;

                case 4:

                    System.out.print("Enter Skill Name to Search : ");
                    String search = sc.nextLine();

                    manager.searchSkill(search);
                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}