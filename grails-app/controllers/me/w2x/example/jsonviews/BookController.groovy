package me.w2x.example.jsonviews

class BookController {
    static responseFormats = ['json']

    def index() {
        respond(Book.list(), [view: 'bookList'])
    }

    def indexDetail() {
        def bookList = Book.list()
        respond(bookList, [view: 'bookListDetail'])
    }

    def show() {
        respond(Book.last())
    }

    def detail() {
        respond(Book.last(), [view: '_bookDetail'])
    }

}
