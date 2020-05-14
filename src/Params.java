import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Params {
    private boolean businessCase1;
    private boolean businessCase2;
    private String inputText;

    private Consumer consumer1;
    private Consumer consumer2;
    private Function function1;
    private Function function2;
    private BiConsumer biConsumer1;
    private BiConsumer biConsumer2;
    private BiFunction biFunction1;
    private BiFunction biFunction2;

    public Params() {
    }

    public Params(boolean businessCase1, boolean businessCase2, String inputText) {
        this.businessCase1 = businessCase1;
        this.businessCase2 = businessCase2;
        this.inputText = inputText;
    }

    public boolean isBusinessCase1() {
        return businessCase1;
    }

    public void setBusinessCase1(boolean businessCase1) {
        this.businessCase1 = businessCase1;
    }

    public boolean isBusinessCase2() {
        return businessCase2;
    }

    public void setBusinessCase2(boolean businessCase2) {
        this.businessCase2 = businessCase2;
    }

    public Consumer getConsumer() {
        //return corresponding consumer after applying business logic
        return businessCase1 ? consumer1 : consumer2;
    }

    public Function getFunction() {
        //return corresponding function after applying business logic
        return businessCase1 ? function1 : function2;
    }

    public BiConsumer getBiConsumer() {
        //return corresponding biconsumer after applying business logic
        return businessCase1 ? biConsumer1 : biConsumer2;
    }

    public BiFunction getBiFunction() {
        //return corresponding bifunction after applying business logic
        return businessCase1 ? biFunction1 : biFunction2;
    }

    public void setConsumer1(Consumer consumer1) {
        this.consumer1 = consumer1;
    }

    public void setConsumer2(Consumer consumer2) {
        this.consumer2 = consumer2;
    }

    public void setFunction1(Function function1) {
        this.function1 = function1;
    }

    public void setFunction2(Function function2) {
        this.function2 = function2;
    }

    public void setBiConsumer1(BiConsumer biConsumer1) {
        this.biConsumer1 = biConsumer1;
    }

    public void setBiConsumer2(BiConsumer biConsumer2) {
        this.biConsumer2 = biConsumer2;
    }

    public void setBiFunction1(BiFunction biFunction1) {
        this.biFunction1 = biFunction1;
    }

    public void setBiFunction2(BiFunction biFunction2) {
        this.biFunction2 = biFunction2;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public Consumer getConsumer1() {
        return consumer1;
    }

    public Consumer getConsumer2() {
        return consumer2;
    }

    public Function getFunction1() {
        return function1;
    }

    public Function getFunction2() {
        return function2;
    }

    public BiConsumer getBiConsumer1() {
        return biConsumer1;
    }

    public BiConsumer getBiConsumer2() {
        return biConsumer2;
    }

    public BiFunction getBiFunction1() {
        return biFunction1;
    }

    public BiFunction getBiFunction2() {
        return biFunction2;
    }
}
