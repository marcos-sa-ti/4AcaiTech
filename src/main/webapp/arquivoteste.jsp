

<%-- 
    Document   : arquivoteste
    Created on : 23/05/2019, 15:54:30
    Author     : marcos.sbrito2

PODE EXCLUIR ESSE ARQUIVO
PODE EXCLUIR ESSE ARQUIVO
PODE EXCLUIR ESSE ARQUIVO
PODE EXCLUIR ESSE ARQUIVO
PODE EXCLUIR ESSE ARQUIVO


--%>

<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.png"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/linearicons-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/MagnificPopup/magnific-popup.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pode excluir essa pagina</title>
    </head>
    <body>
       
        <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-md-8">

              <form action="${pageContext.request.contextPath}/cadastrarCliente" name="formularioCliente" id="formularioCliente" method="post">
              
              <div class="p-3 p-lg-5 border">
			  
			  	<center><b>Dados</b></center>
				<br>
			  
			    <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_subject" class="text-black">Nome Completo </label>
                    <input type="text" class="form-control" id="c_subject" name="nomeCliente"><br>
                  </div>
                                    
                </div>
                <div class="form-group row">
                  <div class="col-md-6">
                    <label for="c_fname" class="text-black">CPF <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="cpfCliente">
                  </div>
                  <div class="col-md-6">
                    <label for="c_lname" class="text-black">Data de Nascimento	 <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_lname" name="datanascimentoCliente">
                  </div>
                </div>
                
                <div class="form-group row">
                  <div class="col-md-6">
                    <label for="c_fname" class="text-black">Telefone <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="telefoneCliente">
                  </div>
                                </div>
                                
                                
                  <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_fname" class="text-black">E-mail <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="emailCliente">
                  </div>
                </div>

                				
				<div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_fname" class="text-black">Senha <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="senhaCliente">
                  </div>
                </div>
                                
                                
				
				
				
				<br>
				<br>
            
				<center ><b>Endereco de Entrega</b></center>
				<br>

             <div class="form-group row">
                  <div class="col-md-10">
                    <label for="c_fname" class="text-black">Rua <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="enderecoCliente">
                  </div>
                  <div class="col-md-2">
                    <label for="c_lname" class="text-black">Numero	 <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_lname" name="numerocasaCliente">
                  </div>
                </div>
                
                <div class="form-group row">
                  <div class="col-md-8">
                    <label for="c_fname" class="text-black">Complemento <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="complementoCliente">
                  </div>
                  <div class="col-md-4">
                    <label for="c_lname" class="text-black">CEP	 <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_lname" name="cepCliente">
                  </div>
                </div>
            
				<div class="form-group row">
                  <div class="col-md-6">
                    <label for="c_fname" class="text-black">Cidade <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="cidadeCliente">
                  </div>
                  <div class="col-md-6">
                    <label for="c_lname" class="text-black">Estado <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_lname" name="estadoCliente">
                  </div>
                </div>
                <br>
				
            <center ><b>Forma de Pagamento</b></center>
				
				<div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_fname" class="text-black">Nome do Titular <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="nometitularCliente">
                  </div>
                </div>
				
								
				<div class="form-group row">
                  <div class="col-md-8">
                    <label for="c_fname" class="text-black">Numero do Cartao <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="numerocartaoCliente">
                  </div>
                  <div class="col-md-4">
                    <label for="c_lname" class="text-black">Codigo de Seguranca <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_lname" name="codsegcartaoCliente">
                  </div>
                </div>
            
            <br>
            <center>
            		<div class="form-group row">
                  <div class="col-lg-12">
                    <input type="submit" class="flex-c-m stext-101 cl0 size-101 bg1 bor1 hov-btn1 p-lr-15 trans-04 js-addcart-detail" value="Cadastrar">
                        </div>
                </div>
            </center>
            
            
              </div>
            </form>
          </div>
 
          
        </div>
      </div>
    </div>
        
        
        
        
    </body>
</html>
