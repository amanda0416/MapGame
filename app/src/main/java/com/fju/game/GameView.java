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
    //private float posX , posY;
    Lion lion;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (lion == null) {
            lion = new Lion(this);
        }
        Log.d("Game","OnDraw : " + getWidth() + " , " + getHeight());
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.lion);
        //canvas.drawBitmap(bitmap,posX,posY,paint);
        canvas.drawBitmap(bitmap, lion.getX(), lion.getY(), paint);
//        float imageHight = bitmap.getHeight();
//        float imageWidth = bitmap.getWidth();

//        for (int i = 0 ; i < getHeight()-bitmap.getHeight() ; i+=50){  //   i+=50  是i=i+50的縮寫
//            canvas.drawBitmap(bitmap,400,300+i,paint);
//        }
    }

    public void moveUp(){
//        if (posY > 0){
//          posY -= 50;
//          invalidate();    //invalidate  重畫的意思
//        }
        if (lion.getY() > 0) {
            lion.setDirection(lion.DIRECTION_UP);
            invalidate();
        }
    }
    public void moveDown(){
//        if (posY < getHeight()-250){
//            posY += 50;
//            invalidate();
//        }
        if (lion.getY() < getHeight()-250) {
            lion.setDirection(lion.DIRECTION_DOWN);
            invalidate();
        }
    }
    public void moveLeft(){
//        if (posX > 0){
//            posX -= 50;
//            invalidate();
//        }
        if (lion.getX() > 0) {
            lion.setDirection(lion.DIRECTION_LEFT);
            invalidate();
        }
    }
    public void moveRight(){
//        if (posX < getWidth()-250){
//            posX += 50;
//            invalidate();
//        }
        if (lion.getX() < getWidth()-250) {
            lion.setDirection(lion.DIRECTION_RIGHT);
            invalidate();
        }
    }

//    public float getPosX() {
//        return posX;
//    }
//    public float getPosY() {
//        return posY;
//    }
//
//    public void setPosX(float posX) {
//       if (posX > 0 && posX < getWidth()-190){
//           this.posX = posX;
//       }
//    }
//    public void setPosY(float posY) {
//        if (posY > 0 && posY < getHeight()-185){
//            this.posY = posY;
//        }
//    }
}
