import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

    SalariedEmployee J = new SalariedEmployee ();
    HourlyEmployee K = new HourlyEmployee ();
    CommissionEmployee S = new CommissionEmployee ();
    BaseCommissionEmployee B = new BaseCommissionEmployee ();

      Employee[] employeeArray =
    {
    J, K, S, B};
  for (Employee i:employeeArray)
      {
	i.earnedMethod ();
      }
    System.out.println ("Employees Processed Individually.");
    J.displayMethod ();
    K.displayMethod ();
    S.displayMethod ();
    B.displayMethodNo10 ();
    System.out.println ("Employees Processed Polymorphically.");
  for (Employee i:employeeArray)
      {
	i.displayMethod ();
      }
  }

}

abstract class Employee
{
  public String empName;
  public String irdNumber;
  abstract void earnedMethod ();
  abstract void displayMethod ();

}

class SalariedEmployee extends Employee
{
  public double salary;
  public void earnedMethod ()
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("What is this employee's name?");
      empName = input.nextLine ();
      System.out.println ("What is this employee's IRD Number?");
      irdNumber = input.nextLine ();

    while (true)
      {
	System.out.println ("What is this employee's salary?");
	salary = input.nextDouble ();
	if (salary <= 0)
	  {
	    System.out.println ("The value must be greater than 0");
	  }
	else
	  {
	    break;
	  }
      }

  }
  public void displayMethod ()
  {
    System.out.println ("salaried employee: " + empName + "\nIRD Number: " +
			irdNumber + "\nWeekly Salary: $" +
			salary + "\nEarned: $" + salary);
  }
}

class HourlyEmployee extends Employee
{
  public double wage;
  public double hoursWorked;
  public double earnedVal;
  public void earnedMethod ()
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("What is this employee's name?");
      empName = input.nextLine ();
      System.out.println ("What is this employee's IRD Number?");
      irdNumber = input.nextLine ();

    while (true)
      {
	System.out.println ("What is this employee's wage?");
	wage = input.nextDouble ();
	if (wage <= 16.5)
	  {
	    System.out.println ("The value must be greater than 16.5");
	  }
	else
	  {
	    break;
	  }
      }
    System.out.println ("How many hours has this employee worked?");
    hoursWorked = input.nextDouble ();

    earnedVal = wage * hoursWorked;
  }
  public void displayMethod ()
  {
    System.out.println ("Hourly Employee: " + empName + "\nIRD Number: " +
			irdNumber + "\nHourly Wage: $" +
			wage + ". Hours worked: " + hoursWorked +
			"\nEarned: $" + earnedVal);

  }
}

class CommissionEmployee extends Employee
{
  public double grossSales;
  public double commissionRate;
  public double earnedVal;
  public void earnedMethod ()
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("What is this employee's name?");
      empName = input.nextLine ();
      System.out.println ("What is this employee's IRD Number?");
      irdNumber = input.nextLine ();
      System.out.println ("How much did the Employee make in gross sales?");
      grossSales = input.nextDouble ();


    while (true)
      {
	System.out.println ("What is this employee's commission rate?");
	commissionRate = input.nextDouble ();
	if (commissionRate >= 100)
	  {
	    System.out.println ("The value cannot be greater than 100");
	  }
	else
	  {
	    break;
	  }
      }
    earnedVal = grossSales * commissionRate;
  }
  public void displayMethod ()
  {
    System.out.println ("Hourly Employee: " + empName + "\nIRD Number: " +
			irdNumber + "\nGross Sales: $" +
			grossSales + ". Commission Rate: " + commissionRate +
			"\nEarned: $" + earnedVal);

  }
}

class BaseCommissionEmployee extends CommissionEmployee
{
  public double grossSales;
  public double commissionRate;
  public double salary;
  public double earnedVal;
  public void earnedMethod ()
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("What is this employee's name?");
      empName = input.nextLine ();
      System.out.println ("What is this employee's IRD Number?");
      irdNumber = input.nextLine ();
      System.out.println ("How much did the Employee make in gross sales?");
      grossSales = input.nextDouble ();
    while (true)
      {
	System.out.println ("What is this employee's commission rate?");
	commissionRate = input.nextDouble ();
	if (commissionRate >= 100)
	  {
	    System.out.println ("The value cannot be greater than 100");
	  }
	else
	  {
	    break;
	  }
      }
    while (true)
      {
	System.out.println ("What is this employee's salary?");
	salary = input.nextDouble ();
	if (salary <= 0)
	  {
	    System.out.println ("The value must be greater than 0");
	  }
	else
	  {
	    break;
	  }
      }
  }
  public void displayMethod ()
  {
    earnedVal = grossSales * commissionRate + salary * 1.1;
    System.out.println ("Hourly Employee: " + empName + "\nIRD Number: " +
			irdNumber + "\nGross Sales: $" +
			grossSales + ". Commission Rate: " +
			commissionRate + "Salary: " + salary +
			"\nEarned: $" + earnedVal);

  }
  public void displayMethodNo10 ()
  {
    earnedVal = grossSales * commissionRate + salary;
    System.out.println ("Hourly Employee: " + empName + "\nIRD Number: " +
			irdNumber + "\nGross Sales: $" +
			grossSales + ". Commission Rate: " +
			commissionRate + ". Salary: " + salary +
			"\nEarned: $" + earnedVal);

  }

}
