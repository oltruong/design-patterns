package fr.oltruong.pattern.prototype;

/**
 * @author oltruong
 */
public interface Prototype
{

    Prototype clone()
        throws CloneNotSupportedException;
}
