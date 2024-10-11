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

public val LogosGroup.MediumFill: ImageVector
    get() {
        if (_mediumFill != null) {
            return _mediumFill!!
        }
        _mediumFill = Builder(name = "MediumFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.409f, 12.007f)
                curveTo(13.409f, 15.457f, 10.631f, 18.254f, 7.205f, 18.254f)
                curveTo(3.778f, 18.254f, 1.0f, 15.458f, 1.0f, 12.007f)
                curveTo(1.0f, 8.556f, 3.778f, 5.76f, 7.205f, 5.76f)
                curveTo(10.631f, 5.76f, 13.409f, 8.557f, 13.409f, 12.007f)
                close()
                moveTo(20.216f, 12.007f)
                curveTo(20.216f, 15.255f, 18.827f, 17.888f, 17.114f, 17.888f)
                curveTo(15.4f, 17.888f, 14.011f, 15.254f, 14.011f, 12.007f)
                curveTo(14.011f, 8.76f, 15.4f, 6.126f, 17.114f, 6.126f)
                curveTo(18.827f, 6.126f, 20.216f, 8.76f, 20.216f, 12.007f)
                close()
                moveTo(23.0f, 12.007f)
                curveTo(23.0f, 14.917f, 22.511f, 17.276f, 21.909f, 17.276f)
                curveTo(21.306f, 17.276f, 20.818f, 14.916f, 20.818f, 12.007f)
                curveTo(20.818f, 9.098f, 21.306f, 6.738f, 21.909f, 6.738f)
                curveTo(22.512f, 6.738f, 23.0f, 9.097f, 23.0f, 12.007f)
                close()
            }
        }
        .build()
        return _mediumFill!!
    }

private var _mediumFill: ImageVector? = null
