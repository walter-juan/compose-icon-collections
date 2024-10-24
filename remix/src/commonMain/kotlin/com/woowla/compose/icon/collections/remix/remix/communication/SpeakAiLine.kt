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

public val CommunicationGroup.SpeakAiLine: ImageVector
    get() {
        if (_speakAiLine != null) {
            return _speakAiLine!!
        }
        _speakAiLine = Builder(name = "SpeakAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.713f, 7.128f)
                lineTo(20.467f, 7.694f)
                curveTo(20.286f, 8.108f, 19.714f, 8.108f, 19.533f, 7.694f)
                lineTo(19.287f, 7.128f)
                curveTo(18.847f, 6.119f, 18.056f, 5.316f, 17.068f, 4.877f)
                lineTo(16.308f, 4.539f)
                curveTo(15.897f, 4.357f, 15.897f, 3.759f, 16.308f, 3.576f)
                lineTo(17.025f, 3.257f)
                curveTo(18.038f, 2.807f, 18.844f, 1.974f, 19.276f, 0.931f)
                lineTo(19.529f, 0.32f)
                curveTo(19.706f, -0.107f, 20.294f, -0.107f, 20.471f, 0.32f)
                lineTo(20.724f, 0.931f)
                curveTo(21.156f, 1.974f, 21.962f, 2.807f, 22.975f, 3.257f)
                lineTo(23.692f, 3.576f)
                curveTo(24.103f, 3.759f, 24.103f, 4.357f, 23.692f, 4.539f)
                lineTo(22.932f, 4.877f)
                curveTo(21.944f, 5.316f, 21.153f, 6.119f, 20.713f, 7.128f)
                close()
                moveTo(9.0f, 2.0f)
                curveTo(13.068f, 2.0f, 16.426f, 5.036f, 16.934f, 8.965f)
                lineTo(19.184f, 12.504f)
                curveTo(19.332f, 12.737f, 19.302f, 13.085f, 18.959f, 13.232f)
                lineTo(17.0f, 14.071f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 18.105f, 16.105f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(13.001f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 18.306f)
                curveTo(4.0f, 17.125f, 3.564f, 16.009f, 2.756f, 15.001f)
                curveTo(1.657f, 13.631f, 1.0f, 11.892f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(9.0f, 4.0f)
                curveTo(5.686f, 4.0f, 3.0f, 6.686f, 3.0f, 10.0f)
                curveTo(3.0f, 11.385f, 3.468f, 12.693f, 4.316f, 13.75f)
                curveTo(5.41f, 15.114f, 6.0f, 16.667f, 6.0f, 18.306f)
                lineTo(6.0f, 20.0f)
                horizontalLineTo(11.001f)
                lineTo(11.002f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.752f)
                lineTo(16.55f, 12.088f)
                lineTo(15.007f, 9.663f)
                lineTo(14.95f, 9.221f)
                curveTo(14.566f, 6.251f, 12.024f, 4.0f, 9.0f, 4.0f)
                close()
                moveTo(19.489f, 16.993f)
                lineTo(21.153f, 18.102f)
                curveTo(22.32f, 16.356f, 23.0f, 14.258f, 23.0f, 12.0f)
                curveTo(23.0f, 11.317f, 22.938f, 10.649f, 22.819f, 10.0f)
                lineTo(20.876f, 10.5f)
                curveTo(20.957f, 10.988f, 21.0f, 11.489f, 21.0f, 12.0f)
                curveTo(21.0f, 13.847f, 20.444f, 15.564f, 19.489f, 16.993f)
                close()
            }
        }
        .build()
        return _speakAiLine!!
    }

private var _speakAiLine: ImageVector? = null
