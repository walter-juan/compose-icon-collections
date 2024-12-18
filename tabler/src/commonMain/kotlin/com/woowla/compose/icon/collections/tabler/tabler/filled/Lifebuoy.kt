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

public val FilledGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.757f, 16.172f)
                lineToRelative(3.571f, 3.571f)
                arcToRelative(10.004f, 10.004f, 0.0f, false, true, -12.656f, 0.0f)
                lineToRelative(3.57f, -3.571f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 2.758f, 0.828f)
                curveToRelative(1.02f, 0.0f, 1.967f, -0.305f, 2.757f, -0.828f)
                moveToRelative(-10.5f, -10.5f)
                lineToRelative(3.571f, 3.57f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.828f, 2.758f)
                curveToRelative(0.0f, 1.02f, 0.305f, 1.967f, 0.828f, 2.757f)
                lineToRelative(-3.57f, 3.572f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.258f, -6.329f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 2.252f, -6.005f)
                moveToRelative(17.743f, 6.329f)
                curveToRelative(0.0f, 2.343f, -0.82f, 4.57f, -2.257f, 6.328f)
                lineToRelative(-3.571f, -3.57f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.828f, -2.758f)
                curveToRelative(0.0f, -1.02f, -0.305f, -1.967f, -0.828f, -2.757f)
                lineToRelative(3.571f, -3.57f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 2.257f, 6.327f)
                moveToRelative(-5.0f, -8.66f)
                quadToRelative(0.707f, 0.41f, 1.33f, 0.918f)
                lineToRelative(-3.573f, 3.57f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.757f, -0.828f)
                curveToRelative(-1.02f, 0.0f, -1.967f, 0.305f, -2.757f, 0.828f)
                lineToRelative(-3.573f, -3.57f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 11.33f, -0.918f)
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
