package com.wiki.eldenring.model;

import lombok.*;




@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Damage {

    private Integer physical;
    private Integer magic;
    private Integer fire;
    private Integer lightining;
    private Integer holy;
    private Integer critical;

}
