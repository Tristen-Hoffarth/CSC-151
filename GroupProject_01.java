/*
- St. Justice Youngblood
- Christian Davis
- Tristen Hoffarth
- Braden Johnson
- Nolan Pait
- 2/1/26 - 2/8/26
M2_JavaCode_GroupProject_01

Nolan's Individual Contribution:
Athletic Trainers and Medical Staff section
*/

import javax.swing.JOptionPane;

public class GroupProject_01 {

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            String menu =
            "Carolina Panthers Information\n" +
            "------------------------------\n" +
            "1. Coaches\n" +
            "2. Players\n" +
            "3. Support Staff\n" +
            "4. Athletic Trainers and Medical Staff\n" +
            "5. Exit\n";

            String choice = JOptionPane.showInputDialog(menu);

            if (choice == null) {
                running = false;
            } else {

                choice = choice.trim();

                switch (choice) {

                    case "1":
                        Coaches.showCoaches();
                        break;

                    case "2":
                        Players.showPlayers();
                        break;

                    case "3":
                        FrontOffice.showFrontOffice();
                        break;

                    case "4":
                        MedicalStaff.showMedicalStaff();
                        break;

                    case "5":
                        running = false;
                        JOptionPane.showMessageDialog(null,
                                "Thanks for learning about the Carolina Panthers!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,
                                "Invalid choice. Please enter 1 to 5.");
                }
            }
        }
    }


    public static class Coaches {

        static void showCoaches() {

            String coachesMenu =
                "Carolina Panthers Coaches\n" +
                "--------------------------\n" +
                "Head Coach: Dave Canales\n" +
                "Offensive Coordinator: Brad Idzik\n" +
                "Secondary Coach: Renaldo Hill\n" +
                "Defensive Line: Todd Wash\n" +
                "Running Backs: Bernie Parmalee\n" +
                "Senior Defensive Assistant:\n" +
                "Defensive Coordinator: Ejiro Evero\n";

            JOptionPane.showMessageDialog(null, coachesMenu,
                    "Coaches", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static class Players {

        static void showPlayers() {

            String playersMenu =
                "Key Carolina Panthers Players\n" +
                "------------------------------\n" +
                "Quarterback: Bryce Young\n" +
                "Quarterback: Andy Dalton\n" +
                "Wide Receiver: Brycen Tremayne\n" +
                "Wide Receiver: David Moore\n" +
                "Wide Receiver: Tetairoa McMillan\n" +
                "Wide Receiver: Xavier Legette\n" +
                "Wide Receiver: Jimmy Horn Jr.\n" +
                "Wide Receiver: Jalen Coker\n" +
                "Tight End: Tommy Tremble\n" +
                "Tight End: James Mitchell\n" +
                "Tight End: Mitchell Evans\n" +
                "Defensive Tackle: Derrick Brown\n" +
                "Defensive Tackle: Bobby Brown III\n" +
                "Defensive Tackle: Cam Jackson\n";

            JOptionPane.showMessageDialog(null, playersMenu,
                    "Players", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static class FrontOffice {

        static void showFrontOffice() {

            String staffMenu =
                "Carolina Panthers Front Office\n" +
                "-------------------------------\n" +
                "Chairman: David A. Tepper\n" +
                "Chief Executive Officer: Kristi Coleman\n" +
                "Chief Administrative Officer: Nicole Tepper\n" +
                "President of Football Operations / General Manager: Dan Morgan\n";

            JOptionPane.showMessageDialog(null, staffMenu,
                    "Support Staff", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    // Nolan's Section
    public static class MedicalStaff {

        static void showMedicalStaff() {

            String medicalMenu =
                "Carolina Panthers Athletic Trainers and Medical Staff\n" +
                "------------------------------------------------------\n" +
                "Head Athletic Trainer: Kevin King\n" +
                "Assistant Athletic Trainer: Melissa Carter\n" +
                "Team Physician: Dr. James Thompson\n" +
                "Orthopedic Specialist: Dr. Ryan Mitchell\n" +
                "Strength and Conditioning Coach: Mark Davis\n" +
                "Physical Therapist: Sarah Collins\n" +
                "Sports Nutritionist: Emily Roberts\n";

            JOptionPane.showMessageDialog(null, medicalMenu,
                    "Medical Staff", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
