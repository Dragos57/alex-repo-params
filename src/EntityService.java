import java.util.List;

public class EntityService {
    private EntityRepository repository;

    public EntityService(EntityRepository repository) {
        this.repository = repository;
    }

    public List<Entity> findEntities(Params params) {
        return repository.of(params).findRespectingBusinessCase();
    }
}
