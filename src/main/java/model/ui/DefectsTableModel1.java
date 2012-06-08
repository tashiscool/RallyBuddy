package model.ui;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import model.Tasks;
import model.com.rallydev.webservice.v1_34.domain.*;
public class DefectsTableModel1 extends DefaultTableModel
{
    private List<Tasks> tasks = new ArrayList<Tasks>();
    
    private String[] fColumnNames =
    { "Name", "Estimate", "Actuals", "State", "TA"};

    public DefectsTableModel1()
    {

    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    @Override
    public int getColumnCount()
    {
        return fColumnNames.length;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.table.AbstractTableModel#getColumnName(int)
     */
    @Override
    public String getColumnName(int col)
    {
        return fColumnNames[col];
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.table.TableModel#getRowCount()
     */
    @Override
    public int getRowCount()
    {
        if (tasks == null)
        {
            return 0;
        }
        else
        {
            return tasks.size();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    @Override
    public Object getValueAt(int row, int col)
    {
        if (tasks == null)
        {
            return null;
        }
        else if (tasks.size() == 0)
        {
            return null;
        }
        
        Tasks res = tasks.get(row);

        switch (col)
        {
            case 0:
            {
                return res;
            }
            case 1:
            {
               return res.Estimate;
            }
            case 2:
            {
                return res.Actuals;
            }
            case 3:
            {
                return res.State;
            }
            case 4:
            {
                return res.TA;
            }
            case 5:
            {
                return res.id;
            }
                
        }
        return null;
    }

    /**
     * @return the reservations
     */
    public List<Tasks> getReservations()
    {
        return tasks;
    }

    /**
     * @param reservations
     *            the reservations to set
     */
    public void setReservations(List<Tasks> reservations)
    {
        tasks = reservations;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.table.DefaultTableModel#isCellEditable(int, int)
     */
    @Override
    public boolean isCellEditable(int row, int column)
    {
        return false;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.AbstractTableModel#getColumnClass(int)
     */
    public Class getColumnClass(int c)
    {
        Object obj = getValueAt(0, c);
        
        if (obj != null)
        {
            if (obj instanceof Tasks)
            {
                return Tasks.class;
            }
            return obj.getClass();
        }
        else
        {
            return String.class;
        }
    }
    

}
