package com.example.dagger2.android.droidwiki.dagger

import com.example.dagger2.android.droidwiki.ui.homepage.HomepagePresenter
import com.example.dagger2.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.example.dagger2.android.droidwiki.ui.search.EntryPresenter
import com.example.dagger2.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Provides
    @Singleton
    fun provideHomePagePresenter(): HomepagePresenter = HomepagePresenterImpl()
    fun provideSearchPagePresenter(): EntryPresenter = EntryPresenterImpl()
}