best_travel 1.0: (SpringBoot 3.1.2 - JAVA 17)
- Se incluyen las dependencias Jpa, postgres y lombok.
- Esta creado el arcvhivo docker_compose.yml en la carpeta raiz (incluye como crear la base de datos y que datos cargar -volumes-, que la BD sea postgres y el puerto 5432:5432).
- Nombre DB: best_travel - Usuario: alejandro - Password: debuggeandoideas.
- Se crea un directorio en la carpeta raiz db/sql/create_schema.sql (estructura o esquema de la bd).
- Se añade al directorio db/sql/data.sql (datos de ejemplo para cargar en la bd al iniciar docker).
- Se crea el sistema de paquetes general.
- Todas las entidades estan creadas.
- Se crea un enum con los nombres de las aerolineas.
- Todas las relaciones OneToMany y ManyToOne estan mapeadas.
- Tenemos 2 repositorios solo FlyRepository y HotelRepository.

best_travel 1.1: (Añadir el resto de repositorios)# travelShop
