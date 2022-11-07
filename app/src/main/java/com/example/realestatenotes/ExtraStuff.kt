package com.example.realestatenotes

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Type
import kotlin.math.abs
import kotlin.math.sqrt

class ExtraStuff {

    //add note activity from note app
    class AddNoteActivity : AppCompatActivity() {
        /*
        lateinit var binding: ActivityAddNoteBinding
        lateinit var editTitle: EditText
        lateinit var editText: EditText
        lateinit var buttonSave: Button
        lateinit var noteList: ArrayList<NotesData>

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_add_note)

            editTitle = findViewById(R.id.editTextTitle)
            editText = findViewById(R.id.editTextText)
            buttonSave = findViewById(R.id.buttonSave)
            binding = ActivityAddNoteBinding.inflate(layoutInflater)
            setContentView(binding.root)
            val sharedPref = getSharedPreferences("notes", MODE_PRIVATE)
            val gson = Gson()
            val json = sharedPref.getString("notes", null)
            val type: Type = object : TypeToken<ArrayList<NotesData?>?>() {}.type
            //noteList = gson.fromJson<Any>(json, type) as ArrayList<NotesData>


            buttonSave.setOnClickListener {
                val sharedPref = getSharedPreferences("notes", MODE_PRIVATE)
                val editor = sharedPref.edit()
                val gson = Gson()
                val json: String = gson.toJson(noteList)
                editor.putString("notes", json)
                editor.apply()
                Toast.makeText(this, "Note saved successfully", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

         */

    }
    // main activity from note app
    /*
    private lateinit var addButton: Button
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    lateinit var recyclerAdapter: RecyclerAdapter
    lateinit var noteList: ArrayList<NotesData>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager

        val sharedPreferences = getSharedPreferences("notes", MODE_PRIVATE)
        val gson = Gson()
        val json = sharedPreferences.getString("courses", null)
        val type: Type = object : TypeToken<ArrayList<NotesData?>?>() {}.type
        //noteList = gson.fromJson<Any>(json, type) as ArrayList<NotesData>
        //adapter = RecyclerAdapter(noteList)
        recyclerView.adapter = adapter

        addButton = findViewById(R.id.buttonAdd)
        onClick()

    }

     */

    private fun onClick() {
        /*
        addButton.setOnClickListener {
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

         */

    }

    // notes data from note app
    data class NotesData(
        var noteTitle: String,
        var noteText: String)

    // recycler adapter from notes app
    /*
    class RecyclerAdapter(private var noteList: ArrayList <NotesData>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder> () {


        private var images = intArrayOf(R.drawable.notes_icon)

        override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
            val item = LayoutInflater.from(parent.context).inflate(R.layout.note_layout, parent, false)
            return ViewHolder(item)
        }

        override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
            holder.noteTitle.text = noteList.get(position).noteTitle
            holder.noteText.text = noteList.get(position).noteText
            holder.noteImage.setImageResource(images[position])
        }

        override fun getItemCount(): Int {
            return noteList.size
        }

     */
        /*
        inner class ViewHolder(NoteView: View): RecyclerView.ViewHolder(NoteView) {
            var noteImage: ImageView
            var noteTitle: TextView
            var noteText: TextView
            var noteDelete: Button
            val sharedPref = itemView.context.getSharedPreferences("notes", Context.MODE_PRIVATE)

            init {
                noteImage = NoteView.findViewById(R.id.note_image)
                noteTitle = NoteView.findViewById(R.id.note_title)
                noteText = NoteView.findViewById(R.id.note_text)
                noteDelete = NoteView.findViewById(R.id.note_delete)

                sharedPref.getString("title", null)
                sharedPref.getString("note", null)
            }


        }

         */
    }

    // calculator
    private lateinit var textView: TextView
    private lateinit var deleteButton: Button
    private lateinit var pointButton: Button
    private lateinit var additionButton: Button
    private lateinit var subtractionButton: Button
    private lateinit var multiplicationButton: Button
    private lateinit var divisionButton: Button
    private lateinit var percentageButton: Button
    private lateinit var squareRootButton: Button
    private lateinit var signButton: Button
    private lateinit var oneButton: Button
    private lateinit var twoButton: Button
    private lateinit var threeButton: Button
    private lateinit var fourButton: Button
    private lateinit var fiveButton: Button
    private lateinit var sixButton: Button
    private lateinit var sevenButton: Button
    private lateinit var eightButton: Button
    private lateinit var nineButton: Button
    private lateinit var zeroButton: Button
    private lateinit var equalsButton: Button

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        onClick()
    }

     */

    private fun init() {
        /*
        textView = findViewById(R.id.textView)
        deleteButton = findViewById(R.id.deleteButton)
        pointButton = findViewById(R.id.pointButton)
        additionButton = findViewById(R.id.additionButton)
        subtractionButton = findViewById(R.id.subtractionButton)
        multiplicationButton = findViewById(R.id.multiplicationButton)
        divisionButton = findViewById(R.id.divisionButton)
        percentageButton = findViewById(R.id.percentageButton)
        squareRootButton = findViewById(R.id.squareRootButton)
        signButton = findViewById(R.id.signButton)
        oneButton = findViewById(R.id.oneButton)
        twoButton = findViewById(R.id.twoButton)
        threeButton = findViewById(R.id.threeButton)
        fourButton = findViewById(R.id.fourButton)
        fiveButton = findViewById(R.id.fiveButton)
        sixButton = findViewById(R.id.sixButton)
        sevenButton = findViewById(R.id.sevenButton)
        eightButton = findViewById(R.id.eightButton)
        nineButton = findViewById(R.id.nineButton)
        zeroButton = findViewById(R.id.zeroButton)
        equalsButton = findViewById(R.id.equalsButton)

         */
    }

    /*
    @SuppressLint("SetTextI18n")
    private fun onClick() {
        // output num after pressing "="
        var num = 0.0

        //saving last operator for multiple operators used in one equation
        var lastOperator = ""

        //each number clicked
        zeroButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("0")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("0")
            }
            else {
                textView.text = ""
                textView.append("0")
            }
        }

        oneButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("1")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("1")
            }
            else {
                textView.text = ""
                textView.append("1")
            }
        }

        twoButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("2")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("2")
            }
            else {
                textView.text = ""
                textView.append("2")
            }
        }

        threeButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("3")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("3")
            }
            else {
                textView.text = ""
                textView.append("3")
            }
        }

        fourButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("4")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("4")
            }
            else {
                textView.text = ""
                textView.append("4")
            }
        }

        fiveButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("5")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("5")
            }
            else {
                textView.text = ""
                textView.append("5")
            }
        }

        sixButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("6")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("6")
            }
            else {
                textView.text = ""
                textView.append("6")
            }
        }

        sevenButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("7")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("7")
            }
            else {
                textView.text = ""
                textView.append("7")
            }
        }

        eightButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("8")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("8")
            }
            else {
                textView.text = ""
                textView.append("8")
            }
        }

        nineButton.setOnClickListener {
            if(textView.text.isDigitsOnly() && textView.text.toString().toInt() != 0 || textView.text.contains(".")) {
                textView.append("9")
            }
            else if (num == 0.0 && textView.text.contains("-")) {
                textView.append("9")
            }
            else {
                textView.text = ""
                textView.append("9")
            }
        }

        //clicked on button "C"
        deleteButton.setOnClickListener {
            textView.text = "0"
            num = 0.0
        }

        //clicked on button "."
        pointButton.setOnClickListener {
            if (textView.text.toString().contains(".")) {
                textView.text = textView.text
            }else {
                textView.append(".")
            }
        }

        //addition function
        additionButton.setOnClickListener {
            if (lastOperator == "" || lastOperator == "=" || lastOperator == "+") {
                num += textView.text.toString().toDouble()
            }
            if (lastOperator == "-") {
                if (textView.text.toString().toDouble() > 0) {
                    num -= textView.text.toString().toDouble()
                }else {
                    num += textView.text.toString().toDouble()
                }
            }
            if (lastOperator == "*") {
                num *= textView.text.toString().toDouble()
            }
            if (lastOperator == "/") {
                num /= textView.text.toString().toDouble()
            }
            textView.text = "+"
            lastOperator = "+"
        }

        //subtraction function
        subtractionButton.setOnClickListener {
            if (num == 0.0 || lastOperator == "+" || lastOperator == "=") {
                num += textView.text.toString().toDouble()
            }
            if (lastOperator == "-"){
                if (textView.text.toString().toDouble() < 0) {
                    num = textView.text.toString().toDouble()
                } else {
                    num -= textView.text.toString().toDouble()
                }
            }
            if (lastOperator == "*") {
                num *= textView.text.toString().toDouble()
            }
            if (lastOperator == "/") {
                num /= textView.text.toString().toDouble()
            }
            textView.text = "-"
            lastOperator = "-"
        }

        //multiplication function
        multiplicationButton.setOnClickListener {
            if(num == 0.0 || lastOperator == "+" || lastOperator == "=") {
                num += textView.text.toString().toDouble()
            }
            if (lastOperator == "-") {
                if (textView.text.toString().toDouble() >= 0) {
                    num -= textView.text.toString().toDouble()
                } else {
                    num = textView.text.toString().toDouble()
                }
            }
            if (lastOperator == "*"){
                num *= textView.text.toString().toDouble()
            }
            if (lastOperator == "/") {
                num /= textView.text.toString().toDouble()
            }
            textView.text = "*"
            lastOperator = "*"
        }

        //division function
        divisionButton.setOnClickListener {
            if (num == 0.0 || lastOperator == "+" || lastOperator == "=") {
                num += textView.text.toString().toDouble()
            }
            if (lastOperator == "-") {
                if (textView.text.toString().toDouble() >= 0) {
                    num -= textView.text.toString().toDouble()
                } else {
                    num = textView.text.toString().toDouble()
                }
            }
            if (lastOperator == "*") {
                num *= textView.text.toString().toDouble()
            }
            if (lastOperator == "/" ){
                num /= textView.text.toString().toDouble()
            }
            textView.text = "/"
            lastOperator = "/"
        }

        //pressed on "%"
        percentageButton.setOnClickListener {
            var thisNum = textView.text.toString().toDouble()
            thisNum /= 100
            textView.text = thisNum.toString()
        }

        //pressed on "√"
        squareRootButton.setOnClickListener {
            val thisNum = textView.text.toString().toDouble()
            val result = sqrt(thisNum)
            val intCheck = result.toString().substringAfter(".")
            if (intCheck == "0") {
                textView.text = result.toInt().toString()
            }else {
                textView.text = result.toString()
            }
        }

        //pressed on "+/-"
        signButton.setOnClickListener {
            if (textView.text != "+" || textView.text != "-" || textView.text != "*" || textView.text != "/") {
                var num = textView.text.toString().toDouble()
                num = if (num > 0) {
                    -num
                } else {
                    abs(num)
                }
                val intCheck = num.toString().substringAfter(".")
                if (intCheck == "0") {
                    textView.text = num.toInt().toString()
                }else {
                    textView.text = num.toString()
                }
            } else {
                lastOperator = ""
                num = 0.0
                textView.text = num.toString()
            }
        }

        //final result after pressing "="
        equalsButton.setOnClickListener {
            if (lastOperator == "+") {
                num += textView.text.toString().toDouble()
            }
            if (lastOperator == "-") {
                num -= textView.text.toString().toDouble()
            }
            if (lastOperator == "*") {
                num *= textView.text.toString().toDouble()
            }
            if (lastOperator == "/") {
                num /= textView.text.toString().toDouble()
            }
            val intCheck = num.toString().substringAfter(".")
            if (intCheck == "0") {
                textView.text = num.toInt().toString()
            }else {
                textView.text = num.toString()
            }
            lastOperator = "="
            num = 0.0
        }
    }

     */

