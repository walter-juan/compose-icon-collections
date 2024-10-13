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

public val RegularGroup.BxLaugh: ImageVector
    get() {
        if (_bxLaugh != null) {
            return _bxLaugh!!
        }
        _bxLaugh = Builder(name = "BxLaugh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 18.0f)
                curveToRelative(4.0f, 0.0f, 5.0f, -4.0f, 5.0f, -4.0f)
                lineTo(7.0f, 14.0f)
                reflectiveCurveToRelative(1.0f, 4.0f, 5.0f, 4.0f)
                close()
                moveTo(17.555f, 8.832f)
                lineTo(16.446f, 7.168f)
                lineTo(13.446f, 9.168f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.108f, 1.727f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(0.895f, -1.789f)
                lineToRelative(-2.459f, -1.229f)
                lineToRelative(1.565f, -1.045f)
                close()
                moveTo(10.998f, 10.062f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.443f, -0.894f)
                lineToRelative(-3.0f, -2.0f)
                lineToRelative(-1.11f, 1.664f)
                lineToRelative(1.566f, 1.044f)
                lineToRelative(-2.459f, 1.229f)
                lineToRelative(0.895f, 1.789f)
                lineToRelative(4.0f, -2.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.551f, -0.832f)
                close()
            }
        }
        .build()
        return _bxLaugh!!
    }

private var _bxLaugh: ImageVector? = null
