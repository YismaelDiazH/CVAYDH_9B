package mx.edu.utez.cvaydh9b.controller;

@RestController
@RestMApping("/api/user/")
@CrossOrigin("*")

public class User2Controller {
    @GetMapping("")
    public String getMessage(){
        return "Hola desde el controlador 1";
    }
}
