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

public val SystemGroup.LoopLeftAiLine: ImageVector
    get() {
        if (_loopLeftAiLine != null) {
            return _loopLeftAiLine!!
        }
        _loopLeftAiLine = Builder(name = "LoopLeftAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(14.748f, 20.0f, 17.175f, 18.614f, 18.615f, 16.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.001f)
                curveTo(18.176f, 20.429f, 15.272f, 22.0f, 12.0f, 22.0f)
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
                curveTo(9.252f, 4.0f, 6.825f, 5.386f, 5.385f, 7.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.999f)
                curveTo(5.824f, 3.571f, 8.728f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _loopLeftAiLine!!
    }

private var _loopLeftAiLine: ImageVector? = null
