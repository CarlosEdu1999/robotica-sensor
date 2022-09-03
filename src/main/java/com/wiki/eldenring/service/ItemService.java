package com.wiki.eldenring.service;

import com.wiki.eldenring.dto.AmbienteMacroDTO;
import com.wiki.eldenring.model.AmbienteMacro;
import com.wiki.eldenring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Iterable<AmbienteMacro> getItems() {
        return itemRepository.findAll();
    }

    public AmbienteMacro getItem(String id) {
        return itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("AmbienteMacro not find with id " + id);
        });
    }

    public AmbienteMacro getByNome(String nome) {
        return itemRepository.findByNome(nome);
    }

    public AmbienteMacro create(AmbienteMacroDTO itemDTO) {
        AmbienteMacro ambienteMacroModel = AmbienteMacro.builder()
                .ambienteMicroList(itemDTO.getAmbienteMicroList())
                .nome(itemDTO.getNome())
                .build();
        return itemRepository.save(ambienteMacroModel);
    }

    public AmbienteMacro update(String id, AmbienteMacroDTO itemDTO) {
        AmbienteMacro ambienteMacroModel = itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with id: " + id);

        });
        ambienteMacroModel.setAmbienteMicroList(itemDTO.getAmbienteMicroList());
        ambienteMacroModel.setNome(itemDTO.getNome());

        return itemRepository.save(ambienteMacroModel);
    }

    public AmbienteMacro delete(String id) {
        AmbienteMacro ambienteMacroModel = itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with id: " + id);

        });
        itemRepository.delete(ambienteMacroModel);
        return ambienteMacroModel;
    }
    public AmbienteMacro deleteByNome(String nome) {
        AmbienteMacro ambienteMacroModel = itemRepository.findByNome(nome);
        itemRepository.delete(ambienteMacroModel);
        return ambienteMacroModel;
    }
}
