package org.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    Integer id;
    String title;
    Double price;
    String description;
    String category;
    String image;
    Rating rating;
}
