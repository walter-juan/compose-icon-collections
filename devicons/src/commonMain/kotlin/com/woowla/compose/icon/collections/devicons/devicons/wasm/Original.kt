package com.woowla.compose.icon.collections.devicons.devicons.wasm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.WasmGroup

public val WasmGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF654ff0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.22f, 0.22f)
                verticalLineToRelative(127.56f)
                horizontalLineToRelative(127.56f)
                lineTo(127.78f, 0.22f)
                lineTo(78.59f, 0.22f)
                curveToRelative(0.01f, 0.23f, 0.04f, 0.46f, 0.04f, 0.69f)
                curveToRelative(0.0f, 8.08f, -6.55f, 14.63f, -14.63f, 14.63f)
                curveToRelative(-8.08f, 0.0f, -14.63f, -6.55f, -14.63f, -14.63f)
                curveToRelative(0.0f, -0.23f, 0.02f, -0.46f, 0.03f, -0.69f)
                close()
                moveTo(29.82f, 68.97f)
                horizontalLineToRelative(8.44f)
                lineToRelative(5.78f, 30.74f)
                horizontalLineToRelative(0.11f)
                lineToRelative(6.97f, -30.74f)
                horizontalLineToRelative(7.91f)
                lineToRelative(6.26f, 31.12f)
                horizontalLineToRelative(0.11f)
                lineToRelative(6.6f, -31.12f)
                horizontalLineToRelative(8.28f)
                lineToRelative(-10.77f, 45.16f)
                lineTo(61.12f, 114.12f)
                lineToRelative(-6.21f, -30.74f)
                lineTo(54.8f, 83.39f)
                lineToRelative(-6.7f, 30.74f)
                horizontalLineToRelative(-8.56f)
                close()
                moveTo(89.81f, 68.97f)
                horizontalLineToRelative(13.33f)
                lineToRelative(13.28f, 45.16f)
                horizontalLineToRelative(-8.77f)
                lineToRelative(-2.88f, -10.05f)
                lineTo(89.59f, 104.07f)
                lineToRelative(-2.21f, 10.05f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(94.89f, 80.1f)
                lineToRelative(-3.68f, 16.57f)
                horizontalLineToRelative(11.47f)
                lineTo(98.45f, 80.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
