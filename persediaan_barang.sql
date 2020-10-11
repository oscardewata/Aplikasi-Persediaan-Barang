-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2019 at 05:44 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `persediaan_barang`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_barang`
--

CREATE TABLE `tbl_barang` (
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` varchar(50) NOT NULL,
  `stok` varchar(50) NOT NULL,
  `satuan` enum('Buah','Lusin','Dus') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_barang`
--

INSERT INTO `tbl_barang` (`kode_barang`, `nama_barang`, `harga`, `stok`, `satuan`) VALUES
('K-012', 'Pensil Warna', '12000', '14', 'Buah'),
('PP-002', 'Pensil 2B', '3500', '65', 'Lusin'),
('PP-005', 'Crayon', '5500', '67', 'Buah');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_barang_keluar`
--

CREATE TABLE `tbl_barang_keluar` (
  `no_keluar` varchar(50) NOT NULL,
  `kode_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `stok_barang` varchar(50) NOT NULL,
  `jumlah` varchar(50) NOT NULL,
  `sisa_barang` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_barang_keluar`
--

INSERT INTO `tbl_barang_keluar` (`no_keluar`, `kode_barang`, `nama_barang`, `stok_barang`, `jumlah`, `sisa_barang`, `tanggal`) VALUES
('BK-001', 'PP-001', 'Pulpen Standard', '73', '1', '72', '02-07-2019');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_barang_masuk`
--

CREATE TABLE `tbl_barang_masuk` (
  `no_masuk` varchar(50) NOT NULL,
  `no_faktur` varchar(50) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah` varchar(25) NOT NULL,
  `tanggal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_barang_masuk`
--

INSERT INTO `tbl_barang_masuk` (`no_masuk`, `no_faktur`, `nama_supplier`, `nama_barang`, `jumlah`, `tanggal`) VALUES
('BM-001', 'TP-002', 'Faber Castell', 'Pensil 2B', '2', '02-07-2019');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_supplier`
--

CREATE TABLE `tbl_supplier` (
  `kode_supplier` varchar(10) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `alamat_supplier` varchar(50) NOT NULL,
  `no_telp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_supplier`
--

INSERT INTO `tbl_supplier` (`kode_supplier`, `nama_supplier`, `alamat_supplier`, `no_telp`) VALUES
('FC-001', 'Faber Castell', 'Bogor', '081111'),
('SP-006', 'Sinar Dunia', 'Depok', '08812');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi_pembelian`
--

CREATE TABLE `tbl_transaksi_pembelian` (
  `no_faktur` varchar(50) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_transaksi_pembelian`
--

INSERT INTO `tbl_transaksi_pembelian` (`no_faktur`, `nama_supplier`, `nama_barang`, `jumlah`, `tanggal`) VALUES
('TP-002', 'Faber Castell', 'Pensil 2B', '5', '01-07-2019');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `usertype` enum('Pemilik','Sales/Gudang') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id`, `username`, `password`, `usertype`) VALUES
('1', 'admin', 'admin', 'Pemilik'),
('2', 'riyan', 'user', 'Sales/Gudang'),
('3', 'andri', 'user', 'Sales/Gudang');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `tbl_barang_keluar`
--
ALTER TABLE `tbl_barang_keluar`
  ADD PRIMARY KEY (`no_keluar`);

--
-- Indexes for table `tbl_barang_masuk`
--
ALTER TABLE `tbl_barang_masuk`
  ADD PRIMARY KEY (`no_masuk`);

--
-- Indexes for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indexes for table `tbl_transaksi_pembelian`
--
ALTER TABLE `tbl_transaksi_pembelian`
  ADD PRIMARY KEY (`no_faktur`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
