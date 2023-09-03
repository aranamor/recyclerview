package com.example.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycle : RecyclerView

    private var countryname = ArrayList<String>()
    private var detailslist = ArrayList<String>()
    private var imagelist = ArrayList<Int>()

    private lateinit var adapter: Countriesadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle = findViewById(R.id.recycle)

        recycle.layoutManager = LinearLayoutManager(this@MainActivity)


        countryname.add("India")
        countryname.add("USA")
        countryname.add("Canada")

        detailslist.add("This is the flag of India")
        detailslist.add("This is the flag of USA")
        detailslist.add("This is the flag of Canada")

        imagelist.add(R.drawable.india)
        imagelist.add(R.drawable.usa)
        imagelist.add(R.drawable.canada)

        adapter = Countriesadapter(countryname, detailslist, imagelist, this@MainActivity)

        recycle.adapter = adapter

    }
}