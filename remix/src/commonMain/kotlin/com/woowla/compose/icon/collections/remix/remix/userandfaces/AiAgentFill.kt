package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.AiAgentFill: ImageVector
    get() {
        if (_aiAgentFill != null) {
            return _aiAgentFill!!
        }
        _aiAgentFill = Builder(name = "AiAgentFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(9.713f, 15.0f, 7.65f, 15.961f, 6.192f, 17.5f)
                curveTo(7.65f, 19.039f, 9.713f, 20.0f, 12.0f, 20.0f)
                curveTo(14.287f, 20.0f, 16.349f, 19.039f, 17.807f, 17.5f)
                curveTo(16.349f, 15.961f, 14.287f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.471f, 5.319f)
                curveTo(12.294f, 4.893f, 11.706f, 4.893f, 11.529f, 5.319f)
                lineTo(11.276f, 5.931f)
                curveTo(10.844f, 6.973f, 10.038f, 7.806f, 9.025f, 8.257f)
                lineTo(8.308f, 8.576f)
                curveTo(7.898f, 8.759f, 7.897f, 9.356f, 8.308f, 9.539f)
                lineTo(9.067f, 9.877f)
                curveTo(10.055f, 10.316f, 10.848f, 11.119f, 11.287f, 12.128f)
                lineTo(11.533f, 12.693f)
                curveTo(11.714f, 13.107f, 12.286f, 13.107f, 12.467f, 12.693f)
                lineTo(12.714f, 12.128f)
                curveTo(13.153f, 11.119f, 13.945f, 10.316f, 14.933f, 9.877f)
                lineTo(15.692f, 9.539f)
                curveTo(16.103f, 9.356f, 16.103f, 8.759f, 15.692f, 8.576f)
                lineTo(14.975f, 8.257f)
                curveTo(13.962f, 7.806f, 13.156f, 6.973f, 12.724f, 5.931f)
                lineTo(12.471f, 5.319f)
                close()
            }
        }
        .build()
        return _aiAgentFill!!
    }

private var _aiAgentFill: ImageVector? = null
