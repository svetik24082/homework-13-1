import transport.Car;

public class Main {
    public static void main(String[] args) {


        Car car = new Car(null, null, 0, null, 0, null, null, null, "ха00хх000 ", 5, true, null, null);
        Car car1 = new Car(" Audi ", " A8 50 L TDI quattro ", 3.0, " черный ", 2020, " Германия ", " АКПП", null, "х000хх000", 3, false, new Car.Key(), new Car.Insurance());
        Car car2 = new Car(" BMW ", " Z8 ", 3.0, " черный ", 2021, " Германия ", "МКПП", null, "х230хх000", 0, false, new Car.Key(), new Car.Insurance());
        Car car3 = new Car(" Kia ", " Sportage 4-го поколения ", 2.4, " красный ", 2018, " Южная Корея", "АКПП", null, "х000хх001", 4, true, new Car.Key(), new Car.Insurance());
        Car car4 = new Car(" Hyundai ", " Avante ", 1.6, " оранжевый ", 2016, " Южная Корея", null, null, "х000хх100", 2, true, new Car.Key(), new Car.Insurance());

        printCars(car);
        printCars(car1);
        printCars(car2);
        printCars(car3);
        printCars(car4);
    }

    private static void printCars(Car car) {
        System.out.println(car.getStamp() + " " +
                car.getModel() +
                " . Объем двигателя " + car.getEngineCapacity() +
                ". Цвет кузова : " + car.getBodyColor() +
                " . Год производства :" + car.getYearOfManufacture() +
                " . Страна сборки :" + car.getCountryOfAssembly() +
                " . Коробка передач : " + car.getTransmission() +
                " . Тип кузова : " + car.getBodyType() +
                " . Рег.номер : " + car.getRegistrationNumber() +
                " . Количество мест: " + car.getNumberOfSeats() +
                " .  " + (car.isSummerTyres() ? " летняя" : " зимняя ") + " резина " +
                (car.getKey().isKeylessAccess() ? " безключевой доступ" : "ключевой доступ") +
                (car.getKey().isRemoteLaunch() ? " удаленный запуск" : " не удаленный запуск") +
                " . номер страховки" + car.getInsurance().getNumber() +
                " . стоимость страховки " + car.getInsurance().getCost() +
                " . срок действия страховки " + car.getInsurance().getValidityPeriod());

    }


}


