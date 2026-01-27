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

public val CommunicationGroup.ChatAi2Line: ImageVector
    get() {
        if (_chatAi2Line != null) {
            return _chatAi2Line!!
        }
        _chatAi2Line = Builder(name = "ChatAi2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.591f)
                lineTo(12.0f, 19.012f)
                lineTo(13.409f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.545f, 21.545f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(14.45f)
                lineTo(12.0f, 22.5f)
                lineTo(9.55f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.455f, 19.0f, 2.0f, 18.545f, 2.0f, 18.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.455f, 2.455f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
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
        return _chatAi2Line!!
    }

private var _chatAi2Line: ImageVector? = null
