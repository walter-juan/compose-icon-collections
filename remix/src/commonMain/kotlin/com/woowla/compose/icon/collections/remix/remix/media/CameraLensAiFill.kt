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

public val MediaGroup.CameraLensAiFill: ImageVector
    get() {
        if (_cameraLensAiFill != null) {
            return _cameraLensAiFill!!
        }
        _cameraLensAiFill = Builder(name = "CameraLensAiFill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(14.309f, 14.0f)
                lineTo(9.827f, 21.763f)
                curveTo(10.527f, 21.918f, 11.254f, 22.0f, 12.0f, 22.0f)
                curveTo(14.181f, 22.0f, 16.198f, 21.302f, 17.841f, 20.118f)
                lineTo(14.309f, 14.0f)
                close()
                moveTo(2.458f, 15.0f)
                curveTo(3.315f, 17.73f, 5.312f, 19.955f, 7.89f, 21.119f)
                lineTo(11.423f, 15.0f)
                horizontalLineTo(2.458f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 12.337f, 2.017f, 12.671f, 2.049f, 13.0f)
                horizontalLineTo(9.113f)
                lineTo(4.632f, 5.239f)
                curveTo(2.998f, 7.019f, 2.0f, 9.393f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(9.819f, 2.0f, 7.802f, 2.698f, 6.159f, 3.883f)
                lineTo(9.691f, 10.0f)
                lineTo(14.173f, 2.237f)
                curveTo(13.473f, 2.082f, 12.746f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 11.663f, 21.983f, 11.329f, 21.951f, 11.0f)
                horizontalLineTo(14.887f)
                lineTo(19.368f, 18.761f)
                curveTo(21.002f, 16.981f, 22.0f, 14.607f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cameraLensAiFill!!
    }

private var _cameraLensAiFill: ImageVector? = null
