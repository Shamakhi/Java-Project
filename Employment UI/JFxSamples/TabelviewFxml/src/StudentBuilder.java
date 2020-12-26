public class StudentBuilder {
    private String name;
    private String lastname;
    private String id;
    private String average;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public StudentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setAverage(String average) {
        this.average = average;
        return this;
    }

    public Student createStudent() {
        return new Student(name, lastname, id, average);
    }
}