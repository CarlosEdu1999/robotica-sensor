package com.wiki.eldenring.model;

import lombok.*;




@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Sensor {

    private String nome;
    private String tipo;
    private String tag;

}
