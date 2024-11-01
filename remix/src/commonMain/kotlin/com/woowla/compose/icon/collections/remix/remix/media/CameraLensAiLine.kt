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

public val MediaGroup.CameraLensAiLine: ImageVector
    get() {
        if (_cameraLensAiLine != null) {
            return _cameraLensAiLine!!
        }
        _cameraLensAiLine = Builder(name = "CameraLensAiLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.467f, 8.694f)
                lineTo(20.713f, 8.128f)
                curveTo(21.153f, 7.119f, 21.944f, 6.316f, 22.932f, 5.877f)
                lineTo(23.692f, 5.539f)
                curveTo(24.103f, 5.357f, 24.103f, 4.759f, 23.692f, 4.576f)
                lineTo(22.975f, 4.257f)
                curveTo(21.962f, 3.807f, 21.156f, 2.974f, 20.724f, 1.931f)
                lineTo(20.471f, 1.32f)
                curveTo(20.294f, 0.893f, 19.706f, 0.893f, 19.529f, 1.32f)
                lineTo(19.276f, 1.931f)
                curveTo(18.844f, 2.974f, 18.038f, 3.807f, 17.025f, 4.257f)
                lineTo(16.308f, 4.576f)
                curveTo(15.897f, 4.759f, 15.897f, 5.357f, 16.308f, 5.539f)
                lineTo(17.068f, 5.877f)
                curveTo(18.056f, 6.316f, 18.847f, 7.119f, 19.287f, 8.128f)
                lineTo(19.533f, 8.694f)
                curveTo(19.714f, 9.108f, 20.286f, 9.108f, 20.467f, 8.694f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.597f, 21.976f, 11.2f, 21.93f, 10.81f)
                lineTo(19.944f, 11.045f)
                curveTo(19.981f, 11.358f, 20.0f, 11.677f, 20.0f, 12.0f)
                curveTo(20.0f, 13.458f, 19.61f, 14.824f, 18.929f, 16.001f)
                lineTo(15.464f, 10.0f)
                horizontalLineTo(17.93f)
                lineTo(16.775f, 8.0f)
                horizontalLineTo(12.0f)
                lineTo(15.169f, 2.512f)
                curveTo(14.173f, 2.18f, 13.107f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 4.0f)
                lineTo(8.536f, 10.0f)
                lineTo(6.395f, 6.292f)
                curveTo(7.838f, 4.874f, 9.817f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(9.691f, 12.0f)
                lineTo(10.846f, 10.0f)
                horizontalLineTo(13.155f)
                lineTo(14.309f, 12.0f)
                lineTo(13.155f, 14.0f)
                horizontalLineTo(10.845f)
                lineTo(9.691f, 12.0f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(9.858f, 19.71f)
                curveTo(7.819f, 19.145f, 6.107f, 17.792f, 5.07f, 16.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 20.0f)
                lineTo(15.464f, 14.0f)
                lineTo(17.605f, 17.708f)
                curveTo(16.162f, 19.126f, 14.183f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(5.071f, 7.999f)
                lineTo(8.536f, 14.0f)
                horizontalLineTo(4.252f)
                curveTo(4.088f, 13.361f, 4.0f, 12.691f, 4.0f, 12.0f)
                curveTo(4.0f, 10.542f, 4.39f, 9.176f, 5.071f, 7.999f)
                close()
            }
        }
        .build()
        return _cameraLensAiLine!!
    }

private var _cameraLensAiLine: ImageVector? = null
