package com.example.intellijgit.programmers;

public class LinkedNum {
    public int solution(int[] num_list) {
        int answer = 0;

        String odd = "";
        String even = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0) {
                even += String.valueOf(num_list[i]);
            } else {
                odd += String.valueOf(num_list[i]);
            }
        }

        int oddInt = Integer.parseInt(odd);
        int evenInt = Integer.parseInt(even);

        answer = oddInt + evenInt;
        return answer;
    }
}
