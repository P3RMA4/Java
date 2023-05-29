package sem2.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t1079 {

    public static void main(String[] args) throws IOException {
        List<Integer> input = getInput();
        List<Integer> sequence = getSequence(Collections.max(input));

        for (Integer i : input)
            System.out.println(Collections.max(sequence.subList(0, i + 1)));
    }

    private static List<Integer> getInput() throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = new ArrayList<>(10);
        String line;

        while (!(line = consoleReader.readLine()).equals("0"))
            input.add(Integer.parseInt(line));

        consoleReader.close();

        return input;
    }

    private static List<Integer> getSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);

        for (int i = 1; i <= n; i++) {
            if (i == 1)
                sequence.add(1);
            else if (i % 2 == 0)
                sequence.add(sequence.get(i/2));
            else if (i % 2 == 1)
                sequence.add(sequence.get((i - 1)/2) + sequence.get(1 + (i - 1)/2));
        }

        return sequence;
    }
}
