-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 18-06-2018 a las 23:58:03
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario-equipo-5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `contacto` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `rfc` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `municipio` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `localidad` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `codigopostal` int(11) NOT NULL,
  `asentamiento` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `calle` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `contacto`, `telefono`, `email`, `rfc`, `estado`, `municipio`, `localidad`, `codigopostal`, `asentamiento`, `calle`, `numero`) VALUES
(1, 'Aurrera', 'José Luis', '9535362391', 'contacto@aurrera.com', '928HEND938HDNOWIN', 'Oaxaca', 'Huajuapan de Léon', 'Huajuapan de León', 69000, 'Col. Centro', 'C. Nuyoo', 12),
(2, 'Mi tiendita', 'Egremy', '68136568465', 'contacto@mitiendita.com', 'IQOUNED83FU3ND83', 'Oaxaca', 'Huajuapan de Léon', 'Huajuapan de León', 69007, 'Col. Jardines del Sur', 'C. 5 de febrero', 26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id` int(11) NOT NULL,
  `idproveedor` int(11) NOT NULL,
  `fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`id`, `idproveedor`, `fecha`, `total`) VALUES
(1, 1, '2018-06-01 00:00:00', 2500),
(2, 1, '2018-06-02 00:00:00', 3500),
(3, 2, '2018-06-01 00:00:00', 2400),
(4, 2, '2018-06-02 00:00:00', 1500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listacompra`
--

CREATE TABLE `listacompra` (
  `id` int(11) NOT NULL,
  `idcompra` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `listacompra`
--

INSERT INTO `listacompra` (`id`, `idcompra`, `idproducto`, `cantidad`, `subtotal`) VALUES
(1, 1, 1, 2, 500),
(2, 1, 2, 2, 500),
(3, 3, 3, 3, 900),
(4, 4, 4, 2, 500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listaventa`
--

CREATE TABLE `listaventa` (
  `id` int(11) NOT NULL,
  `idventa` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` double NOT NULL,
  `subtotalreal` double NOT NULL,
  `ganancia` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `listaventa`
--

INSERT INTO `listaventa` (`id`, `idventa`, `idproducto`, `cantidad`, `subtotal`, `subtotalreal`, `ganancia`) VALUES
(1, 1, 1, 2, 500, 400, 100),
(2, 1, 2, 2, 500, 400, 100),
(3, 3, 3, 3, 900, 800, 100),
(4, 4, 4, 2, 500, 400, 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `tipo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `marca` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `costocompra` double NOT NULL,
  `costoventa` double NOT NULL,
  `existencia` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `tipo`, `marca`, `costocompra`, `costoventa`, `existencia`) VALUES
(1, 'Balón', 'Nike', 200, 300, 10),
(2, 'Balón', 'Puma', 300, 350, 15),
(3, 'Playera', 'Adidas', 200, 250, 20),
(4, 'Playera', 'Jordan', 300, 350, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `contacto` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `rfc` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `municipio` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `localidad` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `codigopostal` int(11) NOT NULL,
  `asentamiento` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `calle` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `nombre`, `contacto`, `telefono`, `email`, `rfc`, `estado`, `municipio`, `localidad`, `codigopostal`, `asentamiento`, `calle`, `numero`) VALUES
(1, 'Aurrera', 'José Luis', '9535362391', 'contacto@aurrera.com', '928HEND938HDNOWIN', 'Oaxaca', 'Huajuapan de Léon', 'Huajuapan de León', 69000, 'Col. Centro', 'C. Nuyoo', 12),
(2, 'Mi tiendita', 'Egremy', '68136568465', 'contacto@mitiendita.com', 'IQOUNED83FU3ND83', 'Oaxaca', 'Huajuapan de Léon', 'Huajuapan de León', 69007, 'Col. Jardines del Sur', 'C. 5 de febrero', 26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `total` double NOT NULL,
  `totalreal` double NOT NULL,
  `ganancia` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id`, `idcliente`, `fecha`, `total`, `totalreal`, `ganancia`) VALUES
(1, 1, '2018-06-01 00:00:00', 2500, 2000, 500),
(2, 1, '2018-06-02 00:00:00', 3500, 3000, 500),
(3, 2, '2018-06-01 00:00:00', 2400, 2000, 400),
(4, 2, '2018-06-02 00:00:00', 1500, 1200, 300);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_idproveedor` (`idproveedor`);

--
-- Indices de la tabla `listacompra`
--
ALTER TABLE `listacompra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_idproducto` (`idproducto`),
  ADD KEY `fk_idcompra` (`idcompra`);

--
-- Indices de la tabla `listaventa`
--
ALTER TABLE `listaventa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_idproducto` (`idproducto`),
  ADD KEY `fk_idventa` (`idventa`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_idcliente` (`idcliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `listacompra`
--
ALTER TABLE `listacompra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `listaventa`
--
ALTER TABLE `listaventa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `fk_idproveedor` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `listacompra`
--
ALTER TABLE `listacompra`
  ADD CONSTRAINT `fk_idcompra` FOREIGN KEY (`idcompra`) REFERENCES `compra` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idproductocompra` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `listaventa`
--
ALTER TABLE `listaventa`
  ADD CONSTRAINT `fk_idproductoventa` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idventa` FOREIGN KEY (`idventa`) REFERENCES `venta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_idcliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
