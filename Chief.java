enum Position {
    CEO,
    CTO,
    CFO
}

public class Chief extends Employee {

    Position position;
    
    Chief(String name, Position position) {
        super(name);
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chief: " + position;
    }
}
