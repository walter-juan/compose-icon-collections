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

public val BusinessGroup.Bookmark3Line: ImageVector
    get() {
        if (_bookmark3Line != null) {
            return _bookmark3Line!!
        }
        _bookmark3Line = Builder(name = "Bookmark3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(22.276f)
                curveTo(21.0f, 22.552f, 20.776f, 22.776f, 20.5f, 22.776f)
                curveTo(20.43f, 22.776f, 20.36f, 22.761f, 20.296f, 22.733f)
                lineTo(12.0f, 19.031f)
                lineTo(3.704f, 22.733f)
                curveTo(3.452f, 22.846f, 3.156f, 22.732f, 3.043f, 22.48f)
                curveTo(3.015f, 22.416f, 3.0f, 22.347f, 3.0f, 22.276f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(19.0f, 19.965f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.965f)
                lineTo(12.0f, 16.841f)
                lineTo(19.0f, 19.965f)
                close()
                moveTo(12.0f, 13.5f)
                lineTo(9.061f, 15.045f)
                lineTo(9.622f, 11.773f)
                lineTo(7.245f, 9.455f)
                lineTo(10.531f, 8.977f)
                lineTo(12.0f, 6.0f)
                lineTo(13.469f, 8.977f)
                lineTo(16.755f, 9.455f)
                lineTo(14.378f, 11.773f)
                lineTo(14.939f, 15.045f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _bookmark3Line!!
    }

private var _bookmark3Line: ImageVector? = null
