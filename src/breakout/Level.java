package breakout;

import java.io.Serializable;
import java.util.LinkedList;

public class Level {

    private Size size;
    private LinkedList<BlockAbstract> blocks;
    private Position start;
    private Transform startTransform;
    private int remaining = 0;
    private int maxCount = 0;


    public Level (int width, int height, Position start, Transform startTransform) {
        size = new Size(width, height);
        blocks = new LinkedList<BlockAbstract>();
        this.start = start;
        this.startTransform = startTransform;
    }

    public void addBlock(BlockAbstract block) {
        if (block.isDestroyable() && block.isVis()) {
            ++remaining;
        }

        ++maxCount;
        blocks.add(block);
    }

    public BlockAbstract popBlock() {
        BlockAbstract block = blocks.pop();

        if (block.isDestroyable() && block.isVis()) {
            --remaining;
        }
        --maxCount;
        return block;
    }

    public boolean didWin() {
        if (maxCount - blocks.size() >= remaining)
            return true;
        else
            return false;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public LinkedList<BlockAbstract>  getBlocks() {
        return blocks;
    }

    public void updateRemainingAdd(BlockAbstract newBlock, BlockAbstract oldBlock) {
        if (newBlock.isDestroyable() && newBlock.isVis()) {
            if (!oldBlock.isDestroyable() || !oldBlock.isVis()) {
                ++remaining;
            }
        } else {
            if(oldBlock.isDestroyable() && oldBlock.isVis()) {
                --remaining;
            }
        }
    }

    public void setBlocks(LinkedList<BlockAbstract> blocks) {
        this.blocks = blocks;
    }

    public int getRemaining() {
        return remaining;
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Transform getStartTransform() {
        return startTransform;
    }

    public void setStartTransform(Transform startTransform) {
        this.startTransform = startTransform;
    }

}