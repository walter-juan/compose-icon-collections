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

public val FilledGroup.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) {
            return _steeringWheel!!
        }
        _steeringWheel = Builder(name = "SteeringWheel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-13.0f, 8.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.0f, 7.937f)
                verticalLineToRelative(-5.107f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.898f, -2.05f)
                lineToRelative(-5.07f, -1.504f)
                quadToRelative(-0.031f, 0.36f, -0.032f, 0.725f)
                moveToRelative(15.967f, -0.725f)
                lineToRelative(-5.069f, 1.503f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.897f, 2.051f)
                verticalLineToRelative(5.108f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.985f, -8.422f)
                close()
                moveTo(8.0f, 5.072f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.536f, 4.244f)
                lineToRelative(4.812f, 1.426f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.448f, 0.0f)
                lineToRelative(4.812f, -1.426f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.536f, -4.244f)
            }
        }
        .build()
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
