package Level03;

import java.io.*;

public class baekjoon_11022 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int size = Integer.parseInt(br.readLine());
            String temp[];
            int sum;

            for(int i=1; size >= i; i++){
                temp = br.readLine().split(" ");
                sum = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
//                Case #1: 1 + 1 = 2
                bw.write("Case #"+i+": "+temp[0]+" + " + temp[1] +" = " + sum +"\n");

            }
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();

        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//A+B - 8
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	256 MB	18950	13686	12853	73.749%
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
//
//        예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        Case #1: 1 + 1 = 2
//        Case #2: 2 + 3 = 5
//        Case #3: 3 + 4 = 7
//        Case #4: 9 + 8 = 17
//        Case #5: 5 + 2 = 7
//        출처
//        문제를 만든 사람: baekjoon
//        빠진 조건을 찾은 사람: djm03178
//        비슷한 문제
//        1000번. A+B
//        1001번. A-B
//        1008번. A/B
//        2558번. A+B - 2
//        10950번. A+B - 3
//        10951번. A+B - 4
//        10952번. A+B - 5
//        10953번. A+B - 6
//        10998번. A×B
//        11021번. A+B - 7
//        15740번. A+B - 9
//        15792번. A/B - 2
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기