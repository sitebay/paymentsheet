package com.stripe.android.paymentsheet.forms

import com.stripe.android.paymentsheet.ElementType
import com.stripe.android.paymentsheet.specifications.IdentifierSpec

/**
 * The identifier here comes from the form element (section, static text, etc)
 */
class FormFieldValues(
    val fieldValuePairs: Map<IdentifierSpec, FormFieldEntry> = mapOf(),
    val saveForFutureUse: Boolean,
    val showsMandate: Boolean
)

data class FormFieldEntry(
    val type: ElementType,
    val value: String?,
    val isComplete: Boolean
)
