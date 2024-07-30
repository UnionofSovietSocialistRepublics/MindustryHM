package hm;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import hm.contents.*;

public class hm extends Mod{

    public hm(){
        Log.info("hardmoding");
    }

    @Override
    public void loadContent(){
        Log.info("Loading maps...");
        hmSectorPresets.load();
    }

}
