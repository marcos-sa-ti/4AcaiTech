<%-- 
    Document   : cadastrarCliente
    Created on : 27/05/2019, 20:43:51
    Author     : murilo.aaraujo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Açai Tech - Cadastro Cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1" http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    </head>
    <body class="animsition">

        <!-- Header -->
        <header class="header-v4">
            <!-- Header desktop -->
            <div class="container-menu-desktop">
                <div class="wrap-menu-desktop how-shadow1">
                    <nav class="limiter-menu-desktop container">

                        <!-- Logo desktop -->		
                        <a href="#" class="logo">
                            <img src="images/icons/logo1.png" alt="IMG-LOGO">
                        </a>

                        <!-- Menu desktop -->
                        <div class="menu-desktop">
                            <ul class="main-menu">
                                <li>
                                    <a href="/mavenproject1/index.jsp">Home</a>

                                </li>
                                
                                <li>
                                    <a href="/mavenproject1/institucional.jsp">Institucional</a>
                                </li>

                                <li>
                                    <a href="#">Relatorios</a>
                                </li>

                                <li>
                                    <a href="/mavenproject1/produtos.jsp">Produtos</a>
                                </li>
                                
                                 
                              
                            </ul>
                        </div>	

                        <!-- Icon header -->
                        <div class="wrap-icon-header flex-w flex-r-m">
                            <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search">
                                <i class="zmdi zmdi-search"></i>
                            </div>

                            <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart" data-notify="2">

                                <li>
                                    <a href="shoping-cart.jsp" class="zmdi zmdi-shopping-cart">

                                    </a>
                                </li>


                            </div>

                            <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11">

                                <li>
                                    <a href="login.jsp" class="zmdi zmdi-account">

                                    </a>
                                </li>


                            </div>


                        </div>
                    </nav>
                </div>	
            </div>

            <!-- Header Mobile -->
            <div class="wrap-header-mobile">
                <!-- Logo moblie -->		
                <div class="logo-mobile">
                    <a href="index.jsp"><img src="images/icons/logo-01.png" alt="IMG-LOGO"></a>
                </div>

                <!-- Icon header -->
                <div class="wrap-icon-header flex-w flex-r-m m-r-15">
                    <div class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search">
                        <i class="zmdi zmdi-search"></i>
                    </div>

                    <div class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-cart" data-notify="2">
                        <i class="zmdi zmdi-shopping-cart"></i>
                    </div>

                    <a href="#" class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti" data-notify="0">
                        <i class="zmdi zmdi-favorite-outline"></i>
                    </a>
                </div>

                <!-- Button show menu -->
                <div class="btn-show-menu-mobile hamburger hamburger--squeeze">
                    <span class="hamburger-box">
                        <span class="hamburger-inner"></span>
                    </span>
                </div>
            </div>


            <!-- Menu Mobile -->
            <div class="menu-mobile">
                <ul class="topbar-mobile">
                    <li>
                        <div class="left-top-bar">
                            Free shipping for standard order over $100
                        </div>
                    </li>

                    <li>
                        <div class="right-top-bar flex-w h-full">
                            <a href="#" class="flex-c-m p-lr-10 trans-04">
                                Help & FAQs
                            </a>

                            <a href="#" class="flex-c-m p-lr-10 trans-04">
                                My Account
                            </a>

                            <a href="#" class="flex-c-m p-lr-10 trans-04">
                                EN
                            </a>

                            <a href="#" class="flex-c-m p-lr-10 trans-04">
                                USD
                            </a>
                        </div>
                    </li>
                </ul>

                <ul class="main-menu-m">
                    <li>
                        <a href="index.jsp">Home</a>
                        <ul class="sub-menu-m">
                            <li><a href="index.jsp">Homepage 1</a></li>
                            <li><a href="home-02.html">Homepage 2</a></li>
                            <li><a href="home-03.html">Homepage 3</a></li>
                        </ul>
                        <span class="arrow-main-menu-m">
                            <i class="fa fa-angle-right" aria-hidden="true"></i>
                        </span>
                    </li>

                    <li>
                        <a href="product.jsp">Shop</a>
                    </li>

                    <li>
                        <a href="shoping-cart.jsp" class="label1 rs1" data-label1="hot">Features</a>
                    </li>

                    <li>
                        <a href="blog.jsp">Blog</a>
                    </li>

                    <li>
                        <a href="about.jsp">About</a>
                    </li>

                    <li>
                        <a href="contact.jsp">Contact</a>
                    </li>
                </ul>
            </div>

            <!-- Modal Search -->
            <div class="modal-search-header flex-c-m trans-04 js-hide-modal-search">
                <div class="container-search-header">
                    <button class="flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search">
                        <img src="images/icons/icon-close2.png" alt="CLOSE">
                    </button>

                    <form class="wrap-search-header flex-w p-l-15">
                        <button class="flex-c-m trans-04">
                            <i class="zmdi zmdi-search"></i>
                        </button>
                        <input class="plh3" type="text" name="search" placeholder="Search...">
                    </form>
                </div>
            </div>
        </header>

        <!-- Cart -->


        <br><br><br><br>

        <div class="site-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
<!--${pageContext.request.contextPath}/cadastrarCliente -->
                        <form action="${pageContext.request.contextPath}/cadastrarCliente" name="formularioCliente" id="formularioCliente"  method="post">

                            <div class="p-3 p-lg-5 border">

                                <center><b>Dados</b></center>
                                <br>

                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label>Nome Completo</label>
                                        <input class="form-control" id="nomeCliente" name="nomeCliente" maxlength="50" required><br>
                                    </div>

                                </div>
                                <div class="form-group row">
                                    <div class="col-md-6">
                                        <label>CPF<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="cpfCliente" name="cpfCliente" maxlength="11" required>
                                    </div>
                                    <div class="col-md-6">
                                        <label>Data de Nascimento<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="datanascimentoCliente" name="datanascimentoCliente">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-md-6">
                                        <label>Telefone<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="telefoneCliente" name="telefoneCliente">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label>E-mail<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="emailCliente" name="emailCliente">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label>Senha<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="senhaCliente" name="senhaCliente">
                                    </div>
                                </div>





                                <br>
                                <br>

                                <center ><b>Endereco de Entrega</b></center>
                                <br>

                                <div class="form-group row">
                                    <div class="col-md-10">
                                        <label>Rua <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="enderecoCliente" name="enderecoCliente">
                                    </div>
                                    <div class="col-md-2">
                                        <label>Numero<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="numerocasaCliente" name="numerocasaCliente">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-md-8">
                                        <label>Complemento <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="complementoCliente" name="complementoCliente">
                                    </div>
                                    <div class="col-md-4">
                                        <label>CEP<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="cepCliente" name="cepCliente">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-md-6">
                                        <label>Cidade<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="cidadeCliente" name="cidadeCliente">
                                    </div>
                                    <div class="col-md-6">
                                        <label>Estado <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="estadoCliente" name="estadoCliente">
                                    </div>
                                </div>
                                <br>

                                <center ><b>Forma de Pagamento</b></center>

                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label>Nome do Titular<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="nometitularCliente" name="nometitularCliente">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <div class="col-md-8">
                                        <label>Numero do Cartao <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="numerocartaoCliente" name="numerocartaoCliente">
                                    </div>
                                    <div class="col-md-4">
                                        <label>Codigo de Seguranca <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="codsegcartaoCliente" name="codsegcartaoCliente">
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

        <br><br><br><br>




        <!-- Footer -->
        <footer class="bg3 p-t-75 p-b-32">
            <div class="container">
                <div class="row">




                    <div class="col-sm-6 col-lg-3 p-b-50">
                        <h4 class="stext-301 cl0 p-b-30">
                            ENTRE EM CONTATO
                        </h4>

                        <p class="stext-107 cl7 size-201">
                            Entre em contato atraves do e-mail contato@acaitech.com.br ou no numero +5511 5181-5564
                        </p>

                    </div>


                </div>


            </div>
        </footer>


        <!-- Back to top -->
        <div class="btn-back-to-top" id="myBtn">
            <span class="symbol-btn-back-to-top">
                <i class="zmdi zmdi-chevron-up"></i>
            </span>
        </div>


        <!--===============================================================================================-->	
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <script>
            $(".js-select2").each(function () {
                $(this).select2({
                    minimumResultsForSearch: 20,
                    dropdownParent: $(this).next('.dropDownSelect2')
                });
            })
        </script>
        <!--===============================================================================================-->
        <script src="vendor/daterangepicker/moment.min.js"></script>
        <script src="vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/slick/slick.min.js"></script>
        <script src="js/slick-custom.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/parallax100/parallax100.js"></script>
        <script>
            $('.parallax100').parallax100();
        </script>
        <!--===============================================================================================-->
        <script src="vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
        <script>
            $('.gallery-lb').each(function () { // the containers for all your galleries
                $(this).magnificPopup({
                    delegate: 'a', // the selector for gallery item
                    type: 'image',
                    gallery: {
                        enabled: true
                    },
                    mainClass: 'mfp-fade'
                });
            });
        </script>
        <!--===============================================================================================-->
        <script src="vendor/isotope/isotope.pkgd.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/sweetalert/sweetalert.min.js"></script>
        <script>
            $('.js-addwish-b2, .js-addwish-detail').on('click', function (e) {
                e.preventDefault();
            });

            $('.js-addwish-b2').each(function () {
                var nameProduct = $(this).parent().parent().find('.js-name-b2').html();
                $(this).on('click', function () {
                    swal(nameProduct, "is added to wishlist !", "success");

                    $(this).addClass('js-addedwish-b2');
                    $(this).off('click');
                });
            });

            $('.js-addwish-detail').each(function () {
                var nameProduct = $(this).parent().parent().parent().find('.js-name-detail').html();

                $(this).on('click', function () {
                    swal(nameProduct, "is added to wishlist !", "success");

                    $(this).addClass('js-addedwish-detail');
                    $(this).off('click');
                });
            });

            /*---------------------------------------------*/

            $('.js-addcart-detail').each(function () {
                var nameProduct = $(this).parent().parent().parent().parent().find('.js-name-detail').html();
                $(this).on('click', function () {
                    swal(nameProduct, "is added to cart !", "success");
                });
            });

        </script>
        <!--===============================================================================================-->
        <script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
        <script>
            $('.js-pscroll').each(function () {
                $(this).css('position', 'relative');
                $(this).css('overflow', 'hidden');
                var ps = new PerfectScrollbar(this, {
                    wheelSpeed: 1,
                    scrollingThreshold: 1000,
                    wheelPropagation: false,
                });

                $(window).on('resize', function () {
                    ps.update();
                })
            });
        </script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>

    </body>
</html>
