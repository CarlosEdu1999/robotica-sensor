package com.wiki.eldenring.controller;

import com.wiki.eldenring.dto.AmbienteDTO;
import com.wiki.eldenring.model.Ambiente;
import com.wiki.eldenring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("v1/items")
public class ItemController {
    @Autowired
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Ambiente>> getItems() {
        return ResponseEntity.ok(itemService.getItems());
    }

    @GetMapping("/getByNome/{nome}")
    public ResponseEntity<Ambiente> getByNome(@PathVariable String nome) {
        return ResponseEntity.ok(itemService.getByNome(nome));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Ambiente> getItem(@PathVariable String id) {
        return ResponseEntity.ok(itemService.getItem(id));
    }

    @PostMapping
    public ResponseEntity<Ambiente> create(@RequestBody @Valid AmbienteDTO itemDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.create(itemDTO));
    }

    @PutMapping("/alterar/{nome}")
    public ResponseEntity<Ambiente> update(@PathVariable String nome, @RequestBody @Valid AmbienteDTO itemDTO) {
        return ResponseEntity.ok(itemService.update(nome, itemDTO));
    }

    @DeleteMapping("/deleteByNome/{nome}")
    public ResponseEntity<Ambiente> delete(@PathVariable String nome) {
        return ResponseEntity.ok(itemService.deleteByNome(nome));
    }

}
