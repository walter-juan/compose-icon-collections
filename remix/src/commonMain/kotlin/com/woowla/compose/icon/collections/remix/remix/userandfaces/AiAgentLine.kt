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

public val UserAndFacesGroup.AiAgentLine: ImageVector
    get() {
        if (_aiAgentLine != null) {
            return _aiAgentLine!!
        }
        _aiAgentLine = Builder(name = "AiAgentLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 14.71f, 20.92f, 17.17f, 19.171f, 18.97f)
                curveTo(17.355f, 20.838f, 14.812f, 22.0f, 12.0f, 22.0f)
                curveTo(9.188f, 22.0f, 6.645f, 20.838f, 4.829f, 18.97f)
                curveTo(3.079f, 17.17f, 2.0f, 14.71f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(10.002f, 16.0f, 8.201f, 16.837f, 6.925f, 18.182f)
                curveTo(8.306f, 19.317f, 10.072f, 20.0f, 12.0f, 20.0f)
                curveTo(13.927f, 20.0f, 15.693f, 19.317f, 17.074f, 18.182f)
                curveTo(15.798f, 16.838f, 13.998f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 13.77f, 4.575f, 15.404f, 5.548f, 16.729f)
                curveTo(7.182f, 15.048f, 9.468f, 14.0f, 12.0f, 14.0f)
                curveTo(14.532f, 14.0f, 16.817f, 15.049f, 18.451f, 16.729f)
                curveTo(19.425f, 15.404f, 20.0f, 13.77f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(11.529f, 5.319f)
                curveTo(11.706f, 4.893f, 12.294f, 4.893f, 12.471f, 5.319f)
                lineTo(12.724f, 5.931f)
                curveTo(13.156f, 6.973f, 13.962f, 7.806f, 14.975f, 8.257f)
                lineTo(15.692f, 8.575f)
                curveTo(16.103f, 8.758f, 16.103f, 9.356f, 15.692f, 9.539f)
                lineTo(14.933f, 9.877f)
                curveTo(13.945f, 10.316f, 13.153f, 11.119f, 12.714f, 12.128f)
                lineTo(12.467f, 12.693f)
                curveTo(12.286f, 13.107f, 11.714f, 13.107f, 11.533f, 12.693f)
                lineTo(11.287f, 12.128f)
                curveTo(10.848f, 11.119f, 10.055f, 10.316f, 9.067f, 9.877f)
                lineTo(8.308f, 9.539f)
                curveTo(7.897f, 9.356f, 7.897f, 8.758f, 8.308f, 8.575f)
                lineTo(9.025f, 8.257f)
                curveTo(10.038f, 7.806f, 10.844f, 6.973f, 11.276f, 5.931f)
                lineTo(11.529f, 5.319f)
                close()
            }
        }
        .build()
        return _aiAgentLine!!
    }

private var _aiAgentLine: ImageVector? = null
