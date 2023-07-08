package com.example.worldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listview)
        var adapter =MyAdapter(this,generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()


    }

    fun generateData() : ArrayList<CountryModel>{
        var countriesList = ArrayList<CountryModel>()

        var country1 : CountryModel = CountryModel(
            "Brazil" ,
            "5",
            R.drawable.brazil
        )

        var country2 : CountryModel = CountryModel(
            "france" ,
            "2",
            R.drawable.france
        )

        var country3 : CountryModel = CountryModel(
            "germany" ,
            "4",
            R.drawable.germany
        )

        var country4 : CountryModel = CountryModel(
            "saudi arabia" ,
            "3",
            R.drawable.saudiarabia
        )

        var country5 : CountryModel = CountryModel(
            "spain" ,
            "1",
            R.drawable.span
        )

        var country6 : CountryModel = CountryModel(
            "united kingdom" ,
            "1",
            R.drawable.unitedkingdom
        )

        var country7 : CountryModel = CountryModel(
            "unites states" ,
            "0",
            R.drawable.unitedstates
        )
        countriesList.add(country1)
        countriesList.add(country2)
        countriesList.add(country3)
        countriesList.add(country4)
        countriesList.add(country5)
        countriesList.add(country6)
        countriesList.add(country7)

        return countriesList
    }

}