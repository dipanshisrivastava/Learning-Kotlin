fun main()
{
    var userName = "Hello"
    var user = User()
    println(user.userName)
}
class User
{
    var userName : String = ""
    set(value) { 
        field = value
    }
    get() {
        return field
    }
}