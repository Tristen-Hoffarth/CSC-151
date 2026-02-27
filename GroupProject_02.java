/*
----------------------------
- St. Justice Youngblood
- Christian Davis
- Tristen Hoffarth
- Braden Johnson
- Nolan Pait
----------------------------
- 2/1/26 - 2/26/26
M3_JavaCode_GroupProject_02
----------------------------
*/

import java.io.*;
import javax.swing.JOptionPane;

public class GroupProject_02
{
  public static void main(String[] args)
    {
        boolean running = true;
        while (running)
        {
            // This displays the menu for user interaction
            String menu =
                "Carolina Panthers Information\n" +
                "------------------------------\n" +
                "1. Coaches\n" +
                "2. Players\n" +
                "3. Front Office\n" +
                "4. Medical Staff\n" +
                "5. Add Player\n" +
                "6. Exit\n";

            String choice = JOptionPane.showInputDialog(menu);

            if (choice == null)
            {
             running = false;
            }
            
            else
            {
                choice = choice.trim();
                // Writen by: Tristen Hoffarth - Modified the main method to read from the CSV file instead of hard coded data
                switch (choice)
                {
                    case "1":
                        readCSVByCategory("data.csv", "Coach");
                        break;

                    case "2":
                        readCSVByCategory("data.csv", "Player");
                        break;

                    case "3":
                        readCSVByCategory("data.csv", "Front Office");
                        break;

                    case "4":
                        readCSVByCategory("data.csv", "Medical");
                        break;

                    
                    // Written by: [Christian Davis & Nolan Pait] – This method adds people to the different categories on the list.
                    case "5":
                        String category = JOptionPane.showInputDialog("Enter category (Coach, Player, Front Office, Medical):");
                        String position = JOptionPane.showInputDialog("Enter position:");
                        String name = JOptionPane.showInputDialog("Enter name:");

                        writeCSV("data.csv", category, position, name);

                        JOptionPane.showMessageDialog(null, "Player added!");
                        break;

                    case "6":
                        running = false;
                        JOptionPane.showMessageDialog(null,
                                "Thanks for learning about the Carolina Panthers!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,
                                "Invalid choice. Please enter 1-6.");
                }
            }
        }
    }

    // Written by : Braden Johnson - This method allows the CSV to be read from
   public static void readCSVByCategory(String fileName, String categoryFilter)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName)); // Handles file access and reading
            String line;

            String output = categoryFilter + " List\n"; // Creates the divider at the top of the popup
            output += "-----------------------------------\n";

            br.readLine(); // Skips header
 
            while ((line = br.readLine()) != null) // Checks through each line before stopping when there are no more to be read
            {
                if(line.trim().isEmpty()) continue;
                String[] values = line.split(","); 

                if(values.length >= 3) // Checks for 3 columns before pulling the category, position, and name values
                {
                    String category = values[0].trim();
                    String position = values[1].trim();
                    String name = values[2].trim();

                    if(category.equalsIgnoreCase(categoryFilter)) // Appends a formatted line with the postion and name to the output string
                    {
                        output += "Position: " + position +
                                " | Name: " + name + "\n";
                    }
                }
            }

            br.close(); // Closes the file reader

            // Sends data to the popup window
            JOptionPane.showMessageDialog(null, output);

        }
        
        catch(IOException e) // Handles any errors that may occur, displays error popup and prints trace to console for debugging
        {
            JOptionPane.showMessageDialog(null, "Error reading file.");
            e.printStackTrace();
        }   
    } 
     
    // St. Justice Youngblood - This method writes to the CSV File
    public static void writeCSV(String fileName, String category, String position, String name)
    {
        try
        {  
            FileWriter fw = new FileWriter(fileName, true); // Creates a new file 
            PrintWriter pw = new PrintWriter(fw);
              
            pw.println(category + "," + position + "," + name); // Writes data to the CSV File

            pw.close();
        }
        
        catch (IOException e)
        {
            System.out.println("Error writing file."); 
            e.printStackTrace();
        }
    }
}