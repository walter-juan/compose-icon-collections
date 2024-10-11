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

public val MediaGroup.CameraLensFill: ImageVector
    get() {
        if (_cameraLensFill != null) {
            return _cameraLensFill!!
        }
        _cameraLensFill = Builder(name = "CameraLensFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.827f, 21.763f)
                lineTo(14.309f, 14.0f)
                lineTo(17.841f, 20.118f)
                curveTo(16.198f, 21.302f, 14.181f, 22.0f, 12.0f, 22.0f)
                curveTo(11.254f, 22.0f, 10.527f, 21.918f, 9.827f, 21.763f)
                close()
                moveTo(7.89f, 21.119f)
                curveTo(5.312f, 19.955f, 3.315f, 17.73f, 2.458f, 15.0f)
                horizontalLineTo(11.423f)
                lineTo(7.89f, 21.119f)
                close()
                moveTo(2.049f, 13.0f)
                curveTo(2.017f, 12.671f, 2.0f, 12.337f, 2.0f, 12.0f)
                curveTo(2.0f, 9.393f, 2.998f, 7.019f, 4.632f, 5.239f)
                lineTo(9.113f, 13.0f)
                horizontalLineTo(2.049f)
                close()
                moveTo(6.159f, 3.883f)
                curveTo(7.802f, 2.698f, 9.819f, 2.0f, 12.0f, 2.0f)
                curveTo(12.746f, 2.0f, 13.473f, 2.082f, 14.173f, 2.237f)
                lineTo(9.691f, 10.0f)
                lineTo(6.159f, 3.883f)
                close()
                moveTo(16.11f, 2.881f)
                curveTo(18.688f, 4.045f, 20.685f, 6.27f, 21.542f, 9.0f)
                horizontalLineTo(12.577f)
                lineTo(16.11f, 2.881f)
                close()
                moveTo(21.951f, 11.0f)
                curveTo(21.983f, 11.329f, 22.0f, 11.663f, 22.0f, 12.0f)
                curveTo(22.0f, 14.607f, 21.002f, 16.981f, 19.368f, 18.761f)
                lineTo(14.887f, 11.0f)
                horizontalLineTo(21.951f)
                close()
            }
        }
        .build()
        return _cameraLensFill!!
    }

private var _cameraLensFill: ImageVector? = null
