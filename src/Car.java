public class Car {
    String stamp;
    String model;
    double engineCapacity;   // объем движка
    String bodyColor;     //цвет
    int yearOfManufacture;   //  год выпуска
    String countryOfAssembly;   // стр сборки

    @Override
    public String toString() {
        return "Марка автомобиля : " + this.stamp + ", модель : " + this.model +
                ", объем двигателя : " + this.engineCapacity + " литров, " +
                " цвет кузова : " + this.bodyColor +
                " , год производства : " + this.yearOfManufacture +
                " , страна сборки : " + this.countryOfAssembly;
    }

    public Car(String stamp, String model, double engineCapacity, String bodyColor, int yearOfManufacture, String countryOfAssembly) {
        if (stamp == null) {
            this.stamp = "default";
        } else {
            this.stamp = stamp;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineCapacity == 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
        if (bodyColor == null) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
        if (yearOfManufacture == 0) {
            this.yearOfManufacture = 2020;
        } else {
            this.yearOfManufacture = yearOfManufacture;
        }
        if (countryOfAssembly == null) {
            this.countryOfAssembly = "default";
        } else {
            this.countryOfAssembly = countryOfAssembly;
        }

    }
}
