package com.tankwar.model;

import com.tankwar.util.MoveConstant;

public abstract class MovingModel {

    protected int x;
    protected int y;
    protected int speed = MoveConstant.SPEED_DEFAULT;
    protected int with;
    protected int hight;
    protected int direct = MoveConstant.DIRECT_DOWN;
    protected boolean isRun = true;

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWith() {
        return with;
    }

    public int getHight() {
        return hight;
    }

    public int getOldDirect() {
        return direct;
    }

    public void setOldDirect(int direct) {
        this.direct = direct;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"x\":")
                .append('\"').append(x).append('\"');
        sb.append(",\"y\":")
                .append('\"').append(y).append('\"');
        sb.append(",\"speed\":")
                .append('\"').append(speed).append('\"');
        sb.append(",\"with\":")
                .append('\"').append(with).append('\"');
        sb.append(",\"hight\":")
                .append('\"').append(hight).append('\"');
        sb.append('}');
        return sb.toString();
    }


    public void move() {
        if (isRun) {
            switch (direct) {
                case MoveConstant.DIRECT_DOWN:
                    x += speed;
                    break;
                case MoveConstant.DIRECT_UP:
                    x -= speed;
                    break;
                case MoveConstant.DIRECT_LIFT:
                    y -= speed;
                    break;
                case MoveConstant.DIRECT_RIGHT:
                    y += speed;
                    break;

            }
        }
    }

    public void back() {
        switch (direct) {
            case MoveConstant.DIRECT_DOWN:
                x += -speed;
                break;
            case MoveConstant.DIRECT_UP:
                x -= -speed;
                break;
            case MoveConstant.DIRECT_LIFT:
                y -= -speed;
                break;
            case MoveConstant.DIRECT_RIGHT:
                y += -speed;
                break;

        }
    }


}
