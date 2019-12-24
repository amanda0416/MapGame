package com.fju.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    private float posX , posY;


    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game","OnDraw : " + getWidth() + " , " + getHeight());
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.lion);
        canvas.drawBitmap(bitmap,posX,posY,paint);
//        float imageHight = bitmap.getHeight();
//        float imageWidth = bitmap.getWidth();

//        for (int i = 0 ; i < getHeight()-bitmap.getHeight() ; i+=50){  //   i+=50  是i=i+50的縮寫
//            canvas.drawBitmap(bitmap,400,300+i,paint);
//        }
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosX(float posX) {
       if (posX > 0 && posX < getWidth()-190){
           this.posX = posX;
       }
    }

    public void setPosY(float posY) {
        if (posY > 0 && posY < getHeight()-185){
            this.posY = posY;
        }
    }
}
