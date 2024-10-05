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

public val FilledGroup.EggCracked: ImageVector
    get() {
        if (_eggCracked != null) {
            return _eggCracked!!
        }
        _eggCracked = Builder(name = "EggCracked", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.236f, 2.066f)
                lineToRelative(-1.694f, 5.647f)
                lineToRelative(-0.029f, 0.123f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.406f, 0.978f)
                lineToRelative(2.764f, 1.974f)
                lineToRelative(-1.551f, 2.716f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.736f, 0.992f)
                lineToRelative(2.0f, -3.5f)
                lineToRelative(0.052f, -0.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.339f, -1.205f)
                lineToRelative(-2.918f, -2.085f)
                lineToRelative(1.623f, -5.41f)
                curveToRelative(3.641f, 1.074f, 6.714f, 6.497f, 6.714f, 11.892f)
                curveToRelative(0.0f, 4.59f, -3.273f, 7.71f, -8.0f, 7.917f)
                curveToRelative(-4.75f, 0.0f, -8.0f, -3.21f, -8.0f, -7.917f)
                curveToRelative(0.0f, -5.654f, 3.372f, -11.344f, 7.236f, -12.017f)
            }
        }
        .build()
        return _eggCracked!!
    }

private var _eggCracked: ImageVector? = null
