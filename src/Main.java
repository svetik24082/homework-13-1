import transport.Car;

public class Main {
    public static void main(String[] args) {


        Car car = new Car(null, null, 0, null, 0, null, null, null, "ха00хх000 ", 5, true);
        Car car1 = new Car(" Audi ", " A8 50 L TDI quattro ", 3.0, " черный ", 2020, " Германия ", " АКПП", null, "х000хх000", 3, false);
        Car car2 = new Car(" BMW ", " Z8 ", 3.0, " черный ", 2021, " Германия ", "МКПП", null, "х230хх000", 0,false);
        Car car3 = new Car(" Kia ", " Sportage 4-го поколения ", 2.4, " красный ", 2018, " Южная Корея", "АКПП", null, "х000хх001", 4, true);
        Car car4 = new Car(" Hyundai ", " Avante ", 1.6, " оранжевый ", 2016, " Южная Корея", null, null, "х000хх100", 2, true);

        printCars(car);
       printCars(car1);
        printCars(car2);
        printCars(car3);
        printCars(car4);
    }
    public static void printCars (Car car){
        System.out.println( " Марка :" + car.getStamp() + " , Модель : " + car.getModel()+ " . Объем двигателя " +
                 car.getEngineCapacity()+ ". Цвет кузова : " +
                car.getBodyColor()+ " . Год производства :"  + car.getYearOfManufacture()+
                " . Страна сборки :" +  car.getCountryOfAssembly() + " . Коробка передач : " +
                car.getTransmission()+ " . Тип кузова : " +  car.getBodyType()+ " . Рег.номер : " +
                car.getRegistrationNumber()+ " . Количество мест: " +  car.getNumberOfSeats() +  " .  " + (car.isSummerTyres() ? " летняя" :
                " зимняя ") + " резина ");

    }


    }


