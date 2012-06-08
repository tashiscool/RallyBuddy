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

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;


/**
 * GUI component that lets the user enter a date using a drop-down DatePicker.
 * Usage is illustrated in the sample code below:
 * 
 * 
 * @author tkhan
 * 
 */
public final class DateFieldPanel extends JPanel
{
    private JComboBox month = new JComboBox();
    SpinnerDateModel dateModel = new SpinnerDateModel();
    JSpinner spinner = new JSpinner(dateModel);
    JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spinner,
            "MMMMM dd, yyyy H:mm");
    JSpinner Day = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    
    
    TimeZone tz = TimeZone.getTimeZone("UTC");
    GregorianCalendar calenderdate = new GregorianCalendar(tz);
//    calenderdate.setTimeInMillis(System.currentTimeMillis());
    JSpinner Year = new JSpinner(new SpinnerNumberModel(calenderdate.get(Calendar.YEAR), 1959, 2059, 1));
    JSpinner.NumberEditor editor = new JSpinner.NumberEditor(Year,"0");

    JSpinner Hour = new JSpinner(new SpinnerNumberModel(0, 0, 23, 1));
    JSpinner Minute = new JSpinner(new SpinnerNumberModel(0, 0, 59, 1));
    JLabel colon = new JLabel(":");
    private boolean hideDate = false;

    /**
     * toggles Controls for panel
     * @param enabled
     */
    public void setEnableSpinners(boolean enabled)
    {
        spinner.setEnabled(enabled);
        Day.setEnabled(enabled);
        Year.setEnabled(enabled);
        Hour.setEnabled(enabled);
        Minute.setEnabled(enabled);
        month.setEnabled(enabled);
        dropdownButton.setEnabled(enabled);
    }

    /**
     * Displays the currently selected date.
     */
    private final JTextField dateText = new JTextField();

    /**
     * When clicked, displays the DatePicker immediately under the text field.
     */
    private JButton dropdownButton = new JButton();

    /**
     * The current DatePicker instance.
     */
    private DatePicker dp;

    /**
     * The DatePicker's container.
     */
    private JDialog dlg;

    protected Image createImage(String path)
    {
        Image image = null;
        try
        {
            // Read from a file
            File file = new File(path);
            if (file.canRead())
                image = ImageIO.read(file);
            else
                System.out.println("There is no file at " + path);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return (image);
    }

    public void DatetoControls(GregorianCalendar d, boolean gui, boolean station)
    {
//        System.out.println("Date to Controls is : " + d.getTime());
        if (!gui)
        {
            month.setSelectedIndex(d.get(Calendar.MONTH) - 1);
            Day.setValue(d.get(Calendar.DAY_OF_MONTH));
            Year.setValue(d.get(Calendar.YEAR));
            Hour.setValue(d.get(Calendar.HOUR_OF_DAY)+4);
            Minute.setValue(d.get(Calendar.MINUTE));
        }
        else
        {
            month.setSelectedIndex(d.get(Calendar.MONTH));
            Day.setValue(d.get(Calendar.DAY_OF_MONTH));
            Year.setValue(d.get(Calendar.YEAR));
            Hour.setValue(d.get(Calendar.HOUR_OF_DAY));
            Minute.setValue(d.get(Calendar.MINUTE));    
        }
        if (station == true)
        {
            Hour.setValue((Integer)Hour.getValue()+5);
        }
    }

    /**
     * Listener that will catch the selected date when the DatePicker is hidden.
     */
    final class Listener extends ComponentAdapter
    {

        /**
         * Event handler that catches the selected date when the DatePicker is
         * hidden.
         * 
         * @param evt
         */
        public void componentHidden(final ComponentEvent evt)
        {
            final Date dt = ((DatePicker) evt.getSource()).getDate();
            GregorianCalendar f = new GregorianCalendar();
            if (null != dt)
            {
                f.setTime(dt);
//                Date d = (Date) spinner.getValue();
//                Date spun = new Date();
//                long hours = d.getTime();
//                hours /= (3600000);
//                spun.setTime(dt.getTime() + ((d.getTime() / 60000) % 60)
//                        * 60000 + (hours % 24 - 4) * 3600000);
//                spinner.setValue(spun);
                DatetoControls(f, true,false);
            }
            dlg.dispose();
        }

    }

    /**
     * Default constructor; the initially selected date is "empty".
     */
    public DateFieldPanel()
    {
        super();
        init();
    }

    /**
     * Alternate constructor that initializes the currently selected date to the
     * specified date.
     * 
     * @param initialDate
     */
    public DateFieldPanel(final Date initialDate)
    {
        super();
        init();
        dateText.setText(dateToString(initialDate));
    }

    /**
     * Returns the currently selected date or null if not set.
     * 
     * @return date
     */
    public Date getDate()
    {
        if (dp != null)
        {
//            System.out.println(dp.getDate() + "-----ssss");
            dp.setselecteddateYear((Integer)Year.getValue());
            dp.setselecteddateMonth(month.getSelectedIndex());
            dp.setselecteddateDay((Integer)Day.getValue());
            dp.setselecteddateHour((Integer)Hour.getValue());
//            System.out.println("Datepicker hour is " + Hour.getValue());
            dp.setselecteddateMin((Integer)Minute.getValue());
            return (dp.getDate());
        }
        GregorianCalendar cal = new GregorianCalendar();
    TimeZone tz = TimeZone.getTimeZone("UTC");
    GregorianCalendar c = new GregorianCalendar(tz);
    c.setTimeInMillis(System.currentTimeMillis());
    JSpinner Year = new JSpinner(new SpinnerNumberModel(c.get(Calendar.YEAR), 1959, 2059, 1));
        
        if (((Integer)Year.getValue() < c.get(Calendar.YEAR) && (Integer)Day.getValue() == 1) || month.getSelectedIndex() == 12 )
        {
            return null;
        }
        cal.set((Integer)Year.getValue(), month.getSelectedIndex(), (Integer)Day.getValue(),(Integer) Hour.getValue(),(Integer) Minute.getValue(), 0);
//        System.out.println("Datepicker date is " + cal.getTime());
        return (cal.getTime());
    }
//    public Date getDate(boolean trua)
//    {
//        if (dp != null)
//        {
//            dp.setselecteddateHour((Integer)Hour.getValue());
//            dp.setselecteddateMin((Integer)Minute.getValue());
//            return (dp.getDate());
//        }
//        GregorianCalendar cal = new GregorianCalendar();
//        GregorianCalendar cal2 = CarfManager.getInstance().getCurrentCalendar();
//        
//        cal.set((Integer)Year.getValue(), month.getSelectedIndex(), (Integer)Day.getValue(),(Integer) Hour.getValue(),(Integer) Minute.getValue(), 0);
//        return (cal.getTime());
//    }
    public void setblank()
    {
        month.setSelectedIndex(12);
    TimeZone tz = TimeZone.getTimeZone("UTC");
    GregorianCalendar c = new GregorianCalendar(tz);
    c.setTimeInMillis(System.currentTimeMillis());
        Year.setValue(c.get(Calendar.YEAR));
        Day.setValue(1);
    }
    public void setToDay()
    {
        
    TimeZone tz = TimeZone.getTimeZone("UTC");
    GregorianCalendar c = new GregorianCalendar(tz);
    c.setTimeInMillis(System.currentTimeMillis());
    JSpinner Year = new JSpinner(new SpinnerNumberModel(c.get(Calendar.YEAR), 1959, 2059, 1));
        month.setSelectedIndex(c.get(Calendar.MONTH)+1);
        Year.setValue(c.get(Calendar.YEAR));
        Day.setValue(c.get(Calendar.DAY_OF_MONTH));
    }

    /**
     * Initializes the panel components.
     */
    private void init()
    {
        setLayout(new AbsoluteLayout());

        Year.setEditor(editor);
        month.addItem("January");
        month.addItem("February");
        month.addItem("March");
        month.addItem("April");
        month.addItem("May");
        month.addItem("June");
        month.addItem("July");
        month.addItem("August");
        month.addItem("September");
        month.addItem("October");
        month.addItem("November");
        month.addItem("December");
        month.addItem("");
        dateText.setText("");
        dateText.setBackground(new Color(255, 255, 255));
        spinner.setEditor(editor2);
//        GregorianCalendar d = new GregorianCalendar();
//        Date date = new Date();
//        d.setTime(new Date(date.getTime()));
//        DatetoControls(d);
//        Hour.setValue(d.get(Calendar.HOUR));
//        Minute.setValue(d.get(Calendar.MINUTE));
        File file = new File("resources/images/carf_16_calendar_color_icon.png");
        if (file.canRead())
        {
            ImageIcon calendar = new ImageIcon(
                    createImage("resources/images/carf_16_calendar_color_icon.png"));
            dropdownButton.setIcon(calendar);
        }
        if (hideDate)
        {
            add(Hour, new AbsoluteConstraints(0, 0, 40, 20));
            add(colon, new AbsoluteConstraints(50, 0, 20, 20));
            add(Minute, new AbsoluteConstraints(60, 0, 40, 20));
        }
        else
        {
            add(Day, new AbsoluteConstraints(0, 0, 40, 20));
            add(Hour, new AbsoluteConstraints(41, 0, 40, 20));
            add(Minute, new AbsoluteConstraints(81, 0, 40, 20));
            dropdownButton.setMargin(new Insets(2, 2, 2, 2));
            dropdownButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(final ActionEvent evt)
                {
                    onButtonClick(evt);
                }
            });
            // this.add(dropdownButton);
            add(month, new AbsoluteConstraints(131, 0, 110, 20));
            //add(colon, new AbsoluteConstraints(310, 0, 20, 20));
            add(Year, new AbsoluteConstraints(249, 0, 60, 20));
            add(dropdownButton, new AbsoluteConstraints(319, 0, 20, 20));
        }
        // add(spinner, new AbsoluteConstraints(10, 10, 170, 32));
        
        
        ((JSpinner.DefaultEditor) Day.getEditor()).getTextField().addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                selectItLater(e);
            }
        });
        
        ((JSpinner.DefaultEditor) Hour.getEditor()).getTextField().addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                selectItLater(e);
            }
        });
        
        ((JSpinner.DefaultEditor) Minute.getEditor()).getTextField().addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                selectItLater(e);
            }
        });
        
        ((JSpinner.DefaultEditor) Year.getEditor()).getTextField().addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                selectItLater(e);
            }
        });
    }

    /**
     * Event handler that displays the DatePicker when the button is clicked.
     * 
     * @param evt
     */
    private void onButtonClick(final java.awt.event.ActionEvent evt)
    {
        if ("".equals(dateText.getText()))
            dp = new DatePicker();
        else
            dp = new DatePicker(stringToDate(dateText.getText()));
        dp.setHideOnSelect(true);
        dp.addComponentListener(new Listener());

        // final Point p = spinner.getLocationOnScreen();
        // p.setLocation(p.getX(), p.getY() - 1 +
        // spinner.getSize().getHeight());

        final Point p = month.getLocationOnScreen();
        p.setLocation(p.getX(), p.getY() - 1 + month.getSize().getHeight());

        dlg = new JDialog(new JFrame(), true);
        dlg.setLocation(p);
        dlg.setResizable(false);
        dlg.setUndecorated(true);
        dlg.getContentPane().add(dp);
        dlg.pack();
        dlg.show();
    }

    /**
     * Returns a short string representation for the specified date (January 1,
     * 2003).
     * 
     * @param dt
     * @return short string
     */
    private static String dateToString(final Date dt)
    {
        if (null != dt)
            return DateFormat.getDateInstance(DateFormat.LONG).format(dt);
        return null;
    }

    /**
     * Constructs a Date object from a short date (January 1, 2003).
     * 
     * @param s
     * @return date
     */
    private static Date stringToDate(final String s)
    {
        try
        {
            return DateFormat.getDateInstance(DateFormat.LONG).parse(s);
        }
        catch (ParseException e)
        {
            return null;
        }
    }

    // date validation using SimpleDateFormat
    // it will take a string and make sure it's in the proper
    // format as defined by you, and it will also make sure that
    // it's a legal date

    public boolean isValidDate(String date)
    {
        // set date format, this can be changed to whatever format
        // you want, MM-dd-yyyy, MM.dd.yyyy, dd.MM.yyyy etc.
        // you can read more about it here:
        // http://java.sun.com/j2se/1.4.2/docs/api/index.html

        // SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMM dd yyyyy");

        // declare and initialize testDate variable, this is what will hold
        // our converted string

        Date testDate = null;

        // we will now try to parse the string into date form
        try
        {
            testDate = sdf.parse(date);
        }

        // if the format of the string provided doesn't match the format we
        // declared in SimpleDateFormat() we will get an exception

        catch (ParseException e)
        {
            System.out.println("the date you provided is in an invalid date"
                    + " format.");
            return false;
        }

        // dateformat.parse will accept any date as long as it's in the format
        // you defined, it simply rolls dates over, for example, december 32
        // becomes jan 1 and december 0 becomes november 30
        // This statement will make sure that once the string
        // has been checked for proper formatting that the date is still the
        // date that was entered, if it's not, we assume that the date is
        // invalid

        if (!sdf.format(testDate).equals(date))
        {
            System.out.println("the date you provided is in an invalid date");
            return false;
        }

        // if we make it to here without getting an error it is assumed that
        // the date was a valid one and that it's in the proper format

        return true;

    } // end isValidDate

    /**
     * Helper Method to Hide the Time Spinners
     */
    public void hideTime()
    {
        Hour.setEnabled(false);
        Minute.setEnabled(false);
        colon.setVisible(false);
        Hour.setValue(0);
        Minute.setValue(0);
    }

    /**
     * Helper Method to Hide the Date Controls and push the time controls to the
     * front
     */
    public void hideDate()
    {
        Day.setVisible(false);
        Year.setVisible(false);
        month.setVisible(false);
        dropdownButton.setVisible(false);
        hideDate = true;
        init();
    }

    /**
     * Helper Method to Show the Time Spinners
     */
    public void showTime()
    {
        Hour.setVisible(true);
        Minute.setVisible(true);
    }

    /**
     * Helper Method to Show the Date Controls and push the time controls to the
     * back
     */
    public void showDate()
    {
        Day.setVisible(true);
        Year.setVisible(true);
        month.setVisible(true);
        hideDate = false;
        init();
    }
    
    private void selectItLater(FocusEvent e)
    {
        if (e.getSource() instanceof JTextComponent)
        {
            final JTextComponent textComponent = ((JTextComponent) e.getSource());
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    textComponent.selectAll();
                }
            });
        }
    }
}
