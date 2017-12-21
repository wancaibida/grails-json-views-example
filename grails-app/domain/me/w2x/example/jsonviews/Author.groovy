package me.w2x.example.jsonviews

class Author {

    String name

    static hasMany = [books: Book]

    static constraints = {
    }

    static mapping = {
    }
}
