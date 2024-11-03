package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TruckFrontFill: ImageVector
    get() {
        if (_truckFrontFill != null) {
            return _truckFrontFill!!
        }
        _truckFrontFill = Builder(name = "TruckFrontFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 1.0f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.818f, 0.393f, 1.544f, 1.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(5.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.607f, -0.456f, 1.0f, -1.182f, 1.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 0.0f)
                close()
                moveTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.9f)
                curveToRelative(0.0f, 0.625f, -0.562f, 1.092f, -1.17f, 0.994f)
                curveTo(10.925f, 7.747f, 9.208f, 7.5f, 8.0f, 7.5f)
                reflectiveCurveToRelative(-2.925f, 0.247f, -3.83f, 0.394f)
                arcTo(1.008f, 1.008f, 0.0f, false, true, 3.0f, 6.9f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(-5.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(7.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
            }
        }
        .build()
        return _truckFrontFill!!
    }

private var _truckFrontFill: ImageVector? = null
