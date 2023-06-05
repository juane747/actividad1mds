import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import  java.time.*;
import  java.time.format.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Menu{
    public static ArrayList<Pedido>pedidos;
    public static ArrayList<Usuario> usuarios= new ArrayList<>();
    public String nombresucursal;
    public Menu(){
        this.nombresucursal="Unica";
        this.pedidos= new ArrayList<Pedido>();
    } 
    
    public void EliminarUsuario(){
        System.out.println("Se va a eliminar el siguiente usuario: "+this.usuarios);
        this.usuarios=new ArrayList<Usuario>();
    }
    
    public void AgregarUsurio(Usuario us){
        System.out.println("Se va agregar el siguiente usuario: "+us);
        Menu.usuarios.add(us);
    }

    public void EliminarPedido(){
        System.out.println("Se va eliminar el siguiente pedido: "+this.pedidos);
        this.pedidos=new ArrayList<Pedido>();
    }

    public void AgregarPedido(Pedido ped){
        System.out.println("Se va agregar el siguiente pedido: "+ped);
        Menu.pedidos.add(ped);
    }

    public static void main(String[] args){
     Menu menu = new Menu();
     Usuario us1 = new Usuario(1,"Emilio","emi","hola","jose@gal.edu");
     menu.AgregarUsurio(us1);
     Pedido ped1 = new Pedido(1,"Jose","Pendiente",LocalDate.parse("2023-06-04"),LocalDate.parse("2023-06-04"),"Urgente",10,50);
     menu.AgregarPedido(ped1);  

        Scanner scanner = new Scanner(System.in);
        String lectura = "";
        Integer opcion1 =0;
        Integer opcion2 =0;
        Integer opcion3 =0;

            System.out.println("BIENVENIDO AL SISTEMA DE CONTROL DE PEDIDOS "+"\n"+"Menu Principal, Las opciones disponibles son: ");
            while(opcion1 !=3){
                  try{
                    System.out.println("Ingrese 1 para Crear Pedido");
                    System.out.println("Ingrese 2 para Gestiones Administrativas ");
                    System.out.println("Ingrese 3 para salir del programa");

                lectura = scanner.nextLine();
                //Entrando en opcion 1 para crear nuevo pedido
                opcion1=Integer.parseInt(lectura);
                }catch(NumberFormatException nfe){
                    System.out.println("La opcion ingresada no es un numero valido, intente de nuevo");
                    continue;
                }
                 if(opcion1==1){
                    try{
                        System.out.println("Ingrese codigo del pedido, solo se permiten numeros");
                        String input = scanner.nextLine();
                        System.out.println("Ingrese nombre de la persona que envia solo puede usar texto");
                        String input1 = scanner.nextLine();
                        System.out.println("Ingrese Tipo de Pedido: normal o urgente");
                        String input2 = scanner.nextLine();
                        System.out.println("Ingrese fecha de recoleccion formato: años, mes y dia");
                        String input3 = scanner.nextLine();
                        System.out.println("Ingrese fecha de entrega formato: años, mes y dia");
                        String input4 = scanner.nextLine();
                        System.out.println("Ingrese descripcion del pedido");
                        String input5 = scanner.nextLine();
                        System.out.println("Ingrese cantidad pedida, solo se permiten numeros");
                        String input6 = scanner.nextLine();
                        System.out.println("Ingrese costo del pedido solo se permiten numeros");
                        String input7 = scanner.nextLine();
                        menu.AgregarPedido(new Pedido(Integer.parseInt(input), input1,input2,LocalDate.parse(input3),LocalDate.parse(input4),input5,Integer.parseInt(input6),Integer.parseInt(input7)));
                    }catch(NumberFormatException nfe){
                        System.out.println("El codigo de pedido no es un numero valido, vuelva a intentarlo");
                        continue;
                    }
                    }
                        //Opcion 2 del menu Administrativo
                        if(opcion1==2){
                            //iniciando validaciones para usar menu administrativo.
                             System.out.println("Validando Usuario");
                             System.out.println("Ingrese nombre de usuario:");
                            lectura =scanner.nextLine();
                            Usuario seleccion = new Usuario();
                            for(Usuario us : menu.usuarios){
                                if(us.nombreUsuario.equals(lectura)){
                                    System.out.println("Usuario valido");
                                    System.out.println("Validando contraseña");
                                    System.out.println("Ingrese contraseña:");
                                    lectura =scanner.nextLine();
                                    Usuario seleccionado1 = new Usuario();
                                    for(Usuario u2 : menu.usuarios){
                                        if(u2.password.equals(lectura)){
                                            System.out.println("Contraseña valida");
                                             opcion2=0;
                                                while(opcion2 !=3){
                                                    try{
                                                        System.out.println("Menu Administrativo: Las opciones disponibles son: ");
                                                        System.out.println("Ingrese 1 Para ver opciones de usuarios");
                                                        System.out.println("Ingrese 2 Para ver opciones de pedidos");
                                                        System.out.println("Ingrese 3 para salir del sistema");;
                                                    
                                                        lectura = scanner.nextLine();
                                                        opcion2 = Integer.parseInt(lectura);
                                                        }catch(NumberFormatException nfe){
                                                            System.out.println("La opcion ingresada no es un numero intente de nuevo");
                                                            continue;
                                                        }

                                                        //opcion 1 del menu administrativo opciones de usuarios
                                                        if(opcion2==1){
                                                            opcion3=0;
                                                            while(opcion3 !=4){
                                                                    try{
                                                                    System.out.println("Menu Usuarios: Las opciones disponibles son: ");
                                                                    System.out.println("Ingrese 1 Para Modificar usuario");
                                                                    System.out.println("Ingrese 2 Para Crear usuario");
                                                                    System.out.println("Ingrese 3 para eliminar usuario");
                                                                    System.out.println("Ingrese 4 para regresar al menu anterior");
                                                                    lectura = scanner.nextLine();
                                                                    opcion3 = Integer.parseInt(lectura);
                                                                }catch(NumberFormatException nfe){
                                                                    System.out.println("La opcion ingresada no es un numero intente de nuevo");
                                                                    continue;
                                                                } 
                                                                    if(opcion3==1){
                                                                            //Opcion 1 del menu usuarios, modificar usuario
                                                                        System.out.println("Seleccione un Usuario por nombre");
                                                                        lectura =scanner.nextLine();
                                                                        Usuario seleccionado = new Usuario();
                                                                        for(Usuario u : menu.usuarios){
                                                                            if(u.nombreUsuario.equals(lectura)){
                                                                                seleccionado = u;
                                                                                System.out.println("El usuario seleccionado es: "+seleccionado);
                                                                                System.out.println("Ingrese nuevo nombre del Usuario");
                                                                                lectura=scanner.nextLine();
                                                                                seleccionado.ModificarUsuario(lectura);
                                                                                break;
                                                                            }else{
                                                                                System.out.println("El nombre de usuario no existente, intente de nuevo");
                                                                                continue;
                                                                            }
                                                                    }     
                                                                    }
                                                                    //Opcion 2 del menu usuarios, crear usuario
                                                                        if(opcion3==2){
                                                                            opcion3=0;
                                                                                try{
                                                                                    System.out.println("Ingrese codigo del usuario, solo se permiten numeros");
                                                                                    String input = scanner.nextLine();
                                                                                    System.out.println("Ingrese nombre de usuario solo puede usar texto");
                                                                                    String input1 = scanner.nextLine();
                                                                                    System.out.println("Ingrese user name");
                                                                                    String input2 = scanner.nextLine();
                                                                                    System.out.println("Ingrese contraseña");
                                                                                    String input3 = scanner.nextLine();
                                                                                    System.out.println("Ingrese E-mail");
                                                                                    String input4 = scanner.nextLine();
                                                                                    menu.AgregarUsurio(new Usuario(Integer.parseInt(input), input1,input2,input3,input4));
                                                                                }catch(NumberFormatException nfe){
                                                                                    System.out.println("El codigo de usuario no es un numero valido, vuelva a intentarlo");
                                                                                    continue;
                                                                                }
                                                                        }
                                                                            // Opcion 3 del menu usuarios, eliminar usuario
                                                                            if(opcion3==3){
                                                                                opcion3=0;
                                                                                System.out.println("Se va eliminar el usuario");
                                                                                menu.EliminarUsuario();
                                                                                break;
                                                                            }
                                                            }
                                                            
                                                        }
                                                        //Opcion 2 del menu administrativo, opciones de pedidos
                                                            if(opcion2==2){
                                                                opcion3=0;
                                                                while(opcion3!=3){
                                                                        try{
                                                                            System.out.println("Menu Pedidos: Las opciones disponibles son: ");
                                                                            System.out.println("Ingrese 1 Para Modificar pedido");
                                                                            System.out.println("Ingrese 2 Para eliminar pedido");
                                                                            System.out.println("Ingrese 3 para regresar al menu anterior");
                                                                            lectura = scanner.nextLine();
                                                                            opcion3 = Integer.parseInt(lectura);
                                                                        }catch(NumberFormatException nfe){
                                                                            System.out.println("La opcion ingresada no es un numero intente de nuevo");
                                                                            continue;
                                                                        } 
                                                                            // Opcion 1 del menu pedidos, modificar pedido
                                                                            if(opcion3==1){
                                                                                        System.out.println("Seleccione nombre quien pido");
                                                                                        lectura =scanner.nextLine();
                                                                                    
                                                                                        Pedido seleccionado = new Pedido();
                                                                                        for(Pedido p : menu.pedidos){
                                                                                            if(p.nombreEnvia.equals(lectura)){
                                                                                                seleccionado = p;
                                                                                                System.out.println("El Pedido seleccionado es: "+seleccionado);
                                                                                                System.out.println("Ingrese nueva descripcion del pedido");
                                                                                                lectura=scanner.nextLine();
                                                                                                seleccionado.ModificarPedido(lectura);
                                                                                                break;
                                                                                            }else{
                                                                                                System.out.println("El numero de pedido no existente, intente de nuevo");
                                                                                                continue;
                                                                                            }
                                                                                    }  

                                                                            }
                                                                                //Opcion 2 del menu pedidos, eliminar pedido
                                                                                if(opcion3==2){
                                                                                    opcion3=0;
                                                                                    System.out.println("Se va eliminar el pedido");
                                                                                    menu.EliminarPedido();
                                                                                    break;
                                                                                }
                                                                }
                                                            }
                                            }


                                        }else{
                                            System.out.println("La contraseña ingresada no existe, intente de nuevo");
                                             continue;
                                        }
                                    }
                                        
                                        
                                
                                }else{
                                    System.out.println("El nombre de usuario no existe, intente de nuevo");
                                    continue;
                                }
                            }   
                    }
            }
    }
}