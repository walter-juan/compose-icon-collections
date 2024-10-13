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

public val RegularGroup.BxTachometer: ImageVector
    get() {
        if (_bxTachometer != null) {
            return _bxTachometer!!
        }
        _bxTachometer = Builder(name = "BxTachometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(6.486f, 4.0f, 2.0f, 8.486f, 2.0f, 14.0f)
                arcToRelative(9.89f, 9.89f, 0.0f, false, false, 1.051f, 4.445f)
                curveToRelative(0.17f, 0.34f, 0.516f, 0.555f, 0.895f, 0.555f)
                horizontalLineToRelative(16.107f)
                curveToRelative(0.379f, 0.0f, 0.726f, -0.215f, 0.896f, -0.555f)
                arcTo(9.89f, 9.89f, 0.0f, false, false, 22.0f, 14.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(19.41f, 17.0f)
                lineTo(4.59f, 17.0f)
                arcTo(7.875f, 7.875f, 0.0f, false, true, 4.0f, 14.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                arcToRelative(7.875f, 7.875f, 0.0f, false, true, -0.59f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.939f, 12.939f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, 0.0f, 2.561f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, 2.121f, -0.44f)
                lineToRelative(3.962f, -6.038f)
                arcToRelative(0.034f, 0.034f, 0.0f, false, false, 0.0f, -0.035f)
                arcToRelative(0.033f, 0.033f, 0.0f, false, false, -0.045f, -0.01f)
                lineToRelative(-6.038f, 3.962f)
                close()
            }
        }
        .build()
        return _bxTachometer!!
    }

private var _bxTachometer: ImageVector? = null
