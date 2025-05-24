package Bai5;

class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructCar() {
        builder.reset();
        if (builder instanceof CarBuilder) {
            ((CarBuilder) builder).buildCar();
        }
    }

    public void constructBicycle() {
        builder.reset();
        if (builder instanceof BicycleBuilder) {
            ((BicycleBuilder) builder).buildBicycle();
        }
    }
    public Builder getBuilder() {
        return builder;
    }
}
