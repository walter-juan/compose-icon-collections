package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxTrendingUp: ImageVector
    get() {
        if (_bxTrendingUp != null) {
            return _bxTrendingUp!!
        }
        _bxTrendingUp = Builder(name = "BxTrendingUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 10.414f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(5.707f, -5.707f)
                lineTo(22.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(2.293f, 2.293f)
                lineTo(14.0f, 11.586f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-7.707f, 7.707f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _bxTrendingUp!!
    }

private var _bxTrendingUp: ImageVector? = null
