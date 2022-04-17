import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		FoodCourt fc = new FoodCourt();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("What do you want to do......?");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. FoodItem Management for a Restaurant");
			System.out.println("4. FoodItem IQuantity  Management ");
			System.out.println("5. Exit");
			
			System.out.print("Your Option: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				
				case 1:
					System.out.println("................");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("..................");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Get an Employee");
					System.out.println("4. Show All Employees ");
					System.out.println("5. Go Back");
					
					System.out.print("Your Option: ");
					int r1 = sc.nextInt();
					
					switch(r1)
					{
						case 1:
							System.out.println("...............");
							System.out.println("Insert new employee");
							
							Employee e = new Employee();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							e.setName(name1);
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							e.setEmpId(empId1);
							
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							e.setSalary(salary1);
							
							
							fc.insertEmployee(e);
							
							System.out.println(".................");
							break;
							
							
						case 2:
							
							System.out.println("Remove existing employee");
							
							System.out.print("Enter employee id : ");
							String empId2 = sc.next();
							
							fc.removeEmployee(fc.getEmployee(empId2));

							System.out.println(".............");
							break;
						
						
						case 3:
							System.out.println("...........");
							System.out.println("Get an Employee");
							
							System.out.print("Enter employee id: ");
							String empId3 = sc.next();
							
							Employee e3 = fc.getEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee id : "+e3.getEmpId());
								System.out.println("Employee name : "+e3.getName());
								System.out.println("Employee salary : "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does NOT Exists");
							}
							
							System.out.println(".............");
							break;
						
						
						case 4:
							System.out.println("............");
							System.out.println("Show all employees");
							
							fc.showAllEmployees();
							
							System.out.println("...........");
							break;
						
						
						case 5:
							System.out.println("..........");
							System.out.println("Going Back");
							System.out.println("..............");
							break;
						
						default:
						
							System.out.println("...............");
							System.out.println("Invalid");
							System.out.println("...............");
							break;
					}
					
					break;
				
				case 2:
				
					
					System.out.println("...............");
					System.out.println("You have choosen Restaurant Management");
					System.out.println("...............");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove Existing Restaurant");
					System.out.println("3. Search a Restaurant");
					System.out.println("4. Show All Restaurants");
					System.out.println("5. Go Back");
					
					System.out.print("Your Option: ");
					int r2 = sc.nextInt();
					
					switch(r2)
					{
						case 1:
							System.out.println("...............");
							System.out.println("Insert New Restaurant");
							
							Restaurant res1  = new Restaurant();
									
							System.out.print("Enter Restaurant RID: ");
							String rid1 = sc.next();
							res1.setRid(rid1);
							String name1;
							System.out.print("Enter Restaurant Name: ");
							try
							{
								name1 = bfr.readLine();
							}
							catch(IOException ioe)
							{
								name1 = "defaultName";
							}
							res1.setName(name1);
							
							fc.insertRestaurant(res1);
							
							System.out.println("..........");
							break;
							
						case 2:
							System.out.println("............");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							
					

							System.out.println(".............");
							break;
						
						
						case 3:
							System.out.println("............");
							System.out.println("Get a Restaurant");
							
							System.out.print("Enter Restaurant rid : ");
							String rid3 = sc.next();
							Restaurant res3 = fc.getRestaurant(rid3);
							
							if(res3 != null)
							{
								System.out.println("Restaurant name : "+res3.getName());
								System.out.println("Restaurant rid : "+res3.getRid());
								
								res3.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant does not exists");
							}
							
							System.out.println(".............");
							break;
							
						case 4:
							System.out.println("..............");
							System.out.println("Show All Restaurants");
							
							fc.showAllRestaurants();
							
							System.out.println("..............");
							break;
						
						case 5:
							System.out.println("................");
							System.out.println("Going Back");
							System.out.println("................");
							break;
						
						default:
						
							System.out.println("..........");
							System.out.println("Invalid");
							System.out.println("............");
							break;
					}

					
					break;
					
				case 3:
				
					System.out.println("..............");
					System.out.println("You have choosen  FoodItem Management for a Restaurant");
					System.out.println("...............");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New FoodItem for a Customer");
					System.out.println("2. Remove Existing FoodItem of a Customer");
					System.out.println("3. Get a FoodItem of a Customer");
					System.out.println("4. Show All FoodItems of a Customer");
					System.out.println("5. Go Back");
					
					System.out.print("Your Option: ");
					int r3 = sc.nextInt();
					
					switch(r3)
					{
						case 1:
							System.out.println("................");
							System.out.println("Insert New FoodItem for a Restaurant ");
							System.out.println("Which Type of FoodItem do you want?");
							System.out.println("1. MainDish");
							System.out.println("2. Appetiziers");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							FoodItem f = null;
							
							if(type == 1)
							{
								System.out.print("Enter Food Id : ");
								String fd1 = sc.next();
								
								System.out.print("Enter Food Name : ");
								String fn1 = sc.next();
								
								System.out.print("Enter Available Quantity : ");
								int avaq1 = sc.nextInt();
								
								System.out.print("Enter price : " );
								double fp1= sc.nextDouble();
								
								System.out.print("Enter Category ");
								String cate1 =sc.next();
								
								
								MainDish maind= new MainDish();
								maind.setFid(fd1);
								maind.setName(fn1);
								maind.setAvailableQuantity(avaq1);
								maind.setPrice(fp1);
								maind.setCategory(cate1);
						
								f= maind;	

							}
							else if(type == 2)
							{
								System.out.print("Enter Food Id : ");
								
								String fd1 = sc.next();
								System.out.print("Enter Food Name : ");
								String fn1 = sc.next();
								System.out.print("Enter Available Quantity : ");
								int avaq1 = sc.nextInt();
								System.out.print("Enter price : " );
								double fp1= sc.nextDouble();
								System.out.print("Enter Size : ");
								String sz1= sc.next();
								
								
								Appetiziers apz = new Appetiziers();
								apz.setFid(fd1);
								apz.setName(fn1);
								apz.setAvailableQuantity(avaq1);
								apz.setPrice(fp1);
								apz.setSize(sz1);
				
								f= apz;
							}
							else if(type == 3)
							{
								System.out.println("Going Back.");
							}
							else
							{
								System.out.println("Invalid.");
							}
							
							
							if(f!=null)
							{
								System.out.print("Enter Restaurant rid : ");
								String rid1 = sc.next();
								
								fc.getRestaurant(rid1).insertFoodItem(f);
							}
						
							System.out.println("..............");
							break;
						
						
						case 2:
							System.out.println(".............");
							System.out.println("Remove Existing FoodItem");
							
							System.out.print("Enter Restaurant rid : ");
							String rid2 = sc.next();
							System.out.print("Enter Food Id: ");
							String fd2 = sc.next();
							
							fc.getRestaurant(rid2).removeFoodItem(fc.getRestaurant(rid2).getFoodItem(fd2));
							

							System.out.println("...............");
							break;
						
						
						case 3:
							System.out.println("..............");
							System.out.println("Get a Restaurant");
							
							System.out.print("Enter Restaurant rid: ");
							String rid3 = sc.next();
							System.out.print("Enter Food Id: ");
							String fd3 = sc.next();
							
							FoodItem f3 = fc.getRestaurant(rid3).getFoodItem(fd3);
							
							if(f3 != null)
							{
								f3.showInfo();
							}
							
							System.out.println("............");
							break;
						
						case 4:
							System.out.println(".................");
							System.out.println("Show All FoodItems");
							
							System.out.print("Enter Restaurant rid: ");
							String rid4 = sc.next();
						
							fc.getRestaurant(rid4).showAllFoodItems();
							
							System.out.println("..............");
							break;
						
						case 5:
							System.out.println("..........");
							System.out.println("Going Back");
							System.out.println("............");
							break;
						
						default:
						
							System.out.println("...........");
							System.out.println("Invalid");
							System.out.println("............");
							break;
					}

					
					break;
					
				case 4:
				
					System.out.println("..............");
					System.out.println("You have choosen FoodItem Quantity Add-Sell");
					System.out.println("...................");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show All History");
					System.out.println("4. Go Back");
					
					System.out.print("Your Option: ");
					int r4 = sc.nextInt();
					
					switch(r4)
					{
						case 1:
						
							System.out.println("................");
							System.out.println("Add FoodItem");
							
							System.out.print("Enter Restaurant rid: ");
							String rid1 = sc.next();
							System.out.print("Enter Food Id: ");
							String fd1 = sc.next();
							System.out.print("Enter Amount: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								fc.getRestaurant(rid1).getFoodItem(fd1).addQuantity(amount1);
								
							
								frwd.writeInFile("Add Quantity : $"+ amount1 +" in Food id "+fd1);
								
							}
							System.out.println("...............");						
							

							break;
							
						case 2:
						
							System.out.println("............");
							System.out.println("Sell FoodItem");
							
							System.out.print("Enter Restaurant rid: ");
						    String rid2 = sc.next();
							System.out.print("Enter Food Id: ");
							String fd2 = sc.next();
							System.out.print("Enter Amount: ");
							int amount2 = sc.nextInt();
							
							
						     if(amount2>0 && amount2 <= fc.getRestaurant(rid2).getFoodItem(fd2).getPrice())
							{
								fc.getRestaurant(rid2).getFoodItem(fd2).sellQuantity(amount2);
								
							
								frwd.writeInFile("Sell Quantity : $"+ amount2 +" from Food id "+fd2);
								
							}
							
							System.out.println("....................");
							
							break;
							
						case 3:
						
							System.out.println(".............");
							System.out.println("Show All History");
							frwd.readFromFile();
							System.out.println(".............");
							break;
							
							
						case 4:
						
							System.out.println("............");
							System.out.println("Going back .");	
							System.out.println("..............");
							break;
						
						
						default:
						
							System.out.println("...........");
							System.out.println("Invalid");
							System.out.println("...........");
							break;
					}
					
					break;
					
				case 5:
					
					System.out.println("You have choosen to exit");
					choice = false;
					break;
					
				default:
				
					System.out.println("Invalid Option");
					break;
			}
		}
	}
}