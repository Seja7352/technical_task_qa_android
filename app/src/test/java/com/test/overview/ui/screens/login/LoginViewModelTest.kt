package com.test.overview.ui.screens.login
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LoginViewModelTest {

    @Test
    fun `loginValidation returns true for valid user`() {
        val viewModel = LoginViewModel()

        viewModel.username = "user"
        viewModel.password = "password"

        val result = viewModel.loginValidation()

        assertTrue(result)

        assertFalse(viewModel.showUsernameError)
        assertFalse(viewModel.showPasswordError)
    }

    @Test
    fun `loginValidation returns true for valid user1`() {
        val viewModel = LoginViewModel()

        viewModel.username = "user1"
        viewModel.password = "password"

        val result = viewModel.loginValidation()

        assertTrue(result)

        assertFalse(viewModel.showUsernameError)
        assertFalse(viewModel.showPasswordError)
    }
}