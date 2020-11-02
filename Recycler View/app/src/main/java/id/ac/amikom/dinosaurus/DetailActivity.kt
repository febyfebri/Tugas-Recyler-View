package id.ac.amikom.dinosaurus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dinosaurus = intent.getParcelableExtra<Dinosaurus>("DINO")
        dinosaurus?.apply {
            detailimage.setImageResource(gambar)
            detailname.text = nama
            detailketerangan.text = keterangan
            detailurl.text = url
        }
    }
}