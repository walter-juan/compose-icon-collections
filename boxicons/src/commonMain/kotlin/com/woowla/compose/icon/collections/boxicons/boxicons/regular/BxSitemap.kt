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

public val RegularGroup.BxSitemap: ImageVector
    get() {
        if (_bxSitemap != null) {
            return _bxSitemap!!
        }
        _bxSitemap = Builder(name = "BxSitemap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.01f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.99f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.99f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.99f)
                close()
                moveTo(10.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.002f, 4.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bxSitemap!!
    }

private var _bxSitemap: ImageVector? = null
