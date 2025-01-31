package avenue.joke.relation.buisiness.soot.com.jokeavenue.JokeAvenueRealm

//これ Realm をアスタリスクで読み込んじゃあかんの？
import io.realm.Realm
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import java.util.*


//アクセス修飾子を open にしないといかんらしい。

open class JAJokeObject : RealmObject() {

    var id: String? = null
    var jokeTitle: String? = null
    var jokeText: String? = null
    var category: Long? = null

    fun shapeJokeText(): String? {
        return jokeText?.replace("<br>", "\n\n")
    }
}
