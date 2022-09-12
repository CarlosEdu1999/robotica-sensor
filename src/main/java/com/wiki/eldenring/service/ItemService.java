package com.wiki.eldenring.service;

import com.wiki.eldenring.dto.AmbienteDTO;
import com.wiki.eldenring.model.Ambiente;
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

    public Iterable<Ambiente> getItems() {
        return itemRepository.findAll();
    }

    public Ambiente getItem(String id) {
        return itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("Ambiente not find with id " + id);
        });
    }

    public Ambiente getByNome(String nome) {
        return itemRepository.findByNome(nome);
    }

    public Ambiente create(AmbienteDTO itemDTO) {
        Ambiente ambienteMacroModel = Ambiente.builder()
                .ambienteMacroList(itemDTO.getAmbienteMacroList())
                .nome(itemDTO.getNome())
                .build();
        return itemRepository.save(ambienteMacroModel);
    }

    public Ambiente update(String nome, AmbienteDTO itemDTO) {
        Ambiente ambienteMacroModel = itemRepository.findByNome(nome);
        ambienteMacroModel.setAmbienteMacroList(itemDTO.getAmbienteMacroList());
        ambienteMacroModel.setNome(itemDTO.getNome());

        return itemRepository.save(ambienteMacroModel);
    }

    public Ambiente delete(String id) {
        Ambiente ambienteMacroModel = itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with id: " + id);

        });
        itemRepository.delete(ambienteMacroModel);
        return ambienteMacroModel;
    }
    public Ambiente deleteByNome(String nome) {
        Ambiente ambienteMacroModel = itemRepository.findByNome(nome);
        itemRepository.delete(ambienteMacroModel);
        return ambienteMacroModel;
    }
}
