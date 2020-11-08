<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Health Track - Alimenta��o</title>
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
            <h4 class="text-center mt-2 mb-4">Controle de peso</h4>    
            <div class="row">
                <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 text-center">
                    <table class="table table-hover table-responsive-sm">
                        <thead class="btn-purple-ht">
                            <tr>
                                <th scope="col"><span class="text-white">Data</span></th>
                                <th scope="col"><span class="text-white">Peso (kg)</span></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>05/05/20</td>
                                <td>86kg</td>
                                <td><img  class="icon-size-1-3" src="img/pencil-edit-button_purple.png" alt="Ícone de um lápis"></td>
                                <td><img  class="icon-size-1-3" src="img/trash_purple.png" alt="Ícone de um lápis"></td>
                            </tr>
                            <tr>
                                <td>06/05/20</td>
                                <td>85kg</td>
                                <td><img  class="icon-size-1-3" src="img/pencil-edit-button_purple.png" alt="Ícone de um lápis"></td>
                                <td><img  class="icon-size-1-3" src="img/trash_purple.png" alt="Ícone de um lápis"></td>
                            </tr>
                            <tr>
                                <td>11/05/20</td>
                                <td>84kg</td>
                                <td><img  class="icon-size-1-3" src="img/pencil-edit-button_purple.png" alt="Ícone de um lápis"></td>
                                <td><img  class="icon-size-1-3" src="img/trash_purple.png" alt="Ícone de um lápis"></td>
                            </tr>
                        </tbody>
                        </table>
                        
                        <button type="button" class="btn border-purple btn-purple-ht mt-2"  data-toggle="modal" data-target="#pesagem">
							  Adicionar Pesagem
							</button>
							
							<!-- Modal -->
							<div class="modal fade" id="pesagem" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
							  <div class="modal-dialog" role="document">
							    <div class="modal-content">
							      <div class="modal-header">
							        <h5 class="modal-title" id="exampleModalLabel">Adicionar Alimento</h5>
							        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
							          <span aria-hidden="true">&times;</span>
							        </button>
							      </div>
							      <div class="modal-body">
							        <form>
									  <div class="form-group">
									    <label for="exampleFormControlInput1">Data</label>
									    <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="09/11/2020">
									  </div>
									  <div class="form-group">
									    <label for="exampleFormControlInput1">Kg:</label>
									    <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="85.0">
									  </div>
							        </form>
							      </div>
							      <div class="modal-footer">
							        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
							        <button type="button" class="btn btn-primary">Salvar</button>
							      </div>
							    </div>
							  </div>
                        </div>
                </div>

                <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 mb-5">
                    <div class="chart-container">
                        <canvas id="graficoPesagem" height="170px">

                        </canvas>
                    </div>
                </div>
            </div>
        </section>

		<%@include file="footer.jsp" %>
		
        <script type="text/javascript" src="js/jquery.slim.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/moment.js"></script>
        <script type="text/javascript" src="js/Chart.min.js"></script>
        <script type="text/javascript" src="js/htChartsPesagem.js"></script>
    </body>
</html>