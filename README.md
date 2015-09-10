KitKatEmoji
===========

Library for Emoji View like Hangouts, Emoji TextView and Emoji EditText

<img src="https://github.com/chathudan/KitKatEmoji/raw/dev/screens/Android_KitKat_Emojicons.gif" width="300" height="500">

## Usage

#####Emojicon EditText



```javascript
<com.sithagi.kitkatemoji.EmojiconEditText
                android:id="@+id/txt_sentMessage"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textAppearance="?android:attr/textAppearanceMedium"
                 />
```

#####Emojicon EditText



```javascript
<com.sithagi.kitkatemoji.EmojiconEditText
                android:id="@+id/txt_sentMessage"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textAppearance="?android:attr/textAppearanceMedium"
                 />
```


#####Emojicon TextView



```javascript
<com.sithagi.kitkatemoji.EmojiconTextView
                android:id="@+id/txt_sentMessage"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textAppearance="?android:attr/textAppearanceMedium"
                 />
```


#####EmojiView


```javascript
<LinearLayout
        android:id="@+id/footer_for_emojiicons"
        android:layout_width="match_parent"
        android:layout_height="@dimen/keyboard_height"
        android:background="@android:color/transparent"
        android:orientation="vertical"
        android:visibility="gone">

        <fragment
            android:id="@+id/emojicons"
            class="com.sithagi.kitkatemoji.EmojiconsFragment"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="5dp"
            android:requiresFadingEdge="none"
            tools:layout="@layout/emojicons" />
    </LinearLayout>
```

## License

KitKatEmoji is released under the <a href="https://raw.githubusercontent.com/chathudan/KitKatEmoji/dev/README.md">Apache License
                           Version 2.0</a>.
