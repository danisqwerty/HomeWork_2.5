package com.example.homework25;

public class Algorithm {


    private final double gOnEarth = (double) 9.80665; // метров в секунду к квадрате
    private final double gOnMars = (double) 3.721; // метров в секунду к квадрат

    //Чтобы вывести на орбиту Земли 1 кг груза требуется 100 килограмм топлива

    public Algorithm() {
    }


    public long absoluteEnergyCalculation(String input) {

        /** Необходимо проверить корректность ввода массы тела, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */
        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            float inputFloat = Float.parseFloat(inputMod);

            // возврат вычисленного значения
            return (long) (inputFloat * 100 /(gOnEarth/ gOnMars));

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (long) (inputFloat * 100 / (gOnEarth/gOnMars));
        }
    }
}
