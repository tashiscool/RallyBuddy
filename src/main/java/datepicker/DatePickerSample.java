 //=== File Prolog =============================================================
 //    This code was developed by ITT Corporation for the CARF project. 
 //
 //--- Notes -------------------------------------------------------------------
 //
 //    Various relevant notes about the source file.
 //
 //--- Warning -----------------------------------------------------------------
 //    This software is property of ITT (FAA?).  Unauthorized use or 
 //    duplication of this software is strictly prohibited.  Authorized users
 //    are subject to the following restrictions:
 //    *   Neither the author, their corporation, nor ITT (FAA?) is responsible
 //        for any consequence of the use of this software.
 //    *   The origin of this software must not be misrepresented either by 
 //        explicit claim or by omission.
 //    *   Altered versions of this software must be plainly marked as such.
 //    *   This notice may not be removed or altered.
 //
 //=== End File Prolog =========================================================
package datepicker;


import javax.swing.*;


import java.awt.*;

public class DatePickerSample {
    public static void main(String[] args) {
        JDialog dlg = new JDialog(new Frame(), true);
        DatePicker dp = new DatePicker();
        dp.setHideOnSelect(false);
        dlg.getContentPane().add(dp);
        dlg.pack();
        dlg.show();
        System.out.println(dp.getDate().toString());
        System.exit(0);
    }
}/***********************************************************


 Copyright (C) 2003 Brenda Bell

 ***********************************************************/

/***********************************************************

 This file is part of JavaDatePicker.

 JavaDatePicker is free software; you can redistribute it
 and/or modify it under the terms of the GNU Lesser
 General Public License as published by the Free Software
 Foundation; either version 2 of the License, or (at your
 option) any later version.

 JavaDatePicker is distributed in the hope that it will
 be useful, but WITHOUT ANY WARRANTY; without even the
 implied warranty of MERCHANTABILITY or FITNESS FOR A
 PARTICULAR PURPOSE.  See the GNU Lesser General Public
 License for more details.

 You should have received a copy of the GNU Lesser
 General Public License along with JavaDatePicker; if
 not, write to the Free Software Foundation, Inc., 59
 Temple Place, Suite 330, Boston, MA  02111-1307  USA

 ***********************************************************/

