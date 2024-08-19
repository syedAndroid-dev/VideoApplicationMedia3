package com.syeddev.videoapplicationmedia3.di

import android.app.Application
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object MyVideoPlayerModule {

    @Provides
    @ViewModelScoped
    fun provideVideoPlayer(app:Application):Player{
        return ExoPlayer.Builder(app)
            .build()
    }
}