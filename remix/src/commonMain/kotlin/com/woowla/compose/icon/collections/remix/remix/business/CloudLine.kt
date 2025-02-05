package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.CloudLine: ImageVector
    get() {
        if (_cloudLine != null) {
            return _cloudLine!!
        }
        _cloudLine = Builder(name = "CloudLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 9.114f, 18.997f, 9.226f, 18.992f, 9.339f)
                curveTo(21.326f, 10.16f, 23.0f, 12.385f, 23.0f, 15.0f)
                curveTo(23.0f, 18.314f, 20.314f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.686f, 21.0f, 1.0f, 18.314f, 1.0f, 15.0f)
                curveTo(1.0f, 12.385f, 2.673f, 10.16f, 5.008f, 9.339f)
                curveTo(5.003f, 9.226f, 5.0f, 9.114f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(9.239f, 4.0f, 7.0f, 6.239f, 7.0f, 9.0f)
                curveTo(7.0f, 9.081f, 7.002f, 9.163f, 7.006f, 9.243f)
                lineTo(7.077f, 10.731f)
                lineTo(5.672f, 11.225f)
                curveTo(4.084f, 11.784f, 3.0f, 13.289f, 3.0f, 15.0f)
                curveTo(3.0f, 17.209f, 4.791f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(19.209f, 19.0f, 21.0f, 17.209f, 21.0f, 15.0f)
                curveTo(21.0f, 12.79f, 19.21f, 11.0f, 17.0f, 11.0f)
                curveTo(15.233f, 11.0f, 13.734f, 12.146f, 13.204f, 13.735f)
                lineTo(11.306f, 13.102f)
                curveTo(12.101f, 10.719f, 14.35f, 9.0f, 17.0f, 9.0f)
                curveTo(17.0f, 6.239f, 14.761f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _cloudLine!!
    }

private var _cloudLine: ImageVector? = null
