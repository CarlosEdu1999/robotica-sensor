package com.wiki.eldenring.service;

import com.wiki.eldenring.dto.ItemDTO;
import com.wiki.eldenring.model.Item;
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

    public Iterable<Item> getItems() {
        return itemRepository.findAll();
    }

    public Item getItem(String id) {
        return itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("Item not find with id " + id);
        });
    }

    public Item getByNome(String nome) {
        return itemRepository.findByNome(nome);
    }

    public Item create(ItemDTO itemDTO) {
        Item itemModel = Item.builder()
                .alcanceDaArma(itemDTO.getAlcanceDaArma())
                .categoria(itemDTO.getCategoria())
                .dano(itemDTO.getDano())
                .defesa(itemDTO.getDefesa())
                .imageURL(itemDTO.getImageURL())
                .fpCost(itemDTO.getFpCost())
                .location(itemDTO.getLocation())
                .nome(itemDTO.getNome())
                .skill(itemDTO.getSkill())
                .peso(itemDTO.getPeso())
                .requisito(itemDTO.getRequisito())
                .videoURL(itemDTO.getVideoURL())
                .build();
        return itemRepository.save(itemModel);
    }

    public Item update(String id, ItemDTO itemDTO) {
        Item itemModel = itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with id: " + id);

        });
        itemModel.setCategoria(itemDTO.getCategoria());
        itemModel.setDano(itemDTO.getDano());
        itemModel.setDefesa(itemDTO.getDefesa());
        itemModel.setAlcanceDaArma(itemDTO.getAlcanceDaArma());
        itemModel.setFpCost(itemDTO.getFpCost());
        itemModel.setImageURL(itemDTO.getImageURL());
        itemModel.setVideoURL(itemDTO.getVideoURL());
        itemModel.setSkill(itemDTO.getSkill());
        itemModel.setPeso(itemDTO.getPeso());
        itemModel.setRequisito(itemDTO.getRequisito());
        itemModel.setNome(itemDTO.getNome());
        itemModel.setLocation(itemDTO.getLocation());

        return itemRepository.save(itemModel);
    }

    public Item delete(String id) {
        Item itemModel = itemRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with id: " + id);

        });
        itemRepository.delete(itemModel);
        return itemModel;
    }
    public Item deleteByNome(String nome) {
        Item itemModel = itemRepository.findByNome(nome);
        itemRepository.delete(itemModel);
        return itemModel;
    }
}
