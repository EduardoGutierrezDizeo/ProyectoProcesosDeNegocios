# PacientesController

Controlador REST básico en Spring Boot para gestionar pacientes en memoria (CRUD).

| Método  | Endpoint                          | Parámetros                                | Descripción                           | Ejemplo de uso                                                                 | Respuesta (ejemplo)                  |
|---------|-----------------------------------|-------------------------------------------|---------------------------------------|-------------------------------------------------------------------------------|--------------------------------------|
| **GET** | `/pacientes/listar`               | –                                         | Listar todos los pacientes            | `http://localhost:8080/pacientes/listar`                                      | `["Eduardo","Andres","José","Mauricio"]` |
| **POST**| `/pacientes/crear`                | `nombre` (String)                         | Crear un nuevo paciente               | `http://localhost:8080/pacientes/crear?nombre=Jairo`                          | `se creo el paciente Jairo`          |
| **PUT** | `/pacientes/editar`               | `index` (int), `nombre` (String)          | Editar paciente por posición en lista | `http://localhost:8080/pacientes/editar?index=0&nombre=Alberto`               | `el paciente Eduardo se cambio a: Alberto` |
| **DELETE** | `/pacientes/eliminar`          | `index` (int)                             | Eliminar paciente por posición        | `http://localhost:8080/pacientes/eliminar?index=2`                            | `el paciente José se elimino`        |

---

### Requisitos
- Java 17+
- Maven configurado
- Spring Boot (3.x recomendado)

###  Ejecución
```bash
mvn spring-boot:run
