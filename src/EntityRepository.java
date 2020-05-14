import java.util.ArrayList;
import java.util.List;

public interface EntityRepository {
    Params params = new Params();

    default Entity findById(Long id) {
        return new Entity(id);
    }

    //@Query("bla bla")
    default List<Entity> findAllRespectingBusinessCase1(String input) {
        return new ArrayList<Entity>() {{
            add(new Entity(1L));
            add(new Entity(2L));
            add(new Entity(3L));
            add(new Entity(4L));
        }};
    }

    //@Query("bla bla")
    default List<Entity> findAllRespectingBusinessCase2(String input) {
        return new ArrayList<Entity>() {{
            add(new Entity(9L));
            add(new Entity(10L));
            add(new Entity(11L));
            add(new Entity(12L));
        }};
    }

    //@Query("bla bla")
    default void saveAllRespectingBusinessCase1() {
        //mock save
        ArrayList<Entity> entities = new ArrayList<Entity>() {{
            add(new Entity(5L));
            add(new Entity(6L));
            add(new Entity(7L));
        }};
        System.out.println(entities);
    }

    //@Query("bla bla")
    default void saveAllRespectingBusinessCase2() {
        //mock save
        ArrayList<Entity> entities = new ArrayList<Entity>() {{
            add(new Entity(13L));
            add(new Entity(14L));
            add(new Entity(15L));
            add(new Entity(16L));
            add(new Entity(17L));
            add(new Entity(18L));
        }};
        System.out.println(entities);
    }

    default List<Entity> findRespectingBusinessCase(String input) {
        return (List<Entity>) params.getFunction().apply(input);
    }


    default void saveRespectingBusinessCase() {
        params.getConsumer().accept(this);
    }

    default EntityRepository of(Params parameters) {
        params.setBusinessCase1(parameters.isBusinessCase1());
        params.setBusinessCase2(parameters.isBusinessCase2());
        params.setInputText(parameters.getInputText());
        params.setConsumer1(parameters.getConsumer1());
        params.setConsumer2(parameters.getConsumer2());
        params.setFunction1(parameters.getFunction1());
        params.setFunction2(parameters.getFunction2());
        params.setBiConsumer1(parameters.getBiConsumer1());
        params.setBiConsumer2(parameters.getBiConsumer2());
        params.setBiFunction1(parameters.getBiFunction1());
        params.setBiFunction2(parameters.getBiFunction2());
        return this;
    }
}
