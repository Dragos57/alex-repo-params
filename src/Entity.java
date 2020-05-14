import java.util.Random;

public class Entity {
    private Long id;
    private String field1;
    private String field2;


    public Entity(Long id) {
        this.id = id;
        this.field1 = "field " + new Random().nextInt(26);
        this.field2 = "field " + new Random().nextInt(26);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}' + "\n";
    }
}
