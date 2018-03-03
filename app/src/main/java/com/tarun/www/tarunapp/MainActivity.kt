package com.tarun.www.tarunapp
import android.graphics.Color
import java.util.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Toast.makeText(this,"Welcome to this tic tac toe Game you start first",Toast.LENGTH_LONG).show()
    }
    var count=0
    var user=ArrayList<Int>()
    var computer=ArrayList<Int>()
    var activeplayer:Int=1
    protected fun buclick(view:View){
     var buselected:Button=view as Button
     var cellid:Int=0
        when(buselected.id)
        {
            R.id.bu1->cellid=1
            R.id.bu2->cellid=2
            R.id.bu3->cellid=3
            R.id.bu4->cellid=4
            R.id.bu5->cellid=5
            R.id.bu6->cellid=6
            R.id.bu7->cellid=7
            R.id.bu8->cellid=8
            R.id.bu9->cellid=9

        }
        if(activeplayer==1) {
            playgame(cellid,buselected)


        }
    }
    fun playgame(cellid:Int,buselected:Button){
        if(activeplayer==1) {
                buselected.text = "X"
            user.add(cellid)
            buselected.setBackgroundColor(Color.CYAN)
            buselected.isEnabled = false
            activeplayer=2
            count++
            autoplay(count)
        }
        else
        {
            buselected.text="O"
            computer.add(cellid)
            buselected.setBackgroundColor(Color.MAGENTA)
            buselected.isEnabled=false
            activeplayer=1
        }
        findwinner()
    }
    fun autoplay(count:Int){
        if(count==1) {
            if (user.contains(1) || user.contains(3) || user.contains(7) || user.contains(9)) {
                playgame(5, bu5)
            } else if (user.contains(5)) {
                playgame(1, bu1)
            } else {
                playgame(5, bu5)
            }

        }
        else if(computer.contains(1)&&computer.contains(2)&&!user.contains(3)&&!computer.contains(3))
        {
            playgame(3,bu3)
        }
        else if(computer.contains(2)&&computer.contains(3)&&!user.contains(1)&&!computer.contains(1))
        {
            playgame(1,bu1)
        }
        else if(computer.contains(3)&&computer.contains(1)&&!user.contains(2)&&!computer.contains(2)) {
            playgame(2, bu2)
        }
        else if(computer.contains(4)&&computer.contains(5)&&!user.contains(6)&&!computer.contains(6))
        {
            playgame(6,bu6)
        }
        else if(computer.contains(5)&&computer.contains(6)&&!user.contains(4)&&!computer.contains(4))
        {
            playgame(4,bu4)
        }
        else if(computer.contains(6)&&computer.contains(4)&&!user.contains(5)&&!computer.contains(5)) {
            playgame(5, bu5)
        }
        else if(computer.contains(7)&&computer.contains(8)&&!user.contains(9)&&!computer.contains(9))
        {
            playgame(9,bu9)
        }
        else if(computer.contains(8)&&computer.contains(9)&&!user.contains(7)&&!computer.contains(7))
        {
            playgame(7,bu7)
        }
        else if(computer.contains(9)&&computer.contains(7)&&!user.contains(8)&&!computer.contains(8)) {
            playgame(8, bu8)
        }
        else if(computer.contains(1)&&computer.contains(4)&&!user.contains(7)&&!computer.contains(7))
        {
            playgame(7,bu7)
        }
        else if(computer.contains(1)&&computer.contains(7)&&!user.contains(4)&&!computer.contains(4))
        {
            playgame(4,bu4)
        }
        else if(computer.contains(4)&&computer.contains(7)&&!user.contains(1)&&!computer.contains(1)) {
            playgame(1, bu1)
        }
        else if(computer.contains(2)&&computer.contains(5)&&!user.contains(8)&&!computer.contains(8)) {
            playgame(8, bu8)
        }
        else if(computer.contains(2)&&computer.contains(8)&&!user.contains(5)&&!computer.contains(5))
        {
            playgame(5,bu5)
        }
        else if(computer.contains(5)&&computer.contains(8)&&!user.contains(2)&&!computer.contains(2))
        {
            playgame(2,bu2)
        }
        else if(computer.contains(3)&&computer.contains(6)&&!user.contains(9)&&!computer.contains(9)) {
            playgame(9, bu9)
        }
        else if(computer.contains(3)&&computer.contains(9)&&!user.contains(6)&&!computer.contains(6))
        {
            playgame(6,bu6)
        }
        else if(computer.contains(6)&&computer.contains(9)&&!user.contains(3)&&!computer.contains(3))
        {
            playgame(3,bu3)
        }
        else if(computer.contains(1)&&computer.contains(5)&&!user.contains(9)&&!computer.contains(9)) {
            playgame(9, bu9)
        }
        else if(computer.contains(1)&&computer.contains(9)&&!user.contains(5)&&!computer.contains(5))
        {
            playgame(5,bu5)
        }
        else if(computer.contains(5)&&computer.contains(9)&&!user.contains(1)&&!computer.contains(1))
        {
            playgame(1,bu1)
        }
        else if(computer.contains(3)&&computer.contains(5)&&!user.contains(7)&&!computer.contains(7)) {
            playgame(7, bu7)
        }
        else if(computer.contains(3)&&computer.contains(7)&&!user.contains(5)&&!computer.contains(5))
        {
            playgame(5,bu5)
        }
        else if(computer.contains(7)&&computer.contains(5)&&!user.contains(3)&&!computer.contains(3))
        {
            playgame(3,bu3)
        }

        else if(user.contains(1)&&user.contains(2)&&!user.contains(3)&&!computer.contains(3))
        {
            playgame(3,bu3)
        }
        else if(user.contains(2)&&user.contains(3)&&!user.contains(1)&&!computer.contains(1))
        {
            playgame(1,bu1)
        }
        else if(user.contains(3)&&user.contains(1)&&!user.contains(2)&&!computer.contains(2)) {
            playgame(2, bu2)
        }
        else if(user.contains(4)&&user.contains(5)&&!user.contains(6)&&!computer.contains(6))
        {
            playgame(6,bu6)
        }
        else if(user.contains(5)&&user.contains(6)&&!user.contains(4)&&!computer.contains(4))
        {
            playgame(4,bu4)
        }
        else if(user.contains(6)&&user.contains(4)&&!user.contains(5)&&!computer.contains(5)) {
            playgame(5, bu5)
        }
        else if(user.contains(7)&&user.contains(8)&&!user.contains(9)&&!computer.contains(9))
        {
            playgame(9,bu9)
        }
        else if(user.contains(8)&&user.contains(9)&&!user.contains(7)&&!computer.contains(7))
        {
            playgame(7,bu7)
        }
        else if(user.contains(9)&&user.contains(7)&&!user.contains(8)&&!computer.contains(8)) {
            playgame(8, bu8)
        }
        else if(user.contains(1)&&user.contains(4)&&!user.contains(7)&&!computer.contains(7))
        {
            playgame(7,bu7)
        }
        else if(user.contains(1)&&user.contains(7)&&!user.contains(4)&&!computer.contains(4))
        {
            playgame(4,bu4)
        }
        else if(user.contains(4)&&user.contains(7)&&!user.contains(1)&&!computer.contains(1)) {
            playgame(1, bu1)
        }
        else if(user.contains(2)&&user.contains(5)&&!user.contains(8)&&!computer.contains(8)) {
            playgame(8, bu8)
        }
        else if(user.contains(2)&&user.contains(8)&&!user.contains(5)&&!computer.contains(5))
        {
            playgame(5,bu5)
        }
        else if(user.contains(5)&&user.contains(8)&&!user.contains(2)&&!computer.contains(2))
        {
            playgame(2,bu2)
        }
        else if(user.contains(3)&&user.contains(6)&&!user.contains(9)&&!computer.contains(9)) {
            playgame(9, bu9)
        }
        else if(user.contains(3)&&user.contains(9)&&!user.contains(6)&&!computer.contains(6))
        {
            playgame(6,bu6)
        }
        else if(user.contains(6)&&user.contains(9)&&!user.contains(3)&&!computer.contains(3))
        {
            playgame(3,bu3)
        }
        else if(user.contains(1)&&user.contains(5)&&!user.contains(9)&&!computer.contains(9)) {
            playgame(9, bu9)
        }
        else if(user.contains(1)&&user.contains(9)&&!user.contains(5)&&!computer.contains(5))
        {
            playgame(5,bu5)
        }
        else if(user.contains(5)&&user.contains(9)&&!user.contains(1)&&!computer.contains(1))
        {
            playgame(1,bu1)
        }
        else if(user.contains(3)&&user.contains(5)&&!user.contains(7)&&!computer.contains(7)) {
            playgame(7, bu7)
        }
        else if(user.contains(3)&&user.contains(7)&&!user.contains(5)&&!computer.contains(5))
        {
            playgame(5,bu5)
        }
        else if(user.contains(7)&&user.contains(5)&&!user.contains(3)&&!computer.contains(3))
        {
            playgame(3,bu3)
        }
        else if(count==2)
        {
            if(user.contains(1)&&user.contains(9)&&computer.contains(5))
            {
                playgame(4,bu4)
            }
            else if(user.contains(3)&&user.contains(7)&&computer.contains(5))
            {
                playgame(4,bu4)
            }

        }
        else
        {
            var button:Button=bu1
            var c:Int=0
            var cell:Int=0
            for(i in 1..9)
            {
                if(!user.contains(i)||user.contains(i))
                {
                    cell=i
                }
            }
            when(cell)
            {
                1->{
                    c++
                    button=bu1
                }

                2-> {
                    button = bu2
                    c++
                }
                3-> {
                    button = bu3
                    c++
                }
                4-> {
                    button = bu4
                    c++
                }
                5-> {
                    button = bu5
                    c++
                }
                6-> {
                    button = bu6
                    c++
                }
                7->{
                    button=bu7
                    c++
                }
                8-> {
                    button = bu8
                    c++
                }
                9-> {
                    button = bu9
                    c++
                }
            }
            if(c==1)
            playgame(cell,button)


        }

    }
    fun findwinner(){
        var winner:Int=-1
        if(user.contains(1)&&user.contains(2)&&user.contains(3))
        {
            winner=1
        }
        if(user.contains(1)&&user.contains(4)&&user.contains(7))
        {
            winner=1
        }
        if(user.contains(1)&&user.contains(5)&&user.contains(9))
        {
            winner=1
        }
        if(user.contains(2)&&user.contains(5)&&user.contains(8))
        {
            winner=1
        }
        if(user.contains(3)&&user.contains(6)&&user.contains(9))
        {
            winner=1
        }
        if(user.contains(4)&&user.contains(5)&&user.contains(6))
        {
            winner=1
        }
        if(user.contains(7)&&user.contains(8)&&user.contains(9))
        {
            winner=1
        }
        if(user.contains(3)&&user.contains(5)&&user.contains(7))
        {
            winner=1
        }
        if(computer.contains(1)&&computer.contains(2)&&computer.contains(3))
        {
            winner=2
        }
        if(computer.contains(1)&&computer.contains(4)&&computer.contains(7))
        {
            winner=2
        }
        if(computer.contains(1)&&computer.contains(5)&&computer.contains(9))
        {
            winner=2
        }
        if(computer.contains(2)&&computer.contains(5)&&computer.contains(8))
        {
            winner=2
        }
        if(computer.contains(3)&&computer.contains(6)&&computer.contains(9))
        {
            winner=2
        }
        if(computer.contains(3)&&computer.contains(5)&&computer.contains(7))
        {
            winner=2
        }
        if(computer.contains(4)&&computer.contains(5)&&computer.contains(7))
        {
            winner=2
        }
        if(computer.contains(7)&&computer.contains(8)&&computer.contains(9))
        {
            winner=2
        }
        if(winner!=-1)
        {
            if(winner==1)
            {
                Toast.makeText(this,"You win",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"you lose",Toast.LENGTH_LONG).show()

            }
        }


    }

    fun gamereset(view: View){
        bu1.setBackgroundColor(Color.WHITE)
        bu2.setBackgroundColor(Color.WHITE)
        bu3.setBackgroundColor(Color.WHITE)
        bu4.setBackgroundColor(Color.WHITE)
        bu5.setBackgroundColor(Color.WHITE)
        bu6.setBackgroundColor(Color.WHITE)
        bu7.setBackgroundColor(Color.WHITE)
        bu8.setBackgroundColor(Color.WHITE)
        bu9.setBackgroundColor(Color.WHITE)
        bu1.text=""
        bu2.text=""
        bu3.text=""
        bu4.text=""
        bu5.text=""
        bu6.text=""
        bu7.text=""
        bu8.text=""
        bu9.text=""
        bu1.isEnabled=true
        bu2.isEnabled=true
        bu3.isEnabled=true
        bu4.isEnabled=true
        bu5.isEnabled=true
        bu6.isEnabled=true
        bu7.isEnabled=true
        bu8.isEnabled=true
        bu9.isEnabled=true
        user.clear()
        computer.clear()
        count=0

    }


}
