# ProductosController

Controlador REST básico en Spring Boot para gestionar productos en memoria (CRUD).

| Método   | Endpoint                          | Parámetros                                | Descripción                           | Ejemplo de uso                                                                 | Respuesta (ejemplo)                  |
|----------|-----------------------------------|-------------------------------------------|---------------------------------------|-------------------------------------------------------------------------------|--------------------------------------|
| **GET**  | `/productos/listar`               | –                                         | Listar todos los productos            | `http://localhost:8080/productos/listar`                                      | `["Teclado","Mouse","Monitor","Portátil","GPU","FANS"]` |
| **POST** | `/productos/crear`                | `nombre` (String)                         | Crear un nuevo producto               | `http://localhost:8080/productos/crear?nombre=Impresora`                      | `Se creó el producto Impresora`      |
| **PUT**  | `/productos/editar`               | `index` (int), `nombre` (String)          | Editar producto por posición en lista | `http://localhost:8080/productos/editar?index=0&nombre=Tablet`                | `El producto Teclado se cambió a: Tablet` |
| **DELETE** | `/productos/eliminar`           | `index` (int)                             | Eliminar producto por posición        | `http://localhost:8080/productos/eliminar?index=2`                            | `El producto Monitor se eliminó`     |

---

### Requisitos
- Java 17+
- Maven configurado
- Spring Boot (3.x recomendado)

### Ejecución
```bash
mvn spring-boot:run