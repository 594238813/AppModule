package com.lib_widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.NestedScrollingChild;

/**
 * author : hyt
 * date : 2020/9/29
 * description :
 */
public class ColorView extends AppCompatTextView implements NestedScrollingChild {

    public ColorView(Context context) {
        super(context);
    }

    public ColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private int lastX, lastY;    //保存手指点下的点的坐标

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        //获取到手指处的横坐标和纵坐标
         int x = (int) event.getX();
         int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;

            case MotionEvent.ACTION_MOVE:
                invalidate();
                //计算移动的距离
                int offX = x - lastX;
                int offY = y - lastY;
                layout(getLeft()+offX,getTop()+offY, getRight()+offX,getBottom()+offY);
                
                break;
        }
        //刷新界面
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        setMeasuredDimension(600,300);
    }
}
