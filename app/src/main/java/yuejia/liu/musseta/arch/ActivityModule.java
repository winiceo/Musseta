package yuejia.liu.musseta.arch;

import dagger.Module;
import yuejia.liu.musseta.MussetaActivity;
import yuejia.liu.musseta.MussetaFragment;
import yuejia.liu.musseta.ui.BootstrapActivity;

/**
 * Musseta activity module.
 *
 * @author longkai
 */
@Module(
    injects = {
        MussetaActivity.class,
        MussetaFragment.class,
        BootstrapActivity.class
    },
    addsTo = AndroidModule.class,
    library = true
)
public class ActivityModule {
  private final MussetaActivity activity;

  public ActivityModule(MussetaActivity activity) {
    this.activity = activity;
  }
}