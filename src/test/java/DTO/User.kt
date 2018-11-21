package DTO

import com.google.gson.annotations.SerializedName


data class User(
        @SerializedName("FirstName") val firstName: String,
        @SerializedName("LastName") val lastName: String,
        @SerializedName("Email") val email: String,
        @SerializedName("Phone") val phone: String,
        @SerializedName("Role") val role: String,
        @SerializedName("ProfileImageUrl") val profileImageUrl: String,
        @SerializedName("Properties") val properties: Properties,
        @SerializedName("ETag") val eTag: Int
) {

    data class Properties(
            @SerializedName("PropertyName") val propertyName: String,
            @SerializedName("PropertyId") val propertyId: String
    )
}