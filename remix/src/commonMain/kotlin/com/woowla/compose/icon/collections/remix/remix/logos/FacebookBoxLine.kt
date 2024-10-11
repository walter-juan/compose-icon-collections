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

public val LogosGroup.FacebookBoxLine: ImageVector
    get() {
        if (_facebookBoxLine != null) {
            return _facebookBoxLine!!
        }
        _facebookBoxLine = Builder(name = "FacebookBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.346f)
                curveTo(12.0f, 9.009f, 12.139f, 8.524f, 12.401f, 8.035f)
                curveTo(12.662f, 7.546f, 13.046f, 7.162f, 13.535f, 6.901f)
                curveTo(13.917f, 6.696f, 14.392f, 6.573f, 15.222f, 6.52f)
                curveTo(15.551f, 6.499f, 15.977f, 6.525f, 16.5f, 6.6f)
                verticalLineTo(8.5f)
                horizontalLineTo(16.0f)
                curveTo(15.083f, 8.5f, 14.704f, 8.543f, 14.478f, 8.664f)
                curveTo(14.338f, 8.739f, 14.239f, 8.838f, 14.164f, 8.978f)
                curveTo(14.043f, 9.204f, 14.0f, 9.429f, 14.0f, 10.346f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
            }
        }
        .build()
        return _facebookBoxLine!!
    }

private var _facebookBoxLine: ImageVector? = null
