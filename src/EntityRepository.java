import java.util.ArrayList;
import java.util.List;

public interface EntityRepository {
    Params params = new Params();

    default Entity findById(Long id) {
        return new Entity(id);
    }

    //@Query("bla bla")
    default List<Entity> findAllRespectingBusinessCase1() {
        return new ArrayList<Entity>() {{
            add(new Entity(1L));
            add(new Entity(2L));
            add(new Entity(3L));
            add(new Entity(4L));
        }};
    }

    //@Query("bla bla")
    default List<Entity> findAllRespectingBusinessCase2() {
        return new ArrayList<Entity>() {{
            add(new Entity(5L));
            add(new Entity(6L));
            add(new Entity(7L));
        }};
    }

    default List<Entity> findRespectingBusinessCase() {
        return params.isBusinessCase1() ? findAllRespectingBusinessCase1() : findAllRespectingBusinessCase2();
    }

    default EntityRepository of(Params parameters) {
        params.setBusinessCase1(parameters.isBusinessCase1());
        params.setBusinessCase2(parameters.isBusinessCase2());
        return this;
    }
}
