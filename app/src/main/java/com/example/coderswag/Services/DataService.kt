package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HODDIES", "hoddieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats= listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie grey", "$28", "hoodie01"),
        Product("Devslopes Hoodie white", "$30", "hoodie02"),
        Product("Devslopes Hoodie black", "$35", "hoodie03"),
        Product("Devslopes Hoodie yellow", "$40", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt black", "$18", "shirt01"),
        Product("Devslopes Shirt badge light grey", "$22", "shirt02"),
        Product("Devslopes Shirt red", "$28", "shirt03"),
        Product("Devslopes Shirt blue", "$30", "shirt04"),
        Product("Devslopes kickstart", "$22", "shirt05")
    )
}