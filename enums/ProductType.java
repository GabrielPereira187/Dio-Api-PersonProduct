package one.dio.dioapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ProductType {
    FRUIT("FRUIT"),
    MEAT("MEAT"),
    VEGETABLES("VEGETABLES");

    private final String description;
}
