package com.wiki.eldenring.model;


import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
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
    @Nullable
    private String videoURL;
    private String location;
}
