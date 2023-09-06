# SOLID GUIDE


| Principio de Responsabilidad Única (SRP)       | Single Responsibility Principle (SRP) |
|-------------------------------------------------|--------------------------------------|
| Un objeto Java debe tener una sola razón para cambiar. Ejemplo: Una clase "Usuario" que solo gestiona datos de usuario, sin lógica adicional. | A Java object should have only one reason to change. Example: A "User" class that only manages user data, without additional logic. |

| Principio de Abierto/Cerrado (OCP)              | Open/Closed Principle (OCP)          |
|-------------------------------------------------|--------------------------------------|
| Debe ser posible extender una clase sin modificar su código fuente. Ejemplo: Usar interfaces y clases abstractas para extender funcionalidad en lugar de modificar clases existentes. | It should be possible to extend a class without modifying its source code. Example: Use interfaces and abstract classes to extend functionality instead of modifying existing classes. |

| Principio de Sustitución de Liskov (LSP)         | Liskov Substitution Principle (LSP) |
|-------------------------------------------------|--------------------------------------|
| Los objetos derivados deben ser sustituibles por sus objetos base sin afectar la funcionalidad. Ejemplo: Si una clase "Ave" tiene un método "volar()", todas las subclases de "Ave" deben implementar "volar()" correctamente. | Derived objects should be substitutable for their base objects without affecting functionality. Example: If a "Bird" class has a "fly()" method, all subclasses of "Bird" should implement "fly()" correctly. |

| Principio de Segregación de Interfaces (ISP)     | Interface Segregation Principle (ISP) |
|-------------------------------------------------|--------------------------------------|
| Las interfaces deben ser específicas para los clientes que las utilizan. Ejemplo: Dividir una interfaz "IReproductorMultimedia" en "IReproductorAudio" e "IReproductorVideo" para que los clientes solo implementen lo que necesitan. | Interfaces should be specific to the clients that use them. Example: Splitting an "IMultimediaPlayer" interface into "IAudioPlayer" and "IVideoPlayer" so that clients only implement what they need. |

| Principio de Inversión de Dependencias (DIP)     | Dependency Inversion Principle (DIP) |
|-------------------------------------------------|--------------------------------------|
| Las clases de alto nivel no deben depender de las clases de bajo nivel. Ambos deben depender de abstracciones. Ejemplo: Usar inyección de dependencias para que una clase de alto nivel dependa de una interfaz en lugar de una implementación concreta. | High-level classes should not depend on low-level classes. Both should depend on abstractions. Example: Use dependency injection so that a high-level class depends on an interface instead of a concrete implementation. |
