package com.fuguoyong.online;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/3/30.
 */

public class FragmentMp4 extends Fragment implements TextureView.SurfaceTextureListener{

    private TextureView textureView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

                            //fragment 需要播放视频控件
        textureView = new TextureView(getContext());


        return textureView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textureView.setSurfaceTextureListener(this);
    }
    // 确实准备好了，可以进行视频播放的展示了
    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {




    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }
}
