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

public val CommunicationGroup.ChatSmileAiLine: ImageVector
    get() {
        if (_chatSmileAiLine != null) {
            return _chatSmileAiLine!!
        }
        _chatSmileAiLine = Builder(name = "ChatSmileAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.713f, 8.128f)
                lineTo(20.467f, 8.694f)
                curveTo(20.286f, 9.108f, 19.714f, 9.108f, 19.533f, 8.694f)
                lineTo(19.287f, 8.128f)
                curveTo(18.847f, 7.119f, 18.056f, 6.316f, 17.068f, 5.877f)
                lineTo(16.308f, 5.539f)
                curveTo(15.897f, 5.357f, 15.897f, 4.759f, 16.308f, 4.576f)
                lineTo(17.025f, 4.257f)
                curveTo(18.038f, 3.807f, 18.844f, 2.974f, 19.276f, 1.931f)
                lineTo(19.529f, 1.32f)
                curveTo(19.706f, 0.893f, 20.294f, 0.893f, 20.471f, 1.32f)
                lineTo(20.724f, 1.931f)
                curveTo(21.156f, 2.974f, 21.962f, 3.807f, 22.975f, 4.257f)
                lineTo(23.692f, 4.576f)
                curveTo(24.103f, 4.759f, 24.103f, 5.357f, 23.692f, 5.539f)
                lineTo(22.932f, 5.877f)
                curveTo(21.944f, 6.316f, 21.153f, 7.119f, 20.713f, 8.128f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 13.703f, 2.425f, 15.306f, 3.176f, 16.709f)
                lineTo(2.0f, 22.0f)
                lineTo(7.291f, 20.824f)
                curveTo(8.694f, 21.575f, 10.297f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.597f, 21.976f, 11.2f, 21.93f, 10.809f)
                lineTo(19.944f, 11.045f)
                curveTo(19.981f, 11.358f, 20.0f, 11.677f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(10.665f, 20.0f, 9.382f, 19.674f, 8.234f, 19.06f)
                lineTo(7.581f, 18.711f)
                lineTo(4.634f, 19.366f)
                lineTo(5.289f, 16.419f)
                lineTo(4.939f, 15.766f)
                curveTo(4.325f, 14.618f, 4.0f, 13.335f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(12.692f, 4.0f, 13.362f, 4.088f, 14.0f, 4.252f)
                lineTo(14.498f, 2.315f)
                curveTo(13.699f, 2.109f, 12.861f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 14.761f, 9.239f, 17.0f, 12.0f, 17.0f)
                curveTo(14.761f, 17.0f, 17.0f, 14.761f, 17.0f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _chatSmileAiLine!!
    }

private var _chatSmileAiLine: ImageVector? = null
