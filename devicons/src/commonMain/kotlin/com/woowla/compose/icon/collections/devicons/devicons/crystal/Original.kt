package com.woowla.compose.icon.collections.devicons.devicons.crystal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CrystalGroup

public val CrystalGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(127.81f, 81.33f)
                lineToRelative(-46.33f, 45.99f)
                curveToRelative(-0.19f, 0.19f, -0.46f, 0.28f, -0.65f, 0.19f)
                lineToRelative(-63.28f, -16.86f)
                curveToRelative(-0.28f, -0.09f, -0.46f, -0.28f, -0.46f, -0.46f)
                lineTo(0.04f, 47.32f)
                curveToRelative(-0.09f, -0.28f, 0.0f, -0.46f, 0.19f, -0.64f)
                lineTo(46.55f, 0.69f)
                curveToRelative(0.18f, -0.19f, 0.46f, -0.28f, 0.65f, -0.19f)
                lineToRelative(63.28f, 16.86f)
                curveToRelative(0.28f, 0.09f, 0.46f, 0.28f, 0.46f, 0.46f)
                lineTo(127.9f, 80.68f)
                curveToRelative(0.19f, 0.28f, 0.09f, 0.46f, -0.09f, 0.64f)
                close()
                moveTo(65.73f, 31.28f)
                lineTo(3.56f, 47.78f)
                curveToRelative(-0.09f, 0.0f, -0.19f, 0.19f, -0.09f, 0.28f)
                lineToRelative(45.49f, 45.16f)
                curveToRelative(0.09f, 0.09f, 0.28f, 0.09f, 0.28f, -0.09f)
                lineToRelative(16.67f, -61.75f)
                curveToRelative(0.09f, 0.0f, -0.09f, -0.19f, -0.18f, -0.09f)
                close()
                moveTo(65.73f, 31.28f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
