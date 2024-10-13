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

public val RegularGroup.BxNoSignal: ImageVector
    get() {
        if (_bxNoSignal != null) {
            return _bxNoSignal!!
        }
        _bxNoSignal = Builder(name = "BxNoSignal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(7.0f, 21.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(14.59f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.59f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(-7.7f, -7.71f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-0.71f, -0.7f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineToRelative(1.88f)
                lineTo(15.0f, 19.12f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.88f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bxNoSignal!!
    }

private var _bxNoSignal: ImageVector? = null
