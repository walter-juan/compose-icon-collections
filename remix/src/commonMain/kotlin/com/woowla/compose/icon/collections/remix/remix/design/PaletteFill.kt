package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.PaletteFill: ImageVector
    get() {
        if (_paletteFill != null) {
            return _paletteFill!!
        }
        _paletteFill = Builder(name = "PaletteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.522f, 2.0f, 22.0f, 5.978f, 22.0f, 10.889f)
                curveTo(22.0f, 13.956f, 19.511f, 16.444f, 16.444f, 16.444f)
                horizontalLineTo(14.478f)
                curveTo(13.556f, 16.444f, 12.811f, 17.189f, 12.811f, 18.111f)
                curveTo(12.811f, 18.533f, 12.978f, 18.922f, 13.233f, 19.211f)
                curveTo(13.5f, 19.511f, 13.667f, 19.9f, 13.667f, 20.333f)
                curveTo(13.667f, 21.256f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(6.478f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.478f, 6.478f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.5f, 12.0f)
                curveTo(8.328f, 12.0f, 9.0f, 11.328f, 9.0f, 10.5f)
                curveTo(9.0f, 9.672f, 8.328f, 9.0f, 7.5f, 9.0f)
                curveTo(6.672f, 9.0f, 6.0f, 9.672f, 6.0f, 10.5f)
                curveTo(6.0f, 11.328f, 6.672f, 12.0f, 7.5f, 12.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(17.328f, 12.0f, 18.0f, 11.328f, 18.0f, 10.5f)
                curveTo(18.0f, 9.672f, 17.328f, 9.0f, 16.5f, 9.0f)
                curveTo(15.672f, 9.0f, 15.0f, 9.672f, 15.0f, 10.5f)
                curveTo(15.0f, 11.328f, 15.672f, 12.0f, 16.5f, 12.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.828f, 9.0f, 13.5f, 8.328f, 13.5f, 7.5f)
                curveTo(13.5f, 6.672f, 12.828f, 6.0f, 12.0f, 6.0f)
                curveTo(11.172f, 6.0f, 10.5f, 6.672f, 10.5f, 7.5f)
                curveTo(10.5f, 8.328f, 11.172f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _paletteFill!!
    }

private var _paletteFill: ImageVector? = null
