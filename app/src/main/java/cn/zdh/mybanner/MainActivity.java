package cn.zdh.mybanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cn.zdh.bannerlibrary.BannerLayout;
import cn.zdh.mybanner.adapter.WebBannerAdapter;

public class MainActivity extends AppCompatActivity implements BannerLayout.OnBannerItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BannerLayout recyclerBanner = (BannerLayout) findViewById(R.id.recycler);
        recyclerBanner.setItemSpace(30);//调整图片间距离
        BannerLayout bannerVertical = (BannerLayout) findViewById(R.id.recycler_ver);


        List<String> list = new ArrayList<>();
        list.add("http://img0.imgtn.bdimg.com/it/u=1352823040,1166166164&fm=27&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=2293177440,3125900197&fm=27&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3967183915,4078698000&fm=27&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3184221534,2238244948&fm=27&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1794621527,1964098559&fm=27&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1243617734,335916716&fm=27&gp=0.jpg");
        WebBannerAdapter webBannerAdapter = new WebBannerAdapter(this, list);
        webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "点击了第  " + position + "  项", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerBanner.setAdapter(webBannerAdapter);


        //banner图2
        WebBannerAdapter WebBannerAdapter2 = new WebBannerAdapter(this, list);
        WebBannerAdapter2.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "点击了第  " + position + "  项", Toast.LENGTH_SHORT).show();
            }
        });
        bannerVertical.setAdapter(WebBannerAdapter2);
    }


    public void jump(View view) {
        startActivity(new Intent(MainActivity.this, NormalActivity.class));
    }

    public void jumpOverFlying(View view) {
        startActivity(new Intent(MainActivity.this, OverFlyingActivity.class));
    }

    @Override
    public void onItemClick(int position) {

    }
}
