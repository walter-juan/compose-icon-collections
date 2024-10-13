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

public val RegularGroup.BxLockOpen: ImageVector
    get() {
        if (_bxLockOpen != null) {
            return _bxLockOpen!!
        }
        _bxLockOpen = Builder(name = "BxLockOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveTo(7.0f, 4.243f, 7.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(18.002f, 20.0f)
                lineTo(13.0f, 20.0f)
                verticalLineToRelative(-2.278f)
                curveToRelative(0.595f, -0.347f, 1.0f, -0.985f, 1.0f, -1.722f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.736f, 0.405f, 1.375f, 1.0f, 1.722f)
                lineTo(11.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(0.002f, 9.0f)
                close()
            }
        }
        .build()
        return _bxLockOpen!!
    }

private var _bxLockOpen: ImageVector? = null
