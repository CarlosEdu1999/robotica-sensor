package com.wiki.eldenring.dto;

import com.mongodb.lang.Nullable;
import com.wiki.eldenring.model.AtributosRequeridos;
import com.wiki.eldenring.model.Damage;
import com.wiki.eldenring.model.Defense;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {
    private String nome;
    private String categoria;
    private String alcanceDaArma;
    private Damage dano;
    private Defense defesa;
    private Float peso;
    private String skill;
    private AtributosRequeridos requisito;
    private String fpCost;
    private String imageURL;
    private String videoURL;
    private String location;
}
