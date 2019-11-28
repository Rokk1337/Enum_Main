/**
 * @since 1.0
 * @author tema
 * @version 1.0
 * package info
 */
package com.company;
import java.util.Arrays;
import java.util.Random;

public final class Main {
private Main() {
}
    public enum Color {
        /**
         * Цвет сброс.
         */
        RESET("\u001B[0m" + "Сброс" + "\u001B[0m"),
        /**
         * Цвет Чёрный.
         */
        BLACK("\u001B[30m" + "Чёрный" + "\u001B[0m"),
        /**
         * Цвет Красный.
         */
        RED("\u001B[31m" + "Красный" + "\u001B[0m"),
        /**
         * Цвет Зеленый.
         */
        GREEN("\u001B[32m" + "Зеленый" + "\u001B[0m"),
        /**
         * Цвет Жёлтый.
         */
        YELLOW("\u001B[33m" + "Жёлтый" + "\u001B[0m"),
        /**
         * Цвет Голубой.
         */
        BLUE("\u001B[34m" + "Голубой" + "\u001B[0m"),
        /**
         * Цвет Фиолетовый.
         */
        PURPLE("\u001B[35m" + "Фиолетовый" + "\u001B[0m"),
        /**
         * Цвет Сине_Зелёный.
         */
        CYAN("\u001B[36m" + "Сине_Зелёный" + "\u001B[0m"),
        /**
         * Цвет белый.
         */
        WHITE("\u001B[37m" + "Белый" + "\u001B[0m");
        /**
         * здесь храниться цвет.
         */
      private String color;

      Color(final String color1) {
            this.color = color1;
        }

        @Override
        public String toString() {
            return "цвет " + color;
        }
        /**
         * приравнивание.
         */
        private static final Color[] VALUES = values();
        /**
         * установка размера.
         */
        private static final int SIZE = VALUES.length;
        /**
         * получение рандомного цвета.
         */
        private static final Random RANDOM = new Random();
        /**
         * рандом.
         * @return tag.
         */
        public static Color getRandomLetter()  {
            return VALUES[RANDOM.nextInt(SIZE)];
        }
    }
    /**
     * тута main.
     * @param args args.
     */
    public static void main(final String[] args) {
        System.out.println(" -" + Arrays.toString(Color.values()));
        System.out.println(" "
                + "-простой текст, без цвета. :-)");
        System.out.println(" -" + Color.getRandomLetter());
    }
}
