package com.lifitness.screens.register

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lifitness.R
import com.lifitness.common.composable.CheckboxComponent
import com.lifitness.common.composable.CreateAnAccountText
import com.lifitness.common.composable.GreetingText
import com.lifitness.common.composable.LogoComponent
import com.lifitness.common.composable.PasswordTextFieldComponent
import com.lifitness.common.composable.RegistrationScreenButtonComponent
import com.lifitness.common.composable.TextFieldComponent

@Composable
fun SignUpScreen(){
    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxSize(),
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            LogoComponent()
            Spacer(modifier = Modifier.height(5.dp))
            GreetingText()
            CreateAnAccountText()
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldComponent(
                labelValue = stringResource(id = R.string.sign_up_username_field),
                imageVector = Icons.Default.Person)
            Spacer(modifier = Modifier.height(10.dp))
            TextFieldComponent(
                labelValue = stringResource(id = R.string.sign_up_email_field),
                imageVector = Icons.Default.Email)
            Spacer(modifier = Modifier.height(10.dp))
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.sign_up_password_field),
                imageVector = Icons.Default.Lock)
            Spacer(modifier = Modifier.height(10.dp))
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.sign_up_retype_your_password_field),
                imageVector = Icons.Default.Lock)
            Spacer(modifier = Modifier.height(15.dp))
            CheckboxComponent(text = stringResource(id = R.string.privacy_policy_and_terms_of_use_text))
            Spacer(modifier = Modifier.height(80.dp))
            RegistrationScreenButtonComponent("next")
        }
    }
}

@Preview
@Composable
fun defaultPreviewSignUpScreen(){
    SignUpScreen()
}