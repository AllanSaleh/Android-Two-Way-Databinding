package com.android.example.twowaydatabindingexample;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Objects;

public class Echo {
    public ObservableField<String> text = new ObservableField<>();

    public TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!Objects.equals(text.get(), s.toString())) {
                text.set(s.toString());
            }
        }
    };
}
