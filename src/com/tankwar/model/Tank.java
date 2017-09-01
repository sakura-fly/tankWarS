package com.tankwar.model;

import com.tankwar.util.MoveConstant;
import com.tankwar.util.TankConstant;

import java.awt.*;

public class Tank extends MovingModel implements PaintModel{
    protected int oldDirect;
    protected int gunX;

    public Tank(int x, int y, Color color) {
        super(x, y, color);
    }

    public int getGunX() {
        return gunX;
    }

    public void setGunX(int gunX) {
        this.gunX = gunX;
    }

    public int getGunY() {
        return gunY;
    }

    public void setGunY(int gunY) {
        this.gunY = gunY;
    }

    protected int gunY;

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        switch (direct) {
            case MoveConstant.DIRECT_UP:
                g.fill3DRect(x, y, TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_CATERPILLAR_HIGHT, false);
                g.fill3DRect(x + TankConstant.TANK_CATERPILLAR_WITH,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_BODY_HIGHT / 2, TankConstant.TANK_BODY_WITH,
                        TankConstant.TANK_BODY_HIGHT, false);
                g.fill3DRect(x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH, y,
                        TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_CATERPILLAR_HIGHT, false);
                g.drawOval(x + TankConstant.TANK_CATERPILLAR_WITH,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_RADIUS / 2, TankConstant.TANK_RADIUS,
                        TankConstant.TANK_RADIUS);
                g.drawLine(x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2,
                        x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2, y);
                gunX = x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2;
                gunY = y;
                break;
            case MoveConstant.DIRECT_DOWN:
                g.fill3DRect(x, y, TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_CATERPILLAR_HIGHT, false);
                g.fill3DRect(x + TankConstant.TANK_CATERPILLAR_WITH,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_BODY_HIGHT / 2, TankConstant.TANK_BODY_WITH,
                        TankConstant.TANK_BODY_HIGHT, false);
                g.fill3DRect(x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH, y,
                        TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_CATERPILLAR_HIGHT, false);
                g.drawOval(x + TankConstant.TANK_CATERPILLAR_WITH,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_RADIUS / 2, TankConstant.TANK_RADIUS,
                        TankConstant.TANK_RADIUS);
                g.drawLine(x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2,
                        x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2,
                        y + TankConstant.TANK_CATERPILLAR_HIGHT / 2 + TankConstant.TANK_CATERPILLAR_HIGHT / 2);
                gunX = x + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2;
                gunY = y + TankConstant.TANK_CATERPILLAR_HIGHT / 2 + TankConstant.TANK_CATERPILLAR_HIGHT / 2;
                break;
            case MoveConstant.DIRECT_RIGHT:
                g.fill3DRect(x, y, TankConstant.TANK_CATERPILLAR_HIGHT, TankConstant.TANK_CATERPILLAR_WITH, false);
                g.fill3DRect(x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_BODY_HIGHT / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_BODY_HIGHT, TankConstant.TANK_BODY_WITH, false);
                g.fill3DRect(x, y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH,
                        TankConstant.TANK_CATERPILLAR_HIGHT, TankConstant.TANK_CATERPILLAR_WITH, false);
                g.drawOval(x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_RADIUS / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_RADIUS, TankConstant.TANK_RADIUS);
                g.drawLine(x + TankConstant.TANK_CATERPILLAR_HIGHT / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2,
                        x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 + TankConstant.TANK_CATERPILLAR_HIGHT / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2);
                gunX = x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 + TankConstant.TANK_CATERPILLAR_HIGHT / 2;
                gunY = y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2;
                break;
            case MoveConstant.DIRECT_LIFT:
                g.fill3DRect(x, y, TankConstant.TANK_CATERPILLAR_HIGHT, TankConstant.TANK_CATERPILLAR_WITH, false);
                g.fill3DRect(x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_BODY_HIGHT / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_BODY_HIGHT, TankConstant.TANK_BODY_WITH, false);
                g.fill3DRect(x, y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH,
                        TankConstant.TANK_CATERPILLAR_HIGHT, TankConstant.TANK_CATERPILLAR_WITH, false);
                g.drawOval(x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_RADIUS / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH, TankConstant.TANK_RADIUS, TankConstant.TANK_RADIUS);
                g.drawLine(x + TankConstant.TANK_CATERPILLAR_HIGHT / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2,
                        x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_CATERPILLAR_HIGHT / 2,
                        y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2);
                gunX = x + TankConstant.TANK_CATERPILLAR_HIGHT / 2 - TankConstant.TANK_CATERPILLAR_HIGHT / 2;
                gunY = y + TankConstant.TANK_CATERPILLAR_WITH + TankConstant.TANK_BODY_WITH / 2;
                break;

            default:
                direct = oldDirect;
//                isMoving = false;
//                doDraw(g);
                break;
        }
    }

    @Override
    public int getOldDirect() {
        return oldDirect;
    }

    @Override
    public void setOldDirect(int oldDirect) {
        this.oldDirect = oldDirect;
    }
}
