package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxIdCard: ImageVector
    get() {
        if (_bxIdCard != null) {
            return _bxIdCard!!
        }
        _bxIdCard = Builder(name = "BxIdCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.715f, 12.0f)
                curveToRelative(1.151f, 0.0f, 2.0f, -0.849f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.849f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.849f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.848f, 2.0f, 2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.841f, -2.0f, 1.875f)
                verticalLineToRelative(12.25f)
                curveTo(2.0f, 19.159f, 2.897f, 20.0f, 4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.841f, 2.0f, -1.875f)
                lineTo(22.0f, 5.875f)
                curveTo(22.0f, 4.841f, 21.103f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 17.989f)
                lineTo(4.0f, 6.0f)
                lineToRelative(16.0f, 0.011f)
                lineTo(20.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.43f, 15.536f)
                curveToRelative(0.0f, -1.374f, -1.676f, -2.786f, -3.715f, -2.786f)
                reflectiveCurveTo(6.0f, 14.162f, 6.0f, 15.536f)
                lineTo(6.0f, 16.0f)
                horizontalLineToRelative(7.43f)
                verticalLineToRelative(-0.464f)
                close()
            }
        }
        .build()
        return _bxIdCard!!
    }

private var _bxIdCard: ImageVector? = null
