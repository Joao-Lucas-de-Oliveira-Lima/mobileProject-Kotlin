package com.lifitness.common.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Preview
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.R.drawable.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComposable(labelValue: String, imageVector: ImageVector) {

    var textValue = remember {
        mutableStateOf("")
    }
    Row() {

        OutlinedTextField(
            modifier = Modifier
                .background(Color(35, 33, 33), RoundedCornerShape(12.dp)),
            label = {
                Text(text = labelValue, color = Color.White)
            },
            value = textValue.value,
            onValueChange = {
                textValue.value = it
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.White,
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
            ),
            keyboardOptions = KeyboardOptions.Default,
            textStyle = androidx.compose.ui.text.TextStyle(color = Color.White),
            leadingIcon = {
                Icon(
                    imageVector,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewTextFieldComponent() {
    TextFieldComposable(labelValue = "Preview", imageVector = Icons.Default.Preview)
}
