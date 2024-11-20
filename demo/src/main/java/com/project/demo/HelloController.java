package com.project.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
   // Halaman Utama
   @RequestMapping("/")
   public String mainPage() {
       return "<!DOCTYPE html>" +
               "<html lang=\"en\">" +
               "<head>" +
               "    <meta charset=\"UTF-8\">" +
               "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
               "    <title>ahmadfazriel348@gmail.com</title>" +
               "    <style>" +
               "        body { font-family: Arial, sans-serif; background-image: url('/background1.jpeg'); background-size: cover; background-position: center; color: #fff; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 10vh; overflow: hidden; }" +
               "        .menu-bar { position: absolute; top: 20px; right: 20px; display: flex; gap: 15px; font-size: 1em; }" +
               "        .menu-item { color: #fff; text-decoration: none; padding: 8px 15px; background-color: rgba(0, 0, 0, 0.5); border-radius: 5px; transition: transform 0.3s, background-color 0.3s; }" +
               "        .menu-item:hover { background-color: rgba(0, 0, 0, 0.8); transform: scale(1.1); }" +
               "        .profile { text-align: center; position: absolute; top: 25%; left: 50%; transform: translateX(-50%); }" +
               "        .profile-img { width: 150px; height: 150px; border-radius: 50%; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.5); margin-bottom: 20px; animation: fadeIn 1.5s ease-out; }" +
               "        h1 { font-size: 2.5em; margin: 0; opacity: 0; animation: slideIn 1.5s forwards; animation-delay: 0.5s; }" +
               "        @keyframes fadeIn { from { opacity: 0; transform: scale(0.8); } to { opacity: 1; transform: scale(1); } }" +
               "        @keyframes slideIn { from { opacity: 0; transform: translateY(-20px); } to { opacity: 1; transform: translateY(0); } }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <div class=\"menu-bar\">" +
               "        <a href=\"/biodata\" target=\"_self\" class=\"menu-item\">Biodata</a>" +
               "        <a href=\"/kontak\" target=\"_self\" class=\"menu-item\">Kontak</a>" +
               "        <a href=\"/cv\" target=\"_self\" class=\"menu-item\">CV</a>" +
               "    </div>" +
               "    <div class=\"profile\">" +
               "        <img src=\"/background1.jpeg\" alt=\"Profile Image\" class=\"profile-img\">" +
               "        <h1>Ahmad Fahzriel</h1>" +
               "    </div>" +
               "</body>" +
               "</html>";
   }

   // Halaman Biodata
   @RequestMapping("/biodata")
   public String biodataPage() {
       return "<!DOCTYPE html>" +
               "<html lang=\"en\">" +
               "<head>" +
               "    <meta charset=\"UTF-8\">" +
               "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
               "    <title>Biodata</title>" +
               "    <style>" +
               "        body { font-family: Arial, sans-serif; background-image: url('/background1.jpeg'); background-size: cover; background-position: center; color: #fff; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }" +
               "        .container { display: flex; justify-content: space-between; width: 80%; padding: 20px; align-items: center; animation: slideIn 1s ease; }" +
               "        .bio-content { max-width: 50%; padding: 20px; text-align: left; }" +
               "        .bio-photo { width: 40%; height: auto; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.5); }" +
               "        .bio-content h1 { font-size: 2.5em; margin-bottom: 20px; }" +
               "        .bio-content p { font-size: 1.2em; line-height: 1.6; }" +
               "        @keyframes slideIn { from { opacity: 0; transform: translateX(-100px); } to { opacity: 1; transform: translateX(0); } }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <div class=\"container\">" +
               "        <div class=\"bio-content\">" +
               "            <h1>Ahmad Fahzriel</h1>" +
               "            <p><strong>Tempat, Tanggal Lahir:</strong> Nanga Pinoh, 15 Agustus 2004</p>" +
               "            <p><strong>Alamat:</strong> Jl. Kramat Raya blok D No. 06, Kalimantan Barat</p>" +
               "            <p><strong>Jenis Kelamin:</strong> Laki-laki</p>" +
               "            <p><strong>Hobi:</strong> Main Futsal, Game</p>" +
               "        </div>" +
               "        <div>" +
               "            <img src=\\\"/bacgroun1.jpeg\" alt=\"Profile Photo\" class=\"bio-photo\">" +
               "        </div>" +
               "    </div>" +
               "</body>" +
               "</html>";
   }

   // Halaman CV
   @RequestMapping("/cv")
   public String cvPage() {
       return "<!DOCTYPE html>" +
               "<html lang=\"en\">" +
               "<head>" +
               "    <meta charset=\"UTF-8\">" +
               "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
               "    <title>Curriculum Vitae</title>" +
               "    <style>" +
               "        body { font-family: Arial, sans-serif; background-image: url('/background1.jpeg'); background-size: cover; background-position: center; color: #fff; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }" +
               "        .content { max-width: 800px; margin: 50px auto; padding: 30px; background-color: rgba(0, 0, 0, 0.7); border-radius: 10px; box-shadow: 0 8px 16px rgba(0, 0, 0, 0.4); text-align: left; animation: fadeIn 1.5s ease; }" +
               "        .content h2, .content h3 { font-size: 2em; color: #4CAF50; margin-bottom: 20px; }" +
               "        .content ul { font-size: 1.2em; line-height: 1.6; list-style-type: none; padding-left: 0; }" +
               "        .content li { margin-bottom: 10px; }" +
               "        @keyframes fadeIn { from { opacity: 0; } to { opacity: 1; } }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <div class=\"content\">" +
               "        <h2>Curriculum Vitae</h2>" +
               "        <h3>Riwayat Pendidikan</h3>" +
               "        <ul>" +
               "            <li><strong>SDN 06 NANGA PINOH</strong>, (2010-2016)</li>" +
               "            <li><strong>SMPN 01 NANGA PINOH</strong>, (2016-2019</li>" +
               "            <li><strong>SMK NURUL MA'ARIF SINTANG</strong>, (2019-2022)</li>" +
               "            <li><strong>Universitas Nahdlatul Ulama Indonesia</strong>, (2023-2027 lulus dengan predikat terbaik TI)</li>" +
               "        </ul>" +
               "        <ul>" +
               "        </ul>" +
               "    </div>" +
               "</body>" +
               "</html>";
   }

   // Halaman Kontak
   @RequestMapping("/kontak")
   public String kontakPage() {
       return "<!DOCTYPE html>" +
               "<html lang=\"en\">" +
               "<head>" +
               "    <meta charset=\"UTF-8\">" +
               "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
               "    <title>Kontak</title>" +
               "    <style>" +
               "        body { font-family: Arial, sans-serif; background-image: url('/background1.jpeg'); background-size: cover; background-position: center; color: #fff; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }" +
               "        .contact-box { padding: 40px; background-color: rgba(0, 0, 0, 0.7); border-radius: 10px; box-shadow: 0 8px 16px rgba(0, 0, 0, 0.4); width: 300px; text-align: center; animation: slideIn 1s ease; }" +
               "        .contact-box h2 { font-size: 2em; color: #4CAF50; margin-bottom: 20px; }" +
               "        .contact-box p { font-size: 1.2em; line-height: 1.6; margin: 10px 0; }" +
               "        @keyframes slideIn { from { opacity: 0; transform: translateX(100px); } to { opacity: 1; transform: translateX(0); } }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <div class=\"contact-box\">" +
               "        <h2>CONTACT</h2>" +
               "        <p><strong>Email:</strong> ahmadfazriel349@gmail.com</p>" +
               "        <p><strong>Telepon:</strong> +6282154286642</p>" +
               "    </div>" +
               "</body>" +
               "</html>";
   }
}
