package barbosa.santos.quiz23a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)

        trueButton.setOnClickListener { view: View ->
            Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_LONG).show()
        }
    }
}