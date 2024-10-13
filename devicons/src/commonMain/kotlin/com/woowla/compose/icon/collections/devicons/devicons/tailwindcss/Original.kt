package com.woowla.compose.icon.collections.devicons.devicons.tailwindcss

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TailwindcssGroup

public val TailwindcssGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF38bdf8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 25.6f)
                curveToRelative(-17.07f, 0.0f, -27.73f, 8.53f, -32.0f, 25.6f)
                curveToRelative(6.4f, -8.53f, 13.87f, -11.73f, 22.4f, -9.6f)
                curveToRelative(4.87f, 1.21f, 8.35f, 4.75f, 12.21f, 8.66f)
                curveTo(72.88f, 56.63f, 80.14f, 64.0f, 96.0f, 64.0f)
                curveToRelative(17.07f, 0.0f, 27.73f, -8.53f, 32.0f, -25.6f)
                curveToRelative(-6.4f, 8.54f, -13.87f, 11.73f, -22.4f, 9.6f)
                curveToRelative(-4.87f, -1.22f, -8.35f, -4.75f, -12.21f, -8.66f)
                curveToRelative(-6.27f, -6.37f, -13.53f, -13.74f, -29.39f, -13.74f)
                close()
                moveTo(32.0f, 64.0f)
                curveToRelative(-17.07f, 0.0f, -27.73f, 8.53f, -32.0f, 25.6f)
                curveTo(6.4f, 81.07f, 13.87f, 77.87f, 22.4f, 80.0f)
                curveToRelative(4.87f, 1.22f, 8.35f, 4.75f, 12.21f, 8.66f)
                curveToRelative(6.27f, 6.37f, 13.54f, 13.74f, 29.4f, 13.74f)
                curveToRelative(17.07f, 0.0f, 27.73f, -8.53f, 32.0f, -25.6f)
                curveToRelative(-6.4f, 8.53f, -13.87f, 11.73f, -22.4f, 9.6f)
                curveToRelative(-4.87f, -1.21f, -8.35f, -4.75f, -12.21f, -8.66f)
                curveTo(55.13f, 71.37f, 47.87f, 64.0f, 32.0f, 64.0f)
                close()
                moveTo(32.0f, 64.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
