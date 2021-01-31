package Search;

import java.util.Scanner;
// 선형검색(보초법)
/*
SequentialSearch.java에서는 다음과 같은 종료조건을 판단해야합니다.
1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
2. 검색할 값과 같은 요소를 발견한 경우
하지만 이 판단을 절반으로 줄일 수 있는 방법인 보초법은 다음과 같습니다.

초기데이터인 배열을 그대로 두고, 배열 1칸을 늘려 늘린 칸에 검색할 값을 넣습니다. (즉, index가 제일 큰 값이 곧 검색할 값이 됩니다.)
이렇게 하면 원래 배열 범위에서 만족하는 값을 찾지 못하더라도 무조건 위 2번과 같은 종료조건을 만족하게 됩니다. (마지막에 검색할 값을 넣어버렸으므로 )
이렇게 하면 1번의 조건은 필요가 없게 됩니다.

 */

class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;					// 보초를 추가

        while (true) {
            if (a[i] == key)		// 검색 성공!
                break;
            i++;
        }
        return i == n ? -1 : i;     //마지막 인덱스를 return 한다면 원래 배열 범위에 값이 존재하지 않았다는 의미이므로 -1을 return
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];				// 요솟수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값：");			// 키값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);		// 배열x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}