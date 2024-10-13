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

public val RegularGroup.BxCoinStack: ImageVector
    get() {
        if (_bxCoinStack != null) {
            return _bxCoinStack!!
        }
        _bxCoinStack = Builder(name = "BxCoinStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(3.976f, 0.0f, 8.0f, -1.374f, 8.0f, -4.0f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.0f, -2.626f, -4.024f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveTo(4.0f, 3.374f, 4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.626f, 4.024f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.722f, 0.0f, -6.0f, -1.295f, -6.0f, -2.0f)
                verticalLineToRelative(-1.268f)
                curveTo(7.541f, 17.57f, 9.777f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(4.459f, -0.43f, 6.0f, -1.268f)
                lineTo(18.0f, 18.0f)
                curveToRelative(0.0f, 0.705f, -2.278f, 2.0f, -6.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.722f, 0.0f, 6.0f, 1.295f, 6.0f, 2.0f)
                reflectiveCurveToRelative(-2.278f, 2.0f, -6.0f, 2.0f)
                reflectiveCurveToRelative(-6.0f, -1.295f, -6.0f, -2.0f)
                reflectiveCurveToRelative(2.278f, -2.0f, 6.0f, -2.0f)
                close()
                moveTo(6.0f, 8.732f)
                curveTo(7.541f, 9.57f, 9.777f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveToRelative(4.459f, -0.43f, 6.0f, -1.268f)
                lineTo(18.0f, 10.0f)
                curveToRelative(0.0f, 0.705f, -2.278f, 2.0f, -6.0f, 2.0f)
                reflectiveCurveToRelative(-6.0f, -1.295f, -6.0f, -2.0f)
                lineTo(6.0f, 8.732f)
                close()
                moveTo(6.0f, 12.732f)
                curveTo(7.541f, 13.57f, 9.777f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveToRelative(4.459f, -0.43f, 6.0f, -1.268f)
                lineTo(18.0f, 14.0f)
                curveToRelative(0.0f, 0.705f, -2.278f, 2.0f, -6.0f, 2.0f)
                reflectiveCurveToRelative(-6.0f, -1.295f, -6.0f, -2.0f)
                verticalLineToRelative(-1.268f)
                close()
            }
        }
        .build()
        return _bxCoinStack!!
    }

private var _bxCoinStack: ImageVector? = null
