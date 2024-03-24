-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 24, 2024 at 07:28 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HotelManagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `Amount`
--

CREATE TABLE `Amount` (
  `ID` int(10) NOT NULL,
  `Category` varchar(25) NOT NULL,
  `Type` varchar(25) NOT NULL,
  `Rate` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Amount`
--

INSERT INTO `Amount` (`ID`, `Category`, `Type`, `Rate`) VALUES
(4, 'Single', 'AC', 500);

-- --------------------------------------------------------

--
-- Table structure for table `Bookings`
--

CREATE TABLE `Bookings` (
  `ID` int(10) NOT NULL,
  `Room` int(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `PhnNo` int(10) NOT NULL,
  `Address` varchar(25) NOT NULL,
  `Category` varchar(25) NOT NULL,
  `Type` varchar(25) NOT NULL,
  `CheckIn` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `CheckOut`
--

CREATE TABLE `CheckOut` (
  `ID` int(10) NOT NULL,
  `Room` int(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `PhnNo` int(10) NOT NULL,
  `CheckIn` date NOT NULL,
  `CheckOut` date NOT NULL,
  `Amount` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `CustomerInfo`
--

CREATE TABLE `CustomerInfo` (
  `ID` int(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `PhnNo` int(10) NOT NULL,
  `Address` varchar(25) NOT NULL,
  `Room` int(10) NOT NULL,
  `CheckIn` varchar(25) NOT NULL,
  `Type` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Registration`
--

CREATE TABLE `Registration` (
  `ID` int(10) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Address` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL,
  `PhoneNumber` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Registration`
--

INSERT INTO `Registration` (`ID`, `Username`, `Email`, `Address`, `Password`, `PhoneNumber`) VALUES
(3, 'john', 'me@mail.com', 'aluva', '12345', 1234567890);

-- --------------------------------------------------------

--
-- Table structure for table `Reservation`
--

CREATE TABLE `Reservation` (
  `ID` int(10) NOT NULL,
  `Room` int(10) NOT NULL,
  `CheckIn` varchar(25) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `PhnNo` int(10) NOT NULL,
  `Address` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Rooms`
--

CREATE TABLE `Rooms` (
  `ID` int(10) NOT NULL,
  `Room` int(10) NOT NULL,
  `Type` varchar(25) NOT NULL,
  `Category` varchar(25) NOT NULL,
  `Availability` varchar(25) NOT NULL DEFAULT 'VACANT'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Rooms`
--

INSERT INTO `Rooms` (`ID`, `Room`, `Type`, `Category`, `Availability`) VALUES
(8, 110, 'AC', 'Single', 'VACANT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Amount`
--
ALTER TABLE `Amount`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Bookings`
--
ALTER TABLE `Bookings`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `CheckOut`
--
ALTER TABLE `CheckOut`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `CustomerInfo`
--
ALTER TABLE `CustomerInfo`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Registration`
--
ALTER TABLE `Registration`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Reservation`
--
ALTER TABLE `Reservation`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Rooms`
--
ALTER TABLE `Rooms`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Amount`
--
ALTER TABLE `Amount`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Bookings`
--
ALTER TABLE `Bookings`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `CheckOut`
--
ALTER TABLE `CheckOut`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `CustomerInfo`
--
ALTER TABLE `CustomerInfo`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `Registration`
--
ALTER TABLE `Registration`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `Reservation`
--
ALTER TABLE `Reservation`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Rooms`
--
ALTER TABLE `Rooms`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
