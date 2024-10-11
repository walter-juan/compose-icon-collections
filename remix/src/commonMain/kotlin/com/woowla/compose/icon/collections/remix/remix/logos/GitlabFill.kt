package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GitlabFill: ImageVector
    get() {
        if (_gitlabFill != null) {
            return _gitlabFill!!
        }
        _gitlabFill = Builder(name = "GitlabFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.663f, 9.987f)
                lineTo(21.635f, 9.915f)
                lineTo(18.916f, 2.821f)
                curveTo(18.861f, 2.682f, 18.763f, 2.564f, 18.637f, 2.483f)
                curveTo(18.51f, 2.403f, 18.361f, 2.364f, 18.21f, 2.372f)
                curveTo(18.06f, 2.38f, 17.916f, 2.435f, 17.798f, 2.528f)
                curveTo(17.681f, 2.622f, 17.597f, 2.75f, 17.557f, 2.895f)
                lineTo(15.719f, 8.52f)
                horizontalLineTo(8.282f)
                lineTo(6.443f, 2.895f)
                curveTo(6.404f, 2.75f, 6.319f, 2.622f, 6.202f, 2.528f)
                curveTo(6.085f, 2.434f, 5.941f, 2.379f, 5.791f, 2.371f)
                curveTo(5.64f, 2.363f, 5.491f, 2.402f, 5.364f, 2.483f)
                curveTo(5.237f, 2.563f, 5.139f, 2.681f, 5.084f, 2.821f)
                lineTo(2.362f, 9.925f)
                lineTo(2.334f, 9.995f)
                curveTo(1.943f, 11.018f, 1.895f, 12.141f, 2.197f, 13.193f)
                curveTo(2.499f, 14.246f, 3.134f, 15.172f, 4.008f, 15.833f)
                lineTo(4.018f, 15.84f)
                lineTo(4.042f, 15.859f)
                lineTo(8.189f, 18.963f)
                lineTo(10.239f, 20.516f)
                lineTo(11.486f, 21.46f)
                curveTo(11.632f, 21.57f, 11.81f, 21.63f, 11.994f, 21.63f)
                curveTo(12.177f, 21.63f, 12.356f, 21.57f, 12.502f, 21.46f)
                lineTo(13.749f, 20.516f)
                lineTo(15.8f, 18.963f)
                lineTo(19.971f, 15.84f)
                lineTo(19.982f, 15.832f)
                curveTo(20.858f, 15.172f, 21.497f, 14.245f, 21.8f, 13.19f)
                curveTo(22.103f, 12.136f, 22.055f, 11.012f, 21.663f, 9.987f)
                close()
            }
        }
        .build()
        return _gitlabFill!!
    }

private var _gitlabFill: ImageVector? = null
