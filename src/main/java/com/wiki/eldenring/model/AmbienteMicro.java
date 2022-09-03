package com.wiki.eldenring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AmbienteMicro {

    private List<Sensor> sensores;
    private String nome;
}
