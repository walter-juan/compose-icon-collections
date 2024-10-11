package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.KeyLine: ImageVector
    get() {
        if (_keyLine != null) {
            return _keyLine!!
        }
        _keyLine = Builder(name = "KeyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.917f, 13.0f)
                curveTo(12.441f, 15.838f, 9.973f, 18.0f, 7.0f, 18.0f)
                curveTo(3.686f, 18.0f, 1.0f, 15.314f, 1.0f, 12.0f)
                curveTo(1.0f, 8.686f, 3.686f, 6.0f, 7.0f, 6.0f)
                curveTo(9.973f, 6.0f, 12.441f, 8.162f, 12.917f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.917f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(9.209f, 16.0f, 11.0f, 14.209f, 11.0f, 12.0f)
                curveTo(11.0f, 9.791f, 9.209f, 8.0f, 7.0f, 8.0f)
                curveTo(4.791f, 8.0f, 3.0f, 9.791f, 3.0f, 12.0f)
                curveTo(3.0f, 14.209f, 4.791f, 16.0f, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _keyLine!!
    }

private var _keyLine: ImageVector? = null
