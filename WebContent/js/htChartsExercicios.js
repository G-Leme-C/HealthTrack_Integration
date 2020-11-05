var configGraficoExercicios = {
    type: 'line',
    data: {
        labels: ['05/05', '06/05', '07/05', '08/05', '09/05', '10/05', '11/05'],
        datasets: [{
            label: 'Exercício Anaeróbico',
            backgroundColor: 'rgb(104, 54, 150)',
            borderColor: 'rgb(104, 54, 150)',
            data: [
                10,
                12,
                10,
                13,
                10,
                10,
                16
            ],
            fill: false,
        }, {
            label: 'Exercício Aeróbico',
            fill: false,
            backgroundColor: 'rgb(180, 143, 214)',
            borderColor: 'rgb(180, 143, 214)',
            data: [
                15,
                25,
                19,
                8,
                5,
                6,
                10
            ],
        }]
    },
    options: {
        responsive: true,
        tooltips: {
            mode: 'index',
            intersect: false,
        },
        hover: {
            mode: 'nearest',
            intersect: true
        },
        scales: {
            xAxes: [{
                display: true,
                scaleLabel: {
                    display: true,
                    labelString: 'Data'
                }
            }],
            yAxes: [{
                display: true,
                scaleLabel: {
                    display: true,
                    labelString: 'Minutos'
                }
            }]
        }
    }
};


window.onload = function() {
    ctx = document.getElementById('graficoExercicios').getContext('2d');
    window.graficoExercicios = new Chart(ctx, configGraficoExercicios);
};