package com.wiki.eldenring.controller;

import com.wiki.eldenring.dto.AmbienteMacroDTO;
import com.wiki.eldenring.model.AmbienteMacro;
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
    public ResponseEntity<Iterable<AmbienteMacro>> getItems() {
        return ResponseEntity.ok(itemService.getItems());
    }

    @GetMapping("/getByNome/{nome}")
    public ResponseEntity<AmbienteMacro> getByNome(@PathVariable String nome) {
        return ResponseEntity.ok(itemService.getByNome(nome));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<AmbienteMacro> getItem(@PathVariable String id) {
        return ResponseEntity.ok(itemService.getItem(id));
    }

    @PostMapping
    public ResponseEntity<AmbienteMacro> create(@RequestBody @Valid AmbienteMacroDTO itemDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.create(itemDTO));
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<AmbienteMacro> update(@PathVariable String id, @RequestBody @Valid AmbienteMacroDTO itemDTO) {
        return ResponseEntity.ok(itemService.update(id, itemDTO));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<AmbienteMacro> delete(@PathVariable String id) {
        return ResponseEntity.ok(itemService.delete(id));
    }

    @DeleteMapping("/deleteByNome/{nome}")
    public ResponseEntity<AmbienteMacro> deleteByNome(@PathVariable String nome) {
        return ResponseEntity.ok(itemService.deleteByNome(nome));
    }
}
