/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.sql.*;

@Path("/books")
public class Book {

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        // Establish database connection here
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL", "admin", "");
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addBook(@FormParam("isbn") String isbn,
                        @FormParam("title") String title,
                        @FormParam("price") BigDecimal price,
                        @FormParam("publisher") String publisher) throws SQLException, ClassNotFoundException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO book (isbn, title, price, publisher) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, isbn);
            stmt.setString(2, title);
            stmt.setBigDecimal(3, price);
            stmt.setString(4, publisher);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/{title}")
    @Produces(MediaType.TEXT_HTML)
    public String getBookByTitle(@PathParam("title") String title) throws SQLException, ClassNotFoundException {
    try (Connection conn = getConnection();
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM book WHERE title = ?")) {
        stmt.setString(1, title);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return "<h2>ISBN:" + rs.getString("isbn") + "<br>Title:"+rs.getString("title")+"<br>Price:"+rs.getDouble("price")+"<br>Publisher:"+rs.getString("publisher")+"</h1>";
        } else {
            return "<h1>Book not found</h1>";
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return "<h1>Error occurred</h1>";
    }
}
}
