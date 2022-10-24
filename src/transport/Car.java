package transport;

import java.time.LocalDate;

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
    private Key key;
    private Insurance insurance;


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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Car(String stamp, String model, double engineCapacity, String bodyColor, int yearOfManufacture, String countryOfAssembly, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, boolean summerTyres, Key key, Insurance insurance) {
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

        this.transmission = "МКПП";
        this.bodyType = "default";
        this.registrationNumber = "х000хх000";
        this.numberOfSeats = 5;
        this.summerTyres = true;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;

        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }


    public void changeTires() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegistrationNumber() {
        // x000xx000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;

        }

        return true;
    }


    public static class Key {
        private final boolean remoteLaunch;
        private final boolean keylessAccess;


        public Key(boolean remoteLaunch, boolean keylessAccess) {

            this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;

        }

        public Key() {
            this(false, false);

        }

        public boolean isRemoteLaunch() {

            return remoteLaunch;
        }

        public boolean isKeylessAccess() {

            return keylessAccess;
        }

    }

    public static class Insurance {
        private LocalDate validityPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }

        }

        public Insurance() {
            this(null, 10_000D, null);

        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public void setValidityPeriod(LocalDate validityPeriod) {
            this.validityPeriod = validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidityPeriod() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                System.out.println(" Нужно срочно оформлять страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println(" Номер страховки не корректный!");
            }

        }
    }
}









