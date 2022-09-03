package com.wiki.eldenring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Defense {

    private Integer physical;
    private Integer magic;
    private Integer fire;
    private Integer lightining;
    private Integer holy;
    private Integer guardBoost;
}
