var configGraficoPesagem = {
    type: 'line',
    data: {
        labels: ['05/05/20', '06/05/20', '07/05/20', '08/05/20', '09/05/20', '10/05/20', '11/05/20'],
        datasets: [{
            label: 'Peso',
            backgroundColor: 'rgb(104, 54, 150)',
            borderColor: 'rgb(104, 54, 150)',
            data: [86, 85, 85, 85, 85, 85, 84],
            fill: false,
        }]
    },
    options: {
        responsive: true,
        legend: {
            display: false
        },
        tooltips: {
            mode: 'index',
            intersect: false,
        },
        hover: {
            mode: 'nearest',
            intersect: true
        }
    }
};

ctx = document.getElementById('graficoPesagem').getContext('2d');
window.graficoPesagem = new Chart(ctx, configGraficoPesagem);