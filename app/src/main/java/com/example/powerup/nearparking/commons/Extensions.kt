@file:JvmName("ExtensionsUtils")
package com.example.powerup.nearparking.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author: Sergio on 30/11/2016.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}