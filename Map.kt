/*
Map is a collection that contains pairs of objects.
Map holds the data in the form of pairs which consists of a key and a value.
Map keys are unique and the map holds only one value for each key.
There are immutable and mutable maps, i.e mapOf() and mutableMapOf().
*/

fun main()
{
    val sites = mapOf("pragprog" to "https://www.pragprog.com",
        "agiledeveloper" to "https://agiledeveloper.com")

    println(sites)
    println(sites.size)

    println(sites.containsKey("agiledeveloper")) //true
    println(sites.containsValue("http://www.example.com")) //false
    println(sites.contains("agiledeveloper")) //true
    println("agiledeveloper" in sites) //true

    /*
        val pragProgSite: String = sites.get("pragprog") //ERROR

        It’s not guaranteed that a key exists in the map, so there may not be a value for it.
        The get() method returns a nullable type—see Nullable References.
        Kotlin protects us at compile time and wants us to use a nullable reference type
    */

    val pragProgSite: String? = sites.get("pragprog")
    println(pragProgSite)

    val pragProgSite2: String? = sites["pragprog"]
    println(pragProgSite2)

    // We can avoid the nullable reference type by providing an alternative, default, value if the key doesn’t exist.
    val agiledeveloper = sites.getOrDefault("agiledeveloper", "http://www.example.com")
    println(agiledeveloper)

    // mapOf() function provides a read-only reference, so we can’t mutate the map.
    val sitesWithExample = sites + ("example" to "http://www.example.com")
    println(sitesWithExample)

    for ((key, value) in sites) {
        println("$key --- $value")
    }
}