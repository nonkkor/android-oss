package com.kickstarter;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.kickstarter.libs.Font;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
  private final Application application;

  public ApplicationModule(final Application application) {
    this.application = application;
  }

  @Provides
  @Singleton
  Application application() {
    return application;
  }

  @Provides
  @Singleton
  Font provideFont() {
    return new Font(application);
  }

  @Provides
  @Singleton
  SharedPreferences provideSharedPreferences() {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }
}