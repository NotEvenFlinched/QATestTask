package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ColorEnum {
    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    BLUE("голубой"),
    INDIGO("синий"),
    VIOLET("фиолетовый");

    private final String colorName;

    ColorEnum(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return this.colorName;
    }

    private static final List<ColorEnum> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();

    public static ColorEnum randomColor() {
        return VALUES.get(Start.rand.nextInt(SIZE));
    }
}
