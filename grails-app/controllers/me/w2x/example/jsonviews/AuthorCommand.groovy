package me.w2x.example.jsonviews

import grails.validation.Validateable

/**
 * Created by charles.chen on 14/12/2017.
 */
class AuthorCommand implements Validateable {
    String name

    AuthorCommand() {
        println 'constructor'
    }
}
