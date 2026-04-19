package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/firstController")

public class FirstController {
    @GetMapping("/firstMethod/{id}")
    public String firstMethod(@PathVariable String id) {
        return "The id is " + id;
    }

    @GetMapping("/methodWithQueryParams")
    public String methodWithParams(@RequestParam String id) {
        return "Method with params is " + id;
    }

    @GetMapping("/methodWithQueryParams2")
    public String methodWithParams2(@RequestParam Map<String, String> allParams) {
        return "Method with params 2 is " + allParams.entrySet();
    }

    @PostMapping("/methodWithBodyParams")
    public String methodWithBodyParams(@RequestBody User user) {
        return "The username is " + user.name();
    }

    @PostMapping("/methodWithHeader")
    public String methodWithHeader(@RequestHeader String name) {
        return "The username from header is " + name;
    }

    @PostMapping("/methodWithListHeader")
    public String methodWithListHeader(@RequestHeader Map<String, String> headers) {
        return "The username from list header is " + headers.entrySet();
    }

    @GetMapping("/methodResponseEntity/{id}")
    public ResponseEntity<Object> methodResponseEntity(@PathVariable Long id) {
        var user = new User("marcusvynicius");

        if(id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }

        return ResponseEntity.badRequest().body("Number smaller than 5");
    }

    record User(String name){}
}
