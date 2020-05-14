public class Main {
    public static void main(String[] args) {
        EntityService entityService = new EntityService(new EntityRepositoryImpl());
        Params params1 = new Params(true, false);
        Params params2 = new Params(false, true);

        System.out.println(entityService.findEntities(params1));
        System.out.println(entityService.findEntities(params2));
    }
}
