package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.ClapperboardFill: ImageVector
    get() {
        if (_clapperboardFill != null) {
            return _clapperboardFill!!
        }
        _clapperboardFill = Builder(name = "ClapperboardFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.998f, 7.0f)
                lineTo(20.308f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(5.998f)
                lineTo(3.689f, 7.0f)
                horizontalLineTo(5.998f)
                lineTo(8.307f, 3.0f)
                horizontalLineTo(11.998f)
                lineTo(9.689f, 7.0f)
                horizontalLineTo(11.998f)
                lineTo(14.307f, 3.0f)
                horizontalLineTo(17.998f)
                lineTo(15.689f, 7.0f)
                horizontalLineTo(17.998f)
                close()
            }
        }
        .build()
        return _clapperboardFill!!
    }

private var _clapperboardFill: ImageVector? = null
