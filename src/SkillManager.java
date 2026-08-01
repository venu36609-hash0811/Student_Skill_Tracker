import java.util.ArrayList;

public class SkillManager {

    ArrayList<Skill> skills = new ArrayList<>();

    // Add Skill
    public void addSkill(Skill skill) {
        skills.add(skill);
    }

  public void viewSkills() {

    if (skills.isEmpty()) {
        System.out.println("No skills added yet.");
        return;
    }

    System.out.println("\n===== SKILL LIST =====");

    for (int i = 0; i < skills.size(); i++) {
        Skill s = skills.get(i);
        System.out.println((i + 1) + ". " + s.name + " - " + s.level);
    }
}

    // Delete Skill
    public void deleteSkill(int index) {

        if (index >= 0 && index < skills.size()) {
            skills.remove(index);
            System.out.println("Skill Deleted Successfully!");
        } else {
            System.out.println("Invalid Skill Number!");
        }
    }

    // Search Skill
    public void searchSkill(String skillName) {

        boolean found = false;

        for (Skill s : skills) {

            if (s.name.equalsIgnoreCase(skillName)) {

                System.out.println("\n===== SKILL FOUND =====");
                System.out.println("Skill Name  : " + s.name);
                System.out.println("Skill Level : " + s.level);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Skill Not Found!");
        }
    }

    // Update Skill
    public void updateSkill(int index, String newName, String newLevel) {

        if (index >= 0 && index < skills.size()) {

            Skill s = skills.get(index);

            s.name = newName;
            s.level = newLevel;

            System.out.println("Skill Updated Successfully!");

        } else {

            System.out.println("Invalid Skill Number!");

        }
    }
}