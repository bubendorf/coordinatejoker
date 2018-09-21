package com.github.siggel.coordinatejoker;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

public class CustomKeyboardView extends KeyboardView {

    public CustomKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomKeyboardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*public CustomKeyboardView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }*/

    @Override
    protected boolean onLongPress(final Keyboard.Key popupKey) {
        /*Context context = getContext();
        final View custom = LayoutInflater.from(context)
                .inflate(R.layout.popup_layout, new FrameLayout(context));
        popup = new PopupWindow(context);
        popup.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.showAtLocation(this, Gravity.NO_GRAVITY, popupKey.x, popupKey.y-50);
*/
        return true;
    }
}