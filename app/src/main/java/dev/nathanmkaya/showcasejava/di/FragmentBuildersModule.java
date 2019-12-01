package dev.nathanmkaya.showcasejava.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dev.nathanmkaya.showcasejava.ui.ui.dashboard.DashboardFragment;
import dev.nathanmkaya.showcasejava.ui.ui.home.HomeFragment;
import dev.nathanmkaya.showcasejava.ui.ui.notifications.NotificationsFragment;

@Module
public abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract DashboardFragment contributeDashboardFragment();
    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeFragment();
    @ContributesAndroidInjector
    abstract NotificationsFragment contributeNotificationFragment();
}
