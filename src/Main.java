public class Main {
    public static void main(String[] args) {
        EntityRepositoryImpl repoImpl = new EntityRepositoryImpl();
        EntityService entityService = new EntityService(repoImpl);
        Params params = new Params(true, false,"input text blabla");

        params.setFunction1(input -> repoImpl.findAllRespectingBusinessCase1(params.getInputText()));
        params.setFunction2(input -> repoImpl.findAllRespectingBusinessCase2(params.getInputText()));
        params.setConsumer1(e -> repoImpl.saveAllRespectingBusinessCase1());
        params.setConsumer2(e -> repoImpl.saveAllRespectingBusinessCase2());

        System.out.println(entityService.findEntities(params));
        entityService.saveEntities(params);

        System.out.println("\n------------BUSINESS CHANGED------------\n");

        params.setBusinessCase1(false);
        params.setBusinessCase2(true);
        params.setInputText("other input text bla");

        System.out.println(entityService.findEntities(params));
        entityService.saveEntities(params);
    }
}
