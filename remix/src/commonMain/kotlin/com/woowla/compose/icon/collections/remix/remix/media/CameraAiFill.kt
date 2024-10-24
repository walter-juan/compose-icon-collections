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

public val MediaGroup.CameraAiFill: ImageVector
    get() {
        if (_cameraAiFill != null) {
            return _cameraAiFill!!
        }
        _cameraAiFill = Builder(name = "CameraAiFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(22.0f, 20.0f)
                verticalLineTo(10.659f)
                curveTo(21.374f, 10.88f, 20.701f, 11.0f, 20.0f, 11.0f)
                curveTo(19.075f, 11.0f, 18.199f, 10.791f, 17.417f, 10.417f)
                curveTo(17.791f, 11.199f, 18.0f, 12.075f, 18.0f, 13.0f)
                curveTo(18.0f, 16.314f, 15.314f, 19.0f, 12.0f, 19.0f)
                curveTo(8.686f, 19.0f, 6.0f, 16.314f, 6.0f, 13.0f)
                curveTo(6.0f, 9.686f, 8.686f, 7.0f, 12.0f, 7.0f)
                curveTo(12.925f, 7.0f, 13.801f, 7.209f, 14.583f, 7.583f)
                curveTo(14.209f, 6.801f, 14.0f, 5.925f, 14.0f, 5.0f)
                curveTo(14.0f, 4.299f, 14.12f, 3.626f, 14.341f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 5.0f, 2.0f, 5.448f, 2.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(9.791f, 17.0f, 8.0f, 15.209f, 8.0f, 13.0f)
                curveTo(8.0f, 10.791f, 9.791f, 9.0f, 12.0f, 9.0f)
                curveTo(14.209f, 9.0f, 16.0f, 10.791f, 16.0f, 13.0f)
                curveTo(16.0f, 15.209f, 14.209f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _cameraAiFill!!
    }

private var _cameraAiFill: ImageVector? = null
