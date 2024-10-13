package com.woowla.compose.icon.collections.devicons.devicons.erlang

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ErlangGroup

public val ErlangGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFA90533)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 103.9f)
                curveTo(11.0f, 93.5f, 5.2f, 79.2f, 5.3f, 62.1f)
                curveTo(5.2f, 47.0f, 10.0f, 34.0f, 18.2f, 24.1f)
                lineTo(1.0f, 24.1f)
                verticalLineToRelative(79.7f)
                lineToRelative(19.7f, 0.1f)
                close()
                moveTo(111.1f, 103.9f)
                curveToRelative(4.2f, -4.5f, 8.0f, -9.8f, 11.4f, -15.9f)
                lineToRelative(-19.0f, -9.5f)
                curveToRelative(-6.7f, 10.8f, -16.4f, 20.8f, -29.9f, 20.9f)
                curveToRelative(-19.6f, -0.1f, -27.3f, -16.9f, -27.3f, -38.5f)
                horizontalLineToRelative(73.3f)
                curveToRelative(0.1f, -2.4f, 0.1f, -3.6f, 0.0f, -4.7f)
                curveToRelative(0.5f, -12.9f, -2.9f, -23.7f, -9.1f, -32.1f)
                lineTo(127.0f, 24.1f)
                verticalLineToRelative(79.7f)
                lineToRelative(-15.9f, 0.1f)
                close()
                moveTo(47.5f, 42.4f)
                curveToRelative(0.8f, -9.8f, 8.5f, -16.3f, 17.6f, -16.4f)
                curveToRelative(9.1f, 0.0f, 15.7f, 6.6f, 15.9f, 16.4f)
                lineTo(47.5f, 42.4f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
