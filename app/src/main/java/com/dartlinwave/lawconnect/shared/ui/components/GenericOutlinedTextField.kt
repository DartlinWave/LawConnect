package com.dartlinwave.lawconnect.shared.ui.components

import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.foundation.layout.fillMaxWidth

/**
 * A reusable outlined text field composable for user input.
 *
 * @param value The current text to display inside the text field.
 * @param label The label to display inside the text field.
 * @param onValueChange Callback invoked when the text changes.
 * @param modifier Modifier to be applied to the text field.
 */
@Composable
fun GenericOutlinedTextField(
    value: TextFieldValue,
    label: String,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        modifier = modifier.fillMaxWidth()
    )
}