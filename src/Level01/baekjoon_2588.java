package Level01;

import java.util.Scanner;

public class baekjoon_2588 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer temp;
        String text = b.toString();

        for(int i = text.length(); i > 0; i--){
            temp = Integer.parseInt(text.substring(i-1,i));
            System.out.println(a * temp);
        }
        System.out.println(a*b);

    }
}

//곱셈
//시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//1 초	128 MB	21694	12645	11638	60.548%
//문제
//(세 자리 수) × (세 자리 수)는 다음과 같은47 과정을 통하여 이루어진다.
//
//
//
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//출력
//첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
//
//예제 입력 1
//472
//385
//예제 출력 1
//2360
//3776
//1416
//181720