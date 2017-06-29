
public class TestPojo {

    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
