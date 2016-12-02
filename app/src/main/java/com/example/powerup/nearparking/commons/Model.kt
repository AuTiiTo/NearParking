package com.example.powerup.nearparking.commons

import com.example.powerup.nearparking.adapter.AdapterConstants
import com.example.powerup.nearparking.adapter.ViewType

/**
 * @author: Sergio on 1/12/2016.
 */

data class ParkingItem(
        val name: String,
        val distance: String,
        val direction: String,
        val price: String,
        val places: String
) : ViewType {
    override fun getViewType() = AdapterConstants.PARKING
}