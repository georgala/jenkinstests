open class Animal {
    var onoma: String? = null
    var eidos: String? = null
    private var gender: Char? = null

    constructor(onoma: String, eidos: String, gender: Char) {
        this.onoma = onoma
        this.eidos = eidos
        this.gender = gender
    }
    constructor()
    fun setGender(gender: Char){
        if (gender == 'M' || gender == 'F'){
            this.gender = gender
        }
    }
    fun getGender(): Char? {
        return this.gender
    }

}
class Bird: Animal {
    var ftera: Double? = null
    constructor(onoma: String, eidos: String, gender: Char, ftera: Double) : super (onoma, eidos, gender){
        this.ftera = ftera
    }
}

fun main(args: Array<String>) {
    var animal = Animal()
    animal.setGender('F')
    println(animal.getGender())
    var lion = Animal(onoma = "Liontari", eidos = "Ailouros", gender = 'M')
    var kotsyfos = Bird(onoma = "Kotsifi", eidos = "Pouli", gender = 'M', ftera = 4.52)

    println(lion.onoma + ":" + lion.eidos)
    println(kotsyfos.onoma + ":" + kotsyfos.ftera)

}

