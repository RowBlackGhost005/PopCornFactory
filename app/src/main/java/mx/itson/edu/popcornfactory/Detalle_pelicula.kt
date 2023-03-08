package mx.itson.edu.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val ivPeliculaImagen:ImageView = findViewById(R.id.ivPeliculaImagen)
        val tvNombrePelicula:TextView = findViewById(R.id.tvNombrePelicula)
        val tvPeliculaDesc: TextView = findViewById(R.id.tvPeliculaDesc)
        val tvSeatsLeft: TextView = findViewById(R.id.tvSeatLeft)

        val bundle = intent.extras

        if(bundle != null){
            ivPeliculaImagen.setImageResource(bundle.getInt("header"))
            tvNombrePelicula.setText(bundle.getString("titulo"))
            tvPeliculaDesc.setText(bundle.getString("sinopsis"))
            tvSeatsLeft.setText(bundle.getString("numberSeats") + " Seats left")
        }

        var btnGetTickets: Button = findViewById(R.id.btnBuyTickets)

        btnGetTickets.setOnClickListener{
            var intent: Intent = Intent(this , SeatSelection::class.java)
            startActivity(intent)
        }
    }
}