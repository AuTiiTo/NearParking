package com.example.powerup.nearparking.parking

/**
 * @author: Sergio on 30/11/2016.
 */


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.powerup.nearparking.R
import com.example.powerup.nearparking.parking.ParkingAdapter
import com.example.powerup.nearparking.commons.ParkingItem
import com.example.powerup.nearparking.commons.inflate
import kotlinx.android.synthetic.main.parkings_fragment.*
import kotlinx.android.synthetic.main.parkings_fragment.view.*

class ParkingsFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        parking_list.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
        }

        initAdapter()

        if (savedInstanceState == null){
            val parkings = mutableListOf<ParkingItem>()
            for (i in 1..10) {
                parkings.add(ParkingItem(
                        "name$i",
                        "distance$i",
                        "direction$i",
                        "price$i",
                        "places$i"
                ))
            }
            (parking_list.adapter as ParkingAdapter).addParking(parkings)
        }
    }

    private fun initAdapter() {
        if (parking_list != null) {
            parking_list.adapter = ParkingAdapter()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.parkings_fragment)
    }
}