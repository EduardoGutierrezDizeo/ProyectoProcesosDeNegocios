package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/productos")

public class ProductosController {

    private List<String> productos = new ArrayList<>(List.of("Teclado", "Mouse", "Monitor", "Portátil", "GPU", "FANS"));

    @GetMapping("/listar")
    public List<String> getProductos() {
        return productos;
    }

    @PostMapping("/crear")
    public String crearProducto(@RequestParam String nombre) {
        productos.add(nombre);
        return "Se creó el producto " + nombre;
    }

    @PutMapping("/editar")
    public String editarProducto(@RequestParam int index, @RequestParam String nombre) {
        String productoEditado = productos.set(index, nombre);
        return "El producto " + productoEditado + " se cambió a: " + nombre;
    }

    @DeleteMapping("/eliminar")
    public String eliminarProducto(@RequestParam int index) {
        String productoEliminado = productos.remove(index);
        return "El producto " + productoEliminado + " se eliminó";
    }
}
