import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {

        String answer;
        char result;
        int computerWins=0, playerWins=0, draws=0, numberOfGames=0;

        answer = JOptionPane.showInputDialog("Would you like to play a game roll dice? : (y or n)");

        while (answer.equals("y"))
        {
            result = rollDice();

            numberOfGames++;

            if(result == 'c')
                computerWins++;
            else if(result == 'p')
                playerWins++;
            else
                draws++;

            JOptionPane.showMessageDialog(null,"Games played: " + numberOfGames +
                                                                     "\nComputer wins: " + computerWins +
                                                                     "\nPlayer wins: " + playerWins +
                                                                     "\nDraws: " + draws,"Game Info",JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showInputDialog("Play another game ? : (y or n)");
        }
        JOptionPane.showMessageDialog(null,"Thanks for the game","See Ya!!",JOptionPane.INFORMATION_MESSAGE);
    }
    public static char rollDice()
    {
        int comRoll, playerRoll;

        comRoll = (int)(Math.random() * 11) + 2;
        JOptionPane.showMessageDialog(null,"The computer roll value " + comRoll + "\n ...hit return to see player roll","Com Roll",JOptionPane.INFORMATION_MESSAGE);

        playerRoll = (int)(Math.random() * 11) + 2;
        JOptionPane.showMessageDialog(null,"The player roll value " + playerRoll,"Player Roll",JOptionPane.INFORMATION_MESSAGE);

        if(comRoll > playerRoll)
            return 'c';
        else if(playerRoll > comRoll)
            return 'p';
        else
            return 'd';
    }
}
