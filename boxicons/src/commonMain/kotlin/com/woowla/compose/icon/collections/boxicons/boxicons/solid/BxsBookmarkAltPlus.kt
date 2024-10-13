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

public val SolidGroup.BxsBookmarkAltPlus: ImageVector
    get() {
        if (_bxsBookmarkAltPlus != null) {
            return _bxsBookmarkAltPlus!!
        }
        _bxsBookmarkAltPlus = Builder(name = "BxsBookmarkAltPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
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
        return _bxsBookmarkAltPlus!!
    }

private var _bxsBookmarkAltPlus: ImageVector? = null
