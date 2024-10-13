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

public val SolidGroup.BxsReceipt: ImageVector
    get() {
        if (_bxsReceipt != null) {
            return _bxsReceipt!!
        }
        _bxsReceipt = Builder(name = "BxsReceipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(18.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(14.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxsReceipt!!
    }

private var _bxsReceipt: ImageVector? = null
