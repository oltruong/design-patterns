package com.oltruong.pattern.creational.prototype;

/**
 * @author oltruong
 */
public interface Prototype
{

    Prototype clone()
        throws CloneNotSupportedException;
}
