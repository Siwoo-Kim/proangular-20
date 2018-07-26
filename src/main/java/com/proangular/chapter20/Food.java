package com.proangular.chapter20;

import lombok.*;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-07-26 오전 7:37
 **/

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Food {
    private String name;
    private String category;
    private double price;
    private int expiry;
}
