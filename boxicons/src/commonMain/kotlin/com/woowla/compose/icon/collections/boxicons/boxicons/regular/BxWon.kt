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

public val RegularGroup.BxWon: ImageVector
    get() {
        if (_bxWon != null) {
            return _bxWon!!
        }
        _bxWon = Builder(name = "BxWon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.758f, 5.0f)
                lineTo(19.68f, 5.0f)
                lineToRelative(-0.844f, 3.0f)
                horizontalLineToRelative(-4.893f)
                lineToRelative(-0.899f, -3.0f)
                horizontalLineToRelative(-2.088f)
                lineToRelative(-0.899f, 3.0f)
                lineTo(5.164f, 8.0f)
                lineTo(4.32f, 5.0f)
                lineTo(2.242f, 5.0f)
                lineToRelative(0.844f, 3.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.648f)
                lineToRelative(0.563f, 2.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.773f)
                lineToRelative(1.688f, 6.0f)
                horizontalLineToRelative(2.083f)
                lineToRelative(1.8f, -6.0f)
                horizontalLineToRelative(3.313f)
                lineToRelative(1.8f, 6.0f)
                horizontalLineToRelative(2.083f)
                lineToRelative(1.688f, -6.0f)
                lineTo(22.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.211f)
                lineToRelative(0.563f, -2.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 8.0f)
                horizontalLineToRelative(-1.086f)
                lineToRelative(0.844f, -3.0f)
                close()
                moveTo(5.727f, 10.0f)
                horizontalLineToRelative(3.729f)
                lineToRelative(-0.6f, 2.0f)
                lineTo(6.289f, 12.0f)
                lineToRelative(-0.562f, -2.0f)
                close()
                moveTo(7.531f, 16.417f)
                lineTo(6.852f, 14.0f)
                horizontalLineToRelative(1.404f)
                lineToRelative(-0.725f, 2.417f)
                close()
                moveTo(10.944f, 12.0f)
                lineToRelative(0.6f, -2.0f)
                horizontalLineToRelative(0.912f)
                lineToRelative(0.6f, 2.0f)
                horizontalLineToRelative(-2.112f)
                close()
                moveTo(16.469f, 16.417f)
                lineTo(15.744f, 14.0f)
                horizontalLineToRelative(1.404f)
                lineToRelative(-0.679f, 2.417f)
                close()
                moveTo(17.711f, 12.0f)
                horizontalLineToRelative(-2.567f)
                lineToRelative(-0.6f, -2.0f)
                horizontalLineToRelative(3.729f)
                lineToRelative(-0.562f, 2.0f)
                close()
            }
        }
        .build()
        return _bxWon!!
    }

private var _bxWon: ImageVector? = null
