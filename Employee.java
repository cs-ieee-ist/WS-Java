import java.util.Date;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private boolean active;
    private ArrayList<Date> attendance = new ArrayList<>();

    Employee(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void addAttendance() {
        this.attendance.add(new Date());
    }

    public void listAttendances() {
        System.out.println("==== " + this.name + "'s Attendance ===");
        for (int i = 0; i < this.attendance.size(); i++) {
            System.out.println(this.attendance.get(i));
        }
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name: " + this.name;
    }
}
