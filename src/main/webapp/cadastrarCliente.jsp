<%-- 
    Document   : cadastrarCliente.jsp
    Created on : 23/05/2019, 21:22:43
    Author     : geoinformacao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Product Detail</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
                                    <a href="index.html">Home</a>

                                </li>



                                <li>
                                    <a href="#">Relatorios</a>
                                </li>

                                <li>
                                    <a href="Produtos.html">Produtos</a>
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
                                    <a href="shoping-cart.html" class="zmdi zmdi-shopping-cart">

                                    </a>
                                </li>


                            </div>

                            <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11">

                                <li>
                                    <a href="login.html" class="zmdi zmdi-account">

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
                    <a href="index.html"><img src="images/icons/logo-01.png" alt="IMG-LOGO"></a>
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
                        <a href="index.html">Home</a>
                        <ul class="sub-menu-m">
                            <li><a href="index.html">Homepage 1</a></li>
                            <li><a href="home-02.html">Homepage 2</a></li>
                            <li><a href="home-03.html">Homepage 3</a></li>
                        </ul>
                        <span class="arrow-main-menu-m">
                            <i class="fa fa-angle-right" aria-hidden="true"></i>
                        </span>
                    </li>

                    <li>
                        <a href="product.html">Shop</a>
                    </li>

                    <li>
                        <a href="shoping-cart.html" class="label1 rs1" data-label1="hot">Features</a>
                    </li>

                    <li>
                        <a href="blog.html">Blog</a>
                    </li>

                    <li>
                        <a href="about.html">About</a>
                    </li>

                    <li>
                        <a href="contact.html">Contact</a>
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
                                        <label for="nome" class="text-black">Nome Completo</label>
                                        <input type="text" class="form-control" id="nome" name="nome"><br>
                                    </div>

                                </div>
                                <div class="form-group row">
                                    <div class="col-md-6">
                                        <label for="cpf" class="text-black">CPF<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="cpf" name="cpf">
                                    </div>
                                    <div class="col-md-6">
                                        <label for="datanascimento" class="text-black">Data de Nascimento<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="datanascimento" name="datanascimento">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-md-6">
                                        <label for="telefone" class="text-black">Telefone<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="telefone" name="telefone">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label for="email" class="text-black">E-mail<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="email" name="email">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label for="senha" class="text-black">Senha<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="senha" name="senha">
                                    </div>
                                </div>





                                <br>
                                <br>

                                <center ><b>Endereco de Entrega</b></center>
                                <br>

                                <div class="form-group row">
                                    <div class="col-md-10">
                                        <label for="endereco" class="text-black">Rua <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="endereco" name="endereco">
                                    </div>
                                    <div class="col-md-2">
                                        <label for="numeroend" class="text-black">Numero<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="numeroend" name="numeroend">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-md-8">
                                        <label for="complemento" class="text-black">Complemento <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="complemento" name="complemento">
                                    </div>
                                    <div class="col-md-4">
                                        <label for="cep" class="text-black">CEP<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="cep" name="cep">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-md-6">
                                        <label for="cidade" class="text-black">Cidade<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="cidade" name="cidade">
                                    </div>
                                    <div class="col-md-6">
                                        <label for="estado" class="text-black">Estado <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="estado" name="estado">
                                    </div>
                                </div>
                                <br>

                                <center ><b>Forma de Pagamento</b></center>

                                <div class="form-group row">
                                    <div class="col-md-12">
                                        <label for="nometitular" class="text-black">Nome do Titular<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="nometitular" name="nometitular">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <div class="col-md-8">
                                        <label for="numerocartao" class="text-black">Numero do Cartao <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="numerocartao" name="numerocartao">
                                    </div>
                                    <div class="col-md-4">
                                        <label for="codsegcartao" class="text-black">Codigo de Seguranca <span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="codsegcartao" name="c_lname">
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
