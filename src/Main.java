//this program make decision about avarage score and make use of JOptionPane to implement input dialog and message Dialog

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        System.out.println("Decision structure programming");

        double score1;
        double score2;
        double score3;
        double averageScore;
        String scoreTotal;

        scoreTotal = JOptionPane.showInputDialog("Enter your first score ");
        score1 = Double.parseDouble(scoreTotal);

        //Get second score

        scoreTotal = JOptionPane.showInputDialog("Enter your second score");
        score2 = Double.parseDouble(scoreTotal);

        //Get third score

        scoreTotal = JOptionPane.showInputDialog("Enter your third score");
        score3 = Double.parseDouble(scoreTotal);

        averageScore = (score1 + score2 + score3) /3.0;
        JOptionPane.showMessageDialog(null, "Your average score is " + averageScore);

        //making decision to determine if average score is greater than or equal to 96

        if (averageScore > 96) {
            JOptionPane.showMessageDialog(null, "Your average score of " + " " + averageScore +
                    " is greater than or equal to 96\n " + " " + "Well done");
        }
        System.exit(0);
    }
}
