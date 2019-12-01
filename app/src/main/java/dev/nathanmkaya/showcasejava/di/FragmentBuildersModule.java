package dev.nathanmkaya.showcasejava.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dev.nathanmkaya.showcasejava.ui.ui.agency.agencyFragment;
import dev.nathanmkaya.showcasejava.ui.ui.past.PastFragment;
import dev.nathanmkaya.showcasejava.ui.ui.upcoming.UpcomingFragment;

@Module
public abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract agencyFragment contributeDashboardFragment();
    @ContributesAndroidInjector
    abstract PastFragment contributeHomeFragment();
    @ContributesAndroidInjector
    abstract UpcomingFragment contributeNotificationFragment();
}
