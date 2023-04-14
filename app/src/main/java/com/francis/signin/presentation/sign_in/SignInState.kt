package com.francis.signin.presentation.sign_in

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInErrorMessage: String? = null
)