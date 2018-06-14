package app;

import controller.CharacterController;
import entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private CharacterController characterController;

    @GetMapping("/name/{name}")
    public ResponseEntity<Character> getCharacterByName(@PathVariable("name") String name) {
        Character character = characterController.getByName(name);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");

        return new ResponseEntity<Character>(character, responseHeaders, HttpStatus.OK);
    }

}