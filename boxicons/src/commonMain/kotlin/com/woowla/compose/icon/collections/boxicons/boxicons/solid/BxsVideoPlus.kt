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

public val SolidGroup.BxsVideoPlus: ImageVector
    get() {
        if (_bxsVideoPlus != null) {
            return _bxsVideoPlus!!
        }
        _bxsVideoPlus = Builder(name = "BxsVideoPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-3.333f)
                lineTo(22.0f, 17.0f)
                lineTo(22.0f, 7.0f)
                lineToRelative(-4.0f, 3.333f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsVideoPlus!!
    }

private var _bxsVideoPlus: ImageVector? = null
