package me.w2x.example.jsonviews

class AuthorController {
    static responseFormats = ['json', 'xml']

    def index() {
        /**
         * 这里需要注意res的类型，
         * 如果是List类型，则json view中的model名称则为authorList
         * 如果是Set类型，则json view中的model名称则为authorSet
         */
        def res = Author.list()
        respond(res, [view: 'authorList'])
    }

    def show() {
        respond(Author.last())
    }

    def detail() {
        def author = Author.last()
        respond(author, [view: 'authorDetail'])
    }

    def detail2() {
        def author = Author.last()
        respond(author, [view: '/author/authorDetail'])
    }

    def save(AuthorCommand command) {
        Author author = new Author(command.properties)
        respond(author)
    }
}
