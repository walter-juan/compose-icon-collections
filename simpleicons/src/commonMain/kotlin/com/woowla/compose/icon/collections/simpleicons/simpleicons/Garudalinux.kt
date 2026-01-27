package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Garudalinux: ImageVector
    get() {
        if (_garudalinux != null) {
            return _garudalinux!!
        }
        _garudalinux = Builder(name = "Garudalinux", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.24f, 3.179f)
                curveTo(6.82f, 6.579f, 3.366f, 10.064f, 0.0f, 13.465f)
                curveToRelative(2.4f, 2.406f, 4.889f, 4.898f, 7.319f, 7.332f)
                lineToRelative(7.504f, 0.024f)
                lineToRelative(6.334f, -6.316f)
                lineToRelative(-13.754f, -0.012f)
                lineToRelative(-1.525f, 1.54f)
                lineToRelative(11.512f, 0.024f)
                lineToRelative(-3.198f, 3.197f)
                horizontalLineTo(7.956f)
                lineTo(2.172f, 13.47f)
                lineToRelative(8.74f, -8.74f)
                horizontalLineToRelative(6.284f)
                lineToRelative(4.815f, 4.815f)
                lineToRelative(-7.501f, -0.01f)
                verticalLineToRelative(-2.12f)
                lineToRelative(-3.68f, 3.68f)
                curveToRelative(3.873f, 0.004f, 7.746f, 0.003f, 11.62f, 0.0f)
                verticalLineToRelative(2.102f)
                lineToRelative(1.55f, -1.55f)
                lineToRelative(-0.003f, -2.306f)
                lineToRelative(-6.16f, -6.159f)
                close()
            }
        }
        .build()
        return _garudalinux!!
    }

private var _garudalinux: ImageVector? = null
