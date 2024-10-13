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

public val RegularGroup.BxPowerOff: ImageVector
    get() {
        if (_bxPowerOff != null) {
            return _bxPowerOff!!
        }
        _bxPowerOff = Builder(name = "BxPowerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -3.35f, -2.072f, -6.221f, -5.0f, -7.411f)
                verticalLineToRelative(2.223f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 13.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                arcToRelative(5.999f, 5.999f, 0.0f, false, true, 3.0f, -5.188f)
                verticalLineTo(5.589f)
                curveTo(6.072f, 6.779f, 4.0f, 9.65f, 4.0f, 13.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxPowerOff!!
    }

private var _bxPowerOff: ImageVector? = null
