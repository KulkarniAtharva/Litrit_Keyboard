package ind.keyboard.settings;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

class CustomPageAdapter extends FragmentPagerAdapter
{
	  private List<Fragment> fragments;
	  public CustomPageAdapter(FragmentManager fm, List<Fragment> fragments)
	  {
	    super(fm);
	    this.fragments = fragments;
	  }

	  @Override 
	  public Fragment getItem(int position)
	  {
	    return this.fragments.get(position);
	  }

	  @Override
	  public int getCount()
	  {
	    return this.fragments.size();

	  }
}