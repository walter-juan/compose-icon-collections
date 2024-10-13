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

public val RegularGroup.BxSortZA: ImageVector
    get() {
        if (_bxSortZA != null) {
            return _bxSortZA!!
        }
        _bxSortZA = Builder(name = "BxSortZA", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.707f, 14.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.586f)
                lineToRelative(-4.293f, 4.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.586f)
                lineToRelative(4.293f, -4.293f)
                close()
                moveTo(6.0f, 3.99f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.417f, 0.0f, -0.79f, 0.259f, -0.937f, 0.649f)
                lineToRelative(-2.75f, 7.333f)
                horizontalLineToRelative(2.137f)
                lineTo(14.193f, 9.0f)
                horizontalLineToRelative(3.613f)
                lineToRelative(0.743f, 1.981f)
                horizontalLineToRelative(2.137f)
                lineToRelative(-2.75f, -7.333f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 3.0f)
                close()
                moveTo(14.943f, 7.0f)
                lineTo(15.693f, 5.0f)
                horizontalLineToRelative(0.613f)
                lineToRelative(0.75f, 2.0f)
                horizontalLineToRelative(-2.113f)
                close()
            }
        }
        .build()
        return _bxSortZA!!
    }

private var _bxSortZA: ImageVector? = null
