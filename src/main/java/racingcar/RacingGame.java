package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingGame {
    public void run() {
        String carNames = inputCarNames();
        System.out.println(carNames);

        String tryCount = inputTryCount();
        System.out.println(tryCount);
    }

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCarNames = readLine();
        return inputCarNames;
    }

    public String inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputTryCount = readLine();
        return inputTryCount;
    }
}