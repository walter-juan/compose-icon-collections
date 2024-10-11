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

public val LogosGroup.NetflixLine: ImageVector
    get() {
        if (_netflixLine != null) {
            return _netflixLine!!
        }
        _netflixLine = Builder(name = "NetflixLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.985f, 17.208f)
                lineTo(16.001f, 2.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(22.0f)
                curveTo(17.321f, 21.733f, 16.648f, 21.567f, 15.981f, 21.5f)
                lineTo(8.001f, 6.302f)
                verticalLineTo(21.5f)
                curveTo(7.334f, 21.567f, 6.668f, 21.733f, 6.001f, 22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.001f)
                lineTo(15.985f, 17.208f)
                close()
            }
        }
        .build()
        return _netflixLine!!
    }

private var _netflixLine: ImageVector? = null
