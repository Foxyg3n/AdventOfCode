package com.github.foxyg3n.aoc_day2;

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

            //Not started yet :D

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
