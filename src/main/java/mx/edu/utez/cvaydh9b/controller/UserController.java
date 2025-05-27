package mx.edu.utez.cvaydh9b.controller;

@RestController
@RestMApping("/api/user/")
@CrossOrigin("*")

public class UserController {
    @GetMapping("")
    public String getMessage(){
        return "Hola desde el controlador 1";
    }
}
