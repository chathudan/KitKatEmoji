package com.sithagi.kitkatemoji;


import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author Chathura Wijesinghe (cdanasiri@gmail.com)
 */
public class EmojiconTextView extends TextView {
    private int mEmojiconSize;

    public EmojiconTextView(Context context) {
        super(context);
        init(null);
    }

    public EmojiconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public EmojiconTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs == null) {
            mEmojiconSize = (int) getTextSize();
        } else {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.EmojiEveryWhere);
            mEmojiconSize = (int) a.getDimension(R.styleable.EmojiEveryWhere_emojiconSize, getTextSize());
            a.recycle();
        }
        setText(getText());
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        SpannableStringBuilder builder;

        if (text != null)
            builder = new SpannableStringBuilder(text);
        else
            builder = new SpannableStringBuilder("");


        EmojiconHandler.addEmojis(getContext(), builder, mEmojiconSize);
        super.setText(builder, type);
    }

    /**
     * Set the size of emojicon in pixels.
     */
    public void setEmojiconSize(int pixels) {
        mEmojiconSize = pixels;
    }
}
