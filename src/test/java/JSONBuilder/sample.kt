package JSONBuilder

import DTO.User
import com.google.gson.GsonBuilder

/**
 * @author jayaprakashs on 10/1/2018
 */
class sample {

    companion object {
        fun userJson() {
            val gson = GsonBuilder().setPrettyPrinting().create()
            val user = User("test", "demo", "jayaprakash.s@harman.com", "998657111", "Admin", "", User.Properties("", "71711b35909944de989296b1a59121c9"), 0)
            val jsonUser = gson.toJson(user)
            println(jsonUser)
        }
    }
}