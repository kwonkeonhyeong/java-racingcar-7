package racingcar.model;

import java.util.Objects;

public class Car {

    private final String name;
    private final Location location;

    private Car(String name, Location location) {
        validate(name);
        this.name = name;
        this.location = location;
    }

    public static Car from(String name) {
        return new Car(name, new Location());
    }

    public void move() {
        location.move();
    }

    public int getCurrentLocation() {
        return location.getLocation();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name +", position : " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car car)) {
            return false;
        }
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    private void validate(String name) {
        validateEmpty(name);
        validateAlphabetic(name);
        validateLength(name);
    }

    private void validateEmpty(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름에 빈 값을 입력할 수 없습니다.");
        }
    }

    private void validateAlphabetic(String name) {
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("이름은 영어로만 작성 가능합니다.");
        }
    }

    private void validateLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 입력 가능합니다.");
        }
    }
}
