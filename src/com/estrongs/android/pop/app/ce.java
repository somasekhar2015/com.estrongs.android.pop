package com.estrongs.android.pop.app;

import com.estrongs.fs.h;
import com.estrongs.fs.i;
import com.estrongs.fs.w;

class ce
  implements i
{
  ce(FileChooserActivity paramFileChooserActivity, boolean paramBoolean) {}
  
  public boolean a(h paramh)
  {
    return (paramh.getFileType().a()) && ((!paramh.getName().startsWith(".")) || (a));
  }
}

/* Location:
 * Qualified Name:     com.estrongs.android.pop.app.ce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */