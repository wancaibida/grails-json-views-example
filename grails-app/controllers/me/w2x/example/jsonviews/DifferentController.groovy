package me.w2x.example.jsonviews

class DifferentController {
    static responseFormats = ['json', 'xml']

    def index() {
        def res = Author.list()
        respond(res, [view: '/author/authorList'])
    }

    def show() {
        respond(Author.last())
    }

    def detail() {
        def author = Author.last()
        respond(author, [view: '/author/authorDetail'])
    }

}
