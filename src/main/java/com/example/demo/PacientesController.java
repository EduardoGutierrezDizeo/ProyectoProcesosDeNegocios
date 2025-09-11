package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/pacientes")

public class PacientesController {

    private List<String> pacientes = new ArrayList<>(List.of("Eduardo", "Andres", "José", "Mauricio"));

    @GetMapping("/listar")
    public List<String> getPacientes(){
        return pacientes;
    }

    @PostMapping("/crear")
    public String crearPaciente(@RequestParam String nombre){
        pacientes.add(nombre);
        return "se creo el paciente " + nombre;
    }

    @PutMapping("/editar")
    public String editarPaciente(@RequestParam int index , @RequestParam String nombre){
        String pacienteEditado = pacientes.set(index, nombre);
        return "el paciente " + pacienteEditado + " se cambio a: " + nombre;
    }

    @DeleteMapping("/eliminar")
    public String eliminarPaciente(@RequestParam int index){
        String pacienteEliminado = pacientes.remove(index);
        return "el paciente " + pacienteEliminado + " se elimino";
    }
}
