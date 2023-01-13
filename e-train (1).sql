-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2023 at 03:57 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e-train`
--

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `idKereta` int(100) NOT NULL,
  `namaKereta` varchar(100) NOT NULL,
  `gerbong` varchar(100) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `jadwalBerangkat` varchar(100) NOT NULL,
  `jadwalTiba` varchar(100) NOT NULL,
  `hargaTiket` int(255) NOT NULL,
  `stasiunAsal` varchar(100) NOT NULL,
  `StasiunTujuan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`idKereta`, `namaKereta`, `gerbong`, `kelas`, `jadwalBerangkat`, `jadwalTiba`, `hargaTiket`, `stasiunAsal`, `StasiunTujuan`) VALUES
(1, 'Argo Kayangan', '1', 'Ekonomi', '15.00', '22.00', 100000, 'Stasiun Bandung', 'Stasiun Jakarta Kota'),
(3, 'Kereta Kencana Malam Suro', 'A69', 'Executive', '23.59', '06.00', 1000000, 'Stasiun Jakarta Kota', 'Stasiun Bekasi');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `id` int(255) NOT NULL,
  `nama_penumpang` varchar(255) NOT NULL,
  `nama_penumpangs` varchar(255) NOT NULL,
  `umur` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `nama_kereta` varchar(255) NOT NULL,
  `gerbong` varchar(255) NOT NULL,
  `kelas` varchar(255) NOT NULL,
  `jadwal_berangkat` varchar(255) NOT NULL,
  `jadwal_tiba` varchar(255) NOT NULL,
  `stasiun_asal` varchar(255) NOT NULL,
  `stasiun_tujuan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`id`, `nama_penumpang`, `nama_penumpangs`, `umur`, `jenis_kelamin`, `nama_kereta`, `gerbong`, `kelas`, `jadwal_berangkat`, `jadwal_tiba`, `stasiun_asal`, `stasiun_tujuan`) VALUES
(17, 'a', 'I Kadek Rizky Dwitama Widiasa', '20', 'Laki-Laki', 'Kereta Kencana Malam Suro', 'A69', 'Executive', '06.00', '06.00', 'Stasiun Jakarta Kota', 'Stasiun Bekasi'),
(18, 'aa', 'Arjun', '20', 'Laki-Laki', 'Kereta Kencana Malam Suro', 'A69', 'Executive', '06.00', '06.00', 'Stasiun Jakarta Kota', 'Stasiun Bekasi');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `namaLengkap` varchar(100) NOT NULL,
  `umur` int(100) NOT NULL,
  `jenisKelamin` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `nomorTelepon` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `namaLengkap`, `umur`, `jenisKelamin`, `email`, `alamat`, `nomorTelepon`) VALUES
(1, 'a', 'a', 'a', 20, 'Laki-Laki', 'a', 'a', 'a'),
(2, 'najibjamil', 'najibjamil123', 'Najib Jamil A', 20, 'Laki-Laki', 'emmu@gmail.com', 'Komplek GBA', '085269696969'),
(3, 'rizkydwitama', 'kikikukukoko', 'Don Rizky Dwitama Corleone', 20, 'Laki-Laki', 'doncorleone@gmail.com', 'Komplek Bintang Kejora', '085298241356'),
(4, 'daslkdmaksdmka', 'asld,alsdalsd,a', 'KAKAKAKAKA', 20, 'Laki-Laki', 'aincard@gmail.com', 'Komplek Bojongsoang', '085220202020'),
(5, 'hahahhaha', 'hahahahhahha', 'yayyayayayya', 21, 'Laki-Laki', 'aisdsdancard@gmail.com', 'Komplek Bojonggede', '08522020211'),
(6, 'aa', 'aa', 'aa', 21, 'Laki-Laki', 'aa', 'aa', 'aa'),
(7, 'aka', 'aja', 'aajajjajajaja', 20, 'Laki-Laki', 'ajaja@gmail.com', 'Komplek Petarung', '081269693245'),
(8, 'kikukukoko', 'kiki', 'Kiki', 20, 'Laki-Laki', 'kiki@gmail.com', 'Komplek GBA', '085247474747');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`idKereta`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kereta`
--
ALTER TABLE `kereta`
  MODIFY `idKereta` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
