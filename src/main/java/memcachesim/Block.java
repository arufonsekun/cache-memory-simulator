package memcachesim;

import java.security.InvalidParameterException;

public class Block {
    private final MemoryConfig memoryConfig;
    private Cell[] cells;

    public Block(MemoryConfig memoryConfig) {
        this.memoryConfig = memoryConfig;
        this.generateCells(memoryConfig);
    }

    private void generateCells (MemoryConfig memoryConfig) {
        this.cells = new Cell[memoryConfig.getCellsPerBlock()];
        for (int i = 0; i < memoryConfig.getCellsPerBlock(); i++) {
            this.cells[i] = new Cell(memoryConfig);
        }
    }

    public Cell[] getCells() {
        return this.cells;
    }
}
