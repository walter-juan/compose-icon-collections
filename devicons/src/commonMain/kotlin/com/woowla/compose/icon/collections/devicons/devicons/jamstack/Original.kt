package com.woowla.compose.icon.collections.devicons.devicons.jamstack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JamstackGroup

public val JamstackGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf0047f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.93f, 9.18f)
                curveToRelative(-30.46f, 0.0f, -55.08f, 24.61f, -55.08f, 55.05f)
                curveToRelative(0.0f, 30.44f, 24.62f, 55.05f, 55.08f, 55.05f)
                curveToRelative(30.46f, 0.0f, 55.08f, -24.61f, 55.08f, -55.05f)
                lineTo(117.01f, 9.18f)
                close()
                moveTo(63.09f, 23.83f)
                horizontalLineToRelative(38.63f)
                verticalLineToRelative(38.62f)
                lineTo(63.09f, 62.44f)
                close()
                moveTo(20.99f, 65.93f)
                horizontalLineToRelative(38.62f)
                verticalLineToRelative(38.6f)
                curveToRelative(-20.91f, -0.89f, -37.73f, -17.71f, -38.62f, -38.6f)
                close()
                moveTo(63.09f, 66.01f)
                horizontalLineToRelative(38.62f)
                curveToRelative(-0.88f, 20.89f, -17.72f, 37.71f, -38.62f, 38.6f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
