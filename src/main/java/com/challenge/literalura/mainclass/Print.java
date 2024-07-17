package com.challenge.literalura.mainclass;

public class Print {

    public void menu() {
        String menu = """
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                \tBienvenido a LiterAlura
       
                1. Buscar libro por título
                2. Listar libros registrados
                3. Listar autores registrados
                4. Listar autores vivos año
                5. Listar libros por idioma
                6. Ver estadisticas
                7. Top 10 libros más descargados
                8. Buscar autor por nombre
                9. Salir
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Elige una opción:
                """;
        System.out.println(menu);
    }

    public void menuIdioma(){
        String msjIdioma = """
                **********************
                Idiomas disponibles:
                
                  -en  (Inglés)
                  -es  (Español)
                  -fr  (Francés)
                  -de  (Alemán)
                  -it  (Italiano)
                  -pt  (Portugués)
                  -ja  (Japonés)
                *********************
                """;
        System.out.println(msjIdioma);
    }
}
