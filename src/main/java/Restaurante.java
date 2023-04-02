/**
 *
 * @author davidarriaga
 */


import java.io.*;
public class Restaurante {
	
	
    public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String orderNameM[] ={" ","Pollo a la Plancha","Carne Asada","Litchon Baboy","Sopa de Res","Pastel","Platano en Miel","Postre tres leches","NataDeCoco","Coca Cola","Sprite","Pepsi","7-up"};
	String orderNameP[] ={" ","Pollo a la Plancha\tUSD 50.00","Carne Asada\tUSD 50.00","Litchon Baboy\tUSD 100.00","Sopa de Res\tUSD 150.00",
							"Pastel\t\tUSD 25.00","Platano en Miel\t\tUSD 20.00","Postre tres leches\t\tUSD 25.00","Nata de Coco\tUSD 20.00",
							"Coca Cola\t\t\tUSD 30.00","Sprite\t\t\tUSD 30.00","Pepsi\t\t\tUSD 25.00","7-up\t\t\tUSD 25.00"};
							
							
	double orderPrice[] ={0.00,50.00,50.00,100.00,150.00,25.00,20.00,25.00,20.00,30.0,30.00,25.00,25.00};
	String user,pass,search,again="",mainQ="",mainQ2="",dessertQ="",dessertQ2="",drinksQ="",drinksQ2="";
	
    int a=0,b=0,c=0,d=0,e=1,g=0,h=0,i=0,r=0,choice=0,choice1=0,order=0,table=1,end=0;
    
    String orderString[][] = new String[50][20];
    String orderStringM[][] = new String[20][20];
    String orderStringP[][] = new String[20][20];
    double orderMDouble[][] = new double[50][20];
    double orderDDouble[][] = new double[50][20];
    double tableNo[] = new double[21];
    double pieces[] = new double[13];
    double paid[] = new double[21];
    double totalOrder[] = new double[50];
    double payment,change=0;
    double totalPrice[] = new double[21];
    double orderDouble[][] = new double[21][20];

    for(int z=1;z<=12;z++){
    	pieces[z]=20;
    }
    
    while(a<3){
    	System.out.print("\nIngrese su Usuario: ");
    	user = in.readLine();
    	System.out.print ("\nIngrese su Contraseña: ");
    	pass = in.readLine();
    	
    	
    	if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")){
    		
    		System.out.println ("\n ******************************************************");
    		System.out.println (" ********** Bienvenido al Restaurante David Arriaga **********");
   		 	System.out.println (" *******************************************************");
    		
    		do{
    		System.out.println ("\n **************************************");
    		System.out.println (" ********** M E N U PRINCIPAL **********");
   		 	System.out.println (" **************************************");
    		System.out.println (" (1) Orden");
    		System.out.println (" (2) Informacion de la orden");
    		System.out.println (" (3) Factura");
    		System.out.println (" (4) Inventario de Platos");
    		System.out.println (" (5) Salida");
    		System.out.println (" *************************************");
    		
    		
    			for(int f=1;f==1;){
    		
    			System.out.print("\nEntre su seleccion: ");
    			choice = Integer.parseInt(in.readLine());
    		
//CHOICE 1 - "ORDER"
					
   		    		if(choice==1){
   		    			do{
   		    			for(int z=1;z<=12;z++){
   		    				orderString[b][z]="0";
   		    			}
   		    		for(int x=1;x==1;){
		    			System.out.print("\nEntre el nombre del Cliente: ");
		    			orderString[b][0] = in.readLine();
		    			
		    			x=0;
		    			
		    			for(int l=0; l<b; l++){
	    					if(orderString[l][0].equalsIgnoreCase(orderString[b][0])){
	    						System.out.println("El Nombre del Cliente ya esta siendo usado!");
	    						x=1;
	    					}
	    				}
   		    		}
	    			
	    			c=0;
	    			System.out.println ("\n *************************************");
	    			System.out.println (" ************* Menu de Platillos ************* ");
	    			System.out.println (" *************************************");
	    			System.out.println ("\n    ********** PLATO PRINCIPAL **********");
	    	 		System.out.print (" Pollo a la Plancha \t\tUSD 50.00");
	    	 			if(pieces[1]>0){
							System.out.println("\t" +pieces[1] +"pcs.");
						}
				    	else{
				    	 	System.out.println("\t*No disponible*");
				    	}
			    	System.out.print (" Carne Asada \t\tUSD 50.00");
	    	 			if(pieces[2]>0){
				    		System.out.println("\t" +pieces[2] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No disponible*");
				    	}
			    	System.out.print (" Comida Vegetariana \t\tUSD 100.00");
	    	 			if(pieces[3]>0){
							System.out.println("\t" +pieces[3] +"pcs.");
						}
						else{
							System.out.println("\t*Not Available*");
						}
			   		System.out.print (" Sopa de Res \t\tUSD 150.00");
	    	 			if(pieces[4]>0){
				    		System.out.println("\t" +pieces[4] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No disponible*");
				    	}
	    	 		System.out.println ("\n    *********** POSTRE ***********");
	    	 		System.out.print (" Pastel \t\t\tUSD 25.00");
			    		if(pieces[5]>0){
				    		System.out.println("\t" +pieces[5] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No Disponible*");
				    	}
	    	 		System.out.print (" Platano en Miel \t\t\tUSD 20.00");
			    		if(pieces[6]>0){
				    		System.out.println("\t" +pieces[6] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No Disponible*");
				    	}
	    	 		System.out.print (" Tres Leches \t\t\tUSD 25.00");
			    		if(pieces[7]>0){
				    		System.out.println("\t" +pieces[7] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No disponiblee*");
				    	}
	    	 		System.out.print (" Nata de Coco \t\tUSD 20.00");
			    		if(pieces[8]>0){
				    		System.out.println("\t" +pieces[8] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No disponible*");
				    	}
	    	 		System.out.println ("\n    *********** BEBIDAS ************");
	    	 		System.out.print (" Coca Cola \t\t\t\tUSD 30.00");
	    	 			if(pieces[9]>0){
				    		System.out.println("\t" +pieces[9] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No disponible*");
				    	}
	    	 		System.out.print (" Sprite \t\t\tUSD 30.00");
	    	 			if(pieces[10]>0){
				    		System.out.println("\t" +pieces[10] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No Disponible*");
				    	}
	    	 		System.out.print (" Pepsi \t\t\t\tUSD 25.00");
	    	 			if(pieces[11]>0){
				    		System.out.println("\t" +pieces[11] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No Disponible*");
				    	}
	    	 		System.out.print (" 7-Up \t\t\t\tUSD 25.00");
	    	 			if(pieces[12]>0){
				    		System.out.println("\t" +pieces[12] +"pcs.");
				    	}
				    	else{
				    		System.out.println("\t*No Disponible*");
				    	}
	    	 		System.out.println (" *************************************");
	    	 		
	    	 		
	    	 		if(pieces[1]==0 && pieces[2]==0 && pieces[3]==0 && pieces[4]==0){
	    	 			System.out.println("\nPlato Principal no disponible!");
	    	 		}
	    	 		else{
		    	 		for(int v=1;v==1;){
			    	 		System.out.print("\nDeseas ordenar un plato principal? [Y/N]: ");
			    	 		mainQ = in.readLine();
							
	//MAIN DISH
							
			    	 		if(mainQ.equalsIgnoreCase("y")){
			    	 			
				    	 			do{
				    	 				System.out.println ("\n\t ********** PLATO PRINCIPAL **********");
				    	 				System.out.println (" **************************************");
				    	 				System.out.println (" NAME\t\t\t\tPRICE");
				    	 				System.out.print (" 1. Pollo a la Plancha " + "\tUSD 50.00");
					    	 				if(pieces[1]>0){
					    	 					System.out.println("\t" +pieces[1] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 2. Carne Asada " + "\tUSD 50.00");
					    	 				if(pieces[2]>0){
					    	 					System.out.println("\t" +pieces[2] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 3. Comida Vegetariana " + "\tUSD 100.00");
					    	 				if(pieces[3]>0){
					    	 					System.out.println("\t" +pieces[3] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 4. Sopa de Res " + "\tUSD 150.00");
					    	 				if(pieces[4]>0){
					    	 					System.out.println("\t" +pieces[4] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.println (" **************************************");
				    	 				
				    	 				for(e=1;e==1;){
					    	 				System.out.print("\nEntre su orden: ");
					    	 				order = Integer.parseInt(in.readLine());
					    	 				
					    	 				for(v=1;v<=4;v++){
						    	 				if(order==v){
						    	 					if(orderString[b][v].equals("1")){
						    	 						System.out.println("Su plato esta listo!");
						    	 						e=1;
						    	 					}
						    	 					else if(pieces[v]==0){
						    	 						System.out.println("No Disponible");
						    	 						e=1;
						    	 					}
						    	 					else{
						    	 						e=0;
						    	 					}
						    	 				}
					    	 				}
						    	 			if(order<1 || order>4){
						    	 				System.out.println("Entrada invalida!");
						    	 				e=1;
						    	 			}
					    	 				
				    	 				}
				    	 				
				    	 				do{
					    	 				System.out.print("Cantidad? : ");
					    	 				orderMDouble[b][c] = Double.parseDouble(in.readLine());
					    	 				
				    	 					for(v=1;v<=4;v++){
					    	 					if(order==v){
					    	 						orderString[b][v]="1";
					    	 						pieces[v]=pieces[v]-orderMDouble[b][c];
					    	 						if(pieces[v]<0){
					    	 							pieces[v]=pieces[v]+orderMDouble[b][c];
					    	 							System.out.println("Lo sentimos, solo disponemos de " +pieces[v] +"pcs. Available");
					    	 							v=5;
					    	 							r=1;
					    	 						}
					    	 						else{
					    	 							r=0;
					    	 						}
					    	 					}
					    	 				}
				    	 				}while(r==1);
				    	 				
				    	 				
				    	 				orderStringP[b][c]=orderNameP[order];
				    	 				orderStringM[b][c]=orderNameM[order];
				    	 				orderDouble[b][c]=orderPrice[order];
				    	 				
				    	 				
				    	 				c++;
				    	 				
				    	 				for(d=1;d==1;){
					    	 				System.out.print("\nDeseas ordenar otro platillo principal? [Y/N]: ");
					    	 				mainQ2 = in.readLine();
					    	 			
					    	 				if(mainQ2.equalsIgnoreCase("y")){
					    	 					d=0;
					    	 				}
					    	 				else if(mainQ2.equalsIgnoreCase("n")){
					    	 					System.out.print("");
					    	 					d=0;
					    	 				}
					    	 				else{
					    	 					System.out.print("Entrada Invalida!");
					    	 					d=1;
					    	 				}
					    	 			}
					    	 			if(orderString[b][1].equals("1") && orderString[b][2].equals("1") && orderString[b][3].equals("1") && orderString[b][4].equals("1")){
				    	 					System.out.println("\nLo sentimos, Tu Orden ya tiene 4 Platos!");
				    	 					mainQ2="n";
				    	 				}
				    	 				if(pieces[1]==0 && pieces[2]==0 && pieces[3]==0 && pieces[4]==0){
	    	 								System.out.println("\nPlato Principal no disponible!");
	    	 								mainQ2="n";
	    	 							}
				    	 			}
			    	 				while(mainQ2.equalsIgnoreCase("y"));
			    	 			
			    	 				}
			    	 				else if(mainQ.equalsIgnoreCase("n")){
			    	 					v=0;
			    	 				}
			    	 				else{
			    	 					System.out.print("Entrada invalida!");
			    	 					v=1;
			    	 				}
			    	 		}
	    	 			}
	    	 			if(pieces[5]==0 && pieces[6]==0 && pieces[7]==0 && pieces[8]==0){
	    	 				System.out.println("\nPlatillo principal no disponible!");
	    	 			}
	    	 			else{
			    	 		for(int v=1;v==1;){
				    	 		System.out.print("\nDeseas ordenar otro postre? [Y/N]: ");
				    	 		dessertQ = in.readLine();
				    	 		
		//DESSERT
				    	 		
				    	 		if(dessertQ.equalsIgnoreCase("y")){
				    	 			do{
					    	 			System.out.println ("\n\t ********** POSTRE **********");
					    	 			System.out.println (" **************************************");
						    	 		System.out.println (" NOMBRE\t\t\t\tPRECIO");
						    	 		System.out.print (" 1. Pastel \t\tUSD 25.00");
						    	 			if(pieces[5]>0){
					    	 					System.out.println("\t" +pieces[5] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 2. Platano en Miel \t\tUSD 20.00");
						    	 			if(pieces[6]>0){
					    	 					System.out.println("\t" +pieces[6] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 3. Postre tres leches \t\tUSD 25.00");
						    	 			if(pieces[7]>0){
					    	 					System.out.println("\t" +pieces[7] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 4. Nata de Coco \tUSD 20.00");
						    	 			if(pieces[8]>0){
					    	 					System.out.println("\t" +pieces[8] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.println (" **************************************");
						    	 		
				    	 				for(e=1;e==1;){
					    	 				System.out.print("\nENTRA TU ORDEN: ");
					    	 				order = Integer.parseInt(in.readLine());
					    	 				order=order+4;
					    	 				
					    	 				for(v=5;v<=8;v++){
						    	 				if(order==v){
						    	 					if(orderString[b][v].equals("1")){
						    	 						System.out.println("EL postre ya a sido listado!");
						    	 						e=1;
						    	 					}
						    	 					else if(pieces[v]==0){
						    	 						System.out.println("postre no disponible");
						    	 						e=1;
						    	 					}
						    	 					else{
						    	 						e=0;
						    	 					}
						    	 				}
					    	 				}
					    	 				if(order<5 || order>8){
					    	 					System.out.println("Entrada invalida!");
					    	 					e=1;
					    	 				}
				    	 				}
				    	 				
				    	 				do{	
				    	 				System.out.print("Cantidad? : ");
				    	 				orderMDouble[b][c] = Double.parseDouble(in.readLine());
				    	 				
					    	 				for(v=5;v<=8;v++){
						    	 				if(order==v){
						    	 					orderString[b][v]="1";
						    	 					pieces[v]=pieces[v]-orderMDouble[b][c];
						    	 					if(pieces[v]<0){
						    	 						pieces[v]=pieces[v]+orderMDouble[b][c];
						    	 						System.out.println("Lo sentimos solo tenemos " +pieces[v] +"pcs. Disponibles");
						    	 						v=9;
						    	 						r=1;
						    	 					
						    	 					}
						    	 					else{
						    	 						r=0;
						    	 					}
						    	 				}
						    	 				
					    	 				}
				    	 				}while(r==1);
				    	 				
				    	 				
				    	 				orderStringP[b][c]=orderNameP[order];
				    	 				orderStringM[b][c]=orderNameM[order];
				    	 				orderDouble[b][c]=orderPrice[order];
				    	 				
				    	 				
				    	 				c++;
				    	 				
					    	 			for(d=1;d==1;){
					    	 				System.out.print("\nDeseas Ordenar Postre? [Y/N]: ");
					    	 				dessertQ2 = in.readLine();
					    	 			
					    	 				if(dessertQ2.equalsIgnoreCase("y")){
					    	 					d=0;
					    	 				}
					    	 				else if(dessertQ2.equalsIgnoreCase("n")){
					    	 					d=0;
					    	 					dessertQ="n";
					    	 				}
					    	 				else{
					    	 					System.out.print("Entrada Invalida!");
					    	 					d=1;
					    	 				}
					    	 			}
					    	 			if(orderString[b][5].equals("1") && orderString[b][6].equals("1") && orderString[b][7].equals("1") && orderString[b][8].equals("1")){
					    	 				System.out.print("Lo sentimos, Tu orden ya tienen 4 platillos!");
					    	 				dessertQ2="n";
					    	 			}
					    	 			if(pieces[1]==0 && pieces[2]==0 && pieces[3]==0 && pieces[4]==0){
	    	 								System.out.println("\nPlatillo principal no disponible!");
	    	 								dessertQ2="n";
	    	 							}
				    	 			}
				    	 			while(dessertQ2.equalsIgnoreCase("y"));
					    	 		
				    	 		}
				    	 		else if(dessertQ.equalsIgnoreCase("n")){
			    	 					v=0;
			    	 			}
			    	 			else{
			    	 				System.out.print("Entrada Invalida!");
			    	 				v=1;
			    	 			}
				    	 	}
	    	 			}
	    	 			if(pieces[5]==0 && pieces[6]==0 && pieces[7]==0 && pieces[8]==0){
	    	 				System.out.println("\nPostre no disponible!");
	    	 			}
	    	 			else{
				    	 	for(int v=1;v==1;){
				    	 		System.out.print("\nDeseas ordenar Bebidas? [Y/N]: ");
				    	 		drinksQ = in.readLine();
				    	 		
		//DRINKS
				    	 		
				    	 		if(drinksQ.equalsIgnoreCase("y")){
				    	 			
				    	 			do{
					    	 			System.out.println ("\n\t ********** Bebidas **********");
						    	 		System.out.println (" **************************************");
						    	 		System.out.println (" NOMBRE\t\t\t\tPRECIO");
						    	 		System.out.print (" 1. Coca Cola \t\t\tUSD 30.00");
						    	 			if(pieces[9]>0){
					    	 					System.out.println("\t" +pieces[9] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 2. Sprite \t\t\tUSD 30.00");
						    	 			if(pieces[10]>0){
					    	 					System.out.println("\t" +pieces[10] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 3. Pepsi \t\t\tUSD 25.00");
						    	 			if(pieces[11]>0){
					    	 					System.out.println("\t" +pieces[11] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.print (" 4. 7-Up \t\t\tUSD 25.00");
						    	 			if(pieces[12]>0){
					    	 					System.out.println("\t" +pieces[12] +"pcs.");
					    	 				}
					    	 				else{
					    	 					System.out.println("\t*No Disponible*");
					    	 				}
				    	 				System.out.println (" **************************************");
						    	 		
						    	 		for(e=1;e==1;){
					    	 				System.out.print("\ningresa tu orden: ");
					    	 				order = Integer.parseInt(in.readLine());
					    	 				order=order+8;
					    	 				
					    	 				for(v=9;v<=12;v++){
						    	 				if(order==v){
						    	 					if(orderString[b][v].equals("1")){
						    	 						System.out.println("Bebida ya fue listada!");
						    	 						e=1;
						    	 					}
						    	 					else if(pieces[v]==0){
						    	 						System.out.println("Bebida no disponible");
						    	 						e=1;
						    	 					}
						    	 					else{
						    	 						e=0;
						    	 					}
						    	 				}
					    	 				}
					    	 				if(order<9 || order>12){
					    	 					System.out.println("Entrada Invalida!");
					    	 					e=1;
					    	 				}
				    	 				}
				    	 				
				    	 				orderStringP[b][c]=orderNameP[order];
				    	 				orderStringM[b][c]=orderNameM[order];
				    	 				orderDouble[b][c]=orderPrice[order];
				    	 				
				    	 				
				    	 				do{
				    	 					
				    	 				System.out.print("Cantidad? : ");
				    	 				orderMDouble[b][c] = Double.parseDouble(in.readLine());
				    	 				
					    	 				for(v=9;v<=12;v++){
						    	 				if(order==v){
						    	 					orderString[b][v]="1";
						    	 					pieces[v]=pieces[v]-orderMDouble[b][c];
						    	 					if(pieces[v]<0){
							    	 					pieces[v]=pieces[v]+orderMDouble[b][c];
							    	 					System.out.println("Lo sentimos, solo tenemos " +pieces[v] +"pcs. Disponibles");
							    	 					v=13;
							    	 					r=1;
						    	 					}
							    	 				else{
							    	 					r=0;
							    	 				}
						    	 				}
					    	 				}
				    	 				}while(r==1);
				    	 				
				    	 				c++;
				    	 				
					    	 			for(d=1;d==1;){
					    	 				System.out.print("\nDeseas ordenar otra bebida? [Y/N]: ");
					    	 				drinksQ2 = in.readLine();
					    	 			
					    	 				if(drinksQ2.equalsIgnoreCase("y")){
					    	 					d=0;
					    	 					c++;
					    	 				}
					    	 				else if(drinksQ2.equalsIgnoreCase("n")){
					    	 					System.out.print("");
					    	 					d=0;
					    	 					f=0;
					    	 				}
					    	 				else{
					    	 					System.out.print("Entrada Invalida!");
					    	 					d=1;
					    	 				}
					    	 			}
					    	 			if(orderString[b][9].equals("1") && orderString[b][10].equals("1") && orderString[b][11].equals("1") && orderString[b][12].equals("1")){
					    	 				System.out.print("Lo sentimos, tu orden ya tiene 4 Bebidas!");
					    	 				drinksQ2="n";
					    	 				f=0;
					    	 			}
					    	 			if(pieces[9]==0 && pieces[10]==0 && pieces[11]==0 && pieces[12]==0){
	    	 								System.out.println("\nBebida no disponible!");
	    	 								drinksQ2="n";
	    	 								f=0;
	    	 							}
				    	 			}
				    	 			while(drinksQ2.equalsIgnoreCase("y"));
					    	 		
				    	 		}
				    	 		else if(drinksQ.equalsIgnoreCase("n")){
			    	 					v=0;
			    	 					f=0;
			    	 			}
			    	 			else{
			    	 				System.out.print("Entrada Invalida!");
			    	 				v=1;
			    	 			}
				    	 	}
	    	 			}
			    	 	if(c==0){
			    	 		System.out.println("Tu no tienes otra Orden!");
			    	 		r=1;
			    	 	}
			    	 	else{
			    	 		c--;
			    	 	}
	    	 		}while(r==1);
		    	 	tableNo[b]=table;
		    	 	totalOrder[b]=c;
		    	 	paid[b]=0;
		    	 	
		    	 	System.out.println("\n TU ERAS TABLA NO. ES: "  +tableNo[b]);
		    	 	System.out.println(" TU ERES ORDEN ES: ");
		    	 	for(int y=0;y<=totalOrder[b];y++){
	    				System.out.println("   "+orderMDouble[b][y] +" pcs.\t" +orderStringM[b][y]);
	    				totalPrice[b]=totalPrice[b]+(orderDouble[b][y]*orderMDouble[b][y]);
	    			}
		    	 	
		    	 	
		    	 	
		    	 	
		    	 	
		    	 	
	    		table++;
		    	b++;
	    		}
	    		
//CHOICE 2 - "ORDER INFO"
	    		
	    	 	else if(choice==2){
	    	 		
	    	 		do{
	    	 			
	    	 		System.out.print("\nIngresa el nombre del cliente: ");
	    	 		search = in.readLine();
	    	 		
	    	 		int s=1;
	    	 		
						for(int x=0; x<b; x++){
							
							if(search.equalsIgnoreCase(orderString[x][0])){
	    						System.out.println(" ******   INFORMACION DE LA ORDEN DEL CLIENTE   *******");
	    						System.out.println(" Nombre del Cliente: " + orderString[x][0]);
	    						System.out.println(" Numero de la Tabla: " + tableNo[x]);
	    						System.out.println(" Orden del Cliente:");
	    						
	    						for(int y=0;y<=totalOrder[x];y++){
	    							System.out.println("   " +orderMDouble[x][y] +" Pcs\t" +orderStringP[x][y]);
	    						}
	    						System.out.println(" --------------------------------------");
	    						System.out.print(" Total Factura: USD" + totalPrice[x]);
	    						if(paid[x]==1){
	    							System.out.println(" *PAGADO*");
	    							System.out.println (" **************************************");
	    						}
	    						else{
	    							System.out.println (" *NO PAGADO*");
	    							System.out.println (" **************************************");
	    							System.out.println ("\n Por favor, Procede a Cobrar!");
	    						}
	    						s=0;
							}

						}
							
						if (s==1){
							System.out.println("Nombre del cliente no existe!");
							g=1;
						}
						else{
							g=0;
							}
					
	    	 		f=0;
	    	 	}while(g==1);
	    	 	
	    	 	}
	    	 	
	    	 	else if(choice==3){
	    	 		
	    	 		do{
	    	 			
	    	 		System.out.print("\nIngrese el nombre del cliente: ");
	    	 		search = in.readLine();
	    	 		
	    	 		int s=1;
						for(int x=0; x<b; x++){
							if(search.equalsIgnoreCase(orderString[x][0])){
	    						System.out.println(" ****   RECIBO ORDEN DEL CLIENTE   ****");
	    						System.out.println(" Nombre del Cliente: " + orderString[x][0]);
	    						System.out.println(" Numero de Tabla: " + tableNo[x]);
	    						System.out.println(" Orden del Cliente:");
	    						
	    						for(int y=0;y<=totalOrder[x];y++){
	    							System.out.println("   " +orderMDouble[x][y] +" Pcs\t" +orderStringP[x][y]);
	    						}
	    						System.out.println (" **************************************");
	    						System.out.print(" Total del Recibo: USD " + totalPrice[x]);
	    						if(paid[x]==1){
	    							System.out.println(" *PAGADO*");
	    							System.out.println (" **************************************");
	    						}
	    						else{
	    							System.out.println ("\n **************************************");
	    							for(int m=1;m==1;){
		    							System.out.print("Ingresa pago: ");
		    							payment = Double.parseDouble(in.readLine());
		    							
		    							change=payment-totalPrice[x];
		    							if(change<0){
		    								m=1;
		    								System.out.println("Insuficiente Cantidad de Dinero! Por Favor intentalo de nuevo!");
		    							}
		    							else{
		    								paid[x]=1;
		    								m=0;
		    							}
	    							}
	    							System.out.println("Cambio: USD" +change);
	    						}
	    						
	    						
	    						
	    						s=0;
							}
						}	
						if (s==1){
							System.out.println("Nombre del Cliente No existe!");
							h=1;
							}
						else{
							h=0;
							}
	    	 		f=0;
	    	 		
	    	 		
	    	 	}while(h==1);
	    	 	}
	    	 	else if(choice==4){
	    	 		System.out.println(" ********** INVENTARIO DE PLATOS **********");
	    	 		System.out.println (" **************************************");
	    	 		System.out.println ("\n   *********** MANU DE PLATOS ***********");
	    	 		System.out.println ("   **********************************");
	    	 		for(int z=1;z<=4;z++){
    					System.out.println(" \t" +pieces[z] +" pcs\t\t" +orderNameM[z]);
   					}
   					System.out.println ("   ************ POSTRES *************");
	    	 		System.out.println ("   **********************************");
	    	 		for(int z=5;z<=8;z++){
    					System.out.println(" \t" +pieces[z] +" pcs\t\t" +orderNameM[z]);
   					}
   					System.out.println ("   ************* BEBIDAS *************");
	    	 		System.out.println ("   **********************************");
	    	 		for(int z=9;z<=12;z++){
    					System.out.println(" \t" +pieces[z] +" pcs\t\t" +orderNameM[z]);
   					}
   					System.out.println (" **************************************");
	    	 		f=0;
	    	 	}
	    	 	else if(choice==5){
	    	 		f=0;
	    	 		end=1;
	    	 		again="n";
	    	 		
	    	 		System.out.println("Gracias Vuelve Pronto!!");
	    	 		
	    	 	}
	    	 	else{
	    	 		System.out.println("Entrada Invalida!");
	    	 		f=1;
	    	 	}
	    	 	
    		}
	    		if(end==0){
	    			do{
	    			
		    	 	System.out.print("\nDeseas hacer otra transaccion [Y/N]?");
		    	 	again = in.readLine();
		    	 	
		    	 	if(again.equalsIgnoreCase("n")){
		    	 		i=0;
		    	 	}
		    	 	else if(again.equalsIgnoreCase("y")){
		    	 		i=0;
		    	 	}
		    	 	else{
		    	 		System.out.println("Entrada Invalida!");
		    	 		i=1;
		    	 	}
	    		}while(i==1);
	    		}
	    	}while(again.equalsIgnoreCase("y"));
	    	
	    	break;
    	}
    	else{
    		System.out.println("Invalido Usuario o password!!");
    		a++;
   		}
    }
    	
    }
    
    
}