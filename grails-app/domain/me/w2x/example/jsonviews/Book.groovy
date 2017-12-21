package me.w2x.example.jsonviews

class Book {
    String title
    String isbn

    static belongsTo = [author: Author]

    static constraints = {
    }
}
