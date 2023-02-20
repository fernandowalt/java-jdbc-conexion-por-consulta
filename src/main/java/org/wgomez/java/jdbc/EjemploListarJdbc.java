package org.wgomez.java.jdbc;

import org.wgomez.java.jdbc.modelo.Categoria;
import org.wgomez.java.jdbc.modelo.Producto;
import org.wgomez.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.wgomez.java.jdbc.repositorio.Repositorio;

import java.sql.SQLException;
import java.util.Date;

public class EjemploListarJdbc {
public static void main (String[] args) throws SQLException {

    Repositorio<Producto> repositorio = new ProductoRepositorioImpl();

    repositorio.findAll().forEach(System.out::println);
    System.out.printf(repositorio.findById(16L).getNombre());

    Categoria categoria = new Categoria(2L);
    Producto producto = new Producto("NoteBook Asus ROG", 2550, categoria, new Date());


/*  repositorio.save(producto);*/
    repositorio.delete(20L);

    repositorio.findAll().forEach(System.out::println);


}
}
