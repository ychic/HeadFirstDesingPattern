package codingTestWithJava;
/*
Solved.ac class project

class 1

 */
/*
https://www.acmicpc.net/problem/10950
A+B - 3
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	119637	69266	59717	58.605%
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.

 */


import java.util.NoSuchElementException;
import java.util.Scanner;

public class BJ_10950 {
    public static void main(String[] args) {
        BJ_10950 test = new BJ_10950();
    }

    public BJ_10950() throws NoSuchElementException {

        Scanner sc =new Scanner(System.in);
        int cnt = sc.nextInt();
        while(cnt > 0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            cnt--;
            int answer= solution(num1,num2);
            System.out.println(answer);
        }

    }

    public int solution (int num1, int num2){

        return num1+num2;
    }

}
