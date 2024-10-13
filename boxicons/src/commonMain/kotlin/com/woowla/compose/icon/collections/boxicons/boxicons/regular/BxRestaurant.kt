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

public val RegularGroup.BxRestaurant: ImageVector
    get() {
        if (_bxRestaurant != null) {
            return _bxRestaurant!!
        }
        _bxRestaurant = Builder(name = "BxRestaurant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.159f, 0.0f, -2.0f, 1.262f, -2.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bxRestaurant!!
    }

private var _bxRestaurant: ImageVector? = null
