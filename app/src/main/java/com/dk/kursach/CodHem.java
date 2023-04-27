package com.dk.kursach;

public class CodHem {
    AppActivity getWord;
    // вместо скан ин было введено 1. ПРоверить код
    String word = getWord.getWord();
    public static String encodeHamming(String word) {

        // Находим степень двойки, которая >= длины исходной строки
        int n = 1;
        while ((1 << n) < word.length() + n + 1) {
            n++;
        }

        // Создаём буфер для закодированной строки
        StringBuilder encoded = new StringBuilder();

        // Заполняем буфер пустыми ячейками (как на шаге 1)
        int j = 0;
        for (int i = 1; i <= word.length() + n; i++) {
            if (i == (1 << j)) {
                encoded.append('0');
                j++;
            } else {
                encoded.append(word.charAt(i - j - 1));
            }
        }

        // Для каждой позиции-степени двойки вычисляем код Хэмминга
        j = 0;
        for (int i = 1; i <= encoded.length(); i++) {
            if (i == (1 << j)) {
                int start = i;
                int error = 0;
                for (int k = start; k <= encoded.length(); k += start * 2) {
                    for (int l = k; l < k + start && l <= encoded.length(); l++) {
                        if (encoded.charAt(l - 1) == '1') {
                            error ^= (l - k) + 1;
                        }
                    }
                }
                encoded.setCharAt(i - 1, (char) ('0' + error));
                j++;
            }
        }

        // Возвращаем закодированную строку
        return encoded.toString();

    }


}
