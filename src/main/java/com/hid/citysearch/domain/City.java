package com.hid.citysearch.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * @author rmurugaian 2018-05-24
 */
@Builder(toBuilder = true)
@Getter
public class City {

    private String name;
}
