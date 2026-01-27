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

public val CommunicationGroup.ChatAi3Fill: ImageVector
    get() {
        if (_chatAi3Fill != null) {
            return _chatAi3Fill!!
        }
        _chatAi3Fill = Builder(name = "ChatAi3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.906f, 2.0f, 13.783f, 2.122f, 14.617f, 2.348f)
                curveTo(14.222f, 3.147f, 14.0f, 4.048f, 14.0f, 5.0f)
                curveTo(14.0f, 8.314f, 16.686f, 11.0f, 20.0f, 11.0f)
                curveTo(20.669f, 11.0f, 21.311f, 10.888f, 21.911f, 10.686f)
                curveTo(21.968f, 11.116f, 22.0f, 11.555f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(10.297f, 22.0f, 8.694f, 21.575f, 7.291f, 20.824f)
                lineTo(2.0f, 22.0f)
                lineTo(3.176f, 16.709f)
                curveTo(2.425f, 15.306f, 2.0f, 13.703f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
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
        return _chatAi3Fill!!
    }

private var _chatAi3Fill: ImageVector? = null
