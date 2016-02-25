# SmoothCheckBox

[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)

##介绍 Introduction##
**SmoothCheckBox** - 一款动感的CheckBox。(A dynamic checkBox.)

##截图 Screenshot##
在gif中看上去有卡顿感，但在真机调试中很流畅。(In the gif appears to have felt, but in the real machine debugging very smooth.)

![screenshot_gif](https://github.com/yuqirong/SmoothCheckBox/blob/master/screenshots/20151213140251.gif)

##下载 Demo Download##
[Download](https://github.com/yuqirong/SmoothCheckBox/blob/master/screenshots/app-debug-unaligned.apk)

##博客 Blog##
[《实现炫酷的CheckBox，就这么简单》](http://yuqirong.me/2015/12/05/%E5%AE%9E%E7%8E%B0%E7%82%AB%E9%85%B7%E7%9A%84CheckBox%EF%BC%8C%E5%B0%B1%E8%BF%99%E4%B9%88%E7%AE%80%E5%8D%95/)

##用法 Usage##
###step 1###
把SmoothCheckBox控件添加到你的布局文件中。(Include the SmoothCheckBox widget in your layout.)

	<com.yuqirong.smoothcheckbox.view.SmoothCheckBox
			android:id="@+id/smoothCheckBox"
            android:layout_width="40dp"
            android:layout_height="40dp"
            app:borderColor="@android:color/holo_green_light"
            app:duration="500"
            app:tickColor="#4db6ac"
            app:tickWidth="4dp"
            app:trimColor="#3f51b5" />

###step 2###

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmoothCheckBox checkBox = (SmoothCheckBox) findViewById(R.id.smoothCheckBox);
        checkBox.setOnCheckedChangeListener(new SmoothCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SmoothCheckBox smoothCheckBox, boolean isChecked) {
                Log.i(TAG, "isChecked" + isChecked);
            }
        });
    }

好了，通过上面的两步你可以使用它了。(Well, by the above two steps, you can use SmoothCheckBox, enjoy it!)

##自定义属性 Customization##
你可在下面属性中自定义任何你想要的。(You can customize any of the following properties you want.)

| Name          | format        | Description |
| ------------- |:-------------:| -----------:|
| duration      | integer       | 动画持续时间(Anime Duration) |
| strikeWidth     | dimension\|reference      |   边框宽度(Border Width) |
| borderColor | color\|reference     |    边框颜色(Border Color) |
| trimColor | color\|reference     |    CheckBox选中的颜色(Selected Color) |
| tickColor | color\|reference     |    对勾的颜色(Tick Color) |
| tickWidth | dimension\|reference      |    对勾的宽度(Tick Width) |

##致谢 Thanks##
Inspired by

* [SmoothCheckBox](https://github.com/andyxialm/SmoothCheckBox) created by [andyxialm](https://github.com/andyxialm).

##联系方式 Contact Me##
新浪微博 Sina Weibo：[@活得好像一条狗](http://weibo.com/yyyuqirong) 

电子邮箱 Email：<yqr271228943@gmail.com>

If you have any questions or want to contact me,you can also leave a message in [Issues](https://github.com/yuqirong/DragGridView/issues).

##开源许可证 License##

    Copyright (c) 2016 yuqirong 

    Licensed under the Apache License, Version 2.0 (the "License”);
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.