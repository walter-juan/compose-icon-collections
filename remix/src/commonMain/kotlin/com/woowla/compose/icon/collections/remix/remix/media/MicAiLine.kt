package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.MicAiLine: ImageVector
    get() {
        if (_micAiLine != null) {
            return _micAiLine!!
        }
        _micAiLine = Builder(name = "MicAiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.467f, 7.694f)
                lineTo(20.713f, 7.128f)
                curveTo(21.153f, 6.119f, 21.944f, 5.316f, 22.932f, 4.877f)
                lineTo(23.692f, 4.539f)
                curveTo(24.103f, 4.357f, 24.103f, 3.759f, 23.692f, 3.576f)
                lineTo(22.975f, 3.257f)
                curveTo(21.962f, 2.807f, 21.156f, 1.974f, 20.724f, 0.931f)
                lineTo(20.471f, 0.32f)
                curveTo(20.294f, -0.107f, 19.706f, -0.107f, 19.529f, 0.32f)
                lineTo(19.276f, 0.931f)
                curveTo(18.844f, 1.974f, 18.038f, 2.807f, 17.025f, 3.257f)
                lineTo(16.308f, 3.576f)
                curveTo(15.897f, 3.759f, 15.897f, 4.357f, 16.308f, 4.539f)
                lineTo(17.068f, 4.877f)
                curveTo(18.056f, 5.316f, 18.847f, 6.119f, 19.287f, 7.128f)
                lineTo(19.533f, 7.694f)
                curveTo(19.714f, 8.108f, 20.286f, 8.108f, 20.467f, 7.694f)
                close()
                moveTo(3.055f, 11.0f)
                horizontalLineTo(5.071f)
                curveTo(5.556f, 14.392f, 8.473f, 17.0f, 12.0f, 17.0f)
                curveTo(15.526f, 17.0f, 18.444f, 14.392f, 18.929f, 11.0f)
                horizontalLineTo(20.945f)
                curveTo(20.484f, 15.172f, 17.171f, 18.484f, 13.0f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.945f)
                curveTo(6.828f, 18.484f, 3.516f, 15.172f, 3.055f, 11.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(9.239f, 1.0f, 7.0f, 3.239f, 7.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 12.761f, 9.239f, 15.0f, 12.0f, 15.0f)
                curveTo(14.761f, 15.0f, 17.0f, 12.761f, 17.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 11.657f, 13.657f, 13.0f, 12.0f, 13.0f)
                curveTo(10.343f, 13.0f, 9.0f, 11.657f, 9.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(9.0f, 4.343f, 10.343f, 3.0f, 12.0f, 3.0f)
                curveTo(12.597f, 3.0f, 13.151f, 3.173f, 13.617f, 3.472f)
                lineTo(14.697f, 1.789f)
                curveTo(13.918f, 1.29f, 12.991f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _micAiLine!!
    }

private var _micAiLine: ImageVector? = null
