package kelocker.assigment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
   private lateinit var btn0: Button
   private lateinit var btn1: Button
   private lateinit var btn2: Button
   private lateinit var btn3: Button
   private lateinit var btn4: Button
   private lateinit var btn5: Button
   private lateinit var btn6: Button
   private lateinit var btn7: Button
   private lateinit var btn8: Button
   private lateinit var btn9: Button
   private lateinit var btnback: Button
   private lateinit var btndone: Button
   private lateinit var textView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a="0000"




        intilizaebtn()
        btndone.setOnClickListener {
            if (textView.text.toString() ==a)
            {

               val i= Intent(this,sucessfull::class.java)
                startActivity(i)
                finish()
            }
            else
            {





                for (i in 0..4) {

                       Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()


                }

//                for (i in a) {
//i++                 Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
//                }
            }
        }
        btnback.setOnClickListener {

            textView.setText(" ")


        }




    }

    private fun intilizaebtn() {
        btn0=findViewById(R.id.btn0)
        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn4=findViewById(R.id.btn4)
        btn5=findViewById(R.id.btn5)
        btn6=findViewById(R.id.btn6)
        btn7=findViewById(R.id.btn7)
        btn8=findViewById(R.id.btn8)
        btn9=findViewById(R.id.btn9)
       btnback =findViewById(R.id.btnback)
       btndone =findViewById(R.id.btnopen)
        textView=findViewById(R.id.keypadtext)
    }

}



