package ProgBranches;

import java.util.Scanner;

public class MaxArrayElement {

    private int arrSize;
    private String wordArr[];

    public MaxArrayElement() {
    }

    public MaxArrayElement(int arrSize, String[] wordArr) {
        this.arrSize = arrSize;
        this.wordArr = wordArr;
    }

    public int getArrSize() {
        return arrSize;
    }

    public void setArrSize(int arrSize) {
        this.arrSize = arrSize;
    }

    public String[] getWordArr() {
        return wordArr;
    }

    public void setWordArr(String[] wordArr) {
        this.wordArr = wordArr;
    }

    public String getMaxElement () {

        //находим максимальный элемент массива строк
        String longestWord = wordArr[0];
        for (int i = 0; i < arrSize - 1; i++) {
            if (longestWord.length() < wordArr[i + 1].length()) {
                longestWord = wordArr[i + 1];
            }
        }
        return  longestWord;
    }


}
