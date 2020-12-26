public class Student {
    private String name ;
    private String lastname;
    private String id;
    private String average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public Student(String name, String lastname, String id, String average) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.average = average;
    }
}
