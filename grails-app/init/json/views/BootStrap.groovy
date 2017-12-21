package json.views

import me.w2x.example.jsonviews.Author
import me.w2x.example.jsonviews.Book

class BootStrap {

    def init = { servletContext ->
        Author author = Author.findByName('bill')
        if (!author) {
            author = new Author()
            author.name = 'bill'
            author.save(flush: true)

            Book book0 = new Book()
            book0.title = 'book0'
            book0.isbn = '001'
            book0.author = author

            Book book1 = new Book()
            book1.title = 'book0'
            book1.isbn = '002'
            book1.author = author

            author.addToBooks(book0)
            author.addToBooks(book1)
            author.save(flush: true)
        }

    }
    def destroy = {
    }
}
