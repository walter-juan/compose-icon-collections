package com.woowla.compose.icon.collections.devicons.devicons.framework7

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Framework7Group

public val Framework7Group.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFee350f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.45f, 64.0f)
                curveToRelative(0.0f, -15.38f, 5.39f, -29.5f, 14.37f, -40.53f)
                horizontalLineToRelative(98.36f)
                lineTo(43.02f, 124.43f)
                curveTo(18.23f, 115.7f, 0.45f, 91.94f, 0.45f, 64.0f)
                close()
                moveTo(118.4f, 30.89f)
                curveToRelative(5.81f, 9.66f, 9.15f, 20.99f, 9.15f, 33.11f)
                curveToRelative(0.0f, 35.35f, -28.45f, 64.0f, -63.55f, 64.0f)
                curveToRelative(-4.2f, 0.0f, -8.31f, -0.41f, -12.29f, -1.2f)
                close()
                moveTo(23.2f, 14.94f)
                curveTo(34.24f, 5.61f, 48.47f, 0.0f, 64.0f, 0.0f)
                curveToRelative(15.53f, 0.0f, 29.76f, 5.61f, 40.8f, 14.93f)
                close()
                moveTo(23.2f, 14.94f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
