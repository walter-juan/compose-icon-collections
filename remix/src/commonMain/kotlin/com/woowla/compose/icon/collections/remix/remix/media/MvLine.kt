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

public val MediaGroup.MvLine: ImageVector
    get() {
        if (_mvLine != null) {
            return _mvLine!!
        }
        _mvLine = Builder(name = "MvLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(12.0f, 12.171f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                curveTo(14.0f, 16.657f, 12.657f, 18.0f, 11.0f, 18.0f)
                curveTo(9.343f, 18.0f, 8.0f, 16.657f, 8.0f, 15.0f)
                curveTo(8.0f, 13.343f, 9.343f, 12.0f, 11.0f, 12.0f)
                curveTo(11.351f, 12.0f, 11.687f, 12.06f, 12.0f, 12.171f)
                close()
            }
        }
        .build()
        return _mvLine!!
    }

private var _mvLine: ImageVector? = null
