import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private boolean active;
    private long[] attendance;

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
        this.attendance[this.attendance.length] = new Date().getTime();
    }

    public void listAttendances() {
        System.out.println("==== " + this.name + "Attendance ===");
        for (int i = 0; i < this.attendance.length; i++) {
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name: " + this.name;
    }
}
