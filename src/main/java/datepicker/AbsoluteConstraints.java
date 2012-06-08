// === File Prolog =============================================================
// This code was developed by ITT Corporation for the FAA for the
// CARF project.
//
// --- Notes -------------------------------------------------------------------
//
// Various relevant notes about the source file.
//
// --- Warning -----------------------------------------------------------------
// This software is property of ITT and FAA. Unauthorized use or
// duplication of this software is strictly prohibited. Authorized users
// are subject to the following restrictions:
// * Neither the author, their corporation, nor ITT nor FAA is responsible
// for any consequence of the use of this software.
// * The origin of this software must not be misrepresented either by
// explicit claim or by omission.
// * Altered versions of this software must be plainly marked as such.
// * This notice may not be removed or altered.
//
// === End File Prolog =========================================================

package datepicker;

import java.awt.Dimension;
import java.awt.Point;

/** 
 * An object that encapsulates position and (optionally) size for
 * Absolute positioning of components.
 *
 * @version 1.01, Aug 19, 1998
 */
public class AbsoluteConstraints implements java.io.Serializable {

    /** generated Serialized Version UID */
    static final long serialVersionUID = 5261460716622152494L;

    /** The X position of the component */
    public int x;
    /** The Y position of the component */
    public int y;
    /** The width of the component or -1 if the component's preferred width should be used */
    public int width = -1;
    /** The height of the component or -1 if the component's preferred height should be used */
    public int height = -1;

    /** 
     * Creates a new AbsoluteConstraints for specified position.
     * 
     * @param pos The position to be represented by this AbsoluteConstraints
     */
    public AbsoluteConstraints(Point pos) {
        this(pos.x, pos.y);
    }

    /** 
     * Creates a new AbsoluteConstraints for specified position.
     * 
     * @param x The X position to be represented by this AbsoluteConstraints
     * @param y The Y position to be represented by this AbsoluteConstraints
     */
    public AbsoluteConstraints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** 
     * Creates a new AbsoluteConstraints for specified position and size.
     * 
     * @param pos  The position to be represented by this AbsoluteConstraints
     * @param size The size to be represented by this AbsoluteConstraints or null
     *             if the component's preferred size should be used
     */
    public AbsoluteConstraints(Point pos, Dimension size) {
        this.x = pos.x;
        this.y = pos.y;
        if (size != null) {
            this.width = size.width;
            this.height = size.height;
        }
    }

    /** 
     * Creates a new AbsoluteConstraints for specified position and size.
     * 
     * @param x      The X position to be represented by this AbsoluteConstraints
     * @param y      The Y position to be represented by this AbsoluteConstraints
     * @param width  The width to be represented by this AbsoluteConstraints or -1 if the
     *               component's preferred width should be used
     * @param height The height to be represented by this AbsoluteConstraints or -1 if the
     *               component's preferred height should be used
     */
    public AbsoluteConstraints(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /** @return The X position represented by this AbsoluteConstraints */
    public int getX() {
        return x;
    }

    /** @return The Y position represented by this AbsoluteConstraints */
    public int getY() {
        return y;
    }

    /** 
     * @return The width represented by this AbsoluteConstraints or -1 if the
     * component's preferred width should be used
     */
    public int getWidth() {
        return width;
    }

    /** 
     * @return The height represented by this AbsoluteConstraints or -1 if the
     * component's preferred height should be used
     */
    public int getHeight() {
        return height;
    }

    public String toString() {
        return super.toString() + " [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }

}
