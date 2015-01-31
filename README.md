KitKatEmoji
===========
[![AndroidLibs](https://img.shields.io/badge/AndroidLibs-KitKatEmoji-brightgreen.svg?style=flat)](https://www.android-libs.com/lib/hangoutsemojiview)

EmojiEverywhere library for Hangout Emoji View , TextView and EditText


![image](https://github.com/chathudan/KitKatEmoji/blob/dev/KitKatEmoji.png)


## TextView Example

```xml
   <sithagi.com.emojieverywhere.EmojiconTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:id="@+id/txt_message" />
```

## EditText Example

```xml
    <sithagi.com.emojieverywhere.EmojiconEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/ed_compose" />
```


## EmojiView

```xml
    <LinearLayout
        android:id="@+id/footer_for_emojiicons"
        android:layout_width="match_parent"
        android:layout_height="230dp"
        android:background="@android:color/transparent"
        android:orientation="vertical"
        android:visibility="visible" >
        <fragment
            android:id="@+id/emojicons"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="5dp"
            android:requiresFadingEdge="none"
            class="sithagi.com.emojieverywhere.EmojiconsFragment"
            tools:layout="@layout/emojicons" />
    </LinearLayout>
```




