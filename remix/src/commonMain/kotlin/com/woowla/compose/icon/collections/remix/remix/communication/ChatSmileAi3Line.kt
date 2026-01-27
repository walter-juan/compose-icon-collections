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

public val CommunicationGroup.ChatSmileAi3Line: ImageVector
    get() {
        if (_chatSmileAi3Line != null) {
            return _chatSmileAi3Line!!
        }
        _chatSmileAi3Line = Builder(name = "ChatSmileAi3Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.863f, 2.0f, 13.701f, 2.11f, 14.5f, 2.315f)
                lineTo(14.0f, 4.252f)
                curveTo(13.361f, 4.087f, 12.691f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 14.152f, 4.851f, 16.165f, 6.343f, 17.657f)
                lineTo(7.758f, 19.071f)
                lineTo(6.828f, 20.0f)
                horizontalLineTo(12.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 11.677f, 19.981f, 11.358f, 19.943f, 11.045f)
                lineTo(21.93f, 10.809f)
                curveTo(21.976f, 11.2f, 22.0f, 11.597f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(2.0f)
                lineTo(4.929f, 19.071f)
                curveTo(3.119f, 17.262f, 2.0f, 14.761f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(16.0f, 15.209f, 14.209f, 17.0f, 12.0f, 17.0f)
                curveTo(9.791f, 17.0f, 8.0f, 15.209f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(19.529f, 1.319f)
                curveTo(19.706f, 0.893f, 20.294f, 0.893f, 20.471f, 1.319f)
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
        return _chatSmileAi3Line!!
    }

private var _chatSmileAi3Line: ImageVector? = null
