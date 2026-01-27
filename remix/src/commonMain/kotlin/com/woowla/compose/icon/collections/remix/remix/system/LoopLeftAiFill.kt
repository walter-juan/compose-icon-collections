package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.LoopLeftAiFill: ImageVector
    get() {
        if (_loopLeftAiFill != null) {
            return _loopLeftAiFill!!
        }
        _loopLeftAiFill = Builder(name = "LoopLeftAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(14.59f, 20.0f, 16.894f, 18.77f, 18.357f, 16.857f)
                lineTo(16.0f, 14.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.5f)
                lineTo(19.781f, 18.281f)
                curveTo(17.949f, 20.548f, 15.144f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(11.529f, 8.319f)
                curveTo(11.706f, 7.893f, 12.294f, 7.893f, 12.471f, 8.319f)
                lineTo(12.724f, 8.931f)
                curveTo(13.156f, 9.973f, 13.962f, 10.806f, 14.975f, 11.257f)
                lineTo(15.692f, 11.576f)
                curveTo(16.103f, 11.759f, 16.103f, 12.356f, 15.692f, 12.539f)
                lineTo(14.933f, 12.877f)
                curveTo(13.945f, 13.316f, 13.153f, 14.119f, 12.714f, 15.128f)
                lineTo(12.467f, 15.693f)
                curveTo(12.286f, 16.108f, 11.714f, 16.108f, 11.533f, 15.693f)
                lineTo(11.287f, 15.128f)
                curveTo(10.848f, 14.119f, 10.055f, 13.316f, 9.067f, 12.877f)
                lineTo(8.308f, 12.539f)
                curveTo(7.897f, 12.356f, 7.897f, 11.759f, 8.308f, 11.576f)
                lineTo(9.025f, 11.257f)
                curveTo(10.038f, 10.806f, 10.844f, 9.973f, 11.276f, 8.931f)
                lineTo(11.529f, 8.319f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(9.41f, 4.0f, 7.106f, 5.23f, 5.643f, 7.143f)
                lineTo(8.0f, 9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                lineTo(4.219f, 5.719f)
                curveTo(6.051f, 3.452f, 8.856f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _loopLeftAiFill!!
    }

private var _loopLeftAiFill: ImageVector? = null
