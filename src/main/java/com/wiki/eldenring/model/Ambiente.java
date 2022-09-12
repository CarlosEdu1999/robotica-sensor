package com.wiki.eldenring.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ambiente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private List<AmbienteMacro> ambienteMacroList;
    private String nome;
}
