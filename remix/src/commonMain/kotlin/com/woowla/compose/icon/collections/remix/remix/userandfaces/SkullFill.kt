package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.SkullFill: ImageVector
    get() {
        if (_skullFill != null) {
            return _skullFill!!
        }
        _skullFill = Builder(name = "SkullFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                verticalLineTo(21.0f)
                curveTo(18.0f, 21.552f, 17.552f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 22.0f, 6.0f, 21.552f, 6.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 18.0f, 2.0f, 17.552f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 17.552f, 21.552f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(7.5f, 14.0f)
                curveTo(8.328f, 14.0f, 9.0f, 13.328f, 9.0f, 12.5f)
                curveTo(9.0f, 11.672f, 8.328f, 11.0f, 7.5f, 11.0f)
                curveTo(6.672f, 11.0f, 6.0f, 11.672f, 6.0f, 12.5f)
                curveTo(6.0f, 13.328f, 6.672f, 14.0f, 7.5f, 14.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(17.328f, 14.0f, 18.0f, 13.328f, 18.0f, 12.5f)
                curveTo(18.0f, 11.672f, 17.328f, 11.0f, 16.5f, 11.0f)
                curveTo(15.672f, 11.0f, 15.0f, 11.672f, 15.0f, 12.5f)
                curveTo(15.0f, 13.328f, 15.672f, 14.0f, 16.5f, 14.0f)
                close()
            }
        }
        .build()
        return _skullFill!!
    }

private var _skullFill: ImageVector? = null
