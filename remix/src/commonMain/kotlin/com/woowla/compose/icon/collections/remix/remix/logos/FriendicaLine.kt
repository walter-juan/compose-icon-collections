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

public val LogosGroup.FriendicaLine: ImageVector
    get() {
        if (_friendicaLine != null) {
            return _friendicaLine!!
        }
        _friendicaLine = Builder(name = "FriendicaLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 20.0f, 20.0f, 19.105f, 20.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.895f, 19.105f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.105f, 4.895f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 3.791f, 3.791f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(20.209f, 2.0f, 22.0f, 3.791f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 20.209f, 20.209f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 22.0f, 2.0f, 20.209f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _friendicaLine!!
    }

private var _friendicaLine: ImageVector? = null
