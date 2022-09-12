package com.wiki.eldenring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmbienteDTO {
    private String nome;
    private List<com.wiki.eldenring.model.AmbienteMacro> ambienteMacroList;
}
