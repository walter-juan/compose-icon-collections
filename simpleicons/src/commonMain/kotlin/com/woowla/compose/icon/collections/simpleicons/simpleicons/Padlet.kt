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

public val Simpleicons.Padlet: ImageVector
    get() {
        if (_padlet != null) {
            return _padlet!!
        }
        _padlet = Builder(name = "Padlet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.258f, 2.399f)
                curveToRelative(-0.279f, 0.004f, -0.573f, 0.177f, -0.691f, 0.45f)
                lineToRelative(-4.978f, 11.566f)
                horizontalLineToRelative(0.001f)
                lineToRelative(1.714f, 6.311f)
                curveToRelative(0.138f, 0.606f, 0.742f, 0.986f, 1.349f, 0.848f)
                lineToRelative(2.605f, -0.591f)
                lineToRelative(-0.4f, -5.013f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(-5.267f, -1.553f)
                lineToRelative(5.267f, 0.753f)
                close()
                moveTo(11.259f, 2.399f)
                lineTo(11.656f, 15.168f)
                lineTo(16.927f, 14.414f)
                lineTo(11.949f, 2.848f)
                horizontalLineToRelative(0.001f)
                curveToRelative(-0.118f, -0.272f, -0.411f, -0.446f, -0.69f, -0.45f)
                close()
                moveTo(0.441f, 7.534f)
                curveToRelative(-0.311f, 0.003f, -0.561f, 0.35f, -0.38f, 0.666f)
                lineToRelative(5.724f, 9.986f)
                lineToRelative(-0.968f, -3.562f)
                arcToRelative(0.798f, 0.798f, 0.0f, false, true, 0.037f, -0.526f)
                lineToRelative(1.459f, -3.391f)
                lineTo(0.661f, 7.592f)
                arcToRelative(0.445f, 0.445f, 0.0f, false, false, -0.22f, -0.058f)
                close()
                moveTo(19.614f, 9.214f)
                lineTo(16.195f, 10.69f)
                lineTo(17.662f, 14.098f)
                horizontalLineToRelative(0.001f)
                arcToRelative(0.797f, 0.797f, 0.0f, false, true, 0.037f, 0.525f)
                lineToRelative(-0.924f, 3.401f)
                lineToRelative(5.621f, -8.81f)
                close()
                moveTo(22.397f, 9.214f)
                lineTo(21.728f, 11.678f)
                lineTo(23.523f, 12.531f)
                curveToRelative(0.291f, 0.138f, 0.59f, -0.177f, 0.435f, -0.46f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(16.927f, 14.415f)
                lineTo(11.659f, 15.969f)
                lineTo(11.259f, 20.982f)
                lineTo(13.864f, 21.573f)
                curveToRelative(0.607f, 0.138f, 1.21f, -0.242f, 1.348f, -0.848f)
                close()
            }
        }
        .build()
        return _padlet!!
    }

private var _padlet: ImageVector? = null
