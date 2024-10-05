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

public val FilledGroup.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.678f, 0.911f)
                lineToRelative(0.053f, 0.089f)
                horizontalLineToRelative(7.269f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.883f, 0.993f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.269f)
                lineToRelative(-0.089f, -0.053f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.906f, -1.529f)
                lineToRelative(-0.005f, -0.149f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(9.428f, -1.334f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.884f, 0.668f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.207f, 10.218f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.666f, 1.886f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 12.757f, -12.772f)
                moveToRelative(-4.628f, -0.266f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.6f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, 5.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.2f, 1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.4f, -8.4f)
            }
        }
        .build()
        return _radar!!
    }

private var _radar: ImageVector? = null
