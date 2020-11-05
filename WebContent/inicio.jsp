<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Health Track - Início</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/ht_styles.css">
    <link rel="stylesheet" href="css/geometry.css">
    <link rel="stylesheet" href="open-iconic/font/css/open-iconic-bootstrap.css">
    <link rel="stylesheet" href="css/Chart.min.css">    
</head>
<body>
	<%@include file="menu.jsp" %>    
    <section class="container-fluid">
        <h4 class="text-center mt-1">Dashboard</h4>
        <div class="row">
            <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12 text-center">
                <div class="card pl-3 pr-3 pb-2 pt-1 mb-2" >
                    <div class="font-size-large">Alimentação</div>
                    <div class="chart-container">
                        <canvas id="graficoAlimentacao" height="130px">
                        </canvas>
                        <canvas id="graficoAlimentacao2" height="90px">
                        </canvas>
                        <canvas id="graficoAlimentacao3" height="90px">
                        </canvas>
                        <canvas id="graficoAlimentacao4" height="90px">
                        </canvas>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12 text-center">
                <div class="card mb-2 p-3" >
                    <div class="font-size-large">Exercícios</div>
                    <div class="chart-container">
                        <canvas id="graficoExercicios" height="250px">

                        </canvas>
                    </div>
                </div>
                <div class="card mb-2 p-3 d-block">
                    <img src="img/heartbeat_purple.png" class="icon-size-2">
                    <span class="ml-2">Média de 102 BPM hoje</span>
                </div>
                <div class="card mb-2 p-3 d-block" style="display: block;">
                    <img src="img/running_purple.png" class="icon-size-2">
                    <span class="ml-2">253kCal gastas hoje</span>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12 text-center">
                <div class="card mb-2 p-3" >
                    <div class="font-size-large">Peso</div>
                    <div class="chart-container">
                        <canvas id="graficoPesagem" height="250px">

                        </canvas>
                    </div>
                </div>
                <div class="card mb-2 p-3 d-block">
                    <img src="img/weight_purple.png" class="icon-size-2">
                    <span class="ml-2">Peso atual: 84.0kg</span>
                </div>
                <div class="mb-5 p-3 d-block">
                </div>

            </div>
        </div>
    </section>


	<%@include file="footer.jsp" %>

    <script type="text/javascript" src="js/jquery.slim.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/moment.js"></script>
    <script type="text/javascript" src="js/Chart.min.js"></script>
    <script type="text/javascript" src="js/htCharts.js"></script>
</body>


</html>