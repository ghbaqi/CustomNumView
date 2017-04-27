# CustomNumView
仿淘宝 自定义购物车商品 加减 控件

在布局文件中使用 , 支持自定义属性
<com.trilink.ghbaqi.customnumview.CustomNumView
        android:id="@+id/custom"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginTop="50dp"

        app:addsubColor="@color/red"
        app:defValue="50"
        app:maxValue="60"
        app:minValue="40"
        app:numColor="@color/green"
        />
        
        可以设置监听 , 对数字的加减进行监听
        mCustomNumView = (CustomNumView) findViewById(R.id.custom);
        mCustomNumView.setOnNumChangeListener(new CustomNumView.OnNumChangeListener() {
            @Override
            public void onAddClicked(int number) {
                Toast.makeText(MainActivity.this, "add:" + number, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSubClicked(int number) {
                Toast.makeText(MainActivity.this, "sub:" + number, Toast.LENGTH_SHORT).show();
            }
        });
