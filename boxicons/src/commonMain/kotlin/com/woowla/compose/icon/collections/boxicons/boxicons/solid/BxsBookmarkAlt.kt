package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBookmarkAlt: ImageVector
    get() {
        if (_bxsBookmarkAlt != null) {
            return _bxsBookmarkAlt!!
        }
        _bxsBookmarkAlt = Builder(name = "BxsBookmarkAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-12.0f)
                curveTo(4.57f, 2.0f, 3.0f, 3.57f, 3.0f, 5.5f)
                lineTo(3.0f, 22.0f)
                lineToRelative(7.0f, -3.5f)
                lineToRelative(7.0f, 3.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(5.0f)
                lineTo(22.0f, 5.5f)
                curveTo(22.0f, 3.57f, 20.43f, 2.0f, 18.5f, 2.0f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 5.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                lineTo(20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bxsBookmarkAlt!!
    }

private var _bxsBookmarkAlt: ImageVector? = null
