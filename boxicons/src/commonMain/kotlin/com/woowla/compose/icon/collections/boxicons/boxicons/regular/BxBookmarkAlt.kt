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

public val RegularGroup.BxBookmarkAlt: ImageVector
    get() {
        if (_bxBookmarkAlt != null) {
            return _bxBookmarkAlt!!
        }
        _bxBookmarkAlt = Builder(name = "BxBookmarkAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-12.0f)
                curveTo(4.57f, 2.0f, 3.0f, 3.57f, 3.0f, 5.5f)
                verticalLineTo(22.0f)
                lineToRelative(7.0f, -3.5f)
                lineToRelative(7.0f, 3.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(5.5f)
                curveTo(22.0f, 3.57f, 20.43f, 2.0f, 18.5f, 2.0f)
                close()
                moveTo(15.0f, 18.764f)
                lineToRelative(-5.0f, -2.5f)
                lineToRelative(-5.0f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 4.673f, 5.673f, 4.0f, 6.5f, 4.0f)
                horizontalLineToRelative(8.852f)
                arcTo(3.451f, 3.451f, 0.0f, false, false, 15.0f, 5.5f)
                verticalLineToRelative(13.264f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(5.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _bxBookmarkAlt!!
    }

private var _bxBookmarkAlt: ImageVector? = null
