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

public val SolidGroup.BxsFoodMenu: ImageVector
    get() {
        if (_bxsFoodMenu != null) {
            return _bxsFoodMenu!!
        }
        _bxsFoodMenu = Builder(name = "BxsFoodMenu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                lineTo(3.0f, 22.0f)
                close()
                moveTo(19.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsFoodMenu!!
    }

private var _bxsFoodMenu: ImageVector? = null
