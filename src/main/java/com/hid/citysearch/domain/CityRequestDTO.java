package com.hid.citysearch.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by rmurugaian on 5/24/2018.
 */
@Getter
@Setter
@EqualsAndHashCode
public class CityRequestDTO {
    private String start;
    private int atmost;

}
