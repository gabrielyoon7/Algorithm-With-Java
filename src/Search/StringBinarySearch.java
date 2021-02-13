package Search;

import java.util.Arrays;
import java.util.Scanner;

// 문자열의 배열(Java의 키워드)에서 검색
/*
이진 검색이므로 아래 String 배열의 순서가 문자열 정렬이 되어있지 않으면 검색이 불가능하다!
 */

class StringBinarySearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // Java에서 사용하는 키워드입니다.
        String[] x = { //********무조건 문자열 정렬이 되어있어야 검색이 가능함 ***********
                "abstract",   "assert",       "boolean",   "break",      "byte",
                "case",       "catch",        "char",      "class",      "const",
                "continue",   "default",      "do",        "double",     "else",
                "enum",       "extends",      "final",     "finally",    "float",
                "for",        "goto",         "if",        "implements", "import",
                "instanceof", "int",          "interface", "long",       "native",
                "new",        "package",      "private",   "protected",  "public",
                "return",     "short",        "static",    "strictfp",   "super",
                "switch",     "synchronized", "this",      "throw",      "throws",
                "transient",  "try",          "void",      "volatile",   "while"
        };

        System.out.print("원하는 기워드를 입력하세요 : ");	// 키값을 입력
        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x, ky);		// 배열 x에서 값이 ky인 요소를 검색

        if (idx < 0)
            System.out.println("해당 키워드가 없습니다.");
        else
            System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
    }
}
