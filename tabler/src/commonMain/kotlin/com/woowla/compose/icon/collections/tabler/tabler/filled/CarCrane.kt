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

public val FilledGroup.CarCrane: ImageVector
    get() {
        if (_carCrane != null) {
            return _carCrane!!
        }
        _carCrane = Builder(name = "CarCrane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.06f, 5.66f)
                lineToRelative(0.035f, -0.085f)
                lineToRelative(0.07f, -0.125f)
                lineToRelative(0.033f, -0.048f)
                lineToRelative(0.063f, -0.075f)
                lineToRelative(0.064f, -0.065f)
                lineToRelative(0.098f, -0.079f)
                lineToRelative(0.106f, -0.065f)
                lineToRelative(0.067f, -0.033f)
                lineToRelative(0.048f, -0.02f)
                lineToRelative(0.139f, -0.041f)
                lineToRelative(18.053f, -3.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.164f, 0.986f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.82f)
                lineToRelative(-13.802f, 2.3f)
                lineToRelative(1.25f, 0.626f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.552f, 0.894f)
                lineToRelative(-0.001f, 3.0f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.17f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.66f, 0.0f)
                horizontalLineToRelative(-6.34f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.83f, -1.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                verticalLineToRelative(-4.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.06f, -0.35f)
                moveToRelative(1.94f, 10.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(12.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.992f, 1.124f)
                lineToRelative(0.008f, -0.132f)
                lineToRelative(-0.007f, -0.109f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                moveToRelative(-0.652f, -7.985f)
                lineToRelative(0.895f, 2.985f)
                horizontalLineToRelative(2.63f)
                lineToRelative(-0.042f, -0.155f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.223f, -2.8f)
                close()
            }
        }
        .build()
        return _carCrane!!
    }

private var _carCrane: ImageVector? = null
