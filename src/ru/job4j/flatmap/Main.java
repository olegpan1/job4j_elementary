package ru.job4j.flatmap;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
//        IntStream.range(1, 4)
//                .mapToObj(i -> new Foo("Foo" + i))
//                .peek(f -> IntStream.range(1, 4)
//                        .mapToObj(i -> new Bar("Bar" + i + " <- " + f.name))
//                        .forEach(f.bars::add))
//                .flatMap(f ->
//                {
//                    System.out.println(f.name);
//                    return f.bars.stream();
//                })
//                .forEach(bar -> System.out.println(bar.name));

//        Supplier<Stream<String>> streamSupplier
//                = Stream::of;
//        Optional<String> result1 = streamSupplier.get()
//                .findAny();
//        System.out.println(result1.orElseGet(Main::emptyList));
//        Optional<String> result2 = streamSupplier.get()
//                .findFirst();
//        System.out.println(result2.orElseGet(Main::emptyList));
//
//        Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
//        Stream<UUID> infiniteStreamOfRandomUUID = Stream.generate(randomUUIDSupplier);
//
//        infiniteStreamOfRandomUUID
//                .skip(10)
//                .limit(10)
//                .forEach(System.out::println);

        Stream<Double> anStream = Stream.of(1.1, 2.2, 3.3);
        Stream<Double> newStream = insertInStream(anStream, 9.9, 2);

        List<Double> resultList = newStream.collect(Collectors.toList());
        resultList.forEach(System.out::println);

//        List<String> valueList = new ArrayList<>();
//        valueList.add("Joe");
//        valueList.add("John");
//        valueList.add("Sean");
//
//        Stream<String> stream = valueList.stream();
//        long skipParameter = valueList.size() == 0 ? 0 : valueList.size() - 1;
//
//        System.out.println(stream.skip(skipParameter)
//                .findFirst()
//                .orElseGet(Main::emptyList));
//
    }

    static String emptyList() {
        return "empty list";
    }

    private static <T> Stream<T> insertInStream(Stream <T> stream, T elem, int index) {
        Spliterator<T> spliterator = stream.spliterator();
        Iterator<T> iterator = Spliterators.iterator(spliterator);

        return Stream.concat(Stream.concat(Stream.generate(iterator::next)
                .limit(index), Stream.of(elem)), StreamSupport.stream(spliterator, false));
    }
}

