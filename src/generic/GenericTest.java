package generic;

import cls.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class GenericTest {
    public static void main(String[] args) {
        // Collection : List(ArrayList, LinkedList), Set(HashSet, TreeSet), Map(HashMap, TreeMap)

//        String [] arr = new String[10];
//        arr[0] = "string 1";

        // stream :
        // string : 문자열

        // List
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("String 1");
        arr1.add("String 2");
        arr1.add("String 3");
        arr1.add(1, "String 1.5");
//        for(String str : arr1) {
//            System.out.println( str );
//        }
        arr1.forEach(System.out::println);


        System.out.println( arr1.get(2) );  // index 2번에 해당하는 데이터를 가져옴

        arr1.remove("String 1");    // "String 1"이라는 데이터를 찾아서 삭제
        arr1.remove( 1 );        // 인덱스 1번에 해당하는 데이터를 삭제
        System.out.println( arr1.get(1) );  // index 1번에 해당하는 데이터를 가져옴
        System.out.println("\n---- forEach ----");
        arr1.forEach(System.out::println);

//        Stream<String> strStream = arr1.stream().map((s) -> {
//            return s.toUpperCase();     // 입력값(매개변수) s를 [어떠한 처리를 거친 후] return value로 변경함
//        });
//        strStream.forEach(System.out::println);

        System.out.println("\n---- forEach After map ----");
        arr1.stream().map((s) -> {
            return s.toUpperCase();     // 입력값(매개변수) s를 [어떠한 처리를 거친 후] return value로 변경함
        }).forEach(System.out::println);

        // 정수(Integer형)을 저장할 수 있는 링크드 리스트
        LinkedList<Integer> intArr = new LinkedList<>();

        System.out.println("\n---- SET ----");

        // Set : 중복데이터를 허용하지 않음, 순서가 없음(인덱싱을 지원하지 않음)
        HashSet<String> strSet = new HashSet<>();
        strSet.add("이순신");
        strSet.add("이순신");
        strSet.add("홍길동");
        strSet.add("세종대왕");
        strSet.add("홍길동");
        for(String str : strSet) {
            System.out.println( str );
        }

        strSet.forEach(System.out::println);

        // Map : HashMap, TreeMap
        // 데이터들을 키(Key)와 밸류(Value)의 쌍(Couple)의 형태로 관리하는 자료 구조
        // 키는 중복될 수 없으며, 밸류는 중복 가능하다.
        TreeMap<Integer, String> mapStr = new TreeMap<>();
        mapStr.put(1, "홍길동");
        mapStr.put(10, "이순신");
        mapStr.put(150, "세종대왕");

        System.out.println( mapStr.get(10) );

        mapStr.forEach((k,v)-> System.out.println(k+" : "+v));

        // JSON : 데이터 포맷 구조, Client <---> Server간 데이터 통신
        /*
        {
            키1 : 밸류1,
            키2 : 밸류2,
            키3 : 밸류3
        }
        * */


    }
}
