package com.grape.id;
/**
 * Copyright Google Inc. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created June 02, 2020 by GrapeID.com.
 * Written by Steve Stansbury, for GrapeID.com
 *
 */
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

public class RegistrationCompleteActivity extends AppCompatActivity {

    TextView mWelecomeTitle;
    Button mNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_regtrialinfo);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        String welcomeheaderinfotext = "@string/welcomeHeaderInfoText";
        mWelecomeTitle = (TextView) findViewById(R.id.welcomeInfoHeaderText);
        mWelecomeTitle.setText(HtmlCompat.fromHtml(welcomeheaderinfotext, HtmlCompat.FROM_HTML_MODE_LEGACY));

        mNextBtn = (Button) findViewById(R.id.next_button);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.grape.id", "com.grape.id.RegistrationTrialInfoActivity"));
                startActivity(intent);
            }
        });

    }
}
