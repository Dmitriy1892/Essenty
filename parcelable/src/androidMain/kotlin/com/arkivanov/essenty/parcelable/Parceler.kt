package com.arkivanov.essenty.parcelable

import com.arkivanov.essenty.utils.internal.PARCELABLE_DEPRECATED_MESSAGE

@Deprecated(PARCELABLE_DEPRECATED_MESSAGE)
actual typealias Parceler<T> = kotlinx.parcelize.Parceler<T>
