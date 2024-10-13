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

public val RegularGroup.BxAngry: ImageVector
    get() {
        if (_bxAngry != null) {
            return _bxAngry!!
        }
        _bxAngry = Builder(name = "BxAngry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveToRelative(-3.0f, 0.0f, -4.0f, 3.0f, -4.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                reflectiveCurveToRelative(-1.0f, -3.0f, -4.0f, -3.0f)
                close()
                moveTo(9.561f, 11.561f)
                curveToRelative(0.014f, -0.014f, 0.023f, -0.03f, 0.037f, -0.044f)
                lineToRelative(1.031f, 0.413f)
                lineToRelative(0.742f, -1.857f)
                lineToRelative(-5.0f, -2.0f)
                lineToRelative(-0.742f, 1.856f)
                lineToRelative(1.373f, 0.549f)
                lineTo(7.0f, 10.5f)
                arcToRelative(1.499f, 1.499f, 0.0f, false, false, 2.561f, 1.061f)
                close()
                moveTo(12.629f, 10.071f)
                lineTo(13.371f, 11.928f)
                lineTo(14.408f, 11.513f)
                curveToRelative(0.011f, 0.011f, 0.019f, 0.024f, 0.029f, 0.035f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, false, 2.112f, 0.0f)
                curveToRelative(0.271f, -0.271f, 0.438f, -0.644f, 0.438f, -1.056f)
                lineToRelative(-0.001f, -0.01f)
                lineToRelative(1.386f, -0.554f)
                lineToRelative(-0.742f, -1.857f)
                lineToRelative(-5.001f, 2.0f)
                close()
            }
        }
        .build()
        return _bxAngry!!
    }

private var _bxAngry: ImageVector? = null
