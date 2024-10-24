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

public val CommunicationGroup.ChatAiFill: ImageVector
    get() {
        if (_chatAiFill != null) {
            return _chatAiFill!!
        }
        _chatAiFill = Builder(name = "ChatAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.0f, 11.0f)
                curveTo(20.699f, 11.0f, 21.369f, 10.881f, 21.993f, 10.661f)
                curveTo(21.998f, 10.774f, 22.0f, 10.887f, 22.0f, 11.0f)
                curveTo(22.0f, 15.418f, 18.418f, 19.0f, 14.0f, 19.0f)
                verticalLineTo(22.5f)
                curveTo(9.0f, 20.5f, 2.0f, 17.5f, 2.0f, 11.0f)
                curveTo(2.0f, 6.582f, 5.582f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(14.113f, 3.0f, 14.226f, 3.002f, 14.339f, 3.007f)
                curveTo(14.119f, 3.631f, 14.0f, 4.301f, 14.0f, 5.0f)
                curveTo(14.0f, 8.314f, 16.686f, 11.0f, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _chatAiFill!!
    }

private var _chatAiFill: ImageVector? = null
