<?php

// Define o ID do perfil do Instagram desejado
$instagram_id = '240943328314166';

// Define a hashtag desejada
$hashtag = '46606rdna';

// Define a URL da API do Facebook e o access token necessário
$url = 'https://graph.facebook.com/v16.0/' . $instagram_id . '?fields=id,username&access_token=1443402926434662|JSXU5oY5XwlY-5tQbESiNy3Z_kI';
$access_token = '1443402926434662|JSXU5oY5XwlY-5tQbESiNy3Z_kI';

// Inicializa a biblioteca cURL
$ch = curl_init();

// Define as opções da requisição HTTP GET para obter o username do perfil do Instagram desejado
curl_setopt($ch, CURLOPT_URL, $url);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

// Executa a requisição HTTP GET e armazena a resposta
$resposta = curl_exec($ch);

// Encerra a conexão cURL
curl_close($ch);

// Converte a resposta da API do Facebook em um array associativo
$resultado = json_decode($resposta, true);

// Obtém o username do perfil do Instagram desejado
$username = $resultado['username'];

// Define o endpoint da API do Instagram para buscar fotos com a hashtag desejada
$endpoint = 'https://graph.instagram.com/' . $username . '/media?fields=id,caption,media_type,media_url,thumbnail_url,permalink&access_token=' . $access_token . '&q=%23' . $hashtag;

// Inicializa a biblioteca cURL
$ch = curl_init();

// Define as opções da requisição HTTP GET
curl_setopt($ch, CURLOPT_URL, $endpoint);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

// Executa a requisição HTTP GET e armazena a resposta
$resposta = curl_exec($ch);

// Encerra a conexão cURL
curl_close($ch);

// Converte a resposta da API do Instagram em um array associativo
$resultado = json_decode($resposta, true);

// Exibe as fotos encontradas
foreach ($resultado['data'] as $foto) {
    echo '<img src="' . $foto['media_url'] . '">';
}
?>
