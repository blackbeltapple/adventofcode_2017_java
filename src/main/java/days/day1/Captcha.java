package days.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Captcha {

    public Integer doCaptcha(String input) {

        // Main

        // Next try and do it in old java first???
        return 0;

    }

    public List<Integer> convertToList(String input) {

        List<Integer> intList = Arrays.stream(input.split(""))
                .map(Integer::valueOf)
//                .filter(i -> i>1)
                .collect(Collectors.toList());

        return intList;
    }

    public Integer sumString(String input) {

        Integer answer =  Arrays.stream(input.split(""))
                .map(Integer::valueOf)
                .reduce(0, Integer::sum);

        return answer;
    }

    public List<Integer> filterArray(String input) {

        List<Integer>  answer =  Arrays.stream(input.split(""))
                .map(Integer::valueOf)
                .filter(i -> i>1)
                .collect(Collectors.toList());

        return answer;
    }


}
