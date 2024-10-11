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

public val LogosGroup.GoogleLine: ImageVector
    get() {
        if (_googleLine != null) {
            return _googleLine!!
        }
        _googleLine = Builder(name = "GoogleLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                horizontalLineTo(20.533f)
                curveTo(20.577f, 11.385f, 20.6f, 11.779f, 20.6f, 12.184f)
                curveTo(20.6f, 14.918f, 19.62f, 17.22f, 17.922f, 18.784f)
                curveTo(16.437f, 20.155f, 14.404f, 20.959f, 11.98f, 20.959f)
                curveTo(8.469f, 20.959f, 5.433f, 18.947f, 3.955f, 16.012f)
                curveTo(3.347f, 14.8f, 3.0f, 13.429f, 3.0f, 11.98f)
                curveTo(3.0f, 10.531f, 3.347f, 9.159f, 3.955f, 7.947f)
                curveTo(5.433f, 5.012f, 8.469f, 3.0f, 11.98f, 3.0f)
                curveTo(14.4f, 3.0f, 16.433f, 3.89f, 17.988f, 5.339f)
                lineTo(16.525f, 6.801f)
                curveTo(15.368f, 5.682f, 13.803f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(15.526f, 19.0f, 18.144f, 16.392f, 18.577f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _googleLine!!
    }

private var _googleLine: ImageVector? = null
