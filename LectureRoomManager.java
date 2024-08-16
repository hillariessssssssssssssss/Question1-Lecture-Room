/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.examqn1;

/**
 *
 * @author HILARY UGO453
 */
public class LectureRoomManager {
    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        EasyReader reader = new EasyReader();
        boolean running = true;

        while (running) {
            System.out.println("Main Menu:");
            System.out.println("W - Add students");
            System.out.println("X - Remove students");
            System.out.println("Y - Turn on light");
            System.out.println("Z - Turn off light");
            System.out.println("Q - Quit");
            System.out.print("Enter your choice: ");
            String choice = reader.readString().toUpperCase();

            switch (choice) {
                case "W" -> {
                    System.out.print("Enter number of students to add: ");
                    int addStudents = reader.readInt();
                    room.addStudents(addStudents);
                    System.out.println("Added " + addStudents + " students. Total students: " + room.getStudents());
                }
                case "X" -> {
                    System.out.print("Enter number of students to remove: ");
                    int removeStudents = reader.readInt();
                    room.removeStudents(removeStudents);
                    System.out.println("Removed " + removeStudents + " students. Total students: " + room.getStudents());
                }
                case "Y" -> {
                    System.out.print("Enter light number to turn on (1-3): ");
                    int lightOn = reader.readInt();
                    room.turnOnLight(lightOn);
                    System.out.println("Turned on light " + lightOn + ". Light status: " + room.isLightOn(lightOn));
                }
                case "Z" -> {
                    System.out.print("Enter light number to turn off (1-3): ");
                    int lightOff = reader.readInt();
                    room.turnOffLight(lightOff);
                    System.out.println("Turned off light " + lightOff + ". Light status: " + room.isLightOn(lightOff));
                }
                case "Q" -> {
                    running = false;
                    System.out.println("Quitting program.");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



