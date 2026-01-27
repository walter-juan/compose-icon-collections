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

public val Simpleicons.Visualparadigm: ImageVector
    get() {
        if (_visualparadigm != null) {
            return _visualparadigm!!
        }
        _visualparadigm = Builder(name = "Visualparadigm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.92f, 10.08f)
                curveTo(1.92f, 10.117f, 11.916f, 20.132f, 11.973f, 20.15f)
                curveTo(11.987f, 20.154f, 15.804f, 16.353f, 15.804f, 16.353f)
                curveTo(15.804f, 16.353f, 8.138f, 8.667f, 8.138f, 8.642f)
                curveTo(8.138f, 8.609f, 11.944f, 4.803f, 11.944f, 4.803f)
                curveTo(11.944f, 4.803f, 15.787f, 8.661f, 15.787f, 8.686f)
                curveTo(15.787f, 8.703f, 12.98f, 11.53f, 12.98f, 11.53f)
                lineTo(16.804f, 15.354f)
                lineTo(22.079f, 10.079f)
                curveTo(22.079f, 10.079f, 13.674f, 1.674f, 11.981f, 0.0f)
                moveTo(3.787f, 13.036f)
                curveTo(3.764f, 13.036f, 2.366f, 14.424f, 2.366f, 14.424f)
                curveTo(2.366f, 14.424f, 11.96f, 24.0f, 11.987f, 24.0f)
                curveTo(12.013f, 24.0f, 21.601f, 14.423f, 21.601f, 14.423f)
                curveTo(21.601f, 14.423f, 20.2f, 13.036f, 20.178f, 13.036f)
                curveTo(20.158f, 13.036f, 11.982f, 21.193f, 11.982f, 21.193f)
                curveTo(11.982f, 21.193f, 3.805f, 13.036f, 3.787f, 13.036f)
                close()
            }
        }
        .build()
        return _visualparadigm!!
    }

private var _visualparadigm: ImageVector? = null
