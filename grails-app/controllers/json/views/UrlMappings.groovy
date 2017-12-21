package json.views

class UrlMappings {

    static mappings = {

        group '/authors', {
            get '/'(controller: 'author', action: 'index')
            get "/$id"(controller: 'author', action: 'show')
            get "/$id/detail"(controller: 'author', action: 'detail')
            get "/$id/detail2"(controller: 'author', action: 'detail2')
            post '/'(controller: 'author', action: 'save')
        }

        group '/authors2', {
            get '/'(controller: 'different', action: 'index')
            get "/$id"(controller: 'different', action: 'show')
            get "/$id/detail"(controller: 'different', action: 'detail')
        }

        group '/books', {
            get '/'(controller: 'book', action: 'index')
            get '/details'(controller: 'book', action: 'indexDetail')
            get "/$id"(controller: 'book', action: 'show')
            get "/$id/detail"(controller: 'book', action: 'detail')
        }

        delete "/$controller/$id(.$format)?"(action: "delete")
        get "/$controller(.$format)?"(action: "index")
        get "/$controller/$id(.$format)?"(action: "show")
        post "/$controller(.$format)?"(action: "save")
        put "/$controller/$id(.$format)?"(action: "update")
        patch "/$controller/$id(.$format)?"(action: "patch")

        "/"(controller: 'application', action: 'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
