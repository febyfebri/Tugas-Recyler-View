package id.ac.amikom.dinosaurus

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dinosaurus(
    var nama : String,
    var keterangan : String,
    var url : String,
    var gambar : Int
) : Parcelable