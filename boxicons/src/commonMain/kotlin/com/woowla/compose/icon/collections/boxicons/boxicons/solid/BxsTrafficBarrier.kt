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

public val SolidGroup.BxsTrafficBarrier: ImageVector
    get() {
        if (_bxsTrafficBarrier != null) {
            return _bxsTrafficBarrier!!
        }
        _bxsTrafficBarrier = Builder(name = "BxsTrafficBarrier", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.42f, 13.0f)
                lineToRelative(2.857f, -5.0f)
                lineTo(9.58f, 8.0f)
                lineToRelative(-2.857f, 5.0f)
                lineTo(4.42f, 13.0f)
                close()
                moveTo(12.277f, 8.0f)
                horizontalLineToRelative(2.303f)
                lineToRelative(-2.857f, 5.0f)
                lineTo(9.42f, 13.0f)
                lineToRelative(2.857f, -5.0f)
                close()
                moveTo(17.277f, 8.0f)
                horizontalLineToRelative(2.303f)
                lineToRelative(-2.857f, 5.0f)
                lineTo(14.42f, 13.0f)
                lineToRelative(2.857f, -5.0f)
                close()
            }
        }
        .build()
        return _bxsTrafficBarrier!!
    }

private var _bxsTrafficBarrier: ImageVector? = null
