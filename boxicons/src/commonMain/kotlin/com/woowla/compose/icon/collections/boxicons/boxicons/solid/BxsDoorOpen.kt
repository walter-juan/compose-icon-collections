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

public val SolidGroup.BxsDoorOpen: ImageVector
    get() {
        if (_bxsDoorOpen != null) {
            return _bxsDoorOpen!!
        }
        _bxsDoorOpen = Builder(name = "BxsDoorOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(19.242f, 4.03f)
                lineTo(11.242f, 2.03f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 3.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.242f, 0.97f)
                lineToRelative(8.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 19.0f)
                lineTo(20.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.758f, -0.97f)
                close()
                moveTo(15.0f, 12.188f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.377f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.001f)
                verticalLineToRelative(0.376f)
                close()
            }
        }
        .build()
        return _bxsDoorOpen!!
    }

private var _bxsDoorOpen: ImageVector? = null
