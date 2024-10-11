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

public val BusinessGroup.CloudFill: ImageVector
    get() {
        if (_cloudFill != null) {
            return _cloudFill!!
        }
        _cloudFill = Builder(name = "CloudFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveTo(13.571f, 7.0f, 10.645f, 9.158f, 9.507f, 12.19f)
                lineTo(11.38f, 12.893f)
                curveTo(12.234f, 10.618f, 14.428f, 9.0f, 17.0f, 9.0f)
                curveTo(17.698f, 9.0f, 18.369f, 9.119f, 18.992f, 9.339f)
                curveTo(21.326f, 10.16f, 23.0f, 12.385f, 23.0f, 15.0f)
                curveTo(23.0f, 18.314f, 20.314f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.686f, 21.0f, 1.0f, 18.314f, 1.0f, 15.0f)
                curveTo(1.0f, 12.385f, 2.673f, 10.16f, 5.008f, 9.339f)
                curveTo(5.003f, 9.226f, 5.0f, 9.114f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.242f, 2.0f, 17.969f, 4.204f, 18.765f, 7.195f)
                curveTo(18.197f, 7.068f, 17.607f, 7.0f, 17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _cloudFill!!
    }

private var _cloudFill: ImageVector? = null
