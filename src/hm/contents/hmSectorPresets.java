package hm.contents;

import mindustry.type.*;

import static mindustry.content.Planets.*;

public class hmSectorPresets{
    public static SectorPreset
    groundZero, frozenForest, craters, ruinousShores, fungalPass;


    public static void load(){
        //region serpulo
        groundZero = new SectorPreset("groundZero", serpulo, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 2;
            overrideLaunchDefaults = true;
            noLighting = true;
            startWaveTimeMultiplier = 3f;
        }};
        frozenForest = new SectorPreset("frozenForest", serpulo, 86){{
            captureWave = 15;
            difficulty = 2;
        }};

        craters = new SectorPreset("craters", serpulo, 18){{
            captureWave = 20;
            difficulty = 4;

        }};

        ruinousShores = new SectorPreset("ruinousShores", serpulo, 213){{
            captureWave = 30;
            difficulty = 3;
        }};
        fungalPass = new SectorPreset("fungalPass", serpulo, 21){{
            difficulty = 4;
        }};
    }
}