package com.olive.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="book_tab")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
@Id
private int id;
private String bookName;
private String bookAuthor;
private double bookCost;
private String bookType;
}
