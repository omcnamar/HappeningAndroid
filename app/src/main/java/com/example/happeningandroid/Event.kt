package com.example.happeningandroid

class Event {
    var id: String = ""
    var owner: String = ""
    var templateId: String = ""
    var imageURL: String? = ""
    var lat: Double = 0.0
    var long: Double = 0.0
    var items = HashMap< String, HashMap<String, String>>()
    var idOfUsersWhoLiked = HashMap<String, String>()

    constructor()

    constructor(id: String,
                owner: String,
                templateId: String,
                imageURL: String,
                lat: Double,
                long: Double,
                items: HashMap<String, HashMap<String, String>>,
                idOfUsersWhoLiked: HashMap<String, String>) {

        this.id = id
        this.owner = owner
        this.templateId = templateId
        this.imageURL = imageURL
        this.lat = lat
        this.long = long
        this.items = items
        this.idOfUsersWhoLiked = idOfUsersWhoLiked
    }

    override fun toString(): String {
        return "Event(id='$id', owner='$owner', templateId='$templateId', imageURL=$imageURL, lat=$lat, long=$long, items=$items, idOfUsersWhoLiked=$idOfUsersWhoLiked)"
    }
}