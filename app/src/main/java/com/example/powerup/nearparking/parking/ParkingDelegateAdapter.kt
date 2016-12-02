package com.example.powerup.nearparking.parking

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.powerup.nearparking.R
import com.example.powerup.nearparking.adapter.ViewType
import com.example.powerup.nearparking.adapter.ViewTypeDelegateAdapter
import com.example.powerup.nearparking.commons.ParkingItem
import com.example.powerup.nearparking.commons.inflate
import kotlinx.android.synthetic.main.parking_card.view.*

/**
 * @author: Sergio on 1/12/2016.
 */
class ParkingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as ParkingViewHolder
        holder.bind(item as ParkingItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup) = ParkingViewHolder(parent)

    class ParkingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.parking_card)){
        fun bind(item: ParkingItem) = with(itemView) {
            tv_parking_name.text = item.name
            tv_parking_distance.text = item.distance
            tv_parking_direction.text = item.direction
            tv_parking_price.text = item.price
            tv_parking_places.text = item.places
        }
    }
}


