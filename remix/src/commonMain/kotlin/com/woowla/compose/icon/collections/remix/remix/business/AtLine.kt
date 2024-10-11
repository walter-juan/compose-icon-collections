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

public val BusinessGroup.AtLine: ImageVector
    get() {
        if (_atLine != null) {
            return _atLine!!
        }
        _atLine = Builder(name = "AtLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.642f, 20.0f, 15.168f, 19.505f, 16.438f, 18.657f)
                lineTo(17.548f, 20.321f)
                curveTo(15.96f, 21.382f, 14.052f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(22.0f, 15.433f, 20.433f, 17.0f, 18.5f, 17.0f)
                curveTo(17.296f, 17.0f, 16.234f, 16.392f, 15.604f, 15.466f)
                curveTo(14.694f, 16.412f, 13.416f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                curveTo(7.0f, 9.239f, 9.239f, 7.0f, 12.0f, 7.0f)
                curveTo(13.126f, 7.0f, 14.165f, 7.372f, 15.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.5f)
                curveTo(17.0f, 14.328f, 17.672f, 15.0f, 18.5f, 15.0f)
                curveTo(19.328f, 15.0f, 20.0f, 14.328f, 20.0f, 13.5f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _atLine!!
    }

private var _atLine: ImageVector? = null
