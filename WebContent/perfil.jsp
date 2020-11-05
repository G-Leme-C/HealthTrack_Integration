<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Health Track - Alimentação</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ht_styles.css">
        <link rel="stylesheet" href="open-iconic/font/css/open-iconic-bootstrap.css">
        <link rel="stylesheet" href="css/Chart.min.css">    
    </head>
    <body>
       	<%@include file="menu.jsp" %>    

        <section class="container-fluid">
            <div class="row mb-5">
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <h4 class="text-center mt-1">Perfil</h5>
                    <div class="card">
                        <div class="mt-2">
                            <img src="img/user_purple.png" alt="imagem do usuário" class="icon-size-6 p-2 m-1 float-left" >
                            <a class="btn float-right" ><img src="img/pencil-edit-button_purple.png" alt="imagem do usuário" class="icon-size-2"></a>
                            <p class="font-dark-ht">Nome: <span class="font-light-ht">Gabriel Leme Calsada</span></p>
                            <p class="font-dark-ht">Idade: <span class="font-light-ht">23</span></p>
                            <p class="font-dark-ht">Sexo: <span class="font-light-ht">Masculino</span></p>
                        </div>
                        <div class="m-2 card">
                            <div class="m-3">
                                <p class="font-dark-ht">Data de nascimento: <span class="font-light-ht">04/08/1997</span></p>
                                <p class="font-dark-ht">Altura: <span class="font-light-ht">185cm</span></p>
                                <p class="font-dark-ht">Peso atual: <span class="font-light-ht">85kg</span></p>
                                <p class="font-dark-ht">Meta: <span class="font-light-ht">80kg</span></p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <h4 class="text-center mt-1">Progresso</h4>
                    <div class="card mb-5 m-2 p-1 pb-3">
                        <div class="chart-container">
                            <canvas id="graficoProgresso" height="230px">
                            </canvas>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <h4 class="text-center mt-1">Consumo calórico x Gasto</h4>
                    <div class="card mb-5 m-2 p-1 pb-3">
                        <div class="card m-1">
                            <div class="m-2">
                                <p class="font-dark-ht text-center">Consumo entre 05/05/2020 a 12/05/2020</p>
                                <ul class="list-group">
                                    <li class="list-group-item d-flex justify-content-between">Gasto calórico basal: <span>2350kCal / Dia</span> </li>
                                    <li class="list-group-item d-flex justify-content-between">Gasto com exercícios: <span>500kCal / Dia</span></li>
                                    <li class="list-group-item d-flex justify-content-between">Ingestão: <span>3000kCal / Dia</span></li>
                                    <li class="list-group-item d-flex justify-content-between">Saldo final: <span>+150kCal / Dia</span></li>
                                </ul>
                                <p class="font-dark-ht m-2">
                                    Um gasto calórico positivo geralmente resulta em ganho de massa (aumento de peso).
                                </p>
                            </div>
                            
                        </div>
                    </div>
                </div>

            </div>
        </section>

		<%@include file="footer.jsp" %>
		
        <script type="text/javascript" src="js/jquery.slim.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/moment.js"></script>
        <script type="text/javascript" src="js/Chart.min.js"></script>
        <script type="text/javascript" src="js/htChartsProgresso.js"></script>
    </body>
</html>