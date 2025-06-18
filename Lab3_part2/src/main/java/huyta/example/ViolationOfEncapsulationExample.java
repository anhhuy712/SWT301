package huyta.example;

class User {
    private String name;
    private int age;

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
