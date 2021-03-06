package breakout;

import java.util.Vector;

public class LevelPackage {

    static Vector<Level> levels = null;

    public static Vector<Level> getCurrentLevels(boolean copy) {
        if (levels == null) {
            levels = getStandardLevels(true);
        }

        return copy ? copy(levels) : levels;
    }

    public static void resetLevels() {
        levels = getStandardLevels(true);
    }

    private static Vector<Level> copy(Vector<Level> levels) {
        Vector<Level> newLevels = new Vector<>();

        for (Level l : levels) {
            Level newL = new Level(l.getSize().width, l.getSize().height, new Position(l.getStart()),
                         new Transform(l.getStartTransform()));

            for (BlockAbstract b : l.getBlocks()) {
                BlockAbstract bl = b.copy();
                newL.addBlock(bl);
            }

            newLevels.add(newL);
        }

        return newLevels;
    }

    public static void setLevels(Vector<Level> levels) {
        LevelPackage.levels = levels;
    }

    public static Vector<Level> getStandardLevels(boolean copy) {
        Vector<Level> levels = new Vector<>();

        Level level = new Level(2, 5, new Position(30, 300), new Transform(2 ,4));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(100));
        level.addBlock(new BlockWeak(false));
        levels.add(level);

        level = new Level(8, 1, new Position(30, 300), new Transform(2 ,4));
        level.addBlock(new BlockWeak(5));
        level.addBlock(new BlockWeak(40));
        level.addBlock(new BlockWeak(20));
        level.addBlock(new BlockWeak(100));
        level.addBlock(new BlockWeak(80));
        level.addBlock(new BlockWeak(40));
        level.addBlock(new BlockWeak(30));
        level.addBlock(new BlockWeak(50));
        levels.add(level);

        level = new Level(3, 5, new Position(40, 300), new Transform(-2 ,4));
        level.addBlock(new BlockWeak(35));
        level.addBlock(new BlockWeak(30));
        level.addBlock(new BlockWeak(25));
        level.addBlock(new BlockWeak(20));
        level.addBlock(new BlockWeak(15));
        level.addBlock(new BlockWeak(30));
        level.addBlock(new BlockWeak(25));
        level.addBlock(new BlockWeak(20));
        level.addBlock(new BlockWeak(15));
        level.addBlock(new BlockWeak(10));
        level.addBlock(new BlockWeak(25));
        level.addBlock(new BlockWeak(20));
        level.addBlock(new BlockWeak(15));
        level.addBlock(new BlockWeak(10));
        level.addBlock(new BlockWeak(5));
        levels.add(level);

        level = new Level(6, 8, new Position(40, 300), new Transform(2 ,4));
        level.addBlock(new BlockWeak(100));
        level.addBlock(new BlockWeak(100));
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockWeak(100));
        level.addBlock(new BlockWeak(100));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(90));
        level.addBlock(new BlockWeak(90));
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockWeak(90));
        level.addBlock(new BlockWeak(90));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(80));
        level.addBlock(new BlockWeak(80));
        level.addBlock(new BlockWeak(80));
        level.addBlock(new BlockWeak(80));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(70));
        level.addBlock(new BlockWeak(70));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(60));
        level.addBlock(new BlockWeak(60));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockWeak(false));
        level.addBlock(new BlockStrong());
        level.addBlock(new BlockWeak(50));
        level.addBlock(new BlockWeak(50));
        level.addBlock(new BlockWeak(50));
        level.addBlock(new BlockWeak(50));
        level.addBlock(new BlockWeak(50));
        level.addBlock(new BlockWeak(50));
        level.addBlock(new BlockStrong());
        levels.add(level);

        return copy ? copy(levels) : levels;
    }
}