package id.stu.pu.sm.cyyuan.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


var images = listOf(
    R.drawable.dice1,
    R.drawable.dice2,
    R.drawable.dice3,
    R.drawable.dice4,
    R.drawable.dice5,
    R.drawable.dice6
)

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img.setOnClickListener(this)
        img.setOnLongClickListener(this)
//        buttonClick()
    }

//    override fun buttonClick(v:View?) {
//        }

    override fun onClick(v: View?) {
        var counter = (1..6).random()
        txv.text = counter.toString()
        img.setImageResource(images[counter-1])
//        when (counter) {
//            1 -> img.setImageResource(R.drawable.dice1)
//            2 -> img.setImageResource(R.drawable.dice2)
//            3 -> img.setImageResource(R.drawable.dice3)
//            4 -> img.setImageResource(R.drawable.dice4)
//            5 -> img.setImageResource(R.drawable.dice5)
//            6 -> img.setImageResource(R.drawable.dice6)
//        }


//        if (v == img) {
//            txv.text = "I'm clicked!"
//        }
//        else {
//            txv.text = "Welcome to the Dice Game"
//        }
    }

    override  fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            img.setImageResource(R.drawable.dice)
            txv.text = "Welcome to the Dice Game"
        }
        else if (event?.action == MotionEvent.ACTION_UP) {
            var counter = (1..6).random()
            txv.text = counter.toString()

            when (counter) {
            1 -> img.setImageResource(R.drawable.dice1)
            2 -> img.setImageResource(R.drawable.dice2)
            3 -> img.setImageResource(R.drawable.dice3)
            4 -> img.setImageResource(R.drawable.dice4)
            5 -> img.setImageResource(R.drawable.dice5)
            6 -> img.setImageResource(R.drawable.dice6)
        }
        }
        return true
    }

    override fun onLongClick(p0: View?): Boolean {
        img.setImageResource(R.drawable.dice)
        txv.text = "Long Clicked!!!"
        return true
    }
}