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

public val FilledGroup.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) {
            return _lemon2!!
        }
        _lemon2 = Builder(name = "Lemon2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.443f, 4.742f)
                lineToRelative(-0.06f, 0.076f)
                lineToRelative(0.037f, 0.087f)
                curveToRelative(1.269f, 3.187f, 0.428f, 7.084f, -2.203f, 9.872f)
                lineToRelative(-0.217f, 0.223f)
                curveToRelative(-2.8f, 2.8f, -6.823f, 3.723f, -10.095f, 2.42f)
                lineToRelative(-0.087f, -0.036f)
                lineToRelative(-0.133f, 0.098f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.11f, 0.488f)
                lineToRelative(-0.205f, -0.036f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.852f, -4.62f)
                lineToRelative(0.098f, -0.134f)
                lineToRelative(-0.036f, -0.085f)
                curveToRelative(-1.269f, -3.187f, -0.428f, -7.084f, 2.203f, -9.872f)
                lineToRelative(0.217f, -0.223f)
                curveToRelative(2.8f, -2.8f, 6.823f, -3.723f, 10.095f, -2.42f)
                lineToRelative(0.085f, 0.037f)
                lineToRelative(0.124f, -0.091f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.493f, -0.52f)
                close()
            }
        }
        .build()
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
