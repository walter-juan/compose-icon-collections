package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.ChatAi2Fill: ImageVector
    get() {
        if (_chatAi2Fill != null) {
            return _chatAi2Fill!!
        }
        _chatAi2Fill = Builder(name = "ChatAi2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.343f, 3.0f)
                curveTo(14.122f, 3.626f, 14.0f, 4.299f, 14.0f, 5.0f)
                curveTo(14.0f, 8.314f, 16.686f, 11.0f, 20.0f, 11.0f)
                curveTo(20.701f, 11.0f, 21.374f, 10.878f, 22.0f, 10.657f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(14.45f)
                lineTo(12.0f, 22.5f)
                lineTo(9.55f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 19.0f, 2.0f, 18.552f, 2.0f, 18.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(14.343f)
                close()
                moveTo(19.529f, 1.319f)
                curveTo(19.706f, 0.894f, 20.294f, 0.893f, 20.471f, 1.319f)
                lineTo(20.724f, 1.931f)
                curveTo(21.156f, 2.973f, 21.962f, 3.806f, 22.975f, 4.257f)
                lineTo(23.691f, 4.576f)
                curveTo(24.102f, 4.759f, 24.102f, 5.356f, 23.691f, 5.539f)
                lineTo(22.933f, 5.877f)
                curveTo(21.945f, 6.316f, 21.153f, 7.119f, 20.714f, 8.128f)
                lineTo(20.467f, 8.693f)
                curveTo(20.286f, 9.107f, 19.714f, 9.107f, 19.533f, 8.693f)
                lineTo(19.286f, 8.128f)
                curveTo(18.847f, 7.119f, 18.055f, 6.316f, 17.067f, 5.877f)
                lineTo(16.308f, 5.539f)
                curveTo(15.897f, 5.356f, 15.897f, 4.759f, 16.308f, 4.576f)
                lineTo(17.025f, 4.257f)
                curveTo(18.038f, 3.806f, 18.844f, 2.973f, 19.276f, 1.931f)
                lineTo(19.529f, 1.319f)
                close()
            }
        }
        .build()
        return _chatAi2Fill!!
    }

private var _chatAi2Fill: ImageVector? = null
