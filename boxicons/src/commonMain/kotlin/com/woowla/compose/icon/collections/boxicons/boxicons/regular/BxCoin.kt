package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCoin: ImageVector
    get() {
        if (_bxCoin != null) {
            return _bxCoin!!
        }
        _bxCoin = Builder(name = "BxCoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(7.03f, 6.0f, 2.0f, 7.546f, 2.0f, 10.5f)
                verticalLineToRelative(4.0f)
                curveTo(2.0f, 17.454f, 7.03f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveToRelative(10.0f, -1.546f, 10.0f, -4.5f)
                verticalLineToRelative(-4.0f)
                curveTo(22.0f, 7.546f, 16.97f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(4.0f, 14.5f)
                verticalLineToRelative(-1.197f)
                arcToRelative(9.989f, 9.989f, 0.0f, false, false, 2.0f, 0.86f)
                verticalLineToRelative(1.881f)
                curveToRelative(-1.312f, -0.514f, -2.0f, -1.126f, -2.0f, -1.544f)
                close()
                moveTo(16.0f, 14.648f)
                verticalLineToRelative(1.971f)
                curveToRelative(-0.867f, 0.179f, -1.867f, 0.31f, -3.0f, 0.358f)
                verticalLineToRelative(-2.0f)
                arcToRelative(21.75f, 21.75f, 0.0f, false, false, 3.0f, -0.329f)
                close()
                moveTo(11.0f, 16.978f)
                arcToRelative(18.788f, 18.788f, 0.0f, false, true, -3.0f, -0.358f)
                verticalLineToRelative(-1.971f)
                curveToRelative(0.959f, 0.174f, 1.972f, 0.287f, 3.0f, 0.33f)
                verticalLineToRelative(1.999f)
                close()
                moveTo(18.0f, 16.044f)
                verticalLineToRelative(-1.881f)
                arcToRelative(9.931f, 9.931f, 0.0f, false, false, 2.0f, -0.86f)
                lineTo(20.0f, 14.5f)
                curveToRelative(0.0f, 0.418f, -0.687f, 1.03f, -2.0f, 1.544f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-5.177f, 0.0f, -8.0f, -1.651f, -8.0f, -2.5f)
                reflectiveCurveTo(6.823f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, 1.651f, 8.0f, 2.5f)
                reflectiveCurveToRelative(-2.823f, 2.5f, -8.0f, 2.5f)
                close()
            }
        }
        .build()
        return _bxCoin!!
    }

private var _bxCoin: ImageVector? = null
