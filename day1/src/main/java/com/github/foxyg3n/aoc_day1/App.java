package com.github.foxyg3n.aoc_day1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    private static final String ROOT = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
    private static final String RESOURCES_PATH = ROOT + File.separator + "day1/src/main/resources/";

    public static void main(String[] args) {

        Path filePath = Path.of(RESOURCES_PATH + "input.txt");

        try {

            List<Integer> list = Files.readAllLines(filePath, Charset.defaultCharset())
                .stream().map(Integer::parseInt).collect(Collectors.toList());

            System.out.println("Part 1 answer: " + part1(list));
            System.out.println("Part 2 answer: " + part2(list));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Integer part1(List<Integer> list) {
        int counter = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            int firstValue = list.get(i);
            int secondValue = list.get(i + 1);
            if(secondValue > firstValue) counter++;
        }
        return counter;
    }

    private static Integer part2(List<Integer> list) {
        int counter = 0;
        for(int i = 0; i < list.size() - 3; i++) {
            int[] values = { list.get(i), list.get(i + 1), list.get(i + 2), list.get(i + 3) };
            int firstSum = values[0] + values[1] + values[2];
            int secondSum = values[1] + values[2] + values[3];
            if(secondSum > firstSum) counter++;
        }
        return counter;
    }

}
