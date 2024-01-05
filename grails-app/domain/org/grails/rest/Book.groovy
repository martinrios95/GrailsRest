package org.grails.rest

import grails.rest.Resource

@Resource(uri="/books", readOnly=false)
class Book {
    String id = UUID.randomUUID().toString()
    String name
    float price
    String category
    String author

    static mapping = {
        id generator: 'assigned'
    }
}