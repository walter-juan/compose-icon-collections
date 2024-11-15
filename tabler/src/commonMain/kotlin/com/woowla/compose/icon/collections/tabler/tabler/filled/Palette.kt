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

public val FilledGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.498f, 0.0f, 10.0f, 4.002f, 10.0f, 9.0f)
                curveToRelative(0.0f, 1.351f, -0.6f, 2.64f, -1.654f, 3.576f)
                curveToRelative(-1.03f, 0.914f, -2.412f, 1.424f, -3.846f, 1.424f)
                horizontalLineToRelative(-2.516f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, 1.875f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.194f, 0.14f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -1.597f, 3.99f)
                lineToRelative(-0.156f, -0.009f)
                lineToRelative(0.068f, 0.004f)
                lineToRelative(-0.273f, -0.004f)
                curveToRelative(-5.3f, -0.146f, -9.57f, -4.416f, -9.716f, -9.716f)
                lineToRelative(-0.004f, -0.28f)
                curveToRelative(0.0f, -5.523f, 4.477f, -10.0f, 10.0f, -10.0f)
                moveToRelative(-3.5f, 6.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                moveToRelative(-4.0f, -3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
