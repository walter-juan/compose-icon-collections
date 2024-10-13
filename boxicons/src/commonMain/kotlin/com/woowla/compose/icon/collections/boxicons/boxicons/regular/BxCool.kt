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

public val RegularGroup.BxCool: ImageVector
    get() {
        if (_bxCool != null) {
            return _bxCool!!
        }
        _bxCool = Builder(name = "BxCool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.683f, 14.828f)
                arcToRelative(4.055f, 4.055f, 0.0f, false, true, -1.272f, 0.858f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, -4.875f, -1.45f)
                lineToRelative(-1.658f, 1.119f)
                arcToRelative(6.063f, 6.063f, 0.0f, false, false, 1.621f, 1.62f)
                arcToRelative(5.963f, 5.963f, 0.0f, false, false, 2.148f, 0.903f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, false, 3.542f, -0.35f)
                arcToRelative(6.048f, 6.048f, 0.0f, false, false, 1.907f, -1.284f)
                curveToRelative(0.272f, -0.271f, 0.52f, -0.571f, 0.734f, -0.889f)
                lineToRelative(-1.658f, -1.119f)
                arcToRelative(4.147f, 4.147f, 0.0f, false, true, -0.489f, 0.592f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.953f, 0.0f, 5.531f, 1.613f, 6.918f, 4.0f)
                lineTo(5.082f, 8.0f)
                curveTo(6.469f, 5.613f, 9.047f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.691f, 0.098f, -1.359f, 0.264f, -2.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.736f)
                curveToRelative(0.166f, 0.641f, 0.264f, 1.309f, 0.264f, 2.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxCool!!
    }

private var _bxCool: ImageVector? = null
