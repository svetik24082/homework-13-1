package transport;

public class Car {
    private final String stamp;
    private final String model;
    private double engineCapacity;   // объем движка
    private String bodyColor;     //цвет
    private final int yearOfManufacture;   //  год выпуска
    private final String countryOfAssembly;   // стр сборки
    private String transmission;  // кор перед
    private final String bodyType;  //тип кузова
    private String registrationNumber;     // рег. номер
    private final int numberOfSeats;   // кол.мест
    private boolean summerTyres;


    public String getStamp() {

        return stamp;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {

        return yearOfManufacture;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getTransmission() {

        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;

        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Car(String stamp, String model, double engineCapacity, String bodyColor, int yearOfManufacture, String countryOfAssembly, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, boolean summerTyres) {
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
        //if (transmission == null) {
        this.transmission = "МКПП";
        //} else {
        //this.transmission = transmission;

        //if (bodyType == null) {
        this.bodyType = "default";
        //} else {
        // this.bodyType = bodyType;

        //if (registrationNumber == null) {
        this.registrationNumber = "х000хх000";
        //} else {
        //this.registrationNumber = registrationNumber;

        //if (numberOfSeats <= 0) {
        this.numberOfSeats = 5;
        //} else {
        //this.numberOfSeats = numberOfSeats;

        //if (summerTyres == false) {
        this.summerTyres = true;
        //} else {
        //this.summerTyres = true;


    }

    public void changeTires() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegistrationNumber() {
        // x000xx000
        if ( registrationNumber.length() !=9) {
            return false;
        }
            char[]chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])||!Character.isAlphabetic(chars[5]) ) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
        !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;

        }

        return true;
    }
}

