package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 6.75f)
                curveTo(12.0f, 3.851f, 14.351f, 1.5f, 17.25f, 1.5f)
                curveTo(17.779f, 1.5f, 18.291f, 1.579f, 18.775f, 1.725f)
                curveTo(19.027f, 1.802f, 19.221f, 2.005f, 19.285f, 2.26f)
                curveTo(19.349f, 2.516f, 19.274f, 2.787f, 19.087f, 2.973f)
                lineTo(15.769f, 6.292f)
                curveTo(15.83f, 6.767f, 16.044f, 7.226f, 16.409f, 7.591f)
                curveTo(16.774f, 7.956f, 17.233f, 8.169f, 17.708f, 8.231f)
                lineTo(21.027f, 4.912f)
                curveTo(21.213f, 4.726f, 21.484f, 4.651f, 21.74f, 4.715f)
                curveTo(21.995f, 4.779f, 22.198f, 4.973f, 22.275f, 5.225f)
                curveTo(22.421f, 5.709f, 22.5f, 6.221f, 22.5f, 6.75f)
                curveTo(22.5f, 9.649f, 20.149f, 12.0f, 17.25f, 12.0f)
                curveTo(17.1f, 12.0f, 16.95f, 11.994f, 16.803f, 11.981f)
                curveTo(15.785f, 11.895f, 14.934f, 12.082f, 14.494f, 12.615f)
                lineTo(7.343f, 21.299f)
                curveTo(6.717f, 22.059f, 5.783f, 22.5f, 4.798f, 22.5f)
                curveTo(2.976f, 22.5f, 1.5f, 21.024f, 1.5f, 19.202f)
                curveTo(1.5f, 18.217f, 1.941f, 17.283f, 2.701f, 16.657f)
                lineTo(11.385f, 9.506f)
                curveTo(11.918f, 9.066f, 12.105f, 8.215f, 12.019f, 7.197f)
                curveTo(12.006f, 7.05f, 12.0f, 6.9f, 12.0f, 6.75f)
                close()
                moveTo(4.117f, 19.125f)
                curveTo(4.117f, 18.711f, 4.453f, 18.375f, 4.867f, 18.375f)
                horizontalLineTo(4.875f)
                curveTo(5.289f, 18.375f, 5.625f, 18.711f, 5.625f, 19.125f)
                verticalLineTo(19.132f)
                curveTo(5.625f, 19.547f, 5.289f, 19.882f, 4.875f, 19.882f)
                horizontalLineTo(4.867f)
                curveTo(4.453f, 19.882f, 4.117f, 19.547f, 4.117f, 19.132f)
                verticalLineTo(19.125f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
