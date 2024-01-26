package edu.iu.gsackie.demo.controllers;

import edu.iu.gsackie.demo.model.AnimalData;
import edu.iu.gsackie.demo.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping
    public boolean add(@RequestBody AnimalData data){
        try{
            return animalRepository.add(data);
        }
        catch (IOException e){
            return false;
        }
    }

    @GetMapping
    public List<AnimalData> findAll(){
        try{
            return AnimalRepository.findAll();
        }
        catch (IOException e){
            return Collections.emptyList();
        }
    }

    @GetMapping("/search")
    public List<AnimalData> search(@RequestParam String name,
                                   @RequestParam String picture,
                                   @RequestParam String location){
        try{
            System.out.println(name);
            System.out.println(picture);
            System.out.println(location);
            return AnimalRepository.find(name, picture, location);
        }
        catch (IOException e){
            return Collections.emptyList();
        }
    }
}
