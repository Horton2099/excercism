// @ts-check

/**
 * Implement the classes etc. that are needed to solve the
 * exercise in this file. Do not forget to export the entities
 * you defined so they are available for the tests.
 */

export class Size {
    constructor(width = 80, height = 60) {
        this.width = width;
        this.height = height;
    }
}

Size.prototype.resize = function (newWidth, newHeight) {
    this.width = newWidth;
    this.height = newHeight;
}

export class Position {
    constructor(x = 0, y = 0) {
        this.x = x;
        this.y = y;
    }
}

Position.prototype.move = function(newX, newY) {
    this.x = newX;
    this.y = newY;
}

export class ProgramWindow {
    constructor() {
        this.screenSize = {width: 800, height: 600};
        this.size = new Size;
        this.position = new Position;
    }

    resize(Size) {
        const maxWidth = this.screenSize.width - this.position.x;
        const maxHeight = this.screenSize.height - this.position.y;
        this.size.width = Math.max(1, Math.min(Size.width, maxWidth))
        this.size.height = Math.max(1, Math.min(Size.height, maxHeight))
    }

    move(Position) {
        const maxX = this.screenSize.width - this.size.width;
        const maxY = this.screenSize.height - this.size.height;
        this.position.x = Math.max(0, Math.min(Position.x, maxX));
        this.position.y = Math.max(0, Math.min(Position.y, maxY))
    }
    


}

export function changeWindow(ProgramWindow) {
    ProgramWindow.size.width = 400;
    ProgramWindow.size.height = 300;
    ProgramWindow.position.x = 100;
    ProgramWindow.position.y = 150;
    return ProgramWindow;
}
    
    

