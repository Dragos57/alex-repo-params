public class Params {
    private boolean businessCase1;
    private boolean businessCase2;

    public Params() {
    }

    public Params(boolean businessCase1, boolean businessCase2) {
        this.businessCase1 = businessCase1;
        this.businessCase2 = businessCase2;
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
}
