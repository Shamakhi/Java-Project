public class Student {
    private String name ;
    private String lastname ;
    private String Id ;
    private String average ;

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
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
        Id = id;
        this.average = average;
    }
}
