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

public val CommunicationGroup.MessageAi3Fill: ImageVector
    get() {
        if (_messageAi3Fill != null) {
            return _messageAi3Fill!!
        }
        _messageAi3Fill = Builder(name = "MessageAi3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.999f, 3.0f)
                curveTo(19.313f, 3.0f, 22.0f, 5.695f, 22.0f, 8.994f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.001f)
                curveTo(4.687f, 21.0f, 2.0f, 18.305f, 2.0f, 15.006f)
                verticalLineTo(10.657f)
                curveTo(2.626f, 10.878f, 3.299f, 11.0f, 4.0f, 11.0f)
                curveTo(7.314f, 11.0f, 10.0f, 8.314f, 10.0f, 5.0f)
                curveTo(10.0f, 4.299f, 9.878f, 3.626f, 9.657f, 3.0f)
                horizontalLineTo(15.999f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(3.529f, 1.319f)
                curveTo(3.706f, 0.893f, 4.294f, 0.893f, 4.471f, 1.319f)
                lineTo(4.724f, 1.931f)
                curveTo(5.156f, 2.973f, 5.962f, 3.806f, 6.975f, 4.257f)
                lineTo(7.692f, 4.576f)
                curveTo(8.103f, 4.759f, 8.103f, 5.356f, 7.692f, 5.539f)
                lineTo(6.933f, 5.877f)
                curveTo(5.945f, 6.316f, 5.153f, 7.119f, 4.714f, 8.128f)
                lineTo(4.467f, 8.693f)
                curveTo(4.286f, 9.107f, 3.714f, 9.107f, 3.533f, 8.693f)
                lineTo(3.286f, 8.128f)
                curveTo(2.847f, 7.119f, 2.055f, 6.316f, 1.067f, 5.877f)
                lineTo(0.308f, 5.539f)
                curveTo(-0.103f, 5.356f, -0.103f, 4.759f, 0.308f, 4.576f)
                lineTo(1.025f, 4.257f)
                curveTo(2.038f, 3.806f, 2.844f, 2.973f, 3.276f, 1.931f)
                lineTo(3.529f, 1.319f)
                close()
            }
        }
        .build()
        return _messageAi3Fill!!
    }

private var _messageAi3Fill: ImageVector? = null
