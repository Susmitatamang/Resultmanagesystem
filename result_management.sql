-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: September 09, 2020 at 07:25 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `result_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `Result_ID` int(11) NOT NULL,
  `Student_Id` int(255) NOT NULL,
  `Subject_Code` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`Result_ID`, `Student_Id`, `Subject_Code`) VALUES
(88, 7, 'Science45678'),
(98, 7, 'legal999');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `S_ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Roll_No` int(5) NOT NULL,
  `Class` varchar(10) NOT NULL,
  `Section` varchar(10) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`S_ID`, `Name`, `Roll_No`, `Class`, `Section`, `Gender`, `DOB`, `Address`) VALUES
(7, 'Suman', 1, '25', 'A', 'Male', '25/Dec/1997', 'Kalanki'),
(9, 'Ram Krishna', 7, '25', 'B', 'Male', '01/March/1995', 'Damak'),
(4, 'Hari Sharma', 2, '25', 'C', 'Male', '08/Jun/1998', 'Lamjung'),
(2, 'Sita ', 4, '25', 'B', 'Female', '13/July/1992', 'Butwal');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `Sub_code` varchar(15) NOT NULL,
  `Subject` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`Sub_code`, `Subject`) VALUES
('Science45678', 'C#'),
('opt000', 'php'),
('legal999', 'java'),
('common6789', 'bootstrap'),
('Social3214', 'css');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`Result_ID`),
  ADD KEY `Student_Id` (`Student_Id`),
  ADD KEY `Subject_Code` (`Subject_Code`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`S_ID`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`Sub_code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `S_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`Student_Id`) REFERENCES `student` (`S_ID`),
  ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`Subject_Code`) REFERENCES `subject` (`Sub_code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
