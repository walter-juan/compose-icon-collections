package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.CircleLetterM: ImageVector
    get() {
        if (_circleLetterM != null) {
            return _circleLetterM!!
        }
        _circleLetterM = Builder(name = "CircleLetterM", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                moveToRelative(4.0f, 6.0f)
                curveToRelative(0.0f, -1.014f, -1.336f, -1.384f, -1.857f, -0.514f)
                lineToRelative(-2.143f, 3.57f)
                lineToRelative(-2.143f, -3.57f)
                curveToRelative(-0.521f, -0.87f, -1.857f, -0.5f, -1.857f, 0.514f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-4.39f)
                lineToRelative(1.143f, 1.904f)
                lineToRelative(0.074f, 0.108f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.64f, -0.108f)
                lineToRelative(1.143f, -1.904f)
                verticalLineToRelative(4.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _circleLetterM!!
    }

private var _circleLetterM: ImageVector? = null
