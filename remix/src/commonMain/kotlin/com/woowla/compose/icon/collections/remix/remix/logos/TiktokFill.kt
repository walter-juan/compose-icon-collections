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

public val LogosGroup.TiktokFill: ImageVector
    get() {
        if (_tiktokFill != null) {
            return _tiktokFill!!
        }
        _tiktokFill = Builder(name = "TiktokFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.245f)
                verticalLineTo(15.5f)
                curveTo(16.0f, 19.09f, 13.09f, 22.0f, 9.5f, 22.0f)
                curveTo(5.91f, 22.0f, 3.0f, 19.09f, 3.0f, 15.5f)
                curveTo(3.0f, 11.91f, 5.91f, 9.0f, 9.5f, 9.0f)
                curveTo(10.016f, 9.0f, 10.519f, 9.06f, 11.0f, 9.174f)
                verticalLineTo(12.337f)
                curveTo(10.545f, 12.121f, 10.037f, 12.0f, 9.5f, 12.0f)
                curveTo(7.567f, 12.0f, 6.0f, 13.567f, 6.0f, 15.5f)
                curveTo(6.0f, 17.433f, 7.567f, 19.0f, 9.5f, 19.0f)
                curveTo(11.433f, 19.0f, 13.0f, 17.433f, 13.0f, 15.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 4.761f, 18.239f, 7.0f, 21.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(19.108f, 10.0f, 17.37f, 9.343f, 16.0f, 8.245f)
                close()
            }
        }
        .build()
        return _tiktokFill!!
    }

private var _tiktokFill: ImageVector? = null
