// === File Prolog =============================================================
// This code was developed by ITT Corporation for the CARF project.
//
// --- Notes -------------------------------------------------------------------
//
// Various relevant notes about the source file.
//
// --- Warning -----------------------------------------------------------------
// This software is property of ITT (FAA?). Unauthorized use or
// duplication of this software is strictly prohibited. Authorized users
// are subject to the following restrictions:
// * Neither the author, their corporation, nor ITT (FAA?) is responsible
// for any consequence of the use of this software.
// * The origin of this software must not be misrepresented either by
// explicit claim or by omission.
// * Altered versions of this software must be plainly marked as such.
// * This notice may not be removed or altered.
//
// === End File Prolog =========================================================

package datepicker;

import javax.swing.*;

import java.awt.*;

public class DateFieldSample
{
    public static void main(String[] args)
    {
        JDialog dlg = new JDialog(new Frame(), true);
        DateFieldPanel df = new DateFieldPanel();
        dlg.getContentPane().add(df);
        dlg.pack();
        dlg.show();
        // System.out.println(df.getDate().toString());
        System.exit(0);
    }
}
