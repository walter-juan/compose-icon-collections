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

public val FilledGroup.ChartDots2: ImageVector
    get() {
        if (_chartDots2 != null) {
            return _chartDots2!!
        }
        _chartDots2 = Builder(name = "ChartDots2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(18.97f, 0.757f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.727f, 1.213f)
                lineToRelative(-5.256f, 1.314f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.55f, 1.465f)
                lineToRelative(1.768f, 2.358f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, 3.795f, 2.893f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.436f, 1.751f)
                lineToRelative(-3.57f, 1.428f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.994f, -0.179f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.43f, -1.576f)
                lineToRelative(3.57f, -1.428f)
                lineToRelative(0.015f, -0.17f)
                curveToRelative(0.06f, -0.518f, 0.253f, -0.996f, 0.542f, -1.4f)
                lineToRelative(-1.767f, -2.357f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, -3.795f, -2.893f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.497f, -1.48f)
                lineToRelative(5.255f, -1.314f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.213f, 0.727f)
            }
        }
        .build()
        return _chartDots2!!
    }

private var _chartDots2: ImageVector? = null
