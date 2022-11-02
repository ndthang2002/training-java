package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import data.structures.List;

public class StreamExample {
  public static void main(String[] args) {

    java.util.List<String> list = new ArrayList<>();
    Stream<String> stream = list.stream();
    Stream<String> parallelStream = list.parallelStream();

    list.add("thang");
    list.add("hien");
    list.add("nhan");
    list.add("thyu");

//  forEach  duyet toan bo du lieu 
    list.stream().forEach(l -> System.out.println(l));

    // map tạo ra các giá trị mới từ dữ liệu hiện có

    Arrays.asList(3, 5, 7).stream().map(i -> "loda-" + i).map(String::toUpperCase).forEach(System.out::println);

    // filer lọc những dữ liệu mình muốn
    Arrays.asList(2, 2, 24, 6, 8, 9).stream().filter(i -> i % 2 != 0).map(i -> "loda" + i).forEach(System.out::println);

    // limit giới hạn dữ liệu cầnm xử lý
    System.out.println();
    IntStream.range(1, 1000).boxed() // tao ra stream tu 1-999
        .filter(i -> i % 2 != 0).map(i -> "loda" + i).map(String::toUpperCase).limit(5)// giới hạn dữ liệu xuất ra màn
                                                                                       // hình 5
        .forEach(System.out::println);

    // sorted sắp xếp s
    System.out.println("sort: ");
    IntStream.range(1, 1000).boxed().filter(i -> i % 2 != 0).map(i -> "loda - " + i).limit(10).sorted() // sap xep du
                                                                                                        // lieu da xu ly
        .forEach(System.out::println);

    // collect giúp lấy dữ liệu đã biến đổi trong stream thành đối tượng mình mong
    // muốn
    System.out.println("colect");

    java.util.List<String> result = IntStream.range(1, 1000).boxed().filter(i -> i % 2 != 0).map(i -> "loda-" + i)
        .map(String::toUpperCase).limit(10).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    System.out.println(result);// in doi tuong ra

    System.out.println(" xử lý song song");
    java.util.List<String> results = IntStream.range(1, 1000).boxed().parallel().filter(i -> i % 2 != 0)
        .map(i -> "loda-" + i).map(String::toUpperCase).limit(10).sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println(result);// in doi tuong ra
 
    java.util.List<String> resultt = Stream.of("tao", "la","thang","long","day","tam")
        .filter( s ->{ System.out.println("[filtering]" +s ); return s.length()>=4;})
        .map(s ->{ System.out.println("Map+"+s); return s.toUpperCase();})
        .limit(3)
        .collect(Collectors.toList());
        
    System.out.println("----");
    System.out.println("result");
    resultt.forEach(System.out::println);
  }

}
