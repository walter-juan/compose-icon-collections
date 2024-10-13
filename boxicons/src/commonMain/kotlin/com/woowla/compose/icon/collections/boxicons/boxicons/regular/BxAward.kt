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

public val RegularGroup.BxAward: ImageVector
    get() {
        if (_bxAward != null) {
            return _bxAward!!
        }
        _bxAward = Builder(name = "BxAward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.999f)
                curveToRelative(0.0f, 1.902f, 0.765f, 3.627f, 2.0f, 4.89f)
                lineTo(7.0f, 21.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.447f, 0.895f)
                lineTo(12.0f, 20.118f)
                lineToRelative(3.553f, 1.776f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.972f, -0.043f)
                curveToRelative(0.295f, -0.183f, 0.475f, -0.504f, 0.475f, -0.851f)
                verticalLineToRelative(-7.11f)
                arcToRelative(6.976f, 6.976f, 0.0f, false, false, 2.0f, -4.891f)
                curveTo(19.0f, 5.14f, 15.86f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(5.0f, 5.14f, 5.0f, 8.999f)
                close()
                moveTo(12.447f, 18.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.895f, 0.0f)
                lineTo(9.0f, 19.382f)
                verticalLineToRelative(-4.067f)
                curveToRelative(0.911f, 0.434f, 1.926f, 0.685f, 3.0f, 0.685f)
                reflectiveCurveToRelative(2.089f, -0.25f, 3.0f, -0.685f)
                verticalLineToRelative(4.066f)
                lineToRelative(-2.553f, -1.276f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.756f, 0.0f, 5.0f, 2.242f, 5.0f, 4.999f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 12.0f, 14.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.001f)
                arcTo(5.005f, 5.005f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxAward!!
    }

private var _bxAward: ImageVector? = null
