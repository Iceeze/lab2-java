public class Human {
    private Human father;
    private Name name;
    private int height;

    public Human(Human father, Name name, int height) {
        this.father = father;
        this.name = name;
        this.height = height;
    }

    public Human (Name name, int height) {
        this(null, name, height);
    }

    public String toString() {
        if (father != null) {
            if (name.getLastName() == null && father.name.getLastName() != null) {
                name.setLastName(father.name.getLastName());
            }
            if (name.getMiddleName() == null) {
                name.setMiddleName(father.name.getFirstName() + "ович");
            }
        }
        return name + ", рост: " + height;
    }
}
