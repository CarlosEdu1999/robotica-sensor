package com.wiki.eldenring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AtributosRequeridos {

    private Integer faith;
    private Integer strength;
    private Integer holy;
    private Integer dexterity;
    private Integer inteligence;
    private Integer arcane;

}
