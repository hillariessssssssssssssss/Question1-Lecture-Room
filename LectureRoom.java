
package vu.examqn1;

/**
 *
 * @author HILARY UGO453
 */
public class LectureRoom {
    private int students;
    private final boolean[] lights; // create an array 

    public LectureRoom() {
        students = 0;
        lights = new boolean[3];
    }

    public void addStudents(int number) {
        students += number;
    }

    public void removeStudents(int number) {
        students = Math.max(0, students - number);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
        }
    }

    public int getStudents() {
        return students;
    }

    public boolean isLightOn(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            return lights[lightNumber - 1];
        }
        return false;
    }
}
