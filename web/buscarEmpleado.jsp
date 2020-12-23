

<%@page import="Logica.Usuario"%>
<%@page import="Logica.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge" >
  <title>Administración</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" href= "images/ima.ico" type="image/x-icon" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="admin/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Tempusdominus Bbootstrap 4 -->
  <link rel="stylesheet" href="admin/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="admin/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- JQVMap -->
  <link rel="stylesheet" href="admin/plugins/jqvmap/jqvmap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="admin/dist/css/adminlte.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="admin/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="admin/plugins/daterangepicker/daterangepicker.css">
  
  <link rel="stylesheet" href="css/estilos.css">
  <!-- summernote -->
  <link rel="stylesheet" href="admin/plugins/summernote/summernote-bs4.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  
 
  
</head>
<body class="hold-transition sidebar-mini layout-fixed">
         <% HttpSession misession = request.getSession();
    String usu = (String)request.getSession().getAttribute("usuario");
        if (usu == null){
            
            response.sendRedirect("loginError.jsp");
        }else{
               int tipo = (int)request.getSession().getAttribute("tipo");
            if(tipo==1){
    %>
        
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      
      <li class="nav-item d-none d-sm-inline-block">
        <h1 class="m-0 colorFondo"> ADMINISTRACIÓN</h1>
      </li>
     
    </ul>

  

   
    <ul class="navbar-nav ml-auto">
      
      <li class="nav-item dropdown">
        
        
             
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          
            <div class="media">
              
              <div class="media-body">
              
              </div>
            </div>
            
         
          <div class="dropdown-divider"></div>
        
            <div class="media">
             
              <div class="media-body">
               
               
              </div>
            </div>
            
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            
            <div class="media">
             
             
            </div>
            

      </li>
      
      <li class="nav-item dropdown">
        
          
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          
          <div class="dropdown-divider"></div>
         
          <div class="dropdown-divider"></div>
          
          <div class="dropdown-divider"></div>
         
          <div class="dropdown-divider"></div>
         
        </div>
      </li>
      <li class="nav-item">
        <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="login.jsp">Salir</a></li>
              
            </ol>
          </div>
      </li>
    </ul>
  </nav>
  
  <aside class="main-sidebar sidebar  elevation-4">
    
    <a href="#" class="brand-link">
      <img src="admin/dist/img/avatar1.png" alt="Parque diversión" class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span >Parque Diversiones</span>
    </a>

    
    <div class="sidebar">
      
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
     
        <div class="info">
          <p > <i class="nav-icon fas fa-user colorFondo"></i>  <%= session.getAttribute("usuario")%></p>
        </div>
      </div>

      
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
    
          <li class="nav-item has-treeview">
            <a href="crearUsuario.jsp" class="nav-link">
              <i class="nav-icon fas fa-ticket-alt"></i>
              <p>
              Usuarios
                <i class="fas fa-angle-left right"></i>
               
              </p>
            </a>
           
      </nav>
      
        
        <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
    
          <li class="nav-item has-treeview">
            <a href="crearEmpleado.jsp" class="nav-link">
              <i class="nav-icon fas fa-users"></i>
              <p>
              Empleados
                <i class="fas fa-angle-left right"></i>
               
              </p>
            </a>
           
      </nav>
        
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
    
          <li class="nav-item has-treeview">
            <a href="crearHorario.jsp" class="nav-link">
              <i class="nav-icon fas fa-stopwatch"></i>
              <p>
              Horario-Juego
                <i class="fas fa-angle-left right"></i>
               
              </p>
            </a>
           
      </nav>  
              <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
    
          <li class="nav-item has-treeview">
            <a href="crearJuego.jsp" class="nav-link">
              <i class="nav-icon fas fa-stopwatch"></i>
              <p>
              Juego
                <i class="fas fa-angle-left right"></i>
               
              </p>
            </a>
           
      </nav> 
        <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
    
          <li class="nav-item has-treeview">
            <a href="crearConsulta.jsp" class="nav-link">
              <i class="nav-icon fas fa-search"></i>
              <p>
            Consultas General
                <i class="fas fa-angle-left right"></i>
               
              </p>
            </a>
           
      </nav>  
        
              </nav>

        
    </div>
    
  </aside>

  
  <div class="content-wrapper">
    
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            
          </div><!-- /.col -->
         
        </div>
      </div>
    </div>
    

    
   
          
         
            
          
          
       
             
                
             
             
          
        
          
        
          <section >

            <!-- Map card -->
            <div >
              
              
               
             <h1 class="m-0 text-dark center ">Bienvenido al Sistema del Parque de Diversiones</h1>
                <div class="card ">
                          
                    
                    <div class="con">
                        
                        
                     
                     <table>
                            <tr>
                                
                            <th>NOMBRE</th>
                            <th>APELLIDO</th>
                            <th>CARGO</th>
                             <th>DNI</th>
                              <th>USUARIO</th>
                                 
                            </tr> 
                            <% Controladora control = new Controladora();
                            
                            List<Empleado> lista = control.buscarEmpleado();
                            
                           for(Empleado emple : lista){%>
                            
                             <tr>
                            <td><%=emple.getNombre()%></td>
                            <td><%=emple.getApellido()%></td>
                            <td><%=emple.getCargo()%></td>
                             <td><%=emple.getDni()%></td> 
                             
                          
                              <td><%=emple.getUn_usuario().getUsuario()%></td>
                          
                                
                            </tr>
                            <%    }
                             %>
                     </table>
                    
                    </div>
                    
                
                </div></div>
             
            </div>
          
          </section>
        
  <footer class="main-footer">
    <strong>Copyright &copy; Marycielo Oberto 2020</strong>
    Todos los derechos Reservados.
    <div class="float-right d-none d-sm-inline-block">
      <b>Version</b> 1.0.0
    </div>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="admin/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="admin/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- ChartJS -->
<script src="admin/plugins/chart.js/Chart.min.js"></script>
<!-- Sparkline -->
<script src="admin/plugins/sparklines/sparkline.js"></script>
<!-- JQVMap -->
<script src="admin/plugins/jqvmap/jquery.vmap.min.js"></script>
<script src="admin/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
<!-- jQuery Knob Chart -->
<script src="admin/plugins/jquery-knob/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="admin/plugins/moment/moment.min.js"></script>
<script src="admin/plugins/daterangepicker/daterangepicker.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="admin/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<!-- Summernote -->
<script src="admin/plugins/summernote/summernote-bs4.min.js"></script>
<!-- overlayScrollbars -->
<script src="admin/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="admin/dist/js/adminlte.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="admin/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="admin/dist/js/demo.js"></script>
        <% } else{
response.sendRedirect("loginError.jsp");
}}%>
</body>
</html>


