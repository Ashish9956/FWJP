package Day8;

import java.util.*;

public class MusicPlayer {
    public static void main(String[] args) {
        Album al = new Album();
        al.addsongs();
        al.listofsong();
    }
}

class Album {
    String Arijit[] = {"Tum Hi Ho"};
    Scanner sc = new Scanner(System.in);

    // Method to check if the song is already in the array
    public boolean checksongpresent(String Arijit[], String sname) {
        for (int i = 0; i < Arijit.length; i++) {
            if (Arijit[i].equalsIgnoreCase(sname)) {
                return true;
            }
        }
        return false;
    }

    
    public void listofsong() {
    	System.out.println("Arijit singh song list");
    	 for (int i = 0; i < Arijit.length; i++) {
    			System.out.println("song "+(i+1)+" "+Arijit[i]);
         }
    }
    // Method to add songs to the album
    
    public void addsongs() {
        System.out.println("Provide the number of songs you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character after nextInt()

        String songs[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Give song no. " + (i + 1));
            songs[i] = sc.nextLine();
        }

        System.out.println("Please wait, adding songs...");

        for (int i = 0; i < n; i++) {
            if (!checksongpresent(Arijit, songs[i])) {
                Arijit = Arrays.copyOf(Arijit, Arijit.length + 1);
                Arijit[Arijit.length - 1] = songs[i];
                System.out.println("Song no. " + (i + 1) + " added successfully.");
            } else {
                System.out.println("Song no. " + (i + 1) + " already exists.");
            }
        }

        System.out.println("Songs completely added!");
        
    }
}
