package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    private RandomGenerator() {}

    public static List<Integer> numbersForOneRound(int countInput, List<String> names) {
        List<Integer> result = new ArrayList<>(names.size());

        for (int i = 0; i < names.size(); i++) {
            int number = Randoms.pickNumberInRange(0, 9);
            result.add(number);
        }

        return result;
    }
}
