package com.example.intellijgit.programmers;

/**
 * 1. n * n 크기의 map을 생성
 * 2. arr1의 각 수를 이진수 -> 문지열로 바꿔서 1일 경우 지도에 #으로 저장
 * 3. arr2도 마찬가지
 *
 * 아니지
 *
 * arr1과 arr2를 바로 or 연산을 한 후 arr3에 저장
 * 그후 문자열 배열로 바꾸어서 출력
 * */
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] arr3 = new int[n];

        for(int i = 0; i < n; i++) {
            arr3[i] = arr1[i] | arr2[i];
        }

        String[] answer = new String[n];
        StringBuilder sb = null;
        for(int i = 0; i < n; i++) {
            String binaryString = addZero(n, Integer.toBinaryString(arr3[i]));
            sb = new StringBuilder();

            for(int j = 0; j < n; j++) {
                if(binaryString.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }

            answer[i] = sb.toString();
        }
        return answer;
    }

    public String addZero(int n, String binaryString) {
        if(binaryString.length() < n) {
            String zeroCnt = "";
            for(int i = 0; i < n - binaryString.length(); i++){
                zeroCnt += "0";
            }

            return zeroCnt + binaryString;
        } else return binaryString;
    }
}
