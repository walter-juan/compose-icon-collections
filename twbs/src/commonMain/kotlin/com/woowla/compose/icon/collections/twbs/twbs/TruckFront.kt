package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(-6.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                close()
                moveTo(4.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.9f)
                curveToRelative(0.0f, 0.625f, 0.562f, 1.092f, 1.17f, 0.994f)
                curveTo(5.075f, 7.747f, 6.792f, 7.5f, 8.0f, 7.5f)
                reflectiveCurveToRelative(2.925f, 0.247f, 3.83f, 0.394f)
                arcTo(1.008f, 1.008f, 0.0f, false, false, 13.0f, 6.9f)
                lineTo(13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.9f)
                quadToRelative(0.0f, 0.002f, 0.0f, 0.0f)
                lineToRelative(-0.002f, 0.004f)
                lineToRelative(-0.005f, 0.002f)
                horizontalLineToRelative(-0.004f)
                curveTo(11.088f, 6.761f, 9.299f, 6.5f, 8.0f, 6.5f)
                reflectiveCurveToRelative(-3.088f, 0.26f, -3.99f, 0.406f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-0.005f, -0.002f)
                lineTo(4.0f, 6.9f)
                quadToRelative(0.0f, 0.002f, 0.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.0f, -2.0f)
                close()
                moveTo(3.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 2.5f)
                verticalLineToRelative(9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 13.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 1.0f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
