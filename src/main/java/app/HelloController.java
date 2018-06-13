package app;

import controller.CharacterController;
import entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private CharacterController characterController;

    @GetMapping("/name/{name}")
    public Character getCharacterByName(@PathVariable("name") String name) {
        return characterController.getByName(name);
    }

}