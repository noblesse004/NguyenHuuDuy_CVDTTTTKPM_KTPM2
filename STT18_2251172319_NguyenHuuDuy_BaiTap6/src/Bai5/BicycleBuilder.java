package Bai5;

class BicycleBuilder implements Builder {
    private Bicycle bicycle;

    @Override
    public void reset() {
        bicycle = null;
    }

    public void buildBicycle() {
        bicycle = new Bicycle();
    }

    @Override
    public Vehicle getResult() {
        return bicycle;
    }
}


