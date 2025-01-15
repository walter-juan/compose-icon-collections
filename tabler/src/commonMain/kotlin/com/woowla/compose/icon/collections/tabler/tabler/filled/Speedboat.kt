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

public val FilledGroup.Speedboat: ImageVector
    get() {
        if (_speedboat != null) {
            return _speedboat!!
        }
        _speedboat = Builder(name = "Speedboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.832f, 0.445f)
                lineToRelative(1.702f, 2.555f)
                horizontalLineToRelative(5.466f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.833f, 1.554f)
                lineToRelative(-3.1f, 4.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.333f, 1.786f)
                horizontalLineToRelative(-14.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.936f, -1.351f)
                lineToRelative(1.5f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.936f, -0.649f)
                horizontalLineToRelative(1.756f)
                lineToRelative(0.9f, -3.0f)
                horizontalLineToRelative(-0.156f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.343f, 12.0f)
                horizontalLineToRelative(1.887f)
                curveToRelative(0.383f, 0.0f, 0.762f, -0.074f, 1.12f, -0.219f)
                lineToRelative(3.557f, -1.418f)
                quadToRelative(0.186f, -0.075f, 0.377f, -0.135f)
                lineToRelative(-0.82f, -1.228f)
                horizontalLineToRelative(-5.22f)
                close()
            }
        }
        .build()
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
