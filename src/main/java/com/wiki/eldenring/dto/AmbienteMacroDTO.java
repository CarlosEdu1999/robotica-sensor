package com.wiki.eldenring.dto;

import com.wiki.eldenring.model.AtributosRequeridos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmbienteMacroDTO {
    private String nome;
    private List<com.wiki.eldenring.model.AmbienteMicro> ambienteMicroList;
}
