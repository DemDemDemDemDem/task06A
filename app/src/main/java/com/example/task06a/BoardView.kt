package com.example.task06a

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class BoardView: View {
    constructor(context: Context?)  : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    private var backPaint: Paint
    private var button1Paint: Paint
    private var button2Paint: Paint
    private var textPaint: Paint
    private var counterPaint: Paint

    init {
        backPaint = Paint().apply {
            style = Paint.Style.FILL
            color = Color.GREEN
        }
        button1Paint = Paint().apply {
            style = Paint.Style.FILL
            color = Color.RED
        }
        button2Paint = Paint().apply {
            style = Paint.Style.FILL
            color = Color.YELLOW
        }
        textPaint = Paint().apply {
            style = Paint.Style.FILL
            color = Color.GRAY
        }
        counterPaint = Paint().apply {
            style = Paint.Style.FILL
            color = Color.BLACK
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //Background
        //Measuring the size of the background and storing it as a float
        val canvasWidth = width.toFloat()
        val canvasHeight = height.toFloat()

        //Draw rectangle which is the background of the view
        canvas.drawRect(0f, 0f, canvasWidth, canvasHeight, backPaint)


    }


}