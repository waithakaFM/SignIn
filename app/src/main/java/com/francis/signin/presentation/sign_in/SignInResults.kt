package com.francis.signin.presentation.sign_in

data class SignInResults(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId: String,
    val userName: String?,
    val profilePicUrl: String?
)
