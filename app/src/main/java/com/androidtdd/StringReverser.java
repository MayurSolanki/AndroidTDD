package com.androidtdd;

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 09/09/20, 12:00 PM.
 */
class StringReverser {

    public String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length()-1; i >= 0;i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }
}
