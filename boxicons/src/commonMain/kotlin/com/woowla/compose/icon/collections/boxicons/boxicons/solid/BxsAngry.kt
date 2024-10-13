package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsAngry: ImageVector
    get() {
        if (_bxsAngry != null) {
            return _bxsAngry!!
        }
        _bxsAngry = Builder(name = "BxsAngry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.0f, 10.5f)
                lineTo(7.002f, 10.478f)
                lineTo(5.629f, 9.929f)
                lineTo(6.371f, 8.072f)
                lineTo(11.371f, 10.072f)
                lineTo(10.629f, 11.929f)
                lineTo(9.598f, 11.516f)
                curveToRelative(-0.014f, 0.014f, -0.023f, 0.031f, -0.037f, 0.044f)
                arcTo(1.499f, 1.499f, 0.0f, false, true, 7.0f, 10.5f)
                close()
                moveTo(8.0f, 17.0f)
                reflectiveCurveToRelative(1.0f, -3.0f, 4.0f, -3.0f)
                reflectiveCurveToRelative(4.0f, 3.0f, 4.0f, 3.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(16.986f, 10.493f)
                curveToRelative(0.0f, 0.412f, -0.167f, 0.785f, -0.438f, 1.056f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, true, -2.112f, 0.0f)
                curveToRelative(-0.011f, -0.011f, -0.019f, -0.024f, -0.029f, -0.035f)
                lineToRelative(-1.037f, 0.415f)
                lineToRelative(-0.742f, -1.857f)
                lineToRelative(5.0f, -2.0f)
                lineToRelative(0.742f, 1.857f)
                lineToRelative(-1.386f, 0.554f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, 0.002f, 0.01f)
                close()
            }
        }
        .build()
        return _bxsAngry!!
    }

private var _bxsAngry: ImageVector? = null
